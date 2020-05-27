# 교재 p.270 예제

def myKeyPrint(**kwargs):
    for key in kwargs:
        print('{}: {} '.format(key, kwargs[key]), end= ' ')
    print()

myKeyPrint(여자친구=6, 마마무=4)
myKeyPrint(엑소=9, 트와이스=9, 블랙핑크=4, 방탄소년단=7)
