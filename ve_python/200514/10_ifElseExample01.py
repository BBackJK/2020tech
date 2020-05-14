# https://github.com/lee7py/Python-Programming/blob/master/Ch03/3-2-1.py

num1 = eval(input("Enter the first number: "))
num2 = eval(input("Enter the second number: "))

if num1 > num2:
    largestValue = num1
else:
    largestValue = num2

print("The largest value is", str(largestValue) + ".")