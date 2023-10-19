import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        // Define a mesada inicial como 50.0
        double mesada = 50.0;
        // Loop while para verificar se a mesada é maior que 0
        while (mesada > 0) {
            // Gera um valor aleatório para o doce
            double valorDoce = valorAleatorio();
            // Verifica se o valor do doce é maior que a mesada disponível
            if (valorDoce > mesada) {
                // Se o valor do doce for maior que a mesada, ajusta o valor do doce para o valor da mesada
                valorDoce = mesada;
            }

            // Adiciona o valor do doce ao carrinho e atualiza a mesada
            System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho");
            mesada = mesada - valorDoce;
        }
        // Imprime a mesada restante e uma mensagem informando que Joãozinho gastou toda a sua mesada em doces
        System.out.println("Mesada: " + mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em doces");

        /*
         * Não se preocupe quanto a formatação de valores Iremos explorar os recursos de
         * formatação em breve !!
         */
    }

    // Método para gerar um valor aleatório para o doce
    public static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(0.0, 10.0);
    }
}
