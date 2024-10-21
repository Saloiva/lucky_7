import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Kysytaan, kuinka paljon kayttaja haluaa ladata saldoa
        System.out.println("How much money will you use?");
        int saldo = scanner.nextInt();

        // Maaritellaan pyoraytyksen hinta
        int hinta = 1;

        System.out.println("One spin costs one token.");

        // Kysytaan, haluaako kayttaja pelata
        scanner.nextLine(); // Tyhjennetään syötteen puskuri

        scanner.close();
    }
}