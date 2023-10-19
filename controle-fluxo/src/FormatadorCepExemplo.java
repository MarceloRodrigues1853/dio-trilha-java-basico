// Importa a classe CepInvalidoException, se existir

public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            // Tenta formatar o CEP e captura a possível exceção CepInvalidoException
            String cepFormatado = formatarCep("2376506");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            // Imprime o rastreamento de pilha da exceção e uma mensagem de erro
            e.printStackTrace();
            System.out.println("O Cep não corresponde com as regras de negócio");
        }
    }
    
    // Método para formatar o CEP, que pode lançar a exceção CepInvalidoException
    static String formatarCep(String cep) throws CepInvalidoException {
        // Verifica se o comprimento do CEP não é igual a 8 e lança a exceção se não for válido
        if (cep.length() != 8)
            throw new CepInvalidoException();

        // Simula um CEP formatado para o exemplo
        return "23.765-064";
    }
}
