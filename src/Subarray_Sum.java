import java.util.HashMap;

public class Subarray_Sum {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        map.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum%k)) {
                int m=map.get(sum%k);
                if(i-m>=2)
                {
                    System.out.println(i-m);
                    return true;
                }
            }
            else
            {
                map.put(sum%k, i);
            }

        }
        return false;
    }
    public static void main(String[] args) {
      Subarray_Sum s = new Subarray_Sum();
      System.out.println(s.checkSubarraySum(new int[]{23,4,2,3,4}, 6));
    }
}
