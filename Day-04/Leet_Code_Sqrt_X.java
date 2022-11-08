public class Leet_Code_Sqrt_X {
    public static void main(String[] args) {
        int x=4;
        System.out.println(mySqrt(x));

    }
    static int mySqrt(int x) {
        int start =0;
        int end = x/2;
        int ans = 0;
        while(start <= end)
        {
            int  mid = (start + end) / 2;
            if(mid * mid == x)
            {
                return mid;
            }
            if(mid * mid < x)
            {
                start = mid + 1;
                ans = mid;
            }
            else
            {
                end = mid - 1;
            }
        }
        return ans;
    }
}
