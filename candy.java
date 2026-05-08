import java.util.Scanner;
public class CandyJar {
    public static void main(String[] args) {
        int N = 20;
        int K = 5;
        int M = N;  
        Scanner sc = new Scanner(System.in);
    while(true){
        System.out.println("current candies in jar: " + M);
        System.out.print("enter no.of candies to buy: ");
        if (sc.hasNextInt()) {
            int order = sc.nextInt();
            if (order == 0) {
                break;
            }
            if (order > 0 && order <= M) {
                System.out.println("no.of candies sold:" +order);
                M = M - order;
                if (M <= K) {
                    M = N;
                }
                System.out.println("no.of candies available: " + M);
            } else {
                System.out.println("INVALID INPUT");
                System.out.println("no.of candies available: " + M);
            }
        }else {
            System.out.println("INVALID INPUT");
        }
   
    }
    }
}

