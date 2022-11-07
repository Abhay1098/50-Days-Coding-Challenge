/*
    QUE- A peak element is an element that is strictly greater than its neighbors.

        Given a 0-indexed integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.

        You may imagine that nums[-1] = nums[n] = -∞. In other words, an element is always considered to be strictly greater than a neighbor that is outside the array.

        You must write an algorithm that runs in O(log n) time.



        Example 1:

        Input: nums = [1,2,3,1]
        Output: 2
        Explanation: 3 is a peak element and your function should return the index number 2.
 */


public class Leet_Code_Peak_Index_in_Mountain_Array {
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
