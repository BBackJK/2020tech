from django.contrib.auth.models import User
from django import forms

class RegisterForm(forms.ModelForm):
    password = forms.CharField(label='Password', widget=forms.PasswordInput)
    password2 = forms.CharField(label='Repeat Password', widget=forms.PasswordInput)

    class Meta:
        model = User    # hiediSQL로 보면 auth_user라는 테이블에 컬럼을 참조하겠단 의미
        fields = ['username', 'first_name', 'last_name', 'email']

    def clean_password2(self):

        data = self.cleaned_data

        if data['password'] != data['password2']:
            raise forms.ValidationError('비밀번호와 비밀번호 확인이 일치하지 않습니다.')

        return data['password2']