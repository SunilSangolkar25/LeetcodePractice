class Solution {
    public int distributeCandies(int[] candyType) {
        int count=1;
        Arrays.sort(candyType);

        for (int i=1;i<candyType.length;i++)
        {
            if (candyType[i]!=candyType[i-1])
            {
                count ++;

            }
        }
        int a=candyType.length/2;
        return Math.min(count,a);
        
    }
}