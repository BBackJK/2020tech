from django.urls import path
from . import views

# app_name을 사용해서 네임스페이스 지정
app_name = 'polls'

urlpatterns = [
    # path 지정 '' ; polls앱 root (ex 127.0.0.1:8000/polls) / views.  index ; views.py에 만든   index파일을 호출

    # ex) /polls/
    # path('', views.index, name='index'),
    path('', views.IndexView.as_view(), name='index'),

    # ex) /polls/2/
    # path('<int:question_id>/', views.detail, name='detail'),
    path('<int:pk>/', views.DetailView.as_view(), name='detail'),

    # ex) /polls/2/result/
    # path('<int:question_id>/result/', views.result, name='result'),
    path('<int:pk>/result/', views.ResultView.as_view(), name='result'),

    # ex) /polls/2/vote
    path('<int:question_id>/vote/', views.vote, name='vote')
]