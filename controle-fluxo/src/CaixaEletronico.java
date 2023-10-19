public class CaixaEletronico {
    public static void main(String[] args) {
        // Define o saldo inicial como 25.0
        double saldo = 25.0;
        // Define o valor a ser sacado como 22.0
        double valorSolicitado = 22.0;

        // Verifica se o valor solicitado é menor que o saldo
        if (valorSolicitado < saldo) {
            // Se o valor solicitado for menor que o saldo, subtrai o valor solicitado do saldo
            saldo = saldo - valorSolicitado;
            // Imprime o novo saldo
            System.out.println("Novo Saldo: " + saldo);

        } else {
            // Se o valor solicitado for maior ou igual ao saldo, imprime "Saldo insuficiente"
            System.out.println("Saldo insuficiente");
        }
    }
}
