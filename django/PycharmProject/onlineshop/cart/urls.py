from django.urls import path

from .views import *

app_name = 'cart'

urlpatterns = [
    path('', detail, name='detail'),
    path('add/<int:product_id>', add, name='product_add'),  # add는 views.py에 있는 함수
    path('remove/<int:product_id>', remove, name='product_remove'),
]