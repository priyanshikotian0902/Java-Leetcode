public class Ransome_Note {

        public static boolean canConstruct(String ransomNote, String magazine) {
            int[] r=new int[26];

            for(int i=0;i<magazine.length();i++)
            {
                r[magazine.charAt(i)-'a']++;

            }

            for(int j=0;j<ransomNote.length();j++)
            {
                if(r[ransomNote.charAt(j)-'a']>=1)
                {
                    r[ransomNote.charAt(j)-'a']--;
                }
                else
                {
                    return false;
                }
            }

            return true;
        }

        public static void main(String[] args) {
          System.out.println(canConstruct("aa","aab"));

        }
}
