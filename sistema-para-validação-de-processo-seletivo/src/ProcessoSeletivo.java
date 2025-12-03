import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {

        System.out.println("Processo seletivo");

        String[] candidatos = { "Chines", "Gabriel", "Julia", "Joao", "Theo", "Vitor", "Maria", "Rafael", "Thiago" };

        selecaoCandidatos(candidatos);

    }

    static void selecaoCandidatos(String[] candidatos) {

        List<String> candidatosSelecionados = new ArrayList<>();

        int candidatosSelecionado = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionado < 5 && candidatoAtual < candidatos.length) {
            String canditado = candidatos[candidatoAtual];

            double salarioPretendido = valorPretendido();
            System.out.println("Candidato " + canditado + " salario pretendido: " + salarioPretendido);

            if (salarioBase > salarioPretendido) {
                candidatosSelecionados.add(canditado);
                candidatosSelecionado++;
            }

            candidatoAtual++;
        }

        imprimirSelecionados(candidatosSelecionados);

    }

    static void imprimirSelecionados(List<String> candidatosSelecionados) {

        System.out.printf("\n\nCandidatos selecionados: \n");

        for (String candidato : candidatosSelecionados) {
            System.out.println(candidato);
        }

        for (String candidato : candidatosSelecionados) {
            entrandoEmContato(candidato);
        }

    }

    static void entrandoEmContato(String candidato) {

        System.out.printf("\nEntrando em contato com %s\n", candidato);

        int tentativas = 1;
        boolean atendeu = atendeuLigacao();

        do {
            atendeu = atendeuLigacao();
            if (!atendeu) {
                tentativas++;
            }
        } while (!atendeu && tentativas <= 3);

        if (!atendeu) {
            System.out.println("Nao foi possivel entrar em contato com " + candidato + " apos " + (tentativas - 1)
                    + " tentativas");

            return;
        }

        System.out.println(
                "Conseguimos contato com " + candidato + " em " + tentativas +
                        (tentativas > 1 ? " tentativas" : " tentativa"));

    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800.0, 2200.0);
    }

    static boolean atendeuLigacao() {
        return ThreadLocalRandom.current().nextBoolean();
    }

}
