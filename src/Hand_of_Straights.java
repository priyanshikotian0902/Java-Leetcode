import java.util.TreeMap;

public class Hand_of_Straights {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0) {
            return false;
        }

        TreeMap<Integer, Integer> count = new TreeMap<>();
        for (int card : hand) {
            count.put(card, count.getOrDefault(card, 0) + 1);
        }
        // for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
        //     System.out.println(entry.getKey() + ": " + entry.getValue());
        // }
        while (!count.isEmpty()) {
            int first = count.firstKey();
            for (int i = 0; i < groupSize; ++i) {
                int current = first + i;
                if (!count.containsKey(current) || count.get(current) == 0) {
                    return false;
                }
                count.put(current, count.get(current) - 1);
                if (count.get(current) == 0) {
                    count.remove(current);
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
       Hand_of_Straights h = new Hand_of_Straights();
        int[] hand = {1, 2, 3, 6, 2, 3, 4, 7, 8};
        int groupSize = 3;
        System.out.println(h.isNStraightHand(hand, groupSize)); // Output: true
    }
}

///this question is same as divide array in sets of k consecutive numbers,
//for both, in java it is giving wrong answers in java for hashmap and right answer for
//tree map.
//and in c++, it is giving right answer for map(ordered map) why so????????????????