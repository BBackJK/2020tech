num1 = str(input('첫 번째 16진수 실수 입력 >> '))
num2 = str(input('두 번째 16진수 실수 입력 >> '))

c_num1 = float.fromhex(num1)
c_num2 = float.fromhex(num2)

print('실수 1:', c_num1, '실수 2:', c_num2)
print('합: ', c_num1+c_num2)
print('차: ', c_num1-c_num2)
print('곱하기: ', c_num1*c_num2)
print('나누기: ', c_num1/c_num2)