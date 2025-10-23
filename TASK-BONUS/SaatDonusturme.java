public class saatdonusturme {

    public static void main(String[] args) {
        System.out.println("Bonus 1 - Saat Dönüştürme:");

        int toplamSaniye = 3665;
        
        System.out.println("İşlenecek Saniye: " + toplamSaniye);

        // Saati bul (1 saat = 3600 saniye)
        int saat = toplamSaniye / 3600;

        // Kalan saniyeleri bul
        int kalanSaniye = toplamSaniye % 3600;
        
        // Dakikayı bul (1 dakika = 60 saniye)
        int dakika = kalanSaniye / 60;

        // En son kalan saniyeyi bul
        int saniye = kalanSaniye % 60;

        // Sonucu formatlı yazdırma
        // %02d: Sayıyı 2 basamaklı olarak yaz, eğer 1 basamaklıysa başına '0' ekle.
        System.out.println("Formatlı Sonuç:");
        System.out.printf("%d:%02d:%02d\n", saat, dakika, saniye);
    }
}
