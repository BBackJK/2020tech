lst = ["파일 처리 모드  \n", "mode='x'\n", ",mode"]

try:
    with open("./python/200617/modex.txt", mode='x') as file:
        file.writelines(lst)
except FileExistsError as e:
    print(e)
    print("파일 쓰기 실패".center(30, "*"))
else:
    with open("./python/200617/modex.txt", mode="rt"):
        for line in file:
            print(line, end=" ")
    print("파일 읽기 완료".center(30, "*"))