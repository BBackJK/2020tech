from django.db import models
from django.utils import timezone

import datetime

# Create your models here.

'''
명명규칙  
- camel 표기법 ; 소문자로 시작하고 연결되는 단어에 첫 문자는 대문자로 표기  
    ex ) questionText, pubDate  
    
- 언더바 표기법 ; c나 python에서 자주 사용하는 표기법, 영문자의 구분을 (_)로 구분  
    ex ) question_text, pub_date
    
- 파스칼 표기법 ; c#에서 주로 사용, 대문자로 시작하고 연결되는 단어의 첫 문자는 대문자로 표시
    ex ) QuestionText, PubDate
    
- 케밥 표기법 ; css에서 주로 사용, 문자의 구분을 (-)로 표시
    ex ) question-text, pub-date  

- 헝가리언 표기법 ; old c에서 주로 사용했던 표기법, 데이터의 타입을 약어로 시작
    ex ) strQuestionText, dtPubDate
'''

# django model에 있는 Model을 상속받는 클래스 Question을 생성
class Question(models.Model):
    question_text = models.CharField(max_length=200)
    pub_date = models.DateTimeField('date published')

    def __str__(self):
        return self.question_text

    def was_publised_recently(self):
        return self.pub_date >= timezone.now() - datetime.timedelta(days=1)

class Choice(models.Model):
    question = models.ForeignKey(Question, on_delete=models.CASCADE)
    choice_text = models.CharField(max_length=200)
    votes = models.IntegerField(default=0)

    def __str__(self):
        return self.choice_text