from django.shortcuts import render

# Create your views here.

from django.views.generic.list import ListView
from django.views.generic.edit import CreateView, UpdateView, DeleteView
from django.views.generic.detail import DetailView
from django.urls import reverse_lazy

# bookmark import
from .models import Bookmark

class BookmarkListView(ListView):
    # templates 폴더 밑에 있는 bookmark 밑에 list.html을 참조
    # template_name = 'bookmark/list.html'
    # 모델 추가
    model = Bookmark
    # 컨텍스트 추가
    context_object_name = 'bookmark_list'
    # 페이징 기능 추가
    paginate_by = 5


class BookmarkCreateView(CreateView):
    model = Bookmark
    # 필드 추가
    fields = ['site_name', 'url']
    # templates suffix 추가
    template_name_suffix = '_create'

    # 리다이렉션 reverse 추가
    # 저장이 성공(success)할 시
    # list(bookmark/urls.py에 있는 name인 list)로 가라.
    success_url = reverse_lazy('list')


class BookmarkDetailView(DetailView):
    model = Bookmark

class BookmarkUpdateView(UpdateView):
    model = Bookmark
    fields = ['site_name', 'url']
    template_name_suffix = '_update'

class BookmarkDeleteView(DeleteView):
    model = Bookmark
    success_url = reverse_lazy('list')
