class Account:
    ''' 은행 계좌를 표현하는 클래스 '''

    def __init__(self, name, amount):
        self.name = name
        self.__balance = amount         # 비공개 속성

    def __str__(self):
        return '예금주 {}, 잔고 {}'.format(self.name, self.__balance)

    def __info(self):           # 비공개 매소드
        print('\t', self)       # __str__ 메소드 호출

    def withDraw(self, amount):
        self.__balance -= amount
        print('출금 {}원 이후:'.format(amount))
        self.__info()

    def deposit(self, amount):
        self.__balance += amount
        print('입금 {}원 이후:'.format(amount))
        self.__info()

acc = Account('이은행', 100000)
print(acc)

acc.deposit(5000)

acc.withDraw(10000)

# print(acc.__balance)            # 참조 불가능 오류
# acc.__info()                    # 참조 불가능 오류

