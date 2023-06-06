

/**
 * Given an array nums. we define a running sum of an array as 
 * runningSum[i] = sum(nums[0]...nums[i])
 * contraint: number of node in the list is in range [1, 1000]
 * the value of each element in the array is in the range [-10^6, 10^6]
 * Example
 * inputs = [3, 1, 2, 10, 1]
 * output = [3, 4, 6, 10, 16, 17]
 * 
 * 
 */

 class Summ1 {
    public int[] runningSum(int[] nums){
        for (int i=1; i < nums.length; i++){
            nums[i] = nums[i-1] + nums[i];
        }
        return nums;
    }
 }
