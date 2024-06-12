public class Single_Number {

        public int singleNumber(int[] nums) {
            int res=0;
            for(int i=0;i<nums.length;i++)
            {
                res^=nums[i];
            }

            return res;
        }

        public static void main(String[] args) {
            Single_Number obj = new Single_Number();
            System.out.println(obj.singleNumber(new int[]{1,2,3,2,3,6,7,7,6}));
        }
}
