t = (1, 2, 3)

print(type(t))      # tuple

a,b = 1,2
print(a,b)          # 1 2
a,b = b,a
print(a,b)          # 2 1

a = set((1,2,3))
print(a)            # {1, 2, 3}

b = list(a)
print(b)            # [1, 2, 3]

c = tuple(a)
print(c)            # (1, 2, 3)