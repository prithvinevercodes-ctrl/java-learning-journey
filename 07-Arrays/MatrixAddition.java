public class MatrixAddition {
    public static void main(String[] args) {
        System.out.println("Matrix Addition");

        int[][] a = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] b = {
            {7, 8, 9},
            {10, 11, 12}
        };

        int[][] sum = new int[2][3];

        // add matrices
        for (int i = 0; i < 2; i++) {        // rows
            for (int j = 0; j < 3; j++) {    // columns
                sum[i][j] = a[i][j] + b[i][j];
            }
        }

        // print result
        System.out.println("Resultant Matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
