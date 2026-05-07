class Main {
    public static void main(String[] args) {
       int rev=0,n=123,last,a=n;
       while(n>0){
           last=n%10;
           rev=rev*10+last;
           n=n/10;
       }
       System.out.println(rev);
       if(a==rev){
            System.out.println("palindrome");
            }else{
                  System.out.println("not palindromr");
 }
    }
}
