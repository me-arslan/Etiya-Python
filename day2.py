# Kullanıcıdan Girme Almak

print("2. Gün Başlangıç")

userInput = input()
print(f"Girilen değer: {userInput}")

# Type Conversion
numberStr = "10";
print(type(numberStr))
number = int (numberStr)
print(number + 10)
print(type(number))

userInput = input()
lessonNote = float(userInput)
print(f"Ders4 Notunuz: {lessonNote}")

# indent
# n adet conditiona bağlı karar bloğu
if lessonNote>50: 
    print("Geçtiniz")
elif lessonNote == 50:
    print("Sınırda Kaldınız")
elif lessonNote == 49:
    print("Sınırda Kaldınız")
else:
    print("Kaldınız")


