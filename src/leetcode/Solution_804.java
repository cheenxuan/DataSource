package leetcode;

import java.util.TreeSet;

/**
 * Author: xuanq
 * Create on: 2018-12-23 10:37
 * <p/>
 * Create: leetcode
 * <p/>
 * Description: 常量类
 * <p/>
 * Update:
 */

public class Solution_804 {

    public int uniqueMorseRepresentations(String[] words) {
        String[] codes = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        TreeSet<String> set = new TreeSet<String>();

        for (String word : words) {
            StringBuilder res = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                res.append(codes[word.charAt(i)- 'a']);
            }
            set.add(res.toString());
        }

        return set.size();
    }
}
