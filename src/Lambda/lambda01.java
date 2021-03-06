package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class lambda01 {
    public static void main(String[] args) {
        List<Integer>l=new ArrayList<>(Arrays.asList(14,9,13,4,9,2,4,14,15));
        yazdirJava(l);
        System.out.println();
        yazdirLambda(l);
        System.out.println();
        ciftSayiJava(l);
        System.out.println();
        ciftSayiLambda(l);
        System.out.println();
        tekSayıKare(l);
        System.out.println();
        farklıTekKüp(l);
        System.out.println();
        ciftSayiKareToplam(l);
        System.out.println();
        tekrarsizCiftKüpCarpim(l);
        System.out.println();
        tersDuzSira(l);



    }




    //1)list'in elemanlarını yanyana yazdır(java ile)
    public static void yazdirJava(List<Integer>list) {
        for (Integer w:list){
            System.out.print(w+" ");
        }
    }
    //lambda(functional)
    public static void yazdirLambda(List<Integer>l){

        l.stream().forEach(t-> System.out.print(t+" "));
    }

    //2)List in elemanlarından ÇİFT olanları aralarında boşluk bırakarak yazdıran metod oluştur(Structured)

    public static void ciftSayiJava(List<Integer> l) {
        for (Integer w:l) {
            if (w%2==0){
                System.out.print(w+" ");
            }

        }

    }
//lambda yöntemiyle(functional)
public static void ciftSayiLambda(List<Integer> l) {
        l.stream().filter(t->t%2==0).forEach(t-> System.out.print(t+" "));

}
//3)List'teki tek sayıların karelerini yazdıran method oluşturun

    public static void tekSayıKare(List<Integer> l) {
        l.stream().filter(t->t%2==1).map(t->t*t).forEach(t-> System.out.print(t+" "));
    }
    //4)Listedeki tekrarlı elemanları silip tek sayı olanların küplerini yazdıran metod oluştur
    public static void farklıTekKüp(List<Integer> l) {
        l.stream().distinct().filter(t->t%2==1).map(t->t*t*t).forEach(t-> System.out.print(t+" "));
    }

    //5)List'deki tekrarlı elemanları silip çift sayi olanların karelerinin toplamını yazdıran method olustur.

    public static void ciftSayiKareToplam(List<Integer> l) {
        System.out.println(l.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t).reduce(0, (x, y) -> x + y));
    }
//6)Listedeki tekrarlı elemanları silip çift sayı olanların küplerinin çarpımını yazdıran metod oluştur
public static void tekrarsizCiftKüpCarpim(List<Integer> l) {
        int sayi=l.stream().distinct().filter(t->t%2==0).map(t->t*t*t).reduce(1,(x,y)->x*y);
    System.out.println(sayi);
  }
  //7)Listedeki elemanları sıralayarak ve ters sıralayarak yazdır
  public static void tersDuzSira(List<Integer> l) {
      l.stream().sorted().forEach(t-> System.out.print(t+" "));//2 4 4 9 9 13 14 14 15
      System.out.println();
      l.stream().sorted(Comparator.reverseOrder()).forEach(t-> System.out.print(t+" "));//15 14 14 13 9 9 4 4 2


  }

}
