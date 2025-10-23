package GeometrikHesaplamalar;

public class ucgenalanhesap {

    public static void main(String[] args) {
        System.out.println("3.3 - Üçgen Alanı Formülü):");

        // Kenar uzunlukları
        double a = 3.0;
        double b = 4.0;
        double c = 5.0;

        // 1. Adım: Yarı çevreyi (s) hesapla
        double s = (a + b + c) / 2.0;

        // 2. Adım: Heron formülünü uygula
        // Math.sqrt() karekök almak için kullanılır
        double alan = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println("Kenarlar: a=" + a + ", b=" + b + ", c=" + c);
        System.out.println("Yarı Çevre (s): " + s);
        System.out.println("---------------------");
        System.out.printf("Üçgenin Alanı: %.2f\n", alan);
    }
}
