package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lambda03 {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>(Arrays.asList(7, 12, 14, 4, 9, 2, 4, 12, 16));
        ilkDortEleman(l);
        System.out.println();
        ilkDortElemanGec(l);
        System.out.println();
        ucElemanYazdir(l);

    }


    //1)kücükten büyüğe sırala sonra ilk 4 elemanı yazdır.
    public static void ilkDortEleman(List<Integer> l) {
        l.stream().sorted().limit(4).forEach(metodLambda2::bosluklaYzdir);

    }

    //2)kücükten büyüğe sırala ilk 4 elemanı atla
    public static void ilkDortElemanGec(List<Integer> l) {
        l.stream().sorted().skip(4).forEach(metodLambda2::bosluklaYzdir);
    }
        //3)kücükten büyüğe sıralı 4.5. ve 6. elemanı sırala

        private static void ucElemanYazdir (List < Integer > l) {
            l.stream().sorted().skip(3).limit(3).forEach(metodLambda2::bosluklaYzdir);

        }
    }
