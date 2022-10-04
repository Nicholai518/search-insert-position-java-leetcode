public class Solution {
    public int searchInsert(int[] nums, int target) {
        // first index of the array
        int left = 0;
        // last index of array
        int right = nums.length - 1;

        while (left <= right) {
            // find middle
            int mid = left + (right - left) / 2;

            // if target = middle, return mid
            if (nums[mid] == target) {
                return mid;
            }

            // if mid is less than target, the target must be on the "right side"
            // set left to the first index of the "right side"
            if (nums[mid] < target) {
                left = mid + 1;
            }
            // if mid is greater than target, the target must be on the "left side"
            // set right to the last index of the "left side"
            if (nums[mid] > target) {
                right = mid - 1;
            }
        }
        // return left
        return left;
    }
}
