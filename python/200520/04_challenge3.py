# 교재 p.114 4번 문제

url = "https://docs.python.org/3/tutorial"

idx1 = url.find(":")

idx2 = url.find("//")

idx3 = url.find("/", idx2+2)

ridx = url.rfind('/')

len1 = len(url[idx2+2:idx3])

print(url[0:idx1])

print(url[idx2+2:idx2+2+len1])

print(url[ridx+1:])



