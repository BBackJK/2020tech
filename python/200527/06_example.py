# 교재 p.249 문제 6

from random import sample

A = set(sample(list(range(1,21)), 5))
B = set(sample(list(range(1,21)), 5))


print("A = ", A)
print("B = ", B)

print("A | B = ", A|B)
print("A & B = ", A&B)
print("A - B = ", A-B)
print("A ^ B = ", A^B)