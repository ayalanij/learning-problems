package ProblemSolving;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    static boolean wordPattern(String pattern, String s){
        String st[] = s.split(" ");
        int len = pattern.length();
        if(len != st.length)
            return false;
        HashMap<Character,String> dic = new HashMap<>();
        HashMap<String,Boolean> used = new HashMap<>();

        for(int i = 0; i<pattern.length(); i++){
            char ch = pattern.charAt(i);
            if(!dic.containsKey(ch)) {
                if (used.containsKey(st[i]) == true){
                    return false;
                }else {
                    used.put(st[i],true);
                    dic.put(ch,st[i]);
                }
            } else {
                String str = dic.get(ch);
                if(!str.equals(st[i])){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String pattern = "aaa";
        String s = "aa aa aa aa";
        System.out.println(wordPattern(pattern,s));
    }
}
