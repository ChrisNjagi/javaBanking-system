public class Manag{
    public static void main(String[] args){

        int[][] marks = {
            {85, 90, 78},
            {92, 88, 95}
        };
        for(int i=0; i<marks.length; i++){
            for(int j=0; j<marks[i].length; j++){
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }

        int Total = 0;
        for(int j=0; j<marks[0].length; j++){
                Total += marks[0][j];
        }
        System.out.println("Student 1 marks: " + Total);
//Second student marks
        Total = 0;
        for(int j=0; j<marks[1].length; j++){
             Total += marks[1][j];
             
        }
        System.out.println("Student 2 marks: " + Total);

    }
}