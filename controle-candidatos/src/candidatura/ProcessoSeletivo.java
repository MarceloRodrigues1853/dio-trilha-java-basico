package candidatura;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        // salário base maior que salário pretendido
        case1(2000.0, 1900.0);

        // salário base igual ao salário pretendido
        case1(2000.0, 2000.0);

        // salário base menor que salário pretendido
        case1(1900.0, 2000.0);
    }

    static void case1(double salarioBase, double salarioPretendido) {

        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
