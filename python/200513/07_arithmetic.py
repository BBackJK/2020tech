# 교재 p.63 예제

num1 = float(input("입력값1을 입력해주세요: "))
num2 = float(input("입력값2를 입력해주세요: "))

def sum(a,b):
    return a+b

def minus(a,b):
    return a-b

def div(a,b):
    if (a == 0.0 or b == 0.0):
        return '유효하지 않은 값입니다'
    return a/b

def gop(a,b):
    return a*b

print("합:" , sum(num1,num2))
print("차:" , minus(num1,num2))
print("곱:" , gop(num1,num2))
print("나누기:" , div(num1,num2))

