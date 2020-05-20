# 교재 p.111~p.113 연습문제 

print(len('자바'*3))        # 6
print('귀도 반 로섬'[5])    # 로

print('dictionary'[0:4])    # 'dict'

print('tuple'[-5:-1])       # 'tupl'
print('tuple'[-5:])         # 'tuple'
print('tuple'[-1:])         # 'e'


# 12번 문제

# 어떤 일에든 명확한 - 바람직하며 유일한 - 방법이 존재한다.
# 34
# 바람직하며 유일한
# 어떤일에든명확한-바람직하며유일한-방법이존재한다.

# 1) 변수 str에 위 결과 첫 문장인 문자열을 저장해 출력
# 2) 변수 slen에 변수 str에 저장된 문자열의 길이를 저장해 출력
# 3) 메소드 find()와 부분 문자열 슬라이싱 방법으로 중간 부분 문자열 '바람직하며 유일한' 출력
# 4) 변수 str 에 저장된 문자열에서 모든 공백을 제거해 출력

# 1)

str = '어떤 일에든 명확한 - 바람직하며 유일한 - 방법이 존재한다.'
print(str)

# 2)

slen = len(str)
print(slen)

# 3)

print(str.find('바'))
print(str.find('일한'))

print(str[13:22])

# 교수님 처리

idx = str.find('-')
print(str[(idx+2):(idx+2+len('바람직하며 유일한')+1)])



