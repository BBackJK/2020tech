from django.shortcuts import render

# Create your views here.

from django.http import HttpResponse, HttpResponseRedirect
from .models import Question, Choice
from django.template import loader
from django.http import Http404
from django.shortcuts import get_object_or_404
from django.urls import reverse

from django.views import generic

class IndexView(generic.ListView):
    template_name = 'polls/index.html'  # template 이름 지정
    context_object_name = 'lasted_question_list'

    def get_queryset(self):
        return Question.objects.order_by('-pub_date')[:5]

class DetailView(generic.DetailView):
    model = Question
    template_name = 'polls/detail.html'

class ResultView(generic.DetailView):
    model = Question
    template_name = 'polls/result.html'

def temp_index(request):
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
    # 단축형으로 줄이기
    lasted_question_list = Question.objects.order_by('-pub_date')[:3]
    context = {
        'lasted_question_list': lasted_question_list
    }

    return render(request, 'polls/index.html', context)

def temp_detail(request, question_id):
    # return HttpResponse("You're looking at question %s." %question_id)

    try:
        question = Question.objects.get(pk=question_id)
    except Question.DoesNotExist:
        raise Http404("질문이 존재하지 않습니다.")

    return render(request, 'polls/detail.html', {'question': question})

def result(request, question_id):
    # response = "You're looking at the results of question %s."
    # return HttpResponse(response % question_id)

    question = get_object_or_404(Question, pk=question_id)
    return render(request, 'polls/result.html', {'question': question})

def vote(request, question_id):
    #response = "You're voting on question %s." % question_id
    #return HttpResponse(response)

    question = get_object_or_404(Question, pk=question_id)

    try:
        # request.POST('choice')에서 chioice는 detail.html에서 input 속성 name을 말함.
        # question.choice_set 전체 질문들 중에서
        # get 하나를 가져올건데
        # pk=request.POST('choice') 선택된 값을 가져와서 selected_choice에 저장할 것이다.
        selected_choice = question.choice_set.get(pk=request.POST['choice'])
    except (KeyError, Choice.DoesNotExist):
        return render(request, 'polls/detail.html', {
            'question': question,
            'error_message': "Yor didn't select a choice."
        })

    else:
        selected_choice.votes += 1
        selected_choice.save()

        return HttpResponseRedirect(reverse('polls:result', args=(question.id,)))


