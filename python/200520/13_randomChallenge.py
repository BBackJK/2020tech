# 교재 p.157 8번 문제

from random import randint

status = True

result = 0

while status:

    num = randint(1, 100)

    print("첫 값은 %d 입니다." %num)
    s = input("산술 연산의 종류를 입력하세요. >> ")

    if s != '+' and s != '-' and s != '*' and s !='/':
        print("산술연산이 잘못됐습니다.")
        status = False
    else:
        inputNum = int(input("두 번째 피연산자를 입력하세요. >> "))

        if s == '+':
            result = num + inputNum
            print("%d %s %d = %d" %(num, s, inputNum, result))
        elif s == '-':
            result = num - inputNum
            print("%d %s %d = %d" %(num, s, inputNum, result))
        elif s == '*':
            result = num * inputNum
            print("%d %s %d = %d" %(num, s, inputNum, result))
        elif s == '/' and inputNum != 0:
            result = num / inputNum
            print("%d %s %d = %d" %(num, s, inputNum, result))
        else:
            print("0으로 연산할 수 없습니다.")
            status = False
else:
    print('종료'.center(20,'*'))

