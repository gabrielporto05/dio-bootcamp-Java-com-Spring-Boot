import java.util.Locale;
import java.util.Scanner;

public class User {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        SmartTv smartTv = new SmartTv();

        System.out.println("SmartTv ligada? " + smartTv.ligada);
        System.out.println("SmartTv canal: " + smartTv.canal);
        System.out.println("SmartTv volume: " + smartTv.volume);

        smartTv.ligar();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();

        smartTv.subirCanal();
        smartTv.subirCanal();
        smartTv.subirCanal();
        smartTv.subirCanal();

        System.out.println("SmartTv ligada? " + smartTv.ligada);
        System.out.println("SmartTv canal: " + smartTv.canal);
        System.out.println("SmartTv volume: " + smartTv.volume);

        System.out.print("Digite qual o novo canal desejado: ");
        int canalDesejado = sc.nextInt();
        smartTv.setCanal(canalDesejado);

        System.out.println("SmartTv canal: " + smartTv.canal);

        sc.close();

    }
}
