num = int(input('네 자릿수 정수 입력 >> '))

num1 = num//1000
num2 = num%1000//100
num3 = num%1000%100//10
num4 = num%1000%100%10


print(num4,num3,num2,num1)

# 더 좋은 알고리즘 있을까요 ..?
# print(str(num)[::-1])