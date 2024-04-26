import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


        System.out.println("Por Favor, digite o número da conta!");
        int numero = scanner.nextInt();


        System.out.println("Por Favor, digite o número da agência!");
        String agencia = scanner.next();


        System.out.println("Por Favor, digite o seu nome!");
        String nomeCliente = scanner.next();


        System.out.println("Por Favor, digite o valor que deseja inserir de saldo!");
        double saldo = scanner.nextDouble();
        

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque!");

    }
}
