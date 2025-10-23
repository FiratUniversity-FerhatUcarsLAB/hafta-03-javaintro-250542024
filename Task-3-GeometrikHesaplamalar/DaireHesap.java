package GeometrikHesaplamalar;
public class dairehesap {

    public static void main(String[] args) {
        System.out.println("3.1 - Daire Hesaplama:");

        // Yarıçapı 'double' olarak tanımlıyoruz
        double yariCap = 5.5;

        // Alan hesaplama (Math.PI Java'daki π sabitidir)
        double alan = Math.PI * yariCap * yariCap;
        // Alternatif: double alan = Math.PI * Math.pow(yariCap, 2);

        // Çevre hesaplama
        double cevre = 2 * Math.PI * yariCap;

        System.out.println("Yarıçap: " + yariCap);
        System.out.println("---------------------");
        
        // %.3f: Sonucu 3 ondalık basamakla sınırla
        System.out.printf("Dairenin Alanı (πr^2): %.3f\n", alan);
        System.out.printf("Dairenin Çevresi (2πr): %.3f\n", cevre);
    }
}
