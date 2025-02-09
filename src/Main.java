import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Converter converter = new Converter();
        String input = getValidInput(scanner);
        if (validateMorseCode(input)) {
            System.out.println("In English: " + converter.convertMorseToAlphabet(input));
        } else {
            System.out.println("In Morse: " + converter.convertAlphabetToMorse(input));
        }
    }

    public static String getValidInput(Scanner scanner) {
        while (true) {
            System.out.println("Write your message in English or Morse:");
            try {
                String input = scanner.nextLine();
                if (validateMorseCode(input) || validateEnglishText(input)) {
                    return input;
                } else {
                    System.out.println("Input contains invalid characters. Please try again.");
                }
            } catch (Exception e) {
                System.out.println("Error reading input. Please try again.");
            }
        }
    }

    public static boolean validateMorseCode(String input) {
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c != '.' && c != '-' && c != ' ') {
                return false;
            }
        }
        return true;
    }

    public static boolean validateEnglishText(String input) {
        String allowed = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789 .,?";
        for (char c : input.toUpperCase().toCharArray()) {
            if (allowed.indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    }
}
