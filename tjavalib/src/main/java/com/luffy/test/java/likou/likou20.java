package com.luffy.test.java.likou;

import java.util.Stack;

/**
 * Created by lvlufei on 2020-11-02
 *
 * @name 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * <p>
 * 有效字符串需满足：
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 * <p>
 * 示例 1:
 * 输入: "()"
 * 输出: true
 * <p>
 * 示例 2:
 * 输入: "()[]{}"
 * 输出: true
 * <p>
 * 示例 3:
 * 输入: "(]"
 * 输出: false
 * <p>
 * 示例 4:
 * 输入: "([)]"
 * 输出: false
 * <p>
 * 示例 5:
 * 输入: "{[]}"
 * 输出: true
 */
public class likou20 {

    public static void main(String[] args) {
        System.out.println(isValid("]}"));
    }

    public static boolean isValid(String str) {
        if (str == null || "".equals(str) || str.length() == 0) {
            return true;
        }
        Stack<Character> stack = new Stack<>();
        char[] chars = str.toCharArray();

        for (char c : chars) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char left = stack.pop();
                if (left == '(' && c != ')') {
                    return false;
                }
                if (left == '[' && c != ']') {
                    return false;
                }
                if (left == '{' && c != '}') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
