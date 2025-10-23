package MatematikselIslemler;

public class FaktoriyelHesaplama {

    public static void main(String[] args) {
        System.out.println("2.3 - Faktöriyel:");
        
        int n = 5;
        // Faktöriyel sonuçları çok hızlı büyüyebilir, bu yüzden 'long' kullanmak daha güvenlidir.
        long faktoriyelSonucu = 1; 
        
        // Ara adımları göstermek için bir String oluşturucu
        String araAdimlar = n + "! = ";

        // 5'ten 1'e doğru giden bir döngü
        for (int i = n; i >= 1; i--) {
            faktoriyelSonucu = faktoriyelSonucu * i;
            
            // Ara adımları string'e ekle
            araAdimlar += i;
            if (i > 1) {
                araAdimlar += " × ";
            }
        }
        
        System.out.println("Ara adımlar: " + araAdimlar);
        System.out.println("Sonuç: " + faktoriyelSonucu);
    }
}
