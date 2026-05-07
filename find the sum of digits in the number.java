public class sum {
    public static void main(String[] args) {
        int n = 153;
        int sum = 0, d;

        while (n > 0) {
            d = n % 10;
            sum += d;
            n = n / 10;
        }

        System.out.println(sum);
    }
}
