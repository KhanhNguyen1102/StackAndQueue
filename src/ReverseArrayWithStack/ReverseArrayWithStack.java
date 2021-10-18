package ReverseArrayWithStack;

import java.util.Stack;

public class ReverseArrayWithStack {
    public static void main(String[] args) {

//        Stack<String> stack = new Stack<>();
//        String[] arr = str.split("");
//        for (String s : arr) {
//            stack.push(s);
//        }
//        Stack<String> stack2 = new Stack<>();
//        while (!stack.isEmpty()) {
//            stack2.push(stack.pop());
//        }
//        System.out.println(stack2);
        String str = "123456";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        char[] characters = new char[stack.size()];
        for (int i = 0; i < str.length(); i++) {
            characters[i]=stack.pop();
        }
        String str2 = new String(characters);
        System.out.println(str2);
    }
}



