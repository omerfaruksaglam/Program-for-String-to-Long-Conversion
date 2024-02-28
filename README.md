# Program-for-String-to-Long-Conversion
Bil458- hw1 

String'den Long'a Dönüşüm Programı
Bu Java programı, bir string'i long veri tipine dönüştürmek için yazılmıştır. Program, verilen string içerisinde sayısal bir değer barındırıyorsa, bu değeri long tipine çevirir. Eğer string sayısal bir değer içermiyorsa, bir hata mesajı gösterir.

Kurulum
Bu programı çalıştırmak için Java Development Kit (JDK) yüklü bir sisteme ihtiyacınız var. JDK'nın en güncel sürümünü Java'nın resmi web sitesinden indirip kurabilirsiniz.

Programın Çalıştırılması
Programı çalıştırmak için aşağıdaki adımları takip edin: 

1-  Bir metin editörü kullanarak StringToLongConversion.java adında bir dosya oluşturun.

2-  Yukarıda verilen Java kodunu bu dosyaya yapıştırın.

3-  Komut satırı veya terminali açın ve Java dosyasının bulunduğu dizine gidin.

4-  Aşağıdaki komutu kullanarak programı derleyin:

    javac StringToLongConversion.java
    
5-  Programı çalıştırmak için aşağıdaki komutu kullanın:

    java StringToLongConversion
   

Program çalıştırıldığında, örnek bir string değeri long tipine dönüştürülür ve sonuç ekrana yazdırılır. Eğer dönüştürülmek istenen string sayısal bir değer içermiyorsa, program bir hata mesajı gösterir.

Hata Yönetimi

Program, girilen string'in sayısal bir değer olup olmadığını kontrol eder. Sayısal olmayan bir değer girilirse, NumberFormatException hatası yakalanır ve kullanıcıya bir hata mesajı gösterilir. Bu sayede programın beklenmedik durumlarda çökmesinin önüne geçilir.

