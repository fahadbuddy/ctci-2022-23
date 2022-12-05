import mysql.connector


try:
    mydb = mysql.connector.connect(
    host="85.187.142.70",
    user="weativah",
    password="E339Mf;N4Fcre)",
    ) 
    mycursor=mydb.cursor()
    print('suc')

except Exception as e:
    print('Un')