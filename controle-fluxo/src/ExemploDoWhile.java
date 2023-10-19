import java.util.Random;

public class ExemploDoWhile {
    public static void main(String[] args) {
        // Imprime "Discando..." no console
        System.out.println("Discando...");

        // Inicia o bloco do-while
        do {
            // Executa repetidamente até alguém atender
            System.out.println("Telefone tocando");

        } while (tocando()); // Chama o método tocando

        // Imprime "Alô !!!" quando alguém atender
        System.out.println("Alô !!!");
    }
    
    // Método tocando para simular se alguém atende ou não
    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3) == 1;
        // Imprime se alguém atendeu ou não
        System.out.println("Atendeu? " + atendeu);
        // Retorna false se alguém atendeu para parar o loop, caso contrário, continua tocando
        return !atendeu;
    }
}
