import java.util.ArrayList;

public class Challenge2 {

    public static void main(String[] args) {
        int S = 7; 
        int[] inputArray = {1, 2, 3, 5, 6, 8, 9};
        int[] resultadoArray = squareAndSort(inputArray, S);

        System.out.print("[");
        for (int i = 0; i < resultadoArray.length; i++) {
            System.out.print(resultadoArray[i]);
            if (i < resultadoArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static int[] squareAndSort(int[] inputArray, int S) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int num : inputArray) {
            int square = num * num;
            if (square >= 0 && square <= S * S) {
                result.add(square);
            }
        }

        int[] resultadoArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultadoArray[i] = result.get(i);
        }

        sortArray(resultadoArray);

        return resultadoArray;
    }

    public static void sortArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
