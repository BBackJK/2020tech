# 교재 p.205 8번 문제

from random import randint

list1 = []

for i in range(10):
    list1.append(randint(1,99))

print("리스트:  ", list1)
print("튜플:  ", tuple(list1))
print("튜플 정렬된 리스트:  ", list(sorted(tuple(list1))))

print("합:  ", sum(list1), "  항목수:  ", len(list1))
print("최대:  ", max(list1), "  최소:  ", min(list1), "  평균:  ", sum(list1)/len(list1))