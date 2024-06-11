class Solution {
public:
    bool isNStraightHand(vector<int>& hand, int groupSize) {
        if (hand.size() % groupSize != 0) {
            return false;
        }

        map<int, int> count;
        for (int card : hand) {
            count[card]++;
        }

        while (!count.empty()) {
            int first = count.begin()->first;
            for (int i = 0; i < groupSize; ++i) {
                int current = first + i;
                if (count[current] == 0) {
                    return false;
                }
                count[current]--;
                if (count[current] == 0) {
                    count.erase(current);
                }
            }
        }

        return true;
    }
};