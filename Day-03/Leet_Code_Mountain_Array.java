/*
    Input: array = [1,2,3,4,5,3,1], target = 3
    Output: 2
    Explanation: 3 exists in the array, at index=2 and index=5. Return the minimum index, which is 2.
    Example 2:

    Input: array = [0,1,2,4,2,1], target = 3
    Output: -1
    Explanation: 3 does not exist in the array, so we return -1.
 */


public class Leet_Code_Mountain_Array {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,56,65,45,34,3,2,1};
        System.out.println(peakIndexMountainArray(arr));
    }

    static int peakIndexMountainArray(int[] arr)
    {
        int start = 0;
        int end = arr.length-1;

        while (start < end){
            int mid = (start + end)/2;

            if(arr[mid] < arr[mid+1]){
                //you are in ascending part of the array
                start = mid + 1;
            }
            else{
                // you are in decensding part of the array
                //this may be the ans but look in the LHS as well
                //that is why end !=mid -1;
                end = mid;
            }
        }
        //in the end start == end and pointing towards the maximum element of the array
        // start and end element are always trying to find the max element bcz of above 2 checks

        return start; // can return end as well bcz both are same 
    }
}
