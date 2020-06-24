class Person:
    pass

def hello(p):
    print("%s이 인사합니다." % p.name)


Person.hello = hello

he = Person()

he.name = "홍길동"
he.age = 20

print(he.name, he.age)

he.hello()

print(isinstance(he, Person))

