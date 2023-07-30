import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //Todo: conhecer e importar a classe scannenr

        Scanner scanner = new Scanner(System.in);

        //número da conta
        System.out.printf("Número da conta: ");
        int conta = scanner.nextInt();

        // Consumir o caractere de nova linha deixado pelo nextInt()
        scanner.nextLine();

        // agencia
        System.out.printf("Número da agência: ");
        String agencia = scanner.nextLine();

        // nome cliente
        System.out.printf("Seu nome é: ");
        String nome = scanner.nextLine();

        //saldo
        System.out.printf("Saldo: ");
        double saldo = scanner.nextDouble();

        // exibir a mensagem final,com informações da conta
        // exibir mensagens p usuário
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo R$" + saldo + " já está disponível para saque.");
        

        // fecha o scanner
        scanner.close();
    }
}
