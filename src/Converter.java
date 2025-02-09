import java.util.HashMap;
import java.util.Map;

//Converter to convert our morse code to alphabet and vice versa
public class Converter {
    private  final Map<Character, String> alphabetAndMorse = new HashMap<>();
    private  final Map<String, Character> reversedMorse = new HashMap<>();

    public Converter(){
        alphabetAndMorse.put('A', ".-");
        alphabetAndMorse.put('B', "-...");
        alphabetAndMorse.put('C', "-.-.");
        alphabetAndMorse.put('D', "-..");
        alphabetAndMorse.put('E', ".");
        alphabetAndMorse.put('F', "..-.");
        alphabetAndMorse.put('G', "--.");
        alphabetAndMorse.put('H', "....");
        alphabetAndMorse.put('I', "..");
        alphabetAndMorse.put('J', ".---");
        alphabetAndMorse.put('K', "-.-");
        alphabetAndMorse.put('L', ".-..");
        alphabetAndMorse.put('M', "--");
        alphabetAndMorse.put('N', "-.");
        alphabetAndMorse.put('O', "---");
        alphabetAndMorse.put('P', ".--.");
        alphabetAndMorse.put('Q', "--.-");
        alphabetAndMorse.put('R', ".-.");
        alphabetAndMorse.put('S', "...");
        alphabetAndMorse.put('T', "-");
        alphabetAndMorse.put('U', "..-");
        alphabetAndMorse.put('V', "...-");
        alphabetAndMorse.put('W', ".--");
        alphabetAndMorse.put('X', "-..-");
        alphabetAndMorse.put('Y', "-.--");
        alphabetAndMorse.put('Z', "--..");
        alphabetAndMorse.put('1', ".----");
        alphabetAndMorse.put('2', "..---");
        alphabetAndMorse.put('3', "...--");
        alphabetAndMorse.put('4', "....-");
        alphabetAndMorse.put('5', ".....");
        alphabetAndMorse.put('6', "-....");
        alphabetAndMorse.put('7', "--...");
        alphabetAndMorse.put('8', "---..");
        alphabetAndMorse.put('9', "----.");
        alphabetAndMorse.put('0', "-----");
        alphabetAndMorse.put('.', ".-.-.-");
        alphabetAndMorse.put(',', "--..--");
        alphabetAndMorse.put('?', "..--..");
        alphabetAndMorse.put(' ', " ");


        for (Map.Entry<Character, String> entry : alphabetAndMorse.entrySet()) {
            Character key = entry.getKey();
            String value = entry.getValue();
            reversedMorse.put(value, key);
        }
    }

    public  String convertMorseToAlphabet(String morseCode) {
        String text = "";
        for (String code : morseCode.split(" ")) {
            Character letter = reversedMorse.getOrDefault(code, ' ');
            text += "" + letter;
        }
        return text;
    }

    public  String convertAlphabetToMorse(String text) {
        String morse = "";
        for (char c : text.toUpperCase().toCharArray()) {
            String code = alphabetAndMorse.getOrDefault(c, "?");
            morse += code + " ";
        }
        return morse;
    }
}