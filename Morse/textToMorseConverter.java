package Morse;

import java.util.HashMap;

public class textToMorseConverter {
    private HashMap<String, String> morseLexikon;

    public textToMorseConverter() {
        morseLexikon = new HashMap<>();

        morseLexikon.put("A", ".-");
        morseLexikon.put("B", "-...");
        morseLexikon.put("C", "-.-.");
        morseLexikon.put("D", "-..");
        morseLexikon.put("E", ".");
        morseLexikon.put("F", "..-.");
        morseLexikon.put("G", "--.");
        morseLexikon.put("H", "....");
        morseLexikon.put("I", "..");
        morseLexikon.put("J", ".---");
        morseLexikon.put("K", "-.-");
        morseLexikon.put("L", ".-..");
        morseLexikon.put("M", "--");
        morseLexikon.put("N", "-.");
        morseLexikon.put("O", "---");
        morseLexikon.put("P", ".--.");
        morseLexikon.put("Q", "--.-");
        morseLexikon.put("R", ".-.");
        morseLexikon.put("S", "...");
        morseLexikon.put("T", "-");
        morseLexikon.put("U", "..-");
        morseLexikon.put("V", "...-");
        morseLexikon.put("W", ".--");
        morseLexikon.put("X", "-..-");
        morseLexikon.put("Y", "-.--");
        morseLexikon.put("Z", "--..");
        morseLexikon.put("1", ".----");
        morseLexikon.put("2", "..---");
        morseLexikon.put("3", "...--");
        morseLexikon.put("4", "....-");
        morseLexikon.put("5", ".....");
        morseLexikon.put("6", "-....");
        morseLexikon.put("7", "--...");
        morseLexikon.put("8", "---..");
        morseLexikon.put("9", "----.");
        morseLexikon.put("0", "-----");
        morseLexikon.put(",", "--..--");
        morseLexikon.put(".", ".-.-.-");
        morseLexikon.put("?", "..--..");

    }

    public String toMorse(String text) {
        String[] characters = text.toUpperCase().split("");
        String morseCode = "";

        for (String aktuellaTecken : characters) {
            if (aktuellaTecken.equals(" ")) {
                morseCode += "/ ";
            } else {
                String morse = morseLexikon.get(aktuellaTecken);
                if (morse != null) {
                    morseCode += morse + " ";
                } else {
                    morseCode += "Character not supported: (" + aktuellaTecken + ") ";
                }
            }
        }
        return morseCode.trim();

    }
}






