public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 8;

        if (nota >= 7) {
            System.out.println("Aprovado");
        } else if (nota < 7 && nota > 4) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }

        System.out.println("-------------");

        String resultado = nota >= 7 ? "Aprovado" : nota < 7 && nota > 4 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);
    }
}
