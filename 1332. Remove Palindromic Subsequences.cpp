#include <iostream>
#include <string>

using namespace std;


class Solution9 {
public:
    int removePalindromeSub(string s) {
        string P = s;
        
        reverse(P.begin(),P.end());
        
        if(s==P){
            return 1;
        }
        else {
            return 2;
        }
    }
};



/**
The trick to this problem is realizing that since we're dealing with subsequences and only 2 possible characters, the answer cannot possible be larger than 2. In fact, the answer will always be 2 unless S is already a palindrome, in which case the answer is 1, or S is an empty string, in which case the answer is 0.

It's important to understand the distinction between a substring and a subsequence. A substring is a contiguous block of characters between one index and and another in the input string. A subsequence, which we're dealing with here, is any sequence of characters from the string, as long as they're in their original order. But you can pick and choose which characters you want in a subsequence, even if there are gaps between.

So in this situation I could, for example, create a subsequence of every single 'a' in the string. A string of all 'a' s would naturally be palindromic, so it could be removed from the original string. Since there are only 'a' s and 'b' s, that would leave only 'b' s remaining in the original string, which could be then removed in a second operation.

     S = "b b a a b a a a"                 // Input string
              ^ ^   ^ ^ ^                  // Characters for the first subsequence
   sub = "    a a   a a a" = "a a a a a"   // Palindromic, so it can be removed
     S = "b b     b      " = "b b b"       // Remaining string is now palindromic and can be removed
*/