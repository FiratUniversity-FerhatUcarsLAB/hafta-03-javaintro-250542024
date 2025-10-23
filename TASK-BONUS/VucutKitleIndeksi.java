public class BmiHesaplama {

    public static void main(String[] args) {
        System.out.println("Bonus 2 - Vücut Kitle İndeksi (BMI) Hesaplama:");

        // Örnek değerler
        double kilo = 75.5; // Kilogram
        double boy = 1.80; // Metre (Örn: 1.75, 1.80)

        // BMI Hesaplama: kilo / (boy * boy)
        double bmi = kilo / (boy * boy);
        
        System.out.printf("Girilen Kilo: %.1f kg\n", kilo);
        System.out.printf("Girilen Boy : %.2f m\n", boy);
        System.out.println("---------------------------------");
        System.out.printf("Vücut Kitle İndeksi (BMI): %.2f\n", bmi);

        // Sonucu yorumlama
        if (bmi < 18.5) {
            System.out.println("Durum: Zayıf");
        } else if (bmi < 24.9) {
            System.out.println("Durum: Normal Kilolu");
        } else if (bmi < 29.9) {
            System.out.println("Durum: Fazla Kilolu");
        } else {
            System.out.println("Durum: Obez");
        }
    }
}
