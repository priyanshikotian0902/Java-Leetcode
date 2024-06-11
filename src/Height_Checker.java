
import java.util.PriorityQueue;
public class Height_Checker {
//    public int heightChecker(int[] heights) {
//        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
//        int ans=0;
//        for(int i=0;i<heights.length;i++)
//        {
//            priorityQueue.add(heights[i]);
//        }
//        int j=0;
//        while(!priorityQueue.isEmpty())
//        {
//            if(priorityQueue.peek()!=heights[j])
//            {
//                ans+=1;
//            }
//            priorityQueue.poll();
//            j++;
//        }
//        return ans;
//    }
//
public static int[] countsort(int[] arr){
    int[] count = new int[101] ;
    for(int i : arr){
        count[i]++ ;
    }
    int j = 0 ;
    int[] temp = new int[arr.length] ;
    for(int i = 1 ; i<=100 ; i++){
        while(count[i]>0){
            temp[j] = i ;
            j++ ;
            count[i]-- ;
        }
    }
    return temp ;

}
public int heightChecker(int[] heights) {
    int n = heights.length ;
    int[] arr = countsort(heights) ;
    int count = 0 ;
    for(int i = 0 ; i<n ; i++){
        if(arr[i] != heights[i]){
            count++ ;
        }
    }
    return count ;
}

    public static void main(String[] args) {
        Height_Checker obj=new Height_Checker();
        int[] heights=new int[]{5,1,2,3,4};
        System.out.println(obj.heightChecker(heights));
    }
}
