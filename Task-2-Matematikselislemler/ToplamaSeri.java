package MatematikselIslemler;

public class ToplamaSeri {
    public static void main(String[] args) {
        System.out.println("2.1 - Toplama Serisi:");
        
        int toplam = 0;
        String seri = "";

        // 1'den 9'a kadar olan sayıları bir döngü ile toplama
        for (int i = 1; i <= 9; i++) {
            toplam += i;
            seri += i;
            if (i < 9) {
                seri += " + ";
            }
        }
        
        System.out.println(seri + " = " + toplam);
    }
}
