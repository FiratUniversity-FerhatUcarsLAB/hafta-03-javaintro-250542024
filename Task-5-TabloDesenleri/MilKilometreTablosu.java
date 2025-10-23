package TabloDesenleri;

public class MilKilometreTablosu {
    public static void main(String[] args) {
        System.out.println("5.2 - Dönüşüm Tablosu (Mil -> Kilometre):");

        // Sabit dönüşüm katsayısı
        final double MIL_TO_KM = 1.609;

        // İstenen mil değerlerini bir dizi (array) içinde tanımlıyoruz
        int[] milDegerleri = {1, 5, 10, 20, 50};
        
        // Tablo başlığı
        System.out.println("---------------------");
        System.out.printf("%-10s | %-10s\n", "Mil", "Kilometre");
        System.out.println("---------------------");

        // Dizi'deki her bir 'mil' değeri için döngü
        for (int mil : milDegerleri) {
            // Kilometreye çevirme
            double kilometre = mil * MIL_TO_KM;
            
            // %-10d: 10 karakter alana sola yaslı tamsayı
            // %-10.3f: 10 karakter alana sola yaslı, 3 ondalık basamaklı ondalıklı sayı
            System.out.printf("%-10d | %-10.3f\n", mil, kilometre);
        }
    }
}
