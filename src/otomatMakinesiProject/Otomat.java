package otomatMakinesiProject;

import java.util.Scanner;
import java.util.TreeMap;

public class Otomat {
    /*
--5 adet ürün ve bu ürünlerin fiyatlarını belirleyiniz.
Bu ürünler ekranda listelensin
--Ürün seçip, para miktarı giriniz
--girdiğiniz para fazla ise üstünü versin,
eksik ise ekleme yapmanızı istesin
--Ek ürün seçme seçeneği olsun, siz devam ettiğiniz sürece,
para kontrolünü de yaparak işlem yapmaya devam etsin...
NOT: Otomat sadece 1 tl , 5 tl, 10 tl, 20 tl miktarlarını kabul etsin
oop concepte ait öğrendiklerimizi kullanmaya çalışalım...
iyi çalışmalar
Kolay gelsin...
*/
    public static void main(String[] args) throws InterruptedException {
        Scanner scan=new Scanner(System.in);
        System.out.println("Java Otomatina Hosgeldiniz\nÜrünler Asagida Listelenmistir. ");

        TreeMap<String, Double> urunler = new TreeMap<>();
        urunler.put("1-Su", 1.0);
        urunler.put("2-Cay", 1.5);
        urunler.put("3-Bisküvi", 2.5);
        urunler.put("4-Cola", 3.5);
        urunler.put("5-Kek", 2.5);


        double toplamTutar=0;
        boolean flag=false;
        String devam=" ";
        urunler.forEach((x,y)-> System.out.println(x+"="+y+"tl"));


        do {
          System.out.println("Lütfen Seciminizi yapiniz...");
          int secim = scan.nextInt();

          switch (secim) {

              case 1:
                  toplamTutar += urunler.get("1-Su");
                  flag=false;
                  break;
              case 2:
                  toplamTutar += urunler.get("2-Cay");
                  flag=false;
                  break;
              case 3:
                  toplamTutar += urunler.get("3-Bisküvi");
                  flag=false;
                  break;
              case 4:
                  toplamTutar += urunler.get("4-Cola");
                  flag=false;
                  break;
              case 5:
                  toplamTutar += urunler.get("5-Kek");
                  flag=false;
                  break;
              default:
                  System.out.println("Yanlıs Tuslama Yaptiniz,Lütfen Tekrar Deneyiniz:");
                  flag=true;
                  break;
          }

          if (flag==false ){
              System.out.println("Sectiginiz ürün düşüyor...");
              Thread.sleep(5000);
              System.out.println("---------------------------");
              System.out.println("Başka bir ürün almak ister misiniz:(E/H)");
              System.out.println("------------------------------------------");
              devam=scan.next();
          }
      }while (devam.equalsIgnoreCase("E") || flag==true);
        System.out.println("Ödemeniz gereken tutar "+toplamTutar+"tl");
        System.out.println("------------------------------------------");
        double odemeTutarı=0;
        do {


        System.out.println("Lütfen ücreti nakit giris bölümüne yerleştiriniz,");
        double banknot=scan.nextDouble() ;
        if (banknot==1 || banknot==5 || banknot==10 || banknot==20)
        {
            System.out.println("-------------------------------------");
            odemeTutarı += banknot;
            if (odemeTutarı < toplamTutar) {
                System.out.println("Lütfen ödemeyi tam yapınız,ödemeniz gerekn eksik tutar:" + (toplamTutar - odemeTutarı));

            }
            System.out.println("paranız kontrol ediliyor....");
            Thread.sleep(300);
            System.out.println("Paranız onaylandı");
        }else{
            System.out.println("Otomatımız 1tl,5tl,10tl,20tl'lik banknotları kabul ediyor.Lütfen tekrar para yüklemesi yapınız");
        }
    }while (odemeTutarı>toplamTutar);
        if (odemeTutarı>toplamTutar){
            System.out.println("Para ustunuz----->"+(odemeTutarı-toplamTutar));
        }
        System.out.println("İyi günler dileriz...");

    }



    }
