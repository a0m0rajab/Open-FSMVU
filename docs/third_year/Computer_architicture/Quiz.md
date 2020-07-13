# Quiz

## Soru 1 

Aşağıdaki C kodunun Arm assembly dilindeki karşılığını yazınız.

```C
// R5 -> int *p=intDizi;
//R6 -> a;
*p=0;
İnt a=4;
p[1]=p[a]=a;
```

### Solution

```assembly
MOV R6,#4
LDR R5,=intDizi
STR R6,[R5,#16]
STR R6,[R5,#4]
```

Yorum: 
*p=0; burası için de bir str yapmak gerekiyor.

## Soru 2 

Teori ve uygulama dersinde  gördüğünüz temel single-cycle ARM uygulaması sadece bazı komutları uygulayabilmektedir.  Elinizde bulunan komut seti mimarisine yeni komutlar eklenebilmektedir, sadece maliyet, karmaşıklık gibi nedenlerle eklenmemiştir. Aşağıdaki soruları verilen komuta göre cevaplayınız.

add3 Rd,Rs,Rt,Rx                                            Reg[Rd]=Reg[Rs]+Reg[Rt]+Reg[Rx]  ;  şeklinde bir komut eklenmek isteniyor. Bu komut 3 tane kaydediciyi toplayıp sonucu bir kaydediciye yazıyor.

Bu komutun çalışması için datapath kullandığınız datapath üzerinde değişikliğe gerek var mıdır? Bu komut mevcut yapıda çalışabilir mi? Çalışmaz ise nasıl bir değişiklik yapılması gerekir? (Yeni blok ekleme ya da varolan bloklarda değişiklik yapma. ) ( Blok dediğimiz pc,regfile,alu,memory,mux gibi öğeler.)

### solution 

Register'a okuma ve yazma gerceklestiryior

Read resitser eklemesi lazim (reg RC okumasi icin) yada yeni bir alu olusturmasi ya da ucuncu bir giris alu icin eklenmeli 

hem de yeni kontrol sinyali lazim yada yeni bir add3 operatorur

Yorum: tam puan aldim.

## Soru 3 

- ARM assembly dili içerisine aşağıdaki pseudo komutun eklendiğini varsayalım.

Bcift RX,etiket  -->   Komut RX kaydedicisine bakıyor ve içerisinde tutulan değer çift bir tamsayı ise belirlenen etikete dallanma işlemi gerçekleştiriyor. (Örnek Bcift R0,son ; R0 içerisinde çift sayı var ise son etiketine gidecektir  )

Bu ifadeyi minimum sayıda komut kullanarak gerçekleştiriniz. (Program parçası yazmayınız  2-3 komut ile gerçekleştirmeye çalışın.)



### Solution

[Burada guzel anlatiyor](https://www.trccompsci.online/mediawiki/index.php/Assembly_Language_Check_for_ODD_/_EVEN)