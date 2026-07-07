public class JaggedArrayDemo {
    public static void main(String[] args) {
        System.out.println("Jagged Array Demo");

        // jagged array: different length rows
        int[][] jagged = new int[3][];

        jagged[0] = new int[2];  // row 0 has 2 elements
        jagged[1] = new int[3];  // row 1 has 3 elements
        jagged[2] = new int[1];  // row 2 has 1 element

        // assign some values
        jagged[0][0] = 10;
        jagged[0][1] = 20;

        jagged[1][0] = 30;
        jagged[1][1] = 40;
        jagged[1][2] = 50;

        jagged[2][0] = 60;

        // print jagged array
        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }
    }
}
