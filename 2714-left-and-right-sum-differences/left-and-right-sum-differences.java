class Solution {
    public int[] leftRightDifference(int[] nums) {
       int left[]=new int[nums.length];
        int right[]=new int[nums.length];
         int result[]=new int[nums.length];

         for (int i=0;i<nums.length;i++)
         {  int k=0;
            while(k<i)
            {
                left[i]+=nums[k];
                k++;
            }
           
         }
           for (int i = 0; i < nums.length; i++) 
           
        {
            int k = i + 1;
            while (k < nums.length) {
                right[i] += nums[k];
                k++;
            }
        }
        for (int i=0;i<nums.length;i++)
        {
            result[i]=Math.abs(left[i]-right[i]);

        }
        return result;


        
    }
}