#교재 p.151 예제


while True:
    dates = int(input("힌 달 최대 일 수 입력 >> "))
    days = int(input("첫 날 1일의 시작 요일 입력 (0: 일, 1: 월, 2: 화, ..., 6: 토) >> "))

    if (dates != 30 or dates != 31 or dates != 29)and days > 6:
        print("잘못 누르셨습니다. 다시 입력해주세요")
    else:
        print("일 월 화 수 목 금 토")
        for i in '일월화수목금토':
            print("%s" % i, end= ' ')
        else:
            print("\n")
        

