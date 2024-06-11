import java.util.HashMap;

public class The_Number_of_Beautiful_subsets {

        public int createAndCheck(int []nums,int k,int i,HashMap<Integer,Integer> f)
        {

            int pick=0;

            if(i==nums.length)
            {
                if(f.size()==0)
                {
                    return 0;
                }
                return 1;
            }
            else
            {
                if(f.size()==0 || (!f.containsKey(nums[i]+k) && !f.containsKey(nums[i]-k)))
                {
                    f.put(nums[i],f.getOrDefault(nums[i],0)+1);
                    pick=createAndCheck(nums,k,i+1,f);
                    f.put(nums[i],f.get(nums[i])-1);
                    if(f.get(nums[i])==0)
                    {
                        f.remove(nums[i]);
                    }
                }
                int noPick=createAndCheck(nums,k,i+1,f);
                return pick+noPick;

            }
        }

        public int beautifulSubsets(int[] nums, int k) {
            return createAndCheck(nums,k,0,new HashMap<>());
        }

        public static void main(String[] args) {
            The_Number_of_Beautiful_subsets obj = new The_Number_of_Beautiful_subsets();
            int []nums={2,4,6};
            int k=2;
            System.out.println(obj.beautifulSubsets(nums,k));
        }
}
