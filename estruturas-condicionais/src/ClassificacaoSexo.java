public class ClassificacaoSexo {
    public static void main(String[] args) {

        char sigla = 'F';

        switch (sigla) {
            case 'F':
                System.out.println("Feminino");
                break;
            case 'M':
                System.out.println("Masculino");
                break;
            default:
                System.out.println("Sexo inválido");
                break;
        }

    }
}
