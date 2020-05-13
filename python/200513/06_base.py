# 교재 p.59 예제
# 10진수 정수를 입력받아 2진수, 8진수, 10진수, 16진수로 출력하는 프로그램

data = int(input('정수 입력 >>'))   # 함수 int()는 10 진수 형태의 문자열만 변환할 수 있다.

print('2진수: ', bin(data))
print('8진수: ', oct(data))
print('10진수: ', data)
print('16진수: ', hex(data))