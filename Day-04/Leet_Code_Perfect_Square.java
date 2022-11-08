public class Leet_Code_Perfect_Square {
    public static void main(String[] args) {
        int num = 4;
        System.out.println(isPerfectSquare(num));
    }
    static boolean isPerfectSquare(int num) {
        int start =0;
        int end = num / 2;
        while(start <= end)
        {
            int mid = (start + end) / 2;
            if(mid * mid == num)
                return true;

            if(mid < num)
            {
                start = mid + 1;
            }
            else
                end = mid -1;

        }
        return false;
    }
}
