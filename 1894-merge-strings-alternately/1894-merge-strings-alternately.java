class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int i = 0, j = 0;
        int aLen = word1.length(), bLen = word2.length();

        while (i < aLen || j < bLen) {
            if (i < aLen) {
                sb.append(word1.charAt(i++));
            }
            if (j < bLen) {
                sb.append(word2.charAt(j++));
            }
        }
        return sb.toString();
    }
}