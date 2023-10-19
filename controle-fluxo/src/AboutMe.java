import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        try {
            // Criando o objeto Scanner para receber entrada do usuário
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
            // Solicita ao usuário que digite seu nome
            System.out.println("Digite seu nome");
            String nome = scanner.next();
            
            // Solicita ao usuário que digite seu sobrenome
            System.out.println("Digite seu sobrenome");
            String sobrenome = scanner.next();

            // Solicita ao usuário que digite sua idade
            System.out.println("Digite sua idade");
            int idade = scanner.nextInt();
            
            // Solicita ao usuário que digite sua altura
            System.out.println("Digite sua altura");
            double altura = scanner.nextDouble();

            // Imprime os dados fornecidos pelo usuário
            System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " anos ");
            System.out.println("Minha altura é " + altura + "cm ");
            
            // Fecha o objeto Scanner para liberar recursos
            scanner.close();
        } catch (InputMismatchException e) {
            // Captura exceção se os campos idade e altura não forem numéricos
            System.out.println("Os Campos idade e altura precisam ser numéricos");
        }
    }
}
