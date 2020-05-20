# 교재 p.115 8번 문제

num1 = int(input("정수 입력 >> "))
num2 = int(input("2의 지수승 입력 >> "))

print("정수 ", num1 , " >> ", num2 , "결과: ", (num1 << num2)) 
print("정수 ", num1 , "*", 2, "**",num2, "결과: ", (num1*2**num2))

print("2진수(32비트):{0:30b} 정수:{0:n}".format(num1,num1))
print("2진수(32비트):{0:30b} 정수:{0:n} << {0:n}".format((num1 << num2), num1, num2))


