public class ResultadoEscolar {
    public static void main(String[] args) {
        // Define a nota do aluno
        int nota = 6;
        
        // Usa o operador ternário para determinar o resultado com base na nota
        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";
        
        // Imprime o resultado
        System.out.println(resultado);
    }
}
