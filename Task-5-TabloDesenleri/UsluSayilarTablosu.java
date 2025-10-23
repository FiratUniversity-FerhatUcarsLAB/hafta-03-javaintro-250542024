package TabloDesenleri;

public class UsluSayilarTablosu {
    public static void main(String[] args) {
        System.out.println("5.1 - Üslü Sayılar Tablosu:");

        // Tablo başlığını yazdırıyoruz. \t (tab) karakteri ile aralara boşluk koyuyoruz.
        System.out.println("---------------------");
        System.out.println("a\ta^2\ta^3");
        System.out.println("---------------------");

        // 1'den 5'e kadar (5 dahil) giden bir döngü
        for (int a = 1; a <= 5; a++) {
            // Math.pow(sayı, üs) fonksiyonunu kullanabiliriz
            // veya doğrudan çarpma yapabiliriz.
            int aKare = a * a;
            int aKup = a * a * a;

            // printf ile formatlı yazdırma:
            // %d tamsayı (decimal) anlamına gelir
            // %-8d: 8 karakterlik alana, sola yaslı şekilde tamsayıyı yaz
            System.out.printf("%-8d%-8d%-8d\n", a, aKare, aKup);
        }
    }
}
