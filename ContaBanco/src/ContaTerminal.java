import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int conta;
        String agencia, nomeCliente;
        double saldo;

        System.out.print("Ola! Seja bem-vindo(a). Por favor, digite seu nome completo:");
        nomeCliente = sc.nextLine();

        System.out.print("Digite sua conta:");
        conta = sc.nextInt();

        System.out.print("Digite sua agencia:");
        sc.nextLine();
        agencia = sc.nextLine();

        System.out.print("Digite seu saldo:");
        saldo = sc.nextDouble();

        System.out.printf("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + String.format("%.2f", saldo) + " já está disponível para saque.");

    }
}
