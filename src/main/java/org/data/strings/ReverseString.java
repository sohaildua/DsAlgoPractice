package org.data.strings;

import java.util.Stack;

public class ReverseString {

    public static void main(String[] args) {
        String str = "str";
        char[] charArray = str.toCharArray();
        System.out.println(charArray.length);

        Stack<Character> stack = new Stack<>();
        for(char ch: charArray){
            stack.push(ch);
        }
        StringBuilder builder = new StringBuilder();
        while (!stack.isEmpty()) {
            builder.append(stack.pop());
        }

        System.out.println(builder);




    }

}
