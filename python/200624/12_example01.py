# 교재 p. 476 5번 문제

class Area:
    PI = 3.14

    @classmethod
    def circle(cls, r):
        return r * r * cls.PI

    @staticmethod
    def triangle(w, h):
        return w * h / 2

print('%.2f' %Area.circle(2))
print('%.2f' %Area.triangle(3, 5))
        