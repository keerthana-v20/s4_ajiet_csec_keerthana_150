public class LargestNumber {
    public static void main(String[] args) {
        int n1 = 10, n2 = 25, n3 = 15;

        if (n1 >= n2 && n1 >= n3)
            System.out.println("largest:"+n1);
        else if (n2 >= n1 && n2 >= n3)
            System.out.println("largest:"+n2);
        else
            System.out.println("largest:"+n3);
    }
}
