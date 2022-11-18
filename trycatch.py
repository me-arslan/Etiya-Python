# runtime exception vs compile-time exception
# examNote = float(input("Lütfen Sınav Notunuzu Giriniz: "))
# print(examNote)

#exception
#handled exception
try:
    examNote = float(input("Lütfen Sınav Notunuzu Giriniz: "))
    print(examNote)
except ValueError:
    print("Deneme 1 2 3")
except ZeroDivisionError:
    print("Sayı 0'a bölünemez")
except:
    print("Doğru bir girdi girmediniz...")
finally:
    print("Try except bloğu sona erdi...")