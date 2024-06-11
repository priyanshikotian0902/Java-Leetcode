
import java.util.List;

class TrieNode {
    TrieNode[] children = new TrieNode[26];
    String word = null;

    public TrieNode() {}
}

class Trie {
    TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            if (node.children[c - 'a'] == null) {
                node.children[c - 'a'] = new TrieNode();
            }
            node = node.children[c - 'a'];
        }
        node.word = word;
    }

    public String searchRoot(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            if (node.children[c - 'a'] == null) {
                return word;
            }
            node = node.children[c - 'a'];
            if (node.word != null) {
                return node.word;
            }
        }
        return word;
    }
}

public class Replace_Word_trie {

    public String replaceWords(List<String> dictionary, String sentence) {
        Trie trie = new Trie();
        for (String root : dictionary) {
            trie.insert(root);
        }

        StringBuilder result = new StringBuilder();
        String[] words = sentence.split(" ");

        for (String word : words) {
            if (result.length()> 0) {
                result.append(" ");
            }
            result.append(trie.searchRoot(word));
        }

        return result.toString();
    }
}
