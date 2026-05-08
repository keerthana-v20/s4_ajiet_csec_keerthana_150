class Solution {
    public static void main(String[] args) {
        String s="hello";
        char[] rev=s.toCharArray();
        
        for(int p=s.length()-1;p>=0;p--)
        System.out.println(rev[p]);
    }
}
