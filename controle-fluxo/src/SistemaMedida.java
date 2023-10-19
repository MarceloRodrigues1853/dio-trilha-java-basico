public class SistemaMedida {
    public static void main(String[] args) {
        // Define a sigla a ser verificada
        String sigla = "M";

        // Utiliza a declaração switch para comparar o valor da variável sigla
        switch (sigla) {
            case "P": {
                // Caso a sigla seja "P", imprime "PEQUENO"
                System.out.println("PEQUENO");
                break; // Sai do switch após a execução do caso "P"
            }
            case "M": {
                // Caso a sigla seja "M", imprime "MÉDIO"
                System.out.println("MÉDIO");
                break; // Sai do switch após a execução do caso "M"
            }
            case "G": {
                // Caso a sigla seja "G", imprime "GRANDE"
                System.out.println("GRANDE");
                break; // Sai do switch após a execução do caso "G"
            }
            default:
                // Se a sigla não corresponder a nenhum caso, imprime "INDEFINIDO"
                System.out.println("INDEFINIDO");
        }
    }
}
