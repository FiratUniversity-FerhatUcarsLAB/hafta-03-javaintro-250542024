package MatematikselIslemler;

public class IkiIslem {
    public static void main(String[] args) {
        System.out.println("2.2 - İki İşlem Sonucu:");

        // Ondalıklı sayılar için 'double' veri tipi kullanılır.
        
        // Pay hesaplaması
        double pay = (9.5 * 4.5) - (2.5 * 3.0);
        
        // Payda hesaplaması
        double payda = 45.5 - 3.5;
        
        // Sonuç (Pay / Payda)
        double sonuc = pay / payda;
        
        System.out.println("Pay   Hesabı: (9.5 * 4.5) - (2.5 * 3) = " + pay);
        System.out.println("Payda Hesabı: 45.5 - 3.5 = " + payda);
        
        // Sonucu 4 ondalık basamak ile formatlamak için System.out.printf kullanılır.
        // "%.4f" ifadesi, "ondalık noktadan sonra 4 basamak göster" anlamına gelir.
        System.out.printf("Sonuç (4 Ondalık Basamak): %.4f\n", sonuc);
    }
}
