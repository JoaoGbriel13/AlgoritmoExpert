package Pilhas;

import java.util.HashMap;
import java.util.Map;

public class isBalanced {
    public static void main(String[] args) {
        var test = "{(())()}";
        System.out.println(brackets(test));
    }
    static boolean brackets(String test){
        var charArr = test.toCharArray();
        Stack2<Character> characterStack2 = new Stack2<>();
        Map<Character, Character> symbols = new HashMap<>();
        symbols.put(')', '(');
        symbols.put('}', '{');
        for (int i = 0; i <= charArr.length - 1; i++){
            if (symbols.containsValue(charArr[i])){
                characterStack2.push(charArr[i]);
            }
            else if (symbols.containsKey(charArr[i])){
                if (characterStack2.isEmpty() || symbols.get(charArr[i]) != characterStack2.peek().getValue()) {
                    return false;
                }else{
                    characterStack2.pop();
                }
            }
        }
        return characterStack2.isEmpty();
    }
}
