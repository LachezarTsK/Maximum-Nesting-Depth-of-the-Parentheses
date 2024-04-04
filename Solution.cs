
using System;

public class Solution
{
    private static readonly char OPENING_PARENTHESIS = '(';
    private static readonly char CLOSING_PARENTHESIS = ')';

    public int MaxDepth(string input)
    {
        int maxDepth = 0;
        int currentDepth = 0;

        foreach (char character in input)
        {
            if (character == OPENING_PARENTHESIS)
            {
                maxDepth = Math.Max(maxDepth, ++currentDepth);
                continue;
            }
            if (character == CLOSING_PARENTHESIS)
            {
                --currentDepth;
            }
        }
        return maxDepth;
    }
}
