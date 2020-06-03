import random

rank = { 6: ('1등', 1000000000),                # 당첨 번호 맞춘 갯수(key)에 대한 출력값(value)를 정의하기 위한 dictionary rank 선언
         5: { 1: ('2등', 50000000),
              0: ('3등', 1000000)},
         4: ('4등', 50000),
         3: ('5등', 5000)
}

# 번호 출력 함수 , 01 식으로 출력
def printNums(nums):
    for num in sorted(nums):
        print("%02d" %num, end= ' ')
    print()

# 3등 후 부터 당첨 갯수를 줄이고 나머지를 임의의 수로 채우기 위한 함수
def makeNum(num):
    nums = winnum.copy()
    for i in range(6-num):
        nums.pop()
    
    while len(nums) != 6:
        n = random.randint(1, 45)
        if n not in winnum:     # 임의의 수 n이 winnum (당첨번호) 가 아닐 때 
            nums.add(n)         # n 추가

    return nums

# 자동으로 lotto 번호 출력
def printLotto(lotto):
    for i, item in enumerate(lotto):
        print('%c 자동 ' %(ord('A') + i), end= ' ')        # ord는 문자의 아스키 코드 값을 돌려주는 함수
        printNums(item)
    print()

# 리스트 lottos를 인자로 받아
# enumerate 함수를 사용하여 반복문 실행 -> lottos는 첫번째 인덱싱부터 마지막 인덱싱가지 각각 1등, 2등, 3등, 4등, 5등 꽝을 포함하는 리스트
# i 가 리스트 lottos의 인덱스값, item 이 lottos 인덱스에 해당하는 요소값
def getWinner(lotto):
    global bonus
    for i, item in enumerate(lotto):
        win = winnum.intersection(item)     # 당첨 번호와 lottos의 값들의 교집합을 각각 구한다. 따라서 win은 당첨 번호만 나열해 둔 set
        print('%c' %(ord('A') + i), end = ' ')
        if win:                 # 당첨 번호가 있으면
            wincnt=len(win)     # 당첨 번호 갯수
            print('당첨 번호 개수 %d, ' % wincnt, end=' ')
            printNums(win)
            if 3 <= wincnt: # 당첨 번호 갯수가 3개와 같거나 많으면
                grade = rank[wincnt]    
                if 5 == wincnt:
                    if bonus in item:
                        print('\t 보너스 번호 %d도 맞춤!!!' %bonus)
                        grade = rank[wincnt][1] # 2등 지정
                    else:
                        grade = rank[wincnt][0] # 3등 지정
                print('\t%s %s원' % (grade[0], grade[1]))
            else:
                print('\t2개 이하 맞춰, 꽝!!')
        else:               # 당첨 번호가 없으면..
            print('모두 꽝!!!')



winnum = set(random.sample(list(range(1, 46)), 7 ))

bonus = winnum.pop()

print('bonus: ', bonus)

print('당첨 번호: ', end='')
printNums(winnum)
print('보너스 번호: ', bonus, end= " ")
print()

lottos = []

# 1등 번호 만들기
rank1num = winnum.copy()
lottos.append(rank1num)

# 2등 (당첨번호 5개 + 보너스) 번호 만들기
# 2등은 당첨 번호 갯수 5개 + 보너스로 총 6개로 지정
rank2num = winnum.copy()
rank2num.pop()
rank2num.add(bonus)
lottos.append(rank2num)

# 3등 (당첨번호 5개) 번호 만들기
# 3등은 당첨 번호 갯수 5개 + 임의의 수 1개 로 총 6개로 지정
rank3num = winnum.copy()
rank3num.pop()
while True:
    num = random.randint(1, 45)
    if (( num != bonus ) and (num not in rank3num)):
        rank3num.add(num)
        break
lottos.append(rank3num)

# 4등 밑으로 나머지 만들기
for i in range(5):              # 0 - 4 까지
    lottos.append(makeNum(4 - i))

printLotto(lottos)
getWinner(lottos)
