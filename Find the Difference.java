/*
You are given two strings s and t.
String t is generated by random shuffling string s and then add one more letter at a random position.
Return the letter that was added to t.

Example 1:
Input: s = "abcd", t = "abcde"
Output: "e"
Explanation: 'e' is the letter that was added.

Example 2:
Input: s = "", t = "y"
Output: "y"
 
Constraints:
0 <= s.length <= 1000
t.length == s.length + 1
s and t consist of lowercase English letters.
*/

//1st approch -
public char findTheDifference(String s, String t) {
        char c = 0;
        for(char cs : s.toCharArray()) c ^= cs;
        for(char ct : t.toCharArray()) c ^= ct;
        return c;
    }
    
 //2nd approch - 
 public char findTheDifference(String s, String t) {
      char[] s1 = s.toCharArray();
      Arrays.sort(s1);
      char[] t1 = t.toCharArray();
      Arrays.sort(t1);
      int i = 0;
        for(i = 0; i<s.length(); i++){
            if(s1[i]!=t1[i]){
                return t1[i];
            }
        }
        return t1[i];
    }
