import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Conta conta = new Conta();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da conta: ");
        conta.setNumero(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Digite a agência da conta: ");
        conta.setAgencia(scanner.nextLine());

        System.out.println("Digite o nome do cliente: ");
        conta.setNomeCliente(scanner.nextLine());

        System.out.println("Digite o saldo da conta: ");
        conta.setSaldo(scanner.nextDouble());

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível.", conta.getNomeCliente(), conta.getAgencia(), conta.getNumero(), conta.getSaldo());
        scanner.close();
    }
}
