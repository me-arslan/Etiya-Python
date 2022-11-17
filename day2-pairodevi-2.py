
#! Döngüleri araştırmanız,
#! Kullanıcının girdiği sayı kadar vize-final sınavları girilebilmesi beklenmektedir.
#! Kullanıcı kaç dersten geçip kaç dersten kaldığına görebilmeli.


ders_sayisi = int(input("Girilecek Ders Sayısını Giriniz: "))

gecilen_ders = 0

for i in range(1,ders_sayisi+1):
    
    vize = float(input(f"{i}. Vize Notunuzu Giriniz: "))
    final = float(input(f"{i}. Final Notunuzu Giriniz: "))
    ortalama = (vize*0.4)+(final*0.6)
    
    if (ortalama>=0) and (ortalama<=49):
        harf = "FF"
    elif (ortalama>=50) and (ortalama<=59):
        harf = "DD"
    elif (ortalama>=60) and (ortalama<=69):
        harf = "CC"
    elif (ortalama>=70) and (ortalama<=79):
        harf = "BB"
    elif (ortalama>=80) and (ortalama<=100):
        harf = "AA"
    else:
        print("Hatalı giriş yaptınız.")

    print(f"Not Ortalamanız: {ortalama}, Harf Notunuz: {harf} ")
    
    if harf != 'FF':
        gecilen_ders+=1

print(f"Geçilen Ders Sayısı: {gecilen_ders} ")
print(f"Kalınan Ders Sayısı: {ders_sayisi-gecilen_ders} ")
