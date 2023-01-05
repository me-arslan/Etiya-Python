### Summary: Kullanıcı Girilmiş Verilere Uygun Bir Şekilde Araçları Filtreleyebilmeli
 
 ![](https://i.hizliresim.com/emvory5.png)
 
 Accaptence Criterias:
 
 Varsayım 1: Kiralama işlemleri Yurtiçi için geçerli olacaktır. 
 
 
 1. Kullanıcının aracı hangi lokasyondan alacağını seçebileceği bir seçim kutusu oluşturulmalıdır.
  
  1.1. Lokasyon, lokasyon adı içerisinde geçecek şekilde aranabilir. Büyük - küçük harf duyarlılığı yoktur.
  
  1.2. Girdi yazılırken daha önce en çok arananlar listelenerek sıralanmalıdır. 
  
  1.3. Kullanıcıyı yönlendirmek amaçlı girdi kutusunda gölgeli yazı(placeholder) "Nereden Alacaksınız?" yazmalıdır.
  
  1.4. Kullanıcıyı yönlendirmek amaçlı seçim kutusu üstüne üzerine tıklandığında "Listeden Seçim Yapabilir veya Lokasyon Adı Yazabilirsiniz" (pop-up) ibaresi belirten bir bilgi ikonu oluşturulmalıdır.
  
  1.5. Seçim Listesi içerisinde kullanıcının bulunduğu konumu seçebileceği bir konum ikonu olmalıdır. 
   
   1.5.1. Mevcut Konum ikonu tıklandığında "Mevcut Konumu Kullan" (pop-up) ibaresi belirmelidir. 
   
  ![](https://i.hizliresim.com/7l75ctk.png)
  
 2. Aracın alış tarihinin ve saatinin seçilebileceği bir tarih - saat seçim alanı oluşturulmalıdır.
  
  2.1. Takvim seçildikten sonra saat seçim alanı belirmelidir.
  
  2.2. ilk olarak İade tarihi seçildi ise alış tarihi seçiminde seçilen tarih ve saat sonrası seçilemez ve aktif olmamalıdır.
  
  ![](https://i.hizliresim.com/z3ubl1w.png)
  
 3. Aracın iade tarihinin ve saatinin seçilebileceği bir tarih - saat seçim alanı oluşturulmalıdır.
  
  3.1. Tarih seçildikten sonra saat seçim alanı belirmelidir. 
  
  3.2. ilk olarak Alış tarihi seçildi ise iade tarihi seçiminde seçilen tarih ve saat öncesi seçilemez ve aktif olmamalıdır. 
  
  ![](https://i.hizliresim.com/20cxo2p.png)
  
 4. Sürücünün Yaşının seçilebileceği bir seçim kutusu oluşturulmalıdır.
  
  4.1. Kullanıcıyı yönlendirmek amaçlı seçim kutusu üstüne üzerine tıklandığında "Uygun Araçlar İçin Yaş Aralığınızı Seçiniz" (pop-up) ibaresi belirten bir bilgi ikonu oluşturulmalıdır.
  
  ![](https://i.hizliresim.com/mdgz0n9.png)
  
 5. Aracın kiralandığı lokasyondan farklı bir lokasyona iade edilebilmesi durumu için opsiyonel bir tik kutusu olmalıdır ve yanında "Farklı Yerde Bırakacağım" yazılmalıdır.
  
  5.1. Tik kutusunun tıklanmadan önce üzerine tıklandığında "Araç iadenizi farklı bir lokasyonda gerçekleştirebilirsiniz" (pop-up) ibaresi belirten bir bilgi ikonu oluşturulmalıdır.
  
  5.2. Tik kutusu tıklandığında, tik kutusu yanındaki yazı ortadan kalkarak "Araç Teslim Lokasyon" seçim kutusunun aynısı iade lokasyonu için belirmeli.
  
  5.3. Belirecek "Araç İade Lokasyonu" seçim kutusu için 1. maddedeki kabul kriterleri geçerlidir.
  
  5.4. Kullanıcının yanlışlıkla tıklama ihtimaline veya fikrini değiştirme ihitimaline karşın tik kutusu tıklandıktan sonra işlemin geri alınabileceği bir çarpı işareti oluşturulmalıdır. 
  
  5.5. Çarpıya tıklandığında lokasyon seçim kutusu kapanmalıdır ve ilk aşamada bulunan Farklı Lokasyon tik kutusu geri gelmelidir. 
  
  ![](https://i.hizliresim.com/8bqxeqs.png)
  
 6. Kullanıcının promosyon kullanabilmesi için bir tik kutusu olmalıdır ve yanında "Promosyon Kodu Kullan" ibaresi yazmalıdır.
  
  6.1. Tik kutusunun tıklanmadan önce üzerine tıklandığında "Promosyon Kodu Kullanabilirsiniz" (pop-up) ibaresi belirten bir bilgi ikonu oluşturulmalıdır.
  
  6.2. Tik kutusu tıklandığında, tik kutusu yanındaki yazı ortadan kalkarak "Promosyon Türü" için bir seçim kutusu ve "Promosyon Kodu" için bir girdi kutusu oluşturulmalıdır.
  
  6.3. Seçilen "Promosyon Türü"ne göre belirlenen promosyon tanımları kullanılarak "Promosyon Kodu" girdi kutusu ismi değişmelidir ve bazı durumlarda "Promosyon Kodu" Girdi kutusu olmamalıdır. Başka bir seçim yapıldığında geri gelmelidir.
  
  Örneğin; Halkbankası seçimi yapıldığında, Promosyon kodu girdi kutusu "Kartınızın İlk 6 Hanesini Giriniz" olarak değişmeli. Sistemde tanımlı promosyonları ve şartlarını ekte bulunan promosyonTanim.xlsx dosyasında bulabilirsiniz.
  
  6.4. Kullanıcının yanlışlıkla tıklama ihtimaline veya fikrini değiştirme ihitimaline karşın tik kutusu tıklandıktan sonra işlemin geri alınabileceği bir çarpı işareti oluşturulmalıdır.
  
  6.5. Çarpıya tıklandığında Promosyon Türü seçim kutusu ve Promosyon Kodu girdi kutusu kapanmalıdır ve ilk aşamada bulunan promosyon kullanımı tik kutusu geri gelmelidir.
  
  ![](https://i.hizliresim.com/tw3zy44.png)
  
 7. Kullanıcıya uygun araçların filtrelenebilmesi için "Uygun Araçları Listele" isimli bir buton oluşturulmalıdır.

 8. Promosyon Kodunun eksik veya yanlış girilmesi durumunda “Listele” butonu sonrasında ekranda bir uyarı kutusu belirmeli.
 
  ![](https://i.hizliresim.com/t4lzy2a.png)
  
 9. Kullanıcının herhangi bir seçim yapmaması halinde ve “Listele” butonuna tıkladığında varsayılan değerler atanacaktır. 

	- Varsayılan Girdiler: Lokasyon için en çok aranan lokasyon, 

	Alış tarihi için kullanıcının “Listeleme” butonuna tıkladığı tarih ve tıkladığı saatten 2 saat sonrası,

	İade tarihi Alış tarihinin 2 gün sonrası,

	Sürücü Yaşı tüm araçların görülebilmesi adına 27+.