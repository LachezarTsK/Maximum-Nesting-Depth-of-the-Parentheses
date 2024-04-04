
/**
 * @param {string} input
 * @return {number}
 */
var maxDepth = function (input) {
    const OPENING_PARENTHESIS = '(';
    const CLOSING_PARENTHESIS = ')';

    let maxDepth = 0;
    let currentDepth = 0;

    for (let character of input) {
        if (character === OPENING_PARENTHESIS) {
            maxDepth = Math.max(maxDepth, ++currentDepth);
            continue;
        }
        if (character === CLOSING_PARENTHESIS) {
            --currentDepth;
        }
    }
    return maxDepth;
};
