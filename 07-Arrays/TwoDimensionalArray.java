public class TwoDimensionalArrayDemo {
    public static void main(String[] args) {
        System.out.println("Two Dimensional Array Demo");

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // print matrix
        for (int i = 0; i < matrix.length; i++) {          // rows
            for (int j = 0; j < matrix[i].length; j++) {   // columns
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
