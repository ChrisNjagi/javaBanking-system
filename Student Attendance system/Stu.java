import java.util.Scanner;
public class Stu{
 
    public static void main(String[] args){
           Scanner input = new Scanner(System.in);
        String[] Student = {"Christopher", "John", "Alice"};
        int[][] attendance = new int[3][5];
        //     {1, 0, 1, 1, 0},
        //     {1, 1, 1, 0, 1},
        //     {0, 1, 0, 1, 1}
        // };
        for(int i=0; i<Student.length; i++){
             System.out.println("Enter attendance for " + Student[i]);

               for(int j=0; j<attendance[i].length; j++){
                System.out.print("Day " + (j+1) + ": ");
                attendance[i][j] = input.nextInt();
               }
        }
        System.out.println("\nAttendance Record:");
        for(int i=0; i<Student.length; i++){
            System.out.print(Student[i] + ": ");
            for(int j=0; j<attendance[i].length; j++){
                System.out.print(attendance[i][j] );
            }
            System.out.println();
        }
    }   
}
