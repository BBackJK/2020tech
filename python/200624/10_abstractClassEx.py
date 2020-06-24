from abc import *

class Ploygon(metaclass = ABCMeta):
    @abstractmethod
    def area(self):
        print('면적 구하기 메소드 구현')

class Rectangle(Ploygon):
    def __init__(self, width, height):
        self.width = width
        self.height = height

    def area(self):
        return self.width * self.height
    
rect = Rectangle(2.4, 4.3)
print('사각형 면적 %.2f' % rect.area())     # 사각형 면적: 10.32