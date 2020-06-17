import sqlite3 as sql

con = sql.connect("./python/200617/Company.db")
cur = con.cursor()

cur.execute("CREATE TABLE Employee(empId integer primary key autoincrement, name text, phoneNumber text, depId );")
