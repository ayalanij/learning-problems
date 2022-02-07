class PalindromeSolution {
  public static void main(String[] args) {
        PalindromeSolution p = new PalindromeSolution();
        System.out.println(p.isPalindrome("0P"));
    }
    public boolean isPalindrome(String s) {
        char[] ch = s.toCharArray();
        StringBuilder st = new StringBuilder();
        int j = 0;
        for(int i = 0;  i < ch.length; i++){
            if(ch[i] >= 'a' && ch[i] <= 'z'){
                st.append((char) (ch[i] - 'a' + 'A'));
            }else if(ch[i] >= 'A' && ch[i] <= 'Z'){
                st.append(ch[i]);
            }else if(ch[i] >= '0' && ch[i] <= '9'){
                st.append(ch[i]);
            }
        }
        int k=0,o = st.length()-1;
        while(k<o) {
            if (st.charAt(k) != st.charAt(o)) {
                return false;
            }
            k++;o--;
        }
        return true;
    }
}
