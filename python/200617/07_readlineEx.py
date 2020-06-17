f = open("./python/200617/example2.txt", "rt")

while True:
    line = f.readline()
    if not line:
        break
    print(line.strip("\n"))
f.close()