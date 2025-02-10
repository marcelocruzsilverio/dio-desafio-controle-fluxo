import java.util.Locale;
import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite primeiro parâmetro:");
        int firstParameter = scanner.nextInt();

        System.out.println("Por favor, digite segundo parâmetro: (Atenção, o segundo parametro deve ser maior que o primeiro!)");
        int secondParameter = scanner.nextInt();

        try {
            count(firstParameter, secondParameter);
        }
        catch (Exception e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    static void count(int firstParameter, int secondParameter) throws ParametrosInvalidosException {
        if (firstParameter > secondParameter) {
            throw new ParametrosInvalidosException();
        }

        int difference = secondParameter - firstParameter;
        for (int i = 1; i <= difference; i++) {
            System.out.println("Imprimindo número: " + i);
        }

    }
}