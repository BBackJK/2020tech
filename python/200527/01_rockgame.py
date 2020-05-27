rsp = ['가위', '바위', '보']

win_rsp = { '가위':'보', '보':'바위', '바위':'가위'}

comChoice = []
myChoice = []

for i in range(len(rsp)):
    print(rsp[i], end= ' ')

print()
print("=========================")

from random import choice

ch1 = input("첫 번째 가위바위보를 선택하세요 >> ")
ch2 = input("두 번째 가위바위보를 선택하세요 >> ")
ch3 = input("세 번째 가위바위보를 선택하세요 >> ")

myChoice.append(ch1)
myChoice.append(ch2)
myChoice.append(ch3)

print('나의 choice 3개')

for i in range(len(myChoice)):
    print(myChoice[i], end= ' ')

print()
print('컴퓨터의 choice 3개')

for i in range(3):
    comChoice.append(choice(rsp))

for i in range(len(comChoice)):
    print(comChoice[i], end= ' ')

print()

for i in range(3):
    if comChoice[i] == myChoice[i]:
        print('내 choice: ', myChoice[i], ' 컴퓨터 choice: ', comChoice[i], ' 결과: 비겼습니다')
    elif win_rsp[myChoice[i]] == comChoice[i]:
        print('내 choice: ', myChoice[i], ' 컴퓨터 choice: ', comChoice[i], ' 결과: 이겼습니다')
    else:
        print('내 choice: ', myChoice[i], ' 컴퓨터 choice: ', comChoice[i], ' 결과: 졌습니다')