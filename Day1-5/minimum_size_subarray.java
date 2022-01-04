// https://leetcode.com/problems/minimum-size-subarray-sum/
public class minimum_size_subarray {
    //Brute Force 
    // TC: O(n^2)
        public int minSubArrayLen(int target, int[] nums) {
            int n=nums.length;
            int sum=0;
            int len=Integer.MAX_VALUE;
           for(int i=0;i<n;i++){
               sum=0;
               for(int j=i;j<n;j++){
                   sum=sum+nums[j];
                   if(sum>=target){
                        len=Math.min(len,(j-i+1)); 
                   }
               }
           }
            if(len<=nums.length){
                return len;
            }
            return 0;
        }
    
}
