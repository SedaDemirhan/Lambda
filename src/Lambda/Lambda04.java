package Lambda;

import java.util.*;

public class Lambda04 {
    public static void main(String[] args) {

    List<String> l = new ArrayList<>(Arrays.asList("Ali","Ali","Aysima","Abdurrahman","Mehmet","Mustafa","Bedirhan","Yüksel","Süleyman"));
   yazdirBuyuk(l);
        System.out.println();
        uzunlukSirala(l);
        System.out.println();
        farkliSonHarfSirala(l);
        System.out.println();
        uzunlukSiralaIlkEleman(l);
        System.out.println();
        yazdirAileBaslayan(l);
        System.out.println();
        AbaslaVeyaİBit(l);
        System.out.println();
        siralaBuyut(l);
        System.out.println();
        isimUzunlukSirala(l);
        System.out.println();
        karesiniALSiralaSil(l);
        System.out.println();
        ebikGabık(l);
        System.out.println();
        sondanIkınciSıralaIlk(l);
        System.out.println();
        terstenSıralaIlkYazdir(l);


   }




    //1)List'in elemanlarını büyük harfle yazdir
public static void yazdirBuyuk(List<String> l) {
        l.stream().map(t->t.toUpperCase()).forEach(metodLambda2::bosluklaYzdir);
    System.out.println();
        l.stream().map(String::toUpperCase).forEach(metodLambda2::bosluklaYzdir);
}

//2) elemanları uzunluklarına göre sırala ve yazdır
private static void uzunlukSirala(List<String> l) {
        l.stream().sorted(Comparator.comparing(String::length)).forEach(metodLambda2::bosluklaYzdir);
    System.out.println();
    l.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(metodLambda2::bosluklaYzdir);

    }
//3) farklı elemanlarını son harflerine göre sıralayıp yazdır
private static void farkliSonHarfSirala(List<String> l) {
        l.stream().distinct().sorted(Comparator.comparing(t->t.substring(t.length()-1))).forEach(metodLambda2::bosluklaYzdir);
}
//4) Elemanları uzunluklarına ve ardından (aynı uzunlukta olanları) ilk karakterlerine göre sıralamak için bir yöntem oluşturun
private static void uzunlukSiralaIlkEleman(List<String> l) {
        l.add("Ata");
        l.stream().sorted(Comparator.comparing(String::length).thenComparing(t->t.substring(0,1))).forEach(metodLambda2::bosluklaYzdir);

    l.stream().sorted(Comparator.comparing(String::length).thenComparing(t->t.substring(0,1)).thenComparing(t->t.substring(1,2))).forEach(metodLambda2::bosluklaYzdir);


    }
    //5)Büyük harflerle, "A" ile başlayan liste öğelerini yazdırmak için bir yöntem oluşturun
    public static void yazdirAileBaslayan(List<String> l) {
        l.stream().filter(t->t.startsWith("A")).map(String::toUpperCase).forEach(metodLambda2::bosluklaYzdir);

    }
    //6)  Küçük harflerle, "A" ile başlayan veya "i" ile biten liste öğelerini yazdırmak için bir yöntem oluşturun
    public static void AbaslaVeyaİBit(List<String> l) {
        l.stream().filter(t->t.startsWith("A")  || t.endsWith("i")).map(String::toLowerCase).forEach(metodLambda2::bosluklaYzdir);


    }
    //7) Öğeleri uzunluklarına göre sıraladıktan sonra büyük harflerle yazdırmak için bir yöntem oluşturun
    public static void siralaBuyut(List<String> l) {
        l.stream().map(String::toUpperCase).sorted(Comparator.comparing(String::length)).forEach(metodLambda2::bosluklaYzdir);

    }
    //8) Elemanları uzunluklarına göre sıralayın önce elemanı sonra uzunluğunu yazdırın
    public static void isimUzunlukSirala(List<String> l) {
        l.stream().sorted(Comparator.comparing(String::length)).map(t->t+ ":" +t.length()).forEach(metodLambda2::bosluklaYzdir);
    }
    //9) Her elemanın uzunluğunun karesini alıp tekrarlıları sil, bunların 20'den büyük olanlarını ters sırada  yazdırın
    public static void karesiniALSiralaSil(List<String> l) {
        l.stream().map(t->t.length()*t.length()).distinct().filter(t->t>20).sorted(Comparator.reverseOrder()).forEach(metodLambda2::bosluklaYzdir);
    }
    ////10) Tüm elemanların uzunluklarının 12'den az olup olmadığını kontrol etmek için bir metod oluşturun
////bütün elemanların "x" ile başlamadığını kontrol etmek için bir yöntem oluşturun
////en az 1 tane "R" ile biten eleman olup olmadığını kontrol etmek için bir metod oluşturun.

    public static void ebikGabık(List<String> l) {
       boolean resutl1= l.stream().allMatch(t->t.length()<12);
        System.out.println("elemanların uzunlukları 12 den küçük mü ?  "+resutl1);
        System.out.println();
        boolean result2=l.stream().noneMatch(t->t.startsWith("X"));
        System.out.println("X ile başlayan öğe yok mu? : "+result2);
        System.out.println();
        boolean result3=l.stream().anyMatch(t->t.endsWith("R"));
        System.out.println("elemanlardan herhangi biri R ile bitiyor mu? : "+result3);

    }
   //11) elemanları sondan 2. elemanlarına göre sıralayıp ilk elemanı yazdır

    public static void sondanIkınciSıralaIlk(List<String> l) {
        System.out.println(l.stream().sorted(Comparator.comparing(t -> t.charAt(t.length() - 2))).findFirst());
    }
    //12)elemanlari uzunluklarina gore tersten siralayip ilk elemani yazdir
    public static void terstenSıralaIlkYazdir(List<String> l) {
        System.out.println(l.stream().sorted(Comparator.comparing(String::length).reversed()).findFirst());
        //9) Eleman 'A', 'a' ile başlıyor veya 'N', 'n' ile bitiyorsa o elemanı silin
    //l.removeIf(t->t.toUpperCase().startsWith());

    }



}
