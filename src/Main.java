public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

// 4,5,6,7,1,2,3
// 5,6,7,1,2,3,4 ****
// 1,2,3,4,5,6,7
// 2,3,4,5,6,7,1

// my solution. just one correction 
class Solution {
    public int findMin(int[] nums) {
        int L = 0, R = nums.length - 1, mid = 0;

        while (L <= R) {
            mid = L + (R - L) / 2;
            if (nums[mid] > nums[nums.length-1]) { // just make sure comparing to nums.length-1 not nums[R]
                L = mid + 1;
            } else {
                R = mid - 1;
            }
        }
        return nums[R+1];
    }
}

// since sorted, just find index 0 and get its value. bianry search if mid > end.  unlike
// search in rotated sorted array, no binary search of both halves. even easier.