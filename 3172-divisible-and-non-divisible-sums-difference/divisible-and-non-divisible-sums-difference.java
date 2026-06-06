class Solution {
    public int differenceOfSums(int n, int m) {
        int notdiv=0;
        int sumdiv=0;

        for (int i=1;i<=n;i++)
        {
            if(i%m!=0)
            {
                notdiv+=i;

            }
            else
            {
            sumdiv+=i;
            }


        }
       int a= notdiv-sumdiv;
       return a;
        
    }
}