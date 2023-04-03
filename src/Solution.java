class Solution {
    public static void main(String[] args) {
        System.out.println(countDigits(7));
    }
    public static int countDigits(int n) {
        int ans = 0;
        String str = Integer.toString(n);
        for(int i = 0; i< str.length(); i++){
            if(n % (str.charAt(i) - '0') == 0)
                ans++;
        }
        return ans;
    }
}
