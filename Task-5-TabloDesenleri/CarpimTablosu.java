package TabloDesenleri;

public class CarpimTablosu {
    public static void main(String[] args) {
        System.out.println("5.3 - 2'nin Çarpım Tablosu:");

        int sayi = 2; // Çarpım tablosu için temel sayı

        // 1'den 10'a kadar giden döngü
        for (int i = 1; i <= 10; i++) {
            int sonuc = sayi * i;
            
            // Formatlı yazdırma: 2 x 1 = 2
            // %2d: 2 karakterlik alana (sağa yaslı) tamsayı yaz (sayıların düzgün görünmesi için)
            System.out.printf("%d x %2d = %d\n", sayi, i, sonuc);
        }
    }
}
