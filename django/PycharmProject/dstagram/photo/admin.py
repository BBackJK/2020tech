from django.contrib import admin

# Register your models here.

from .models import Photo

class PhotoAdmin(admin.ModelAdmin):
    list_display = ['id', 'author', 'created', 'updated']
    raw_id_fields = ['author']  # 내용이 길 경우 이렇게 바꾸어라

    list_filter = ['created', 'updated', 'author']
    search_fields = ['text', 'created']
    ordering = ['-updated', '-created']

admin.site.register(Photo, PhotoAdmin)