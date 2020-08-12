from django.shortcuts import render
from .models import Todo
from django.http import JsonResponse

from django.views.decorators.csrf import csrf_exempt
import json
from .forms import TodoForm

from django.views.decorators.http import require_POST

# 리스트를 보여주기위한 로직
def todo_fetch(request):
    todos = Todo.objects.all()
    todo_list = []

    for idx, todo in enumerate(todos, start=1):
        todo_list.append({'id' : idx, 'title':todo.title, 'completed' : todo.completed})

    return JsonResponse(todo_list, safe=False)

@csrf_exempt
@require_POST
def todo_save(request):
    if request.body:
        data = json.loads(request.body)

        if 'todos' in data:
            todos = data['todos']

            Todo.objects.all().delete()

            for todo in todos:
                form = TodoForm(todo)

                if form.is_valid():
                    form.save()

    return JsonResponse({})