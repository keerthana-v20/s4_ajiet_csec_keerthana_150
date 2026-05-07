import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner h=new Scanner(System.in);
      int n= h.nextInt();
      int k= h.nextInt();
      int j = h.nextInt();
      int m = h.nextInt();
      int p =h.nextInt();
      if(j<0 ||k<0 || m<0 || p<0 ){
        System.out.println("invalid");
      }
      int d1=m/k;
      int d2=p/j;
      int d=d1+d2;
      if(d<n){
        n=n-d;
      }
      if(m%k!=0){
        n=n-1;
      }
      if(p%j!=0){
        n=n-1;
      }
      System.out.println("number of monkeys:"+n);
    }
}
