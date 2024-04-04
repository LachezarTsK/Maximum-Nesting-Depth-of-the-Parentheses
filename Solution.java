
public class Solution {

    private static final char OPENING_PARENTHESIS = '(';
    private static final char CLOSING_PARENTHESIS = ')';

    public int maxDepth(String input) {
        int maxDepth = 0;
        int currentDepth = 0;

        for (char character : input.toCharArray()) {
            if (character == OPENING_PARENTHESIS) {
                maxDepth = Math.max(maxDepth, ++currentDepth);
                continue;
            }
            if (character == CLOSING_PARENTHESIS) {
                --currentDepth;
            }
        }
        return maxDepth;
    }
}
