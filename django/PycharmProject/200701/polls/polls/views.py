from django.shortcuts import render

# Create your views here.

from django.http import HttpResponse
from .models import Question
from django.template import loader
from django.http import Http404

def index(request):
    # return HttpResponse("Hello, World, You are at the polls index")

    """
    lasted_question_list = Question.objects.order_by('-pub_date')[:5]
    output = ', '.join([q.question_text for q in lasted_question_list])
    return HttpResponse(output)
    """
    """
    lasted_question_list = Question.objects.order_by('-pub_date')[:5]
    context = {
        'lasted_question_list': lasted_question_list
    }
    template = loader.get_template('polls/index.html')
    return HttpResponse(template.render(context, request))
    """
    lasted_question_list = Question.objects.order_by('-pub_date')[:5]
    context = {
        'lasted_question_list': lasted_question_list
    }

    return render(request, 'polls/index.html', context)

def detail(request, question_id):
    # return HttpResponse("You're looking at question %s." %question_id)

    try:
        question = Question.objects.get(pk=question_id)
    except Question.DoesNotExist:
        raise Http404("질문이 존재하지 않습니다.")

    return render(request, 'polls/detail.html', {'question': question})

def results(request, question_id):
    response = "You're looking at the results of question %s."
    return HttpResponse(response % question_id)

def vote(request, question_id):
    response = "You're voting on question %s." % question_id
    return HttpResponse(response)
