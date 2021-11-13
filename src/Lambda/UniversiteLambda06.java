package Lambda;

public class UniversiteLambda06 {
    //ENCAPSULATİON

private String fakülte;
private String bolüm;
private int notOrtalama;
private int ogrenciNo;

    public String getFakülte() {
        return fakülte;
    }

    public String getBolüm() {
        return bolüm;
    }

    public int getNotOrtalama() {
        return notOrtalama;
    }

    public int getOgrenciNo() {
        return ogrenciNo;
    }

    @Override
    public String toString() {
        return "UniversiteLambda06{" +
                "fakülte='" + fakülte + '\'' +
                ", bolüm='" + bolüm + '\'' +
                ", notOrtalama=" + notOrtalama +
                ", ogrenciNo=" + ogrenciNo +
                '}';
    }

    public UniversiteLambda06(String fakülte, String bolüm, int notOrtalama, int ogrenciNo) {
        this.fakülte = fakülte;
        this.bolüm = bolüm;
        this.notOrtalama = notOrtalama;
        this.ogrenciNo = ogrenciNo;







    }
}
