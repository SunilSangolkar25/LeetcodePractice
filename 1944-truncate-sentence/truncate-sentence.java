class Solution {
    public String truncateSentence(String s, int k) {
        String[] result = s.split("\\s+");
        String[] finalResult = new String[k];

        for (int i = 0; i < k; i++) {
            finalResult[i] = result[i];
        }

        return String.join(" ", finalResult);
    }
}