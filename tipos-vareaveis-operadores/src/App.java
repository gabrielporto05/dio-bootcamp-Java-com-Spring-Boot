public class App {
    public static void main(String[] args) throws Exception {

        String name = "Chines";
        int age = 25;
        double height = 1.68;
        double weight = 77.5;
        char gender = 'M';
        boolean isStudent = true;

        printInfo(name, age, height, weight, gender, isStudent);

        name = "Julia";
        System.out.println("Name: " + name);

        double imc = calculateIMC(weight, height);
        System.out.printf("IMC: %.2f%n", imc);

        String imcResult = resultIMC(imc);
        System.out.println("IMC Result: " + imcResult);

    }

    public static void printInfo(String name, int age, double height, double weight, char gender, boolean isStudent) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
        System.out.println("Is student: " + isStudent);
    }

    public static double calculateIMC(double weight, double height) {
        return weight / (height * height);
    }

    public static String resultIMC(double imc) {
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc >= 18.5 && imc < 24.9) {
            return "Peso normal";
        } else if (imc >= 25 && imc < 29.9) {
            return "Acima do peso";
        } else {
            return "Obesidade";
        }
    }

}
