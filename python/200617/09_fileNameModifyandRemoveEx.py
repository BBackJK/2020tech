import os

try:
    with open("./python/200617/pyfile.txt", mode="w") as file:
        file.write("file name modify and remove")
    
    os.rename("./python/200617/pyfile.txt", "./python/200617/fileMfyandRmv.txt")
    os.remove("./python/200617/fileMfyandRmv.txt")

except Exception as e:
    print("예외 발생: ", e)
else:
    print("파일 수정 삭제 성공")
dname = os.getcwd()
print("현재 폴더: ", dname)

fs = os.listdir(dname)
for f in fs:
    if os.path.isfile(f):
        print("\t파일", f)
    elif os.path.isdir(f):
        print("\t폴더", f)