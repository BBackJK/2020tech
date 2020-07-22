from django.db import models

from django.contrib.auth.models import User
from django.urls import reverse

class Photo(models.Model):

    author = models.ForeignKey(User, on_delete=models.CASCADE, related_name='user_photos')

    photo = models.ImageField(upload_to="photos/%Y/%m/%d", default="photos/no_image.png")
    text = models.TextField()

    created = models.DateTimeField(auto_now_add=True)   # 데이터가 insert될 때 자동으로 현재 시각이 들어감.
    updated = models.DateTimeField(auto_now=True)   # 데이터가 변경될 때 자동으로...

    def __str__(self):
        return str(self.id) + ', ' +self.author.username + ', ' + self.updated.strftime('%Y.%m.%d %H:%M:%S')

    class Meta:
        ordering = ['-updated']

    def get_absolute_url(self):
        return reverse('photo:photo_detail', args=[self.id])