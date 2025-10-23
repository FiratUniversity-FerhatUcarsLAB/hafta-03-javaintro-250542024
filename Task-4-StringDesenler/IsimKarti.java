package StringDesenler;

public class IsimKarti {
    public static void main(String[] args) {
        
        String ad = "Sarya";
        String soyad = "Su";
        String ogrenciNo = "250542024";
        String bolum = "Yazılım Mühendisliği";

        System.out.println("4.1 - İsim Kartı:");
        System.out.println("*************************************************");
        System.out.println("* *");
        System.out.println("* ÖĞRENCİ BİLGİ KARTI            *");
        System.out.println("* -------------------            *");
        System.out.println("* *");
        
        // printf ile formatlı yazdırıyoruz:
        // %-12s: 12 karakterlik alanı kapla, metni sola yasla
        // %-30s: 30 karakterlik alanı kapla, metni sola yasla
        System.out.printf("* Ad         : %-30s *\n", ad);
        System.out.printf("* Soyad      : %-30s *\n", soyad);
        System.out.printf("* Öğrenci No : %-30s *\n", ogrenciNo);
        System.out.printf("* Bölüm      : %-30s *\n", bolum);
        System.out.println("* *");
        System.out.println("*************************************************");
    }
}
