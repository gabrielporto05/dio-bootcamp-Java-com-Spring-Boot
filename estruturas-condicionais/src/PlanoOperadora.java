public class PlanoOperadora {
    public static void main(String[] args) {

        char plano = 'C';

        switch (plano) {
            case 'A':
                System.out.println("A - 120Gb de internet");
                break;
            case 'B':
                System.out.println("B - 150Gb de internet");
                break;
            case 'C':
                System.out.println("C - 90Gb de internet");
                break;
            default:
                System.out.println("Plano inválido");
                break;
        }

    }
}
