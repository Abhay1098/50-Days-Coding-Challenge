public class GFG_Search_Infinte_Array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,0,54,68,97};
        int target = 4;

        System.out.println(ans(arr,target));
    }

    static int ans(int[] arr, int target)
    {
        int start = 0;
        int end = 1;

            while(target > arr[end]){
                int newstart = end + 1;
                // new end will be previous end + previousArrayBox * 2
                end = end + (end - start + 1) * 2;
                start = newstart;
            }
        return binarysearch(arr, target, start, end);
    }

    static int binarysearch(int[] arr, int target, int start, int end)
    {
        while(start <= end)
        {
            int mid = (start + end)/2;

            if(target > arr[mid]){
                start = mid + 1;
            }
            else if(target < arr[mid]){
                end = mid -1;
            }
            else
                return mid;
        }
        return -1;
    }
}
