import java.util.Arrays;

public class Minimum_number_of_Moves_to_Seat_Everyone {

        public int minMovesToSeat(int[] seats, int[] students) {

            Arrays.sort(seats);
            Arrays.sort(students);
            int ans=0;
            for(int i=0;i<seats.length;i++)
            {
                ans=ans+Math.abs(seats[i]-students[i]);
            }
            return ans;
        }

        public static void main(String[] args) {
            Minimum_number_of_Moves_to_Seat_Everyone obj = new Minimum_number_of_Moves_to_Seat_Everyone();
            int[] seats = new int[]{2,2,6,6};
            int[] students = new int[]{1,3,2,6};
           System.out.println(obj.minMovesToSeat(seats,students));
        }
}
