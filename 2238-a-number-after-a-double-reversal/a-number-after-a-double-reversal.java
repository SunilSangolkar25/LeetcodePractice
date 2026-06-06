class Solution {
    public boolean isSameAfterReversals(int num) {
        int temp=num;
        int rev=0;

        while (temp!=0)
        {
            int rem =temp%10;
           
                     rev=rev*10+rem;
            

            temp=temp/10;


        }
        int x=num;
        int count1=0;
        int count2=0;
        while (x!=0)
        {
            x=x/10;
            count1++;
        }
        while (rev!=0)
        {
            rev=rev/10;
            count2++;
        }
        if(count1==count2)
        {
            return true;
        }
        
            return false;
        
       
    }
}