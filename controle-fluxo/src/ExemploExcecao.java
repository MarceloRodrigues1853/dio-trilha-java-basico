import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecao {
    public static void main(String[] args) {
        // Declaração da variável valor
        Number valor;
        try {
            // Este código tenta analisar a string "a1.75" como um número usando o formato padrão do local atual.
            valor = NumberFormat.getInstance().parse("a1.75");
            // Imprime o valor analisado
            System.out.println(valor);
        } catch (ParseException e) {
            // Se ocorrer um erro durante a análise, imprime o rastreamento do erro
            e.printStackTrace();
        }
        // Fim do bloco try-catch
    }
    // Fim do método main
}
// Fim da classe ExemploExcecao
