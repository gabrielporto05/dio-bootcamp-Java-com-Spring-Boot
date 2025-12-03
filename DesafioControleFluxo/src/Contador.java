import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Interando sobre subtração de parâmetros informados");

        System.out.print("Digite o primeiro numero: ");
        int primeiroParametro = sc.nextInt();

        System.out.print("Digite o segundo numero: ");
        int segundoParametro = sc.nextInt();

        try {
            contar(primeiroParametro, segundoParametro);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e);
        }

        sc.close();

    }

    static void contar(int primeiroParametro, int segundoParametro) throws ParametrosInvalidosException {

        if (primeiroParametro >= segundoParametro) {
            throw new ParametrosInvalidosException("O segundo parametro deve ser maior que o primeiro!");
        }

        int contador = segundoParametro - primeiroParametro;

        for (int i = 0; i <= contador; i++) {
            System.out.printf("\nImprimindo o numero %d", i);
        }

    }
}
