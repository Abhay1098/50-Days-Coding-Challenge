public class Leet_Code_Ceiling_of_Number_BS {
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};
        int target=15;
        System.out.println(CeilingNumber(arr, target));

    }


    //Ceiling --> Smallest element in the array which is greater or equal to target
    static int CeilingNumber(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length-1;

        while(start <= end)
        {
            int mid = (start + end)/2;

            //if target value is equal to middle value
            if(arr[mid] == target)
                return arr[mid];

            //if target value is greater than the middle value
            if(arr[mid] < target)
                start = mid + 1;

            //if target value is less than the middle value
            if(arr[mid] > target)
                end = mid - 1;
        }
       // if(arr[start] > target)   we are returning arr[start] here is bcz target value is not in the array.
        // hence "WHILE" condition breaks(i.e. END--ANS--START), so we are returning the smallest greater value of the target
            return arr[start];


        //for FLOOR return end
        // return arr[end];
    }
}
