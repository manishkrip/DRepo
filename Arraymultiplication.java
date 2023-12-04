public class Arraymultiplication {

    public static int[][] multiplyArrays(int[][] arr1, int[][] arr2) {
        int rows1 = arr1.length;
        int cols1 = arr1[0].length;
        int cols2 = arr2[0].length;

        int[][] result = new int[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        return result;
    }

    public static void printMatrix(int[][] matrix) {
    	for (int i = 0; i < matrix.length; i++)

		{
			for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr1 = {
            {1, 2},
            {3, 4}
        };

        int[][] arr2 = {
            {5, 6},
            {7, 8}
        };

        int[][] result = multiplyArrays(arr1, arr2);

        System.out.println("Matrix A:");
        printMatrix(arr1);

        System.out.println("\nMatrix B:");
        printMatrix(arr2);

        System.out.println("\nResultant Matrix:");
        printMatrix(result);
    }
}
