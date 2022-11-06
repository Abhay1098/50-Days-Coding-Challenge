/*

QUE-  Find Smallest Letter Greater Than Target

You are given an array of characters letters that is sorted in non-decreasing order, and a character target. There are at least two different characters in letters.

Return the smallest character in letters that is lexicographically greater than target. If such a character does not exist, return the first character in letters.



Example 1:

Input: letters = ["c","f","j"], target = "a"
Output: "c"
Explanation: The smallest character that is lexicographically greater than 'a' in letters is 'c'.


 */


public class Leet_Code_Smallest_Letter_Greater_than_Target {
    public static void main(String[] args) {
        char[] arr= {'c','f','j'};
        char target = 'c';
        System.out.println(SmallestLetterGreaterTarget(arr, target));

    }
    static char SmallestLetterGreaterTarget(char[] arr, char target)
    {
        int start = 0;
        int end = arr.length-1;

        while(start <= end)
        {
            int mid = (start + end)/2;
            if(target < arr[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }
        return arr[start % arr.length];
    }
}
