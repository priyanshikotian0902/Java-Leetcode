public class Sort_colors {

        public void sortColors(int[] nums) {
            int[] arr=new int[3];
            int n=nums.length;
            int i=0;
            for(i=0;i<n;i++)
            {
                arr[nums[i]]++;
            }
            int j=0;
            i=0;
            while(i<n)
            {
                while(arr[j]!=0)
                {
                    nums[i]=j;
                    i++;
                    arr[j]--;

                }
                j++;
            }

        }

        public static void main(String[] args) {
            Sort_colors obj=new Sort_colors();
            int[] nums=new int[]{0,1,2,1,2,1,1,0,0,1,2,2,0,0,1,0};
            obj.sortColors(nums);
            for(int i:nums)
            {
                System.out.print(i+" ");
            }
        }
}
