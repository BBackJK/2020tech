# 교재 p. 473 쪽 예제  

class Circle:
    ''' 원을 표현하는 클래스 정의 '''
    def __init__(self, radius = 1):
        self.radius = radius

    def area(self):
        return self.radius * self.radius * 3.14

class Cylinder(Circle):
    ''' 원통을 표현하는 클래스 정의 '''

    def __init__(self, radius, height):
        super().__init__(radius)
        self.height = height

    
    def volumn(self):
        ''' 원통 체적: 밑면인 원의 넓이 x 높이 '''
        return super().area() * self.height

cy = Cylinder(3, 5)

print('원통 체적 : %.2f' % cy.volumn())         # 원통 체적 : 141.30

