import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
public class Replace_Words {
//
//        public:
//        string replaceWords(vector<string>& dictionary, string sentence) {
//            unordered_map<string, int> map;
//
//            for (const auto& word : dictionary) {
//                map[word] = word.length();
//            }
//
//            string root = "";
//            string new_string = "";
//            size_t i = 0;
//
//            while (i < sentence.length()) {
//                root += sentence[i];
//
//                if (i < sentence.length() && map.find(root) == map.end() && isspace(sentence[i]) || i==sentence.length()-1)  {
//                    new_string += root;
//                    root.clear();
//                }
//                else if (i < sentence.length() && map.find(root) != map.end()) {
//                    new_string += root ;
//                    while (i  < sentence.length() && !isspace(sentence[i+1])) {
//                        i++;
//                    }
//                    root.clear();
//                }
//
//                i++;
//            }
//
//            return new_string;
//        }
//


    public String replaceWords(List<String> dictionary, String sentence) {

        HashMap<String, Integer> map = new HashMap<>();
        for (String word : dictionary) {
            map.put(word, word.length());
        }

        StringBuilder root = new StringBuilder();//cannot use String root=" " ,since in Java Strings
        //are immutable,hence we need to use StringBuilder
        StringBuilder newString = new StringBuilder();
        int i = 0;

        while (i < sentence.length()) {
            root.append(sentence.charAt(i));

            if ((i < sentence.length() - 1 && map.containsKey(root.toString()) && !Character.isWhitespace(sentence.charAt(i + 1))) || (i == sentence.length() - 1)) {

                newString.append(root.toString());
                while (i < sentence.length() - 1 && !Character.isWhitespace(sentence.charAt(i + 1))) {
                    i++;
                }
                root.setLength(0);
            } else if (Character.isWhitespace(sentence.charAt(i)) || i == sentence.length() - 1) {

                newString.append(root.toString());
                root.setLength(0);
            }

            i++;
        }

        return newString.toString();
    }

    public static void main(String[] args) {
        Replace_Words replace_words = new Replace_Words();
        ArrayList<String> dictionary = new ArrayList<>();
        dictionary.add("cat");
        dictionary.add("bat");
        dictionary.add("rat");

        String sentence = "The cattle was rattled by the battery";
        System.out.println(replace_words.replaceWords(dictionary, sentence));
    }
    }


