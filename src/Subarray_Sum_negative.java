import java.util.HashMap;

public class Subarray_Sum_negative {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        map.put(0, 1);
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int mod = sum % k;

            // Handle negative mods by adjusting to the positive equivalent
            if (mod < 0) {
                mod += k;
            }

            if (map.containsKey(mod)) {
                ans += map.get(mod);
            }

            map.put(mod, map.getOrDefault(mod, 0) + 1);
        }

        // Debugging: Print the map
        for (var entry : map.entrySet()) {
            System.out.println("Mod: " + entry.getKey() + ", Count: " + entry.getValue());
        }

        return ans;
    }

    public static void main(String[] args) {
        Subarray_Sum_negative s = new Subarray_Sum_negative();
        System.out.println("Number of subarrays: " + s.subarraysDivByK(new int[]{4,5,0,-2,-3,1}, 5));
    }
}
