from django.contrib import admin

# Register your models here.

from django.contrib import admin

from .models import Question, Choice

# class ChoiceInline(admin.StackedInline):
#     model = Choice
#     extra = 3   # 기본적으로 3개의 값을 추가할 수 있도록 만들어줌

class ChoiceInline(admin.TabularInline):
    model = Choice
    extra = 3   # 기본적으로 3개의 값을 추가할 수 있도록 만들어줌

class QuestionAdmin(admin.ModelAdmin):
    fieldsets = [
        (None, {
            'fields': ['question_text']
        }),
        ('Date information', {
            'fields':['pub_date']
        }),
    ]

    # was_published_recently는 models.py에 있는 Question 클래스에 존재하는 메소드
    list_display = ('question_text', 'pub_date', 'was_published_recently')
    inlines = [ChoiceInline]

    # pub_date에 대해서 필터 추가
    list_filter = ['pub_date']
    # 검색 추가
    search_fields = ['question_text']

admin.site.register(Question, QuestionAdmin)
# admin.site.register(Question)
admin.site.register(Choice)
