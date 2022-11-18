file = open("sample.txt","r")
#write
#append // üzerine ekleme
#read

file.writelines("\n Hello World")
print(file.read())
file.close()

#! Şirket çalışanları verilerini tutan dosya oluşturulacak
#! Kullanıcıdan çalışan sayısını alınacak
#! Çalışan sayısı kadar isim, soyisim, maaş bilgisi alınacak
#! Dosyadaki her satıra "Ad Soyad - Maaş" kalıbında çalışan bilgileri eklenecek.
#! Programın sonunda bu dosyadan bilgileri satır satır okuyup listeleyecek kod yazılacak.
#! Eklenen çalışanlar mevcut çalışanları silmeyecek, üzerine yazılacak.
#! Programın belirli yerlerinde, hata yakalama işlemlerini unutma.