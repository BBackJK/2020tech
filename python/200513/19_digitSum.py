# 교재 p.83 예제

value = input('실수(세 자리. 두 자리로 345.68처럼)를 하나 입력하시오. >> ')
num = value.replace('.','')
sum = 0
print(num)
for i in num:
    sum += int(i)

print('입력값: ', value)
print('모든 자릿수 합: ', sum)