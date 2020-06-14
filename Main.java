public class Main {
    public static void main(String[] args) {
        snake(5);
    }

    private static void snake(int number) {
        int[][] resultArr = new int[number][number];
        int value = 1;
        int left = 0;
        int top = 0;
        int right = number;
        int bottom = number;

        while (value < number * number + 1) {
            for (int i = left; i < right; i++) {
                resultArr[left][i] = value;
                value++;
            }
            top++;

            for (int i = top; i < bottom; i++) {
                resultArr[i][right - 1] = value;
                value++;
            }
            right--;

            for (int i = right - 1; i > left - 1; i--) {
                resultArr[bottom - 1][i] = value;
                value++;
            }
            bottom--;

            for (int i = bottom - 1; i > top - 1; i--) {
                resultArr[i][left] = value;
                value++;
            }
            left++;
        }

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (resultArr[i][j] < 10) System.out.print("0");
                /*add more zero prefix for bigger result values*/
//                if (resultArr[i][j] < 100) System.out.print("0");
//                if (resultArr[i][j] < 1000) System.out.print("0");
                System.out.print(resultArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
