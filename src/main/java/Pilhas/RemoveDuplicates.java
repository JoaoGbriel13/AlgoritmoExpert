package Pilhas;

import java.util.Stack;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("azxxzy"));
    }

    static String removeDuplicates(String s){
        Stack<Character> myStack = new Stack<>();
        var charArr = s.toCharArray();
        for (int i = 0; i < charArr.length; i++){
            if (myStack.isEmpty() || charArr[i] != myStack.peek()){
                myStack.push(charArr[i]);
            }
            else if (charArr[i] == myStack.peek()){
                myStack.pop();
            }
        }
        return myStack.stream().map(String::valueOf).collect(Collectors.joining());

    }
}
