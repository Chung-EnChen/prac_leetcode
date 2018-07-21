class Solution {
    public boolean isPalindrome(int x) {
        int r_num = 0, l_num, xx=x;
        while(x>=0 && xx!=0){
            l_num=xx%10;
            r_num=r_num*10+l_num;
            xx/=10;
        }
        return r_num==x;
    }
}