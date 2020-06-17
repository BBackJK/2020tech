import sqlite3 as sql

con = sql.connect('./python/200617/test.db')                # 디비 생성
cur = con.cursor()

cur.execute("drop table PhoneBook")
cur.execute("create table PhoneBook(name text, phonenumber text);")

cur.execute("INSERT INTO PhoneBook Values('A', '010-1234-1234');")
cur.execute("INSERT INTO PhoneBook Values('B', '010-4321-4321');")
cur.execute("INSERT INTO PhoneBook Values('C', '010-0000-0000');")

con.commit()
cur.execute('SELECT * FROM PhoneBook')
for row in cur:
    print(row)                          # ('A','010-1234-1234')
                                        # ('B','010-4321-4321')
                                        # ('C', '010-0000-0000')

for i in con.iterdump():
    print(i)                            # BEGIN TRANSACTION;
                                        # CREATE TABLE PhoneBook(name text, phonenumber text);
                                        # INSERT INTO "PhoneBook" VALUES('A', '010-1234-1234');
                                        # INSERT INTO "PhoneBook" VALUES('B', '010-4321-4321');
                                        # INSERT INTO "PhoneBook" Values('C', '010-0000-0000');
                                        # COMMIT;

cur.execute('SELECT * FROM PhoneBook')
print(cur.fetchone())                   # ('A', '010-1234-1234')
print(cur.fetchmany(2))                 # [('B', '010-4321-4321'), ('C', '010-0000-0000')]
print(cur.fetchall())                   # []

cur.execute('SELECT * FROM PhoneBook')
print(cur.fetchmany(2))                 # [('A', '010-1234-1234'), ('B', '010-4321-4321')]
print(cur.fetchall())                   # [('C', '010-0000-0000')]

