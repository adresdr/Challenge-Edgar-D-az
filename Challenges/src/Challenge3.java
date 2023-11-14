import java.util.Arrays;

public class Challenge3 {

    public static void main(String[] args) {
        int[] monedas1 = {5, 7, 1, 1, 2, 3, 22};
        int resultado1 = minimoCambio(monedas1);
        System.out.println(resultado1);

        int[] monedas2 = {1, 1, 1, 1, 1};
        int resultado2 = minimoCambio(monedas2);
        System.out.println(resultado2);

        int[] monedas3 = {1, 5, 1, 1, 1, 10, 15, 20, 100};
        int resultado3 = minimoCambio(monedas3);
        System.out.println(resultado3);
    }

    public static int minimoCambio(int[] monedas) {
        Arrays.sort(monedas);

        int cambioMinimo = 1;

        for (int moneda : monedas) {
            if (moneda <= cambioMinimo) {
                cambioMinimo += moneda;
            } else {
                break;
            }
        }

        return cambioMinimo;
    }
}
