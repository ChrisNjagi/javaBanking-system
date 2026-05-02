import java.util.Scanner;
public class Manag{
    public static void main(String[] args){

        int[][] marks = {
            {85, 60, 78},
            {92, 88, 32}
        };
        for(int i=0; i<marks.length; i++){
            for(int j=0; j<marks[i].length; j++){
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }

//         int Total = 0;
//         for(int j=0; j<marks[0].length; j++){
//                 Total += marks[0][j];
//         }
//         System.out.println("Student 1 marks: " + Total);
// //Second student marks
//         Total = 0;
//         for(int j=0; j<marks[1].length; j++){
//              Total += marks[1][j];
             
//         }
//         System.out.println("Student 2 marks: " + Total);
  int jo = marks.length;
  System.out.println(jo);

         for(int i=0; i<marks.length; i++){
            int Total = 0;
            for(int j=0; j<marks[i].length; j++){
                Total += marks[i][j];
            }
            System.out.println("Student " + (i+1) );
            System.out.println("Total = " + Total);
            System.out.println("Average = " + (Total/marks[i].length));

            int highest = marks[i][0];
            int lowest = marks[i][0];
            for(int j=1; j<marks[i].length; j++){
                if(marks[i][j] > highest){
                    highest = marks[i][j];
                }
                else if(marks[i][j] < lowest){
                    lowest = marks[i][j];
                }
            }
            System.out.println("Highest = "+ highest);
            System.out.println("Lowest = "+ lowest);
        }
    }
}