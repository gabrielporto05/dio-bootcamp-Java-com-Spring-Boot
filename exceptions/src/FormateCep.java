public class FormateCep {
    public static void main(String[] args) {
        try {
            String cepFormatado = formateCep("123456783");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println(e.getMessage());
        }
    }

    static String formateCep(String cep) throws CepInvalidoException {
        if (cep.length() != 8) {
            throw new CepInvalidoException("CEP inválido. O CEP deve conter 8 dígitos.");
        }

        return cep;
    }
}
