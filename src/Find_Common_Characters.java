import java.util.*;

public class Find_Common_Characters {

        public List<String> commonChars(String[] words) {
            int[] t1 = new int[26];
            int[] t2 = new int[26];
            ArrayList<String> ans = new ArrayList<>();

            for (char c : words[0].toCharArray()) {
                t1[c - 'a']++;
            }

            for (int i = 1; i < words.length; i++) {
                for (char c : words[i].toCharArray()) {
                    t2[c - 'a']++;
                }
                for (int k = 0; k < 26; k++) {
                    t1[k] = Math.min(t1[k], t2[k]);
                    t2[k] = 0; // Reset t2 for the next word
                }
            }

            for (int k = 0; k < 26; k++) {
                while (t1[k] > 0) {
                    ans.add(String.valueOf((char)(k + 'a')));
                    t1[k]--;
                }
            }

            return ans;
        }

        public static void main(String[] args) {
            Find_Common_Characters f = new Find_Common_Characters();
            System.out.println(f.commonChars(new String[]{"bella","roller","label"}));
        }

}
