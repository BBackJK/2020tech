from django.urls import path

from django.views.generic.detail import DetailView

from .models import Photo
from .views import photo_list
from .views import PhotoUploadView, PhotoUpdateView, PhotoDeleteView


app_name= 'photo'

urlpatterns = [
    path('', photo_list, name='photo_list'),
    path('photo/upload/', PhotoUploadView.as_view(), name='photo_upload'),
    # view 없이 model로 지정할 수가 있다
    path('photo/detail/<int:pk>', DetailView.as_view(model=Photo, template_name='photo/detail.html'), name='photo_detail'),

    path('photo/update/<int:pk>', PhotoUpdateView.as_view(), name='photo_update'),
    path('photo/delete/<int:pk>', PhotoDeleteView.as_view(), name='photo_delete')
]