# 교재 p.476 6번 문제  

class Animal:
    def __init__(self, species):
        self.species = species
    
    def __str__(self):
        return self.species

class Dog(Animal):
    def __init__(self, name):
        super().__init__('개')
        self.name = name

    def __str__(self):
        return super().__str__() + ': ' + self.name

d = Dog('멍멍이')
print(d)            # 개: 멍멍이