public class Temp {
    public static int[][] generateCombinations(int num1, int num2) {
        int[][] combinations = new int[num1][num2];

        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < num2; j++) {
                combinations[i][j] = (i + 1) * (j + 1);
            }
        }

        return combinations;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 3;
        int[][] resultMatrix = generateCombinations(num1, num2);
        printMatrix(resultMatrix);
    }
}
