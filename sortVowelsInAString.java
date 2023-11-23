import java.util.HashMap;

public class sortVowelsInAString {
    public static String sortVowels(String s) {
        // StringBuilder sb=new StringBuilder();
        // List<Character> vowels= new ArrayList<>();
        // for(char c:s.toCharArray()){
        // if(isVowel(c)){
        // vowels.add(c);
        // }
        // }
        // Collections.sort(vowels);
        // int i=0;
        // for(char c:s.toCharArray()){
        // sb.append(isVowel(c)?vowels.get(i++):c);
        // }
        // return sb.toString();
        StringBuilder sb = new StringBuilder();
        String vo = "AEIOUaeiou";
        HashMap<Character, Integer> vowels = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (vowels.containsKey(c)) {
                vowels.replace(c, vowels.get(c) + 1);
            }
            if (isVowel(c)) {
                vowels.put(c, 1);
            }
        }
        int j = 0;
        for (char c : s.toCharArray()) {
            if (isVowel(c)) {
                sb.append(vo.charAt(j));
                vowels.replace(c, vowels.get(c) - 1);
                if (vowels.get(c) == 0) {
                    j++;
                }
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }

    public static void main(String[] args) {
        System.out.println(sortVowels("lEetcOde"));// lEOtcede
    }
}
