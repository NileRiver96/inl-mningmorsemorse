package Morse;



import java.util.Scanner;

public class MorseConverterMain {
    public static void main(String[] args) {
        textToMorseConverter converter = new textToMorseConverter();
        morseTotextConverter converterr = new morseTotextConverter();
        Scanner scanner = new Scanner(System.in);
        boolean keepGoing = true;

        while (keepGoing) {
            System.out.println("Välj alternativ:");
            System.out.println("1. Översätta text till morsekod");
            System.out.println("2. Översätt morsekod till text");
            System.out.println("3. Avsluta");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Ange text att översätta till morsekod:");
                    String textToTranslate = scanner.nextLine();
                    String morseResult = converter.toMorse(textToTranslate.toUpperCase());

                    if (morseResult != null) {
                        System.out.println("Här är din översättning: " + morseResult);
                        System.out.println("Programmet avslutas nu..");
                        keepGoing = false; // Avsluta loopen
                    }
                    break;

                case 2:
                    System.out.println("Ange morsekod att översätta till Engelska:");
                    String morseToTranslate = scanner.nextLine();
                    String englishResult = converterr.toEnglishh(morseToTranslate);
                    if (englishResult != null) {
                        System.out.println("Här är din översättning: " + englishResult);
                        System.out.println("Programmet avslutas nu..");
                        keepGoing = false; // Avsluta loopen
                    }
                    break;

                case 3:
                    System.out.println("Programmet avslutas.");
                    keepGoing = false; // Avsluta loopen
                    break;

                default:
                    System.out.println("Ogiltigt val. Försök igen.");
            }
        }

    }
}