## **PostgreSQL Diagram Oluşturma:**

\-Diagram oluşturulmak istenen ilgili database sağ tıklanır.

\-Ardından `Generate ERD` seçeneği seçilir.

![](https://33333.cdn.cke-cs.com/kSW7V9NHUXugvhoQeFaf/images/d445300f8f434cf5c0b86ffa5095c1b09aff9ca0f4ac9752.png)

\-Database'de bulunan tablo ve bağlantılara göre diagram oluşturulacaktır.

![](https://33333.cdn.cke-cs.com/kSW7V9NHUXugvhoQeFaf/images/31d626a43617df3245c5581e5aecbac404b5d5b810a94ee7.png)

## **PostgreSQL Veri Tipleri:**

### **Sayısal Veri Tipleri :**

| Veri Tipi | Boyut | Tanım | Değer aralığı |
| --- | --- | --- | --- |
| smallint (int2) | 2 byte | small-range integer | \-32768 ile +32767 aralığındaki tam sayılar |
| integer (int4) | 4 byte | typical choice for intege | \-2147483648 ile +2147483647 aralığındaki tam sayılar |
| bigint (int8) | 8 byte | large-range integer | \-9223372036854775808 ile +9223372036854775807 aralığındaki tam sayılar |

*   Integer (4 bytes): Veritabanında kapladığı alan ve performansı dikkate alındığında en iyi dengeyi sağladığı için, çok fazla kullanılan bir veri türüdür.
*   Smallint (2 bytes): Küçük değerlerde tamsayı verilerini saklamak için kullanılır.
*   BigInt (8 bytes): Büyük değerlerde tamsayı veriileri saklamak için kullanılan veri türüdür. Integer alanının yetersiz kaldığı durumlarda tercih edilmelidir.

| Veri Tipi | Boyut | Tanım | Değer aralığı |
| --- | --- | --- | --- |
| decimal | değişken | Kullanıcı tanımlı hassasiyet, mutlak | Ondalık ayracı öncesinde 131072 haneye kadar sonrasında 16383 haneye kadar |
| numeric | değişken | Kullanıcı tanımlı hassasiyet, mutlak | Ondalık ayracı öncesinde 131072 haneye kadar sonrasında 16383 haneye kadar |

*   Bu türdeki veri tipleri kesinliğin gerekli olduğu ondalıklı sayılarda kullanılmalıdır. Matematiksel işlem sonuçlarını saklamada tercih edilmelidir. Performans olarak tam sayı tiplerine oranla yavaştır. Değişken hassasiyeti kullanıcı tarafından belirlenmektedir.

```plaintext
NUMERIC (precision, scale)
```

iki farklı değer verilerek oluşturulur.

| Veri Tipi | Boyut | Tanım | Değer aralığı |
| --- | --- | --- | --- |
| real | 4 byte | değişken ondalık hassasiyeti, mutlak değil | 6 ondalık hane |
| double precision | 4 byte | değişken ondalık hassasiyeti, mutlak değil | 15 ondalık hane |

*   Real ve Double Precision veri türleri değişken hassas sayısal türlerdir. Bazı değerler bu veri tiplerinden tam olarak dönüştürülemez ve yaklaşık değer olarak depolanır.

#### **Seri Tipleri :**

*   Bu türler Smallserial, Serial, ve Bigserial veri tipleridir. Bu veri tipinden bir kolon oluşturmak istediğimizde PostgreSQL bir adet Sequence oluşturarak sahipliğini, kolon oluşturmak istediğimiz tablo yapar ve kolonun varsayılan değeri olarak oluşturulan Sequence'i verir.

#### **Metinsel Veri Tipleri :**

| Veri Tipi | Tanım |
| --- | --- |
| character varying(n), varchar(n) | değişken uzunluklu sabit boyutlu |
| character(n), char(n) | sabit uzunluklu, boş alanlar boşlukla doldurulur |
| text | değişken sınırsız uzunluklu |

Her türden veri rahatlıkla depolandığı için saklanmak istenilen veri tipi bilinmiyor ise, metin veri tipinde bir alan oluşturularak bu alanda veri saklanır. Sayısal tiplere göre okuma oldukça yavaştır.

*   character varying(n), varchar(n) -> Sınırlı değişken uzunluk
*   character(n), char(n) -> Sabit uzunluk
*   Text -> Değişken sınırsız uzunluk

#### **Parasal Veri Tipleri :**

| Veri Tipi | Tanım |
| --- | --- |
| money | sabit hassasiyetli bir para değerini saklamak için |

#### **Binary Veri Türü :**

*   Binary depolamak için imkan sağlar. Binary tipindeki verileri saklamak için PostgreSQL bytea veri tipini kullanır. Bytea veri tipi input ve output için iki formatı destekler: hex ve escape. Her iki format da daima input olarak kabul edilirken output için varsayılan format hex’tir.

![](https://33333.cdn.cke-cs.com/kSW7V9NHUXugvhoQeFaf/images/17325641d26ec47d9468eb1c98635a30df426e0aa86ffafe.png)

#### **Tarih / Zaman Veri Tipleri:**

| Veri Tipi | Depolama Alanı | Tanım | Asgari Değer | Azami Değer | Zamansal çözünürlük |
| --- | --- | --- | --- | --- | --- |
| timestamp \[ (p) \] \[ without time zone \] | 8 byte | Tarih ve saat (zaman dilimi bilgisi hariç) | 4713 MÖ | 294276 MS | 1 mikrosaniye / 14 hane |
| timestamp \[ (p) \] with time zone | 8 byte | Tarih ve saat (zaman dilimi bilgisi dahil) | 4713 MÖ | 294276 MS | 1 mikrosaniye / 14 hane |
| date | 4 byte | Tarih | 4713 MÖ | 5874897 MS | 1 gün |
| time \[ (p) \] \[ without time zone \] | 8 byte | Saat (zaman dilimi bilgisi hariç) | 00:00:00 | 24:00:00 | 1 mikrosaniye / 14 hane |
| time \[ (p) \] with time zone | 12 byte | Saat (zaman dilimi bilgisi dahil) | 00:00:00 +1459 | 24:00:00-1459 | 1 mikrosaniye / 14 hane |
| interval \[ fields \] \[ (p) \] | 16 byte | Zaman araligi | \-178000000 yıl | 178000000 yıl | 1 mikrosaniye / 14 hane |

#### **Network Adres Tipleri:**

| Veri Tipi | Boyut | Tanım |
| --- | --- | --- |
| cidr | 7 - 19 byte | IPv4 ve IPv6 ağlar |
| inet | 7 - 19 byte | IPv4 ve IPv6 ağlar / sunucular |
| macaddr | 6 byte | MAC adresleri |
| macaddr8 | 8 byte | MAC adresleri (EUI-64 formatı) |

Ağ adreslerini depolamak için düz metin türleri yerine bu türleri kullanmak daha iyidir; çünkü bu türler hatalı veri girişine izin vermez, veri uyumsuzluğu hatası olarak geri döner.

*   Cidr (7 veya 19 byte) : IPV4 ve IPv6 ağları.
*   Inet (7 veya 19 byte) : IPV4 ve IPv6 barındırıcılar ve ağlar. Varchar yerine ağ adres türlerini kullanmak; IP/ağ doğrulamasının veritabanı tarafından otomatik yapılmasını sağlar.

#### **Boolean Türü :**

*   Boolean veri ihtiyaçları için PostgreSQL’de sunulan **BOOLEAN** veri tipi `TRUE`, `FALSE` ve bilinmeyen durumlarda kullanılmak üzere de `NULL` değerlerini alabilir. Bu veri tipinde true yerine _yes_, _on_, _t_ ya da 1 kabul edilebilirken false yerine de _no_, _off_, _f_ ve 0 kabul edilmektedir. Büyük - küçük hassasiyeti aranmaz.

#### **Geometrik Veri Tipleri:**

| Veri Tipi | Boyut | Tanım | Gösterim |
| --- | --- | --- | --- |
| point | 16 byte | düzlemde bir nokta | (x,y) |
| line | 32 byte | sonsuz doğru | {A,B,C} |
| lseg | 32 byte | sonlu doğru parçası | ((x1,y1),(x2,y2)) |
| box | 32 byte | dikdörtgensel kutu | ((x1,y1),(x2,y2)) |
| path | 16+16n byte | kapalı hat (polygon) | ((x1,y1),…) |
| path | 16+16n byte | açık hat (polyline) | \[(x1,y1),…\] |
| polygon | 40+16n byte | polygon | ((x1,y1),…) |
| circle | 24 byte | çember | \<(x,y),r> merkezin koordinatları ve yarıçap |

Bu veri türleri iki boyutlu uzaysal nesneleri temsil eder.

*   point (16 byte) : Sayı düzlemi.
*   line (32 byte) : Sonsuz hat.
*   box (32 byte) : Dikdörtgen kutu.
*   Circle (24 byte) : Daire.

#### **Composite Types:**

Birleştirilmiş tipler olarak ifade edilebiliriz.

Kullanımı:

```plaintext
CREATE TYPE typ_ogrenci AS (
    ogrenci_no BIGINT,
    ad  VARCHAR(50),
    soyad VARCHAR(50)
);
```

Oluşturduğumuz yeni veri tipini, bir veri satırı olarak düşünebilirsiniz.Bu özelliği sayesinde tablomuzda bir alan içerisinde bir satır veri saklamamızı sağlar.

*   Oluşturduğumuz yeni veri tipimizin bir tablo içinde kullanımı:

```plaintext
CREATE TABLE tb_ogrenci_not (
    ogrenci public.typ_ogrenci,
    ders_adi VARCHAR(30),
    ders_notu SMALLINT
) ;
```

**Veri giriş şekli** :

```plaintext
INSERT INTO tb_ogrenci_not (
  ogrenci,ders_adi,ders_notu)
VALUES ((1,'ada','lovelace'), 'postgresql', 100);
```

Burada görüldüğü gibi ogrenci alanındaki tüm bilgiler aynı alanda gelmiştir.

*   Bu alandaki verileri ayrı görmek için aşağıdaki şekilde sorgumuzu yazabiliriz:

```plaintext
SELECT (ogrenci).* FROM tb_ogrenci_not ;
```

*   Oluşturduğumuz Composite Types verisinin bir alanına göre sorgulama yapmak istersek :

```plaintext
SELECT (ogrenci).ad FROM tb_ogrenci_not WHERE (ogrenci).ad = 'Ada' ;
```

*   Eğer veri tipinin tüm alt değerlerini değiştirmek istersek :

```plaintext
UPDATE tb_ogrenci_not SET ogrenci = (101,'marie','curie')
WHERE (ogrenci).ogrenci_no=2;
```

#### **UUID ( Universally Unique Identifier ) Türler:**

UUID'ler belirli bir algoritma kullanarak benzersiz bir sayı üretmeyi sağlar. Bu sayı 128 bitlik ve 36 karakter uzunluğundadır. Veri gösteriminde standart olarak 8-4-4-4-12 formatında ve hepsi küçük harf olarak gösterilir.

UUID örnekleri :

```plaintext
 5545f312-9818-11e9-ac0c-525400261060
 5456f6fe-9818-11e9-ac0c-525400261060
 52b0b3e4-9818-11e9-ac0c-525400261060
```

```plaintext
CREATE TABLE tb_ogrenci(id uuid, ad varchar(50), soyad varchar(50));
```

tb\_ogrenci tablosunda ID alanının veri tipini UUID veri tipinde oluşturduk.

**UUID Veri Üretmek**

PostgreSQL'de UUID veri üretmek için uuid-ossp modülünü yüklememiz gerekir.

```plaintext
CREATE EXTENSION IF NOT EXISTS "uuid-ossp";
```

Modül yüklendikten sonra şu şekilde UUID üretebiliriz :

```plaintext
SELECT uuid_generate_v1();
```

ID alanımızın varsayılan değerine UUID üreten fonksiyonumuzu atayalım:

```plaintext
CREATE TABLE tb_ogrenci2(
    id uuid DEFAULT uuid_generate_v4(),
    ad varchar(50),
    soyad varchar(50)
);
```

UUID veri tipinde bir kolon oluşturmak için standart kolon ekleme yöntemleri kullanılır. Sadece veri tipi yerine UUID ifadesi kullanılır.

#### **JSON ( JavaScript Object Notation ) Veri Tipi :**

JSON veri türleri; JSON türünde veri saklamak için kullanılan bir veri tipidir. Metin tabanlı, dilden bağımsız ve kendine özgü bir formatı bulunur. Diğer formatların aksine JSON, insan tarafından okunabilen bir metindir.

**JSON veri tipi kullanımı**

```plaintext
CREATE TABLE tb_ogrenci_dersler(
    ID serial NOT NULL PRIMARY KEY,
    ogrenci_id Integer,
    dersler jsonb);
```

Bu tabloda dersler alanı JSONB veri tipinde oluşturulmuştur.