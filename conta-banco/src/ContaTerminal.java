import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo; 

        System.out.println("Por favor, digite o número da sua conta: ");
        numeroConta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o número da sua agência: ");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite o seu nome completo: ");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o seu saldo: ");
        saldo = scanner.nextDouble();

        System.out.println(" Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
        ", conta " + numeroConta + " e seu saldo R$" + saldo + " já está disponível para saque");







    }
}
