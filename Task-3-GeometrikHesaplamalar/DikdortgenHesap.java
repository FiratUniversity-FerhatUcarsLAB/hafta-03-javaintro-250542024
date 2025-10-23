package GeometrikHesaplamalar;
public class dikdortgenhesap {

    public static void main(String[] args) {
        System.out.println("3.2 - Dikdörtgen Hesaplama:");

        double en = 4.5;
        double boy = 7.9;

        // Alan: en * boy
        double alan = en * boy;

        // Çevre: 2 * (en + boy)
        double cevre = 2 * (en + boy);

        System.out.println("En: " + en);
        System.out.println("Boy: " + boy);
        System.out.println("---------------------");

        // %.2f: Sonucu 2 ondalık basamakla sınırla
        System.out.printf("Dikdörtgen Alanı: %.2f\n", alan);
        System.out.printf("Dikdörtgen Çevresi: %.2f\n", cevre);
    }
}
