class Solution {
    /* public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
    
        while (low <= high) {
    
            int mid = low + (high - low) / 2;
    
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    } */

   int binarySearch(int[] arr, int target, int st, int end) {

        if (st > end)
            return -1;

        int mid = st + (end - st) / 2;

        if (target == arr[mid])
            return mid;
        else if (target > arr[mid])
            return binarySearch(arr, target, mid + 1, end);
        else
            return binarySearch(arr, target, st, mid - 1);
    }

    public int search(int[] nums, int target) {
        return binarySearch(nums, target, 0, nums.length - 1);
    }

}