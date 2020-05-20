# 교재 p.143 럭키 예제

from random import randint
LUCKY = 52

while True:
    n = randint(0, 100)
    if n == LUCKY:
        print('드디어 %d!! 프로그램 종료!' % n) 
        break
    else:
        print('%d, %d 나올 때 까지 계속!' % (n, LUCKY))
else:
    print('여기는 실행되지 않습니다.')