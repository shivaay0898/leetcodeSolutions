import java.util.ArrayDeque;
import java.util.Deque;

public class validParenthisis {
    public static boolean isValid(String s) {
        Deque<Character> stack= new ArrayDeque<>();
        // for(int i=0;i<s.length();i++){
        //     if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
        //         stack.push(s.charAt(i));
        //     }
        //     else{
        //         if(stack.isEmpty()==true){
        //             return false;
        //         }
        //         else if(isMatching(stack.peek(), s.charAt(i))==false){
        //             return false;
        //         }
        //         else{
        //             stack.pop();
        //         }
        //     }
        // }
        // return stack.isEmpty();
        for(char c: s.toCharArray()){
            if(c=='{'){
                stack.push('}');
            }
            else if(c=='('){
                stack.push(')');
            }
            else if(c=='['){
                stack.push(']');
            }
            else if( stack.isEmpty()||stack.pop()!=c){
                return false;
            }
        }
        return stack.isEmpty();
    }
    // public static boolean isMatching(char x,char y){
    //     return ((x=='{'&&y=='}')||(x=='['&&y==']')||(x=='('&&y==')'));
    // }
    public static void main(String[] args) {
        System.out.println(isValid("(){}[]"));
    }
}
