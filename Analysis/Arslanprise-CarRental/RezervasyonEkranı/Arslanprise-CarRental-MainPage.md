Summary: Uygulanmış filtrelere göre uygun araçlar görüntülenebilmeli ve seçilebilmeli

Accaptence Criterias:


1. Ekranın en üstünde işlem sırasını ve bulunduğumuz işlemi belirten bir bilgi ekranı oluşturulmalı.

 1.1. İlk işlemde RC-1(Ana Sayfa) story'sinde belirtilmiş bilgilerin kullanıcıya gösterilebilmesi için "Kiralama" olarak yazılmalı.

 1.2. RC-1'de yapılmış olan "Filtreleme Ekranı"nda seçilmiş olan rezervasyon bilgileri bu alanda belirtilmeli.

 1.3. İşlem sırası "Kiralama", "Araç Seçimi", "Ekstralar", "Ödeme Ekranı" olarak devam etmeli.
 
 1.4. Kullanıcı bulunduğu işlemden sonrasına tıklayamamalı ve önceki işleme tıkladığında o sayfaya dönebilmeli. 

 Tasarım aşağıdaki mockup gibi olmalıdır.
 
 ![](https://i.hizliresim.com/sf45pao.png)

2. Kullanıcının araç detaylarını seçebileceği bir filtreleme form ekranı oluşturulmalı.

 2.1. Araç sınıfının seçilebileceği bir filtreleme kısımı oluşturulmalıdır ve her araç sınıfının yanında bir tik kutusu oluşturulmalıdır.  

 2.2. Yakıt tipinin seçilebileceği bir filtreleme kısımı oluşturulmalıdır ve her yakıt tipinin yanında bir tik kutusu oluşturulmalıdır.

 2.3. Vites tipinin seçilebileceği bir filtreleme kısımı oluşturulmalıdır ve her vites tipinin yanında bir tik kutusu oluşturulmalıdır.

 2.4. Bütün filtrelemeler çoklu seçime uygun yapılmalı ve tik kutuları işaretlendiği anda filtreleme işlemi gerçekleşmelidir. 

 2.5. Filtreleme form ekranı içerisinde kullanıcının kendi istediği fiyat aralığını belirleyebilmesi için bir *slider eklenmeli.  

 2.6. Bir veya birden fazla filtre seçildikten sonra, seçilen Filtrelerin hepsinin seçiminin aynı anda kaldırılabilmesi için bir "Filtreleri Temizle" butonu oluşmalı ve tıklandığında seçilmiş bütün filtreleri kaldırmalıdır. 

 2.7. Sistemde tanımlı araç sınıflarını, yakıt tiplerini ve vites tiplerini ekte bulunan aracDetay.xlsx dosyasında bulabilirsiniz.

 Tasarım aşağıdaki mockup gibi olmalıdır.
 
 ![](https://i.hizliresim.com/t3e7911.png)

3. Filtereleme form ekranın yanında, girdilere uygun araçlar görüntülenebilmeli.

 3.1. Görüntülenen araçlar ismi, görseli, günlük fiyatı, vites tipi, araç kişi kapasitesi ve bagaj kapasitesi ile birlikte görüntülenebilmeli. 

 3.2. Görüntülenen araçlara tıklandığında seçilen araç belirgin olmalı (highlight, stroke kullanılabilir). 
 
 ![](https://i.hizliresim.com/a7wkw4d.png)

 3.3. Kullanıcının aracın özellikler ve fiyat detaylarını görebileceği bir buton listelenen her aracın altına eklenmelidir.

 3.4. "Araç Detay" butonuna tıklandığında, seçilen aracın benzerlerinin görüntülebilmesi için bir "Benzer Araçlar" butonu eklenmeli.
 
 ![](https://i.hizliresim.com/p9337m0.png)

  3.4.1. "Benzer Araçlar" butonuna tıklandığında seçilmiş olan aracının özelliklerine yakın araçlar ayrı bir pop-up ekranında listelenmeli.
 
 ![](https://i.hizliresim.com/nj1yrfp.png)  

 3.5. Kampanyalı olan araçlar, araç çerçeveleri içerisinde belirtilmeli.

 3.6. Fiyatlarda indirim olması halinde, eski fiyatların üstü çizilerek indirimli fiyat eski fiyatın yanına yazılmalıdır.

4. RC-1 Story'sinde düzenlenmiş olan Filtreleme Ekranı içerisinde girilmiş olan promosyon bilgilerinin gösterileceği bir bilgi ekranı oluşturulmalıdır.

5. Filtrelenen araçların fiyat bilgilerine göre "Azalan" veya "Artan" olarak sıralanmasını sağlayacak bir seçim kutusu olmalıdır.

6. Ekranın üstünde sabit olacak şekilde toplam fiyat değerini gösteren bir bilgi yazısı olmalıdır.

 6.1. Araca tıklandığında "Rezervasyon Bilgileri"nde belirtilmiş olan tarihler için seçilen aracın toplam fiyat bilgisi burada gösterilmelidir.

 6.2. Araç seçimi tekrar araç üstüne tıklanarak iptal edildiğinde veya farklı bir araç seçimi yapıldığında, toplam değer dinamik olarak yeni değer ile değişmelidir. 

7. Seçilen araç ile rezervasyona devam edebilmek için "Rezervasyona Devam Et" butonu oluşturulmalıdır.

 7.1. "Rezervasyona Devam Et" butonuna tıklandığında seçilen aracın sınıfının bir şartı olması halinde kullanıcıyı bilgilendiren bir uyarı ekranı oluşmalıdır. Uyarı ekranına bir çarpı işareti yerleştirilmeli ve kullanıcı tıkladığına işlemine devam edebilmelidir.

 Sistemde tanımlı sınıfları ve şartlarını ekte bulunan aracSinif.xlsx dosyasında bulabilirsiniz.

 Örneğin; Değerli müşterimiz, SUV, üst ve lüks sınıftan kiralama yapılabilmesi için ofislerimizden daha önce herhangi bir sınıfta kiralama yapma şartı kontrol edilmektedir.

 7.2. "Sınıf Uyarı" ekranı kapatıldıktan sonra "Rezervasyona Devam Et" butona tıklandığında bir sonraki işlem sayfasına geçiş sağlanmalıdır. İlk etapta araç sınıfı uyarı gerektirmiyorsa bu işlem direkt sağlanmalıdır.

 ![](https://i.hizliresim.com/sdoctl3.png) 