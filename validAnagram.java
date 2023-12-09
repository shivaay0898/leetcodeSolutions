import java.util.HashSet;
import java.util.Set;

public class validAnagram {
    public static boolean isAnagram(String s, String t) {
        Set<Character> c=new HashSet<>();
        for(char ch : s.toCharArray()){
            c.add(ch);
        }
        for(char ch: t.toCharArray()){
            if(!c.contains(ch)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
    }
}
