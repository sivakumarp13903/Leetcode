/**
 * @param {any} val
 * @return {Object}
 */
var expect = function(val) {
    return {
        toBe(actual) {
            if (val === actual) {
                return true;
            } else {
                throw new Error("Not Equal");
            }
        },
        notToBe(actual) {
            if (val !== actual) {
                return true;
            } else {
                throw new Error("Equal");
            }
        }
    };
};
