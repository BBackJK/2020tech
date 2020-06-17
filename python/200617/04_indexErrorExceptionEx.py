let = ["c/c++", "java", "c#", "python"]

try:
    print(let[4])
except Exception as e:
    print("예외 처리 발생 이름: {}".format(type(e)))
    print("예외 처리 발생 이유: {}".format(e))
else:
    print("잘 실행되었습니다. ")
finally:
    print("예외 처리가 잘 되었습니다. ")