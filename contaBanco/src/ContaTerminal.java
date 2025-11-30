import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int numero;
        String agencia;
        String primeiroNome;
        double saldo;

        System.out.print("Digite o numero da sua conta: ");
        numero = sc.nextInt();

        System.out.print("Digite o numero da sua agencia: ");
        agencia = sc.next();

        System.out.print("Digite o seu primeiro nome: ");
        primeiroNome = sc.next();

        System.out.print("Digite o seu sobrenome: ");
        String sobrenome = sc.next();

        System.out.print("Digite o saldo da sua conta: ");
        saldo = sc.nextDouble();

        String nomeCliente = nomeCompleto(primeiroNome, sobrenome);

        imprimirInfo(numero, agencia, nomeCliente, saldo);

        sc.close();

    }

    public static void imprimirInfo(int numero, String agencia, String nomeCliente, double saldo) {
        System.out.printf(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",
                nomeCliente, agencia, numero, saldo);
    }

    public static String nomeCompleto(String nome, String sobrenome) {
        return nome.concat(" ").concat(sobrenome);
    }

}
