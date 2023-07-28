package org.data.strings;

public class SolutionReciprocal {
    public static String solution(String x) {
        // Your code here

        StringBuilder builder = new StringBuilder();
        char[] charArray = x.toCharArray();
        for (Character ch : charArray) {
            if (Character.isLowerCase(ch)) {
                builder.append((char) (122 - (int) (ch) + 97));
            } else {
                builder.append(ch);
            }

        }
        return "\"" + builder.toString() + "\"";
    }

    public static void main(String[] args) {
        System.out.println(SolutionReciprocal.solution("Yvzs! I xzm'g yvorvev Lzmxv olhg srh qly zg gsv xlolmb!!"));
    }
}
