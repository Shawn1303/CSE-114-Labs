public class BinarySearchRecursive {
    public static int binarySearch(int[] nums, int target){
        return helper(nums, target, 0, nums.length);
    }
    public static int helper(int[] nums, int target, int low, int high) {
        int mid = (high+low)/2;
        if(nums[mid] == target) {return mid;}
        if(low >= mid) {return -1;}
        if(nums[mid] < target) {return helper(nums, target, mid, high);}
        else {return helper(nums, target, low, mid);}
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,5,7,8,10,11,13,14,16};
        System.out.println(binarySearch(nums, 9));
    }
}
