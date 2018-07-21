class Solution {
    public int reverse(int x) {
        if(x<Integer.MAX_VALUE&&x>Integer.MIN_VALUE){
            long r_num=0;
            int l_num,xx=x;
            while(xx>0||xx<0){
                l_num=xx%10;
                r_num=r_num*10+l_num;
                xx/=10;
            }
            if(r_num>Integer.MAX_VALUE||r_num<Integer.MIN_VALUE)
                return 0;
            return (int)r_num;
        }
        else 
            return 0;
    }
}