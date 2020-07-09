from django.db import models

from django.urls import reverse
# Create your models here.

class Bookmark(models.Model):
    site_name = models.CharField(max_length=100)

    # django에서는 http://exma...과 같은 형식을 지원해주는 스키마지정이 있다.
    url = models.URLField('Site URL')

    def __str__(self):
        return "이름: " + self.site_name + ", 주소: " + self.url

    def get_absolute_url(self):
        return reverse('detail', args=[str(self.id)])
