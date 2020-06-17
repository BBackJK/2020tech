while True:
    try:
        xstr = input("정수 입력 >> ")
        x = int(xstr)
        y = int(input("0이 아닌 정수 입력 >> "))
        mul = x * y
        div = x / y

    except ZeroDivisionError as zde:
        print("except ZeroDivisionErorr: ", zde)
    except ValueError as ve:
        print("except ValueError: ", ve)
    
    else:
        print("{} * {} = {}".format(x, y, mul))
        print("{} / {} = {}".format(x, y, div))

    finally:
        if xstr in ["x", "X"]:
            print("프로그램 종료")
            break
        print("다시 시도해 주세요.")
