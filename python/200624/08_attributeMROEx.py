class Person:
    def hello(self):
        print('안녕, 난 사람이야!')

class Student(Person):
    def hello(self):
        print('안녕, 난 학생이야!')

class Employee(Person):
    def hello(self):
        print('안녕, 난 직원이야!')

class Assistant(Student, Employee):
    pass

print(Assistant.__mro__)        # (<class '__main__.Assistant'>, <class '__main__.Student'>, <class '__main__.Employee'>, <class '__main__.Person'>, <class 'object'>)
print(Assistant.mro())          # [<class '__main__.Assistant'>, <class '__main__.Student'>, <class '__main__.Employee'>, <class '__main__.Person'>, <class 'object'>]

i = Assistant()
i.hello()                       # 안녕, 난 학생이야!
