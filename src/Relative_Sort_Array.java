import java.util.*;
public class Relative_Sort_Array {


    //________________My Solution_______________________
//        public int[] relativeSortArray(int[] arr1, int[] arr2) {
//            int[] store = new int[1001];
//            ArrayList<Integer> st = new ArrayList<>();
//
//
//            for (int i : arr1) {
//                store[i]++;
//            }
//
//
//            for (int i : arr2) {
//                while (store[i] > 0) {
//                    st.add(i);
//                    store[i]--;
//                }
//            }
//
//
//            for (int i = 0; i < store.length; i++) {
//                while (store[i] > 0) {
//                    st.add(i);
//                    store[i]--;
//                }
//            }
//
//
//            int[] result = new int[st.size()];
//            for (int i = 0; i < st.size(); i++) {
//                result[i] = st.get(i);
//            }
//
//            return result;
//        }

    //   }

    //_________________shashCode solution___________
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int n1 = arr1.length, n2 = arr2.length;
        int Max = Integer.MIN_VALUE;
        for (int i = 0; i < n1; i++) {
            Max = Math.max(Max, arr1[i]);
        }
        int[] count = new int[Max + 1];
        for (int i = 0; i < n1; i++) {
            int element = arr1[i];
            count[element]++;
        }
        int k = 0;
        for (int i = 0; i < n2; i++) {

            while (count[arr2[i]] > 0) {
                arr1[k] = arr2[i];
                k++;
                count[arr2[i]]--;
            }
        }
        for (int i = 0; i < Max + 1; i++) {
            while (count[i] > 0) {
                arr1[k] = i;
                k++;
                count[i]--;
            }
        }
        return arr1;
    }

    public static void main(String[] args) {
        Relative_Sort_Array arr = new Relative_Sort_Array();
        int[] arr1 = new int[]{2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
        int[] arr2 = new int[]{2, 1, 4, 3, 9, 6};
        int[] ans = new int[arr1.length];
        ans = arr.relativeSortArray(arr1, arr2);
        for (int i : ans) {
            System.out.print(i);
            System.out.print(" ");
        }

    }
}

