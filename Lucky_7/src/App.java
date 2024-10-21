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

        while (saldo >= hinta) {
            System.out.println("Do you want to play?");
            System.out.println("If yes, press enter.");
            System.out.println("If not, type: I don't want to play this game anymore.");

            String vastaus = scanner.nextLine();

            // Jos haluaa pelata
            if (vastaus.equalsIgnoreCase("")) {
                saldo -= hinta;

                int randomNum1 = random.nextInt(10);
                int randomNum2 = random.nextInt(10);
                int randomNum3 = random.nextInt(10);

                System.out.println(randomNum1);
                System.out.println(randomNum2);
                System.out.println(randomNum3);

                // Tarkistetaan tulos
                if (randomNum1 == 7 && randomNum2 == 7 && randomNum3 == 7) {
                    System.out.println("All the numbers were 7.");
                    System.out.println("JACKPOT YOU WON 10 TOKENS!!!");
                    saldo += 10;
                } else if ((randomNum1 == 7 && randomNum2 == 7) || (randomNum2 == 7 && randomNum3 == 7) || (randomNum1 == 7 && randomNum3 == 7)) {
                    System.out.println("Two of the numbers were 7!!");
                    System.out.println("You won 5 tokens!!");
                    saldo +=5;
                } else if (randomNum1 == 7 || randomNum2 == 7 || randomNum3 == 7) {
                    System.out.println("One of the numbers was 7!");
                    System.out.println("You won 3 tokens!");
                    saldo +=3;
                } else {
                    System.out.println("You lose.");
                }

                System.out.println("You have now " + saldo + " tokens left.");
            }
            // Jos käyttäjä haluaa lopettaa pelin
            else if (vastaus.equalsIgnoreCase("I don't want to play this game anymore.")) {
                System.out.println("You have now " + saldo + " tokens. Thanks for playing!");
                break;
            }
            // Jos syöte on virheellinen
            else {
                System.out.println("Yes or no?");
                continue; // Palataan kysymään uudelleen
            }
        }
        
        scanner.close();
    }
}