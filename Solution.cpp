
#include <string>
#include <algorithm>
using namespace std;

class Solution {

     static const char OPENING_PARENTHESIS = '(';
     static const char CLOSING_PARENTHESIS = ')';

public:
    int maxDepth(const string& input) const{
        int maxDepth = 0;
        int currentDepth = 0;

        for (const auto& character : input) {
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
};
