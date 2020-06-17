while True:
    try:
        base = int(input("입력할 [2, 8, 10, 16] 진수는? "))
        if not base in (2, 8, 10, 16):
            raise ValueError("2, 8, 10 , 16 중의 입력")
    except Exception as e:
        print("예외 발생 원인: %s \n" %e)
    else:
        print()
        break

check = {2 : "01", 8 : "01234567", 10 : "0123456789", 16 : "0123456789101112131415"}

while True:
    try:
        invar = input(str(base) + "진수 정수 입력 >> ")
        for digit in invar:
            if digit not in check[base]:
                raise ValueError("%d 진수를 입력" %base)
    except Exception as e:
        print("예외 발생 원인: %s \n" %e)
    else:
        print()
        break

data = int(invar, base)

print("2진수: ", bin(data))
print("8진수: ", oct(data))
print("10진수: ", data)
print("16진수: ", hex(data))
        