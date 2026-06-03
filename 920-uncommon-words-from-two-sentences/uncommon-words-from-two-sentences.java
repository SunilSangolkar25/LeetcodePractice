class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {

        String[] arr = (s1 + " " + s2).split(" ");
        String[] ans = new String[arr.length];
        int k = 0;

        for (int i = 0; i < arr.length; i++) {
            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[i].equals(arr[j]))
                    count++;
            }

            if (count == 1)
                ans[k++] = arr[i];
        }

        String[] res = new String[k];
        for (int i = 0; i < k; i++)
            res[i] = ans[i];

        return res;
    }
}