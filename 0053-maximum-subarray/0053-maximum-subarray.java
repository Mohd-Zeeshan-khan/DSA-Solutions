class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int maxi = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++){
            //step 1= sum create karte hai
            sum = sum + nums[i];
            //step 2 = maxi ko update karte hai
            maxi = Math.max(maxi,sum);
            //step 3 = sum check karte hai for -ve values
            if(sum<0)
            sum = 0;
        }
        //return max value
        return maxi;
        
    }
}