import java.util.ArrayList;

public class Challenge1 {

    public static void main(String[] args) {
        int S = 7;
        int[] inputArray = {1, 2, 3, 4, 5, 6, 7, 8, 9 ,10, 71};
        int[] resultadoArray = switchAndDelete(inputArray, S);

        System.out.print("[");
        for (int i = 0; i < resultadoArray.length; i++) {
            System.out.print(resultadoArray[i]);
            if (i < resultadoArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static int[] switchAndDelete(int[] inputArray, int S) {
        ArrayList<Integer> resultado = new ArrayList<>();

        for (int num : inputArray) {
            int[] digits = getDigits(num, S);
            if (digits.length > 0) {
                int newNum = 0;
                for (int i = 0; i < digits.length; i++) {
                    newNum += digits[i] * Math.pow(10, digits.length - i - 1);
                }
                if (newNum < S) {
                    resultado.add(newNum);
                }
            }
        }

        int[] resultArray = new int[resultado.size()];
        for (int i = 0; i < resultado.size(); i++) {
            resultArray[i] = resultado.get(i);
        }

        return resultArray;
    }

    public static int[] getDigits(int num, int S) {
        String numString = Integer.toString(num);
        ArrayList<Integer> digitsList = new ArrayList<>();

        for (int i = 0; i < numString.length(); i++) {
            int digit = Character.getNumericValue(numString.charAt(i));
            if (digit != S) {
                digitsList.add(digit);
            }
        }

        int[] digitsArray = new int[digitsList.size()];
        for (int i = 0; i < digitsList.size(); i++) {
            digitsArray[i] = digitsList.get(i);
        }

        return digitsArray;
    }
}
