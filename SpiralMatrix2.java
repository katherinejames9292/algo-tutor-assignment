public class SpiralMatrixII {

    public static void main(String[] args) {
        int n = 4; // Change n to generate a different-sized matrix

        int[][] result = generateSpiralMatrix(n);

        System.out.println("Spiral Matrix II:");
        displayMatrix(result);
    }

    public static int[][] generateSpiralMatrix(int n) {
        int[][] matrix = new int[n][n];

        int num = 1;
        int top = 0, bottom = n - 1, left = 0, right = n - 1;

        while (num <= n * n) {
            // Traverse top row
            for (int i = left; i <= right; i++) {
                matrix[top][i] = num++;
            }
            top++;

            // Traverse rightmost column
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = num++;
            }
            right--;

            // Traverse bottom row
            for (int i = right; i >= left; i--) {
                matrix[bottom][i] = num++;
            }
            bottom--;

            // Traverse leftmost column
            for (int i = bottom; i >= top; i--) {
                matrix[i][left] = num++;
            }
            left++;
        }

        return matrix;
    }

    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
