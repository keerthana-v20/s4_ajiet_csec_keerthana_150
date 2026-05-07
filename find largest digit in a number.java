public class LargestNumber {
    public static void main(String[] args) {
        int n = 153;
        int lar = 0, d;

        while (n > 0) {
            d = n % 10;

            if (d > lar)
                lar = d;

            n = n / 10;   
        }

        System.out.println("Largest digit: " + lar);
    }
}
