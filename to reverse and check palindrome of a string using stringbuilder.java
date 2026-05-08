
class Solution {
    public static void main(String[] args) {
        String a = "hello";
        StringBuilder q = new StringBuilder(a);
        q.reverse();
        String b = q.toString();
        System.out.println(b);
        if (a.equals(b)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }
}
