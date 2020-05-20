# 교재 p.148 커피 시스템 예제

import sys

menu = ''' Coffee menu!

    1. 아메리카노       2000
    2. 카페라떼         2500
    3. 카푸치노         3000
    4. 카라멜마끼아또   4000
    0. 주문 종료
    '''

total = 0
americano = 0
cafelatte = 0
capuccino = 0
caramel = 0

while True:
    print("메뉴판을 보시고 메뉴 종류와 수량을 선택해주세요!")
    print("")
    print(menu)
    coffee = int(input("종류 >> "))
    
    if (coffee > 4):
        print("")
        print('잘못 누르셨습니다. 다시 입력해주세요.')
        print("")
    else:
        if (coffee == 1):
            print("")
            print("아메리카노는 한 개당 2000원입니다.")
            print("")
            num = int(input("수량 >> "))
            print("")
            americano += num
            total += 2000*num
            print("현재 주문 가격은 %d 입니다." %total)
            print("")
        elif (coffee == 2):
            print("")
            print("카페라데는 한 개당 2500원입니다.")
            print("")
            num = int(input("수량 >> "))
            print("")
            cafelatte += num
            total += 2500*num
            print("현재 주문 가격은 %d 입니다." %total)
            print("")
        elif (coffee == 3):
            print("")
            print("카푸치노는 한 개당 3000원 입니다.")
            print("")
            num = int(input("수량 >> "))
            print("")
            capuccino += num
            total += 3000*num
            print("현재 주문 가격은 %d 입니다." %total)
            print("")
        elif (coffee == 4):
            print("")
            print("카라멜마끼아또는 한 개당 4000원 입니다.")
            print("")
            num = int(input("수량 >> "))
            print("")
            caramel += num
            total += 4000*num
            print("현재 주문 가격은 %d 입니다." %total)
            print("")
        elif (coffee == 0):
            print("")
            print("총 주문내역입니다 아메리카노 %d개, 카페라떼 %d개, 카푸치노 %d개, 카라멜마끼아또 %d개, 총 금액은 %d 입니다." %(americano, cafelatte, capuccino, caramel, total))
            print("")
            print("주문 시스템을 종료합니다. 다음에 이용해주세요")
            sys.exit()
        


