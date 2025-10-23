package StringDesenler;

public class HesapOzeti {
    public static void main(String[] args) {
        System.out.println("4.3 - Hesap Özeti (Alışveriş Listesi):");

        // Örnek ürün bilgileri
        String urun1 = "Ekmek";
        int miktar1 = 2;
        double fiyat1 = 7.50;

        String urun2 = "Süt";
        int miktar2 = 1;
        double fiyat2 = 25.00;

        String urun3 = "Yumurta";
        int miktar3 = 10;
        double fiyat3 = 3.50;

        // Toplamları hesapla
        double toplam1 = miktar1 * fiyat1;
        double toplam2 = miktar2 * fiyat2;
        double toplam3 = miktar3 * fiyat3;
        double genelToplam = toplam1 + toplam2 + toplam3;

        // Tablo Başlığı
       
        System.out.println("------------------------------------------------------------");
        System.out.printf("%-15s | %-10s | %-15s | %-10s\n", "Ürün", "Miktar", "Birim Fiyat", "Toplam");
        System.out.println("------------------------------------------------------------");

        // Ürün Satırları
       
        System.out.printf("%-15s | %-10d | %-15.2f TL | %-10.2f TL\n", urun1, miktar1, fiyat1, toplam1);
        System.out.printf("%-15s | %-10d | %-15.2f TL | %-10.2f TL\n", urun2, miktar2, fiyat2, toplam2);
        System.out.printf("%-15s | %-10d | %-15.2f TL | %-10.2f TL\n", urun3, miktar3, fiyat3, toplam3);
        
        // Genel Toplam
        System.out.println("------------------------------------------------------------");
        System.out.printf("%-45s %.2f TL\n", "GENEL TOPLAM:", genelToplam);
    }
}
