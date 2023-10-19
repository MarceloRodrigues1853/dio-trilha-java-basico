public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "M"; // M / T

        // Utiliza a declaração switch para comparar o valor da variável plano
        switch (plano) {
            case "T": {
                // Caso o plano seja T, imprime os benefícios relacionados
                System.out.println("5Gb Youtube");
                break; // Break para sair do switch após a execução do caso "T"
            }
            case "M": {
                // Caso o plano seja M, imprime os benefícios relacionados
                System.out.println("WhatsApp e Instagram grátis");
                break; // Break para sair do switch após a execução do caso "M"
            }
            case "B": {
                // Caso o plano seja B, imprime os benefícios relacionados
                System.out.println("100 minutos de ligação");
                break; // Break para sair do switch após a execução do caso "B"
            }
        }
    }
}
