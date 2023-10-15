import java.util.Scanner; // Importando a classe Scanner

public class ContaTerminal {

    public static void main(String[] args) throws Exception {

        // Criando um objeto Scanner para ler a entrada do terminal
        Scanner scanner = new Scanner(System.in);

        // Exibindo as mensagens para o usuário
        System.out.println("Bem-vindo! Vamos criar uma nova conta bancária.");
        System.out.println("Por favor, digite as informações necessárias quando solicitado.");

        // Obtendo os valores digitados no terminal usando Scanner
        System.out.print("Digite o nome do titular da conta: ");
        String nomeTitular = scanner.nextLine();

        // Simulando operação de saque
        double saldo = 25; // Valor inicial do saldo
        double valorSolicitado = 18; // Valor inicial solicitado

        // Simulando a primeira operação de saque
        if (saldo >= valorSolicitado) {
            saldo = saldo - valorSolicitado;
        } else {
            System.out.println("Saldo insuficiente");
        }

        // Imprimindo o saldo
        System.out.println("Saldo atual: " + saldo);

        // Simulando a segunda operação de saque
        saldo = 15; // Novo saldo
        valorSolicitado = 22; // Novo valor solicitado

        // Executando a operação de saque novamente
        if (saldo >= valorSolicitado) {
            saldo = saldo - valorSolicitado;
        } else {
            System.out.println("Saldo insuficiente");
        }

        // Imprimindo o saldo resultante
        System.out.println("Saldo atual: " + saldo);

        // Fechando o scanner
        scanner.close();
    }
}
