
import kotlin.math.max

class Solution {

    companion object {
        const val OPENING_PARENTHESIS: Char = '(';
        const val CLOSING_PARENTHESIS: Char = ')';
    }

    fun maxDepth(input: String): Int {
        var maxDepth = 0;
        var currentDepth = 0;

        for (character in input) {
            if (character == OPENING_PARENTHESIS) {
                maxDepth = max(maxDepth, ++currentDepth);
                continue;
            }
            if (character == CLOSING_PARENTHESIS) {
                --currentDepth;
            }
        }
        return maxDepth;
    }
}
