import java.util.Scanner;
public class orthesaplama {
    public static void main(String[] args) {

        int Matematik,fizik,kimya,turkce,muzik, toplam= 0, ortalama;
        int count = 0;


        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz :");
        Matematik = input.nextInt();
        if (Matematik >= 0 && Matematik <= 100) {
            toplam += Matematik;
            count++;
        }
        System.out.print("Fizik notunuzu giriniz : ");
        fizik = input.nextInt();
        if (fizik >=0 && fizik <=100) {
            toplam += fizik;
            count++;
        }
        System.out.print("Kimya notunuzu giriniz : ");
        kimya = input.nextInt();
        if (kimya >=0 && kimya <=100) {
            toplam += kimya;
            count++;
        }
        System.out.print("Türkçe notunuzu giriniz");
        turkce = input.nextInt();
        if (turkce >=0 && turkce <=100 ) {
            toplam += turkce;
            count++;
        }
        System.out.print("Müzik notunuzu giriniz");
        muzik = input.nextInt();
        if (muzik >=0 && muzik <=100) {
            toplam += muzik;
            count++;
        }
        ortalama = toplam/count;
        System.out.print("Ortalama Notunuz : "+ ortalama);

        if (ortalama >= 55) {
            System.out.print("Tebrikler sınıfınızı geçtiniz");
        } else {
            System.out.print("Sınıfta kaldınız.");
        }
    }

}
