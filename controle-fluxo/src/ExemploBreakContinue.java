public class ExemploBreakContinue {
    public static void main(String[] args) {
        // Inicia o loop for com a variável numero
        for (int numero = 1; numero <= 5; numero++) {
            // Verifica se o número é igual a 3
            if (numero == 3)
                // Se for igual a 3, interrompe o loop
                break;

            // Imprime o número atual
            System.out.println(numero);

        }
        // Fim do loop for
    }
    // Fim do método main
}
// Fim da classe ExemploBreakContinue
