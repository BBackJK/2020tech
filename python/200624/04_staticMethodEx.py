class Degree:

    @staticmethod
    def tofahrenhite(celsius):
        return celsius * 1.8 + 32

    @staticmethod
    def tocelsius(fahrenhite):
        return (fahrenhite - 32) / 1.8


print('%.2f' % Degree.tofahrenhite(30))     # 86.00
print('%.2f' % Degree.tocelsius(100))       # 37.78

d = Degree()
print('%.2f' % d.tofahrenhite(35))          # 95.00
print('%.2f' % d.tocelsius(90))             # 32.22