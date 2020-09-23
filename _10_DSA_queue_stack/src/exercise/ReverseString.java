package exercise;

import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        String[] mWord = {"one","two","three","four","five","six"};
        System.out.println();
        System.out.println("- Value in array before reserve: ");
        System.out.println();
        for (int i = 0;i < mWord.length;i++){
            System.out.print(mWord[i]+", ");
        }
        System.out.println();

        Stack<String> wStack = new Stack<String>();

        for (int i = 0;i < mWord.length;i++){
            wStack.push(mWord[i]);
        }
        System.out.println();
        System.out.println("- Value in array after reserve: ");
        System.out.println();

        for (int i = 0;i < mWord.length;i++){
            System.out.print(wStack.pop()+", ");
        }
        System.out.println();
    }
}
