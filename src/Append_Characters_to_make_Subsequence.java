public class Append_Characters_to_make_Subsequence {

        public int appendCharacters(String s, String t) {
            int i = 0, j = 0;
            while (i < s.length() && j < t.length()) {
                if (t.charAt(j) == s.charAt(i)) {
                    j++;
                }
                i++;
            }

            return  t.length()-j;
        }
    public static void main(String[] args) {
            String s = "coaching";
            String t = "coding";
            Append_Characters_to_make_Subsequence app = new Append_Characters_to_make_Subsequence();
            System.out.println(app.appendCharacters(s, t));
    }

}
