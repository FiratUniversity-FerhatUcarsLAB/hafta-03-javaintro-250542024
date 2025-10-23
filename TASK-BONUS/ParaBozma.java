public class parabozma {

    public static void main(String[] args) {
        System.out.println("Bonus 3 - Para Bozma:");

        int toplamPara = 278;
        int kalanPara = toplamPara;
        
        // Sizin örneğinizdeki küpürler (Banknotlar ve madeni paralar)
        int[] kupurler = {100, 50, 20, 10, 5, 2, 1}; 
        
        System.out.println(toplamPara + " TL için hesaplama:");
        System.out.println("---------------------");

        // Bütün küpürleri sırayla (büyükten küçüğe) dolaş
        for (int kupur : kupurler) {
            // O küpürden kaç adet gerektiğini bul (tam sayı bölmesi)
            int adet = kalanPara / kupur;
            
            // Eğer o küpürden en az 1 adet gerekiyorsa
            if (adet > 0) {
                System.out.println(adet + " x " + kupur + " TL");
                // Kalan parayı güncelle (mod alma)
                kalanPara = kalanPara % kupur;
            }
        }
    }
}
