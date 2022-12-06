### İstatistik Kurumundan Gelen Meteoroloji Verilerinin Belirlenmiş Örneklem Değerine Göre Excel Üzerinde Farklı Sayfalarda Gruplandırılması


- Kurumdan gelen şehir ve en düşük - en yüksek sıcaklık verilerinin sağına belirlenecek örneklem değerinin girilebileceği bir input oluşturulmalıdır.

- Input altında işlemin gerçekleşmesini sağlayacak “Grupla” yazan fonksiyonel bir buton oluşturulmalıdır.

-  “Grupla” Butonuna basıldığında, girilen örneklem değeri kadar tablodaki veri sırasına göre şehir ve sıcaklık verisi kopyalanarak yeni bir sayfa oluşturulmalıdır.

![](https://i.hizliresim.com/anu743o.png)

- Herhangi bir input girilmediğinde, integer harici input girildiğinde ve veri sayısından yüksek bir değer girildiğinde “Grupla” butonu aktif olmamalıdır.

![](https://i.hizliresim.com/sfr2dld.png)

- Oluşturulan her sayfada “Şehir”, “En Düşük”, “En Yüksek” veri başlıkları tablo başında oluşturulmalıdır.

- Verilerin gelmiş olduğu ana sheet Excel içerisinden silinmemelidir.

- Oluşturulan her sayfa sırası ile “Grup 1”, “Grup 2”, “Grup 3”…. olacak şekilde numaralandırılması artarak isimlendirilmelidir.

![](https://i.hizliresim.com/hwngomr.png)

- VeriSayısı %(MOD) ÖrneklemDeğeri = 0 olmaması halinde arta kalan veriler yeni bir Grup Sayfası olarak oluşturulmalıdır.

![](https://i.hizliresim.com/ap5qkem.png)

- Örneklem için input’a yeni bir değer girilip buton çalıştırıldığında daha önceden oluşturulmuş Grup Sayfaları silinerek tekrardan yeni değer ile oluşturulmalıdır.