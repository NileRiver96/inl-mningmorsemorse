package Morse;

import java.util.HashMap;

public class morseTotextConverter {
    private HashMap<String, String> morseLexikonReversed = new HashMap<String, String>();

    public morseTotextConverter() {

        morseLexikonReversed.put(".-", "A");
        morseLexikonReversed.put("-...", "B");
        morseLexikonReversed.put("-.-.", "C");
        morseLexikonReversed.put("-..", "D");
        morseLexikonReversed.put(".", "E");
        morseLexikonReversed.put("..-.", "F");
        morseLexikonReversed.put("--.", "G");
        morseLexikonReversed.put("....", "H");
        morseLexikonReversed.put("..", "I");
        morseLexikonReversed.put(".---", "J");
        morseLexikonReversed.put("-.-", "K");
        morseLexikonReversed.put(".-..", "L");
        morseLexikonReversed.put("--", "M");
        morseLexikonReversed.put("-.", "N");
        morseLexikonReversed.put("---", "O");
        morseLexikonReversed.put(".--.", "P");
        morseLexikonReversed.put("--.-", "Q");
        morseLexikonReversed.put(".-.", "R");
        morseLexikonReversed.put("...", "S");
        morseLexikonReversed.put("-", "T");
        morseLexikonReversed.put("..-", "U");
        morseLexikonReversed.put("...-", "V");
        morseLexikonReversed.put(".--", "W");
        morseLexikonReversed.put("-..-", "X");
        morseLexikonReversed.put("-.--", "Y");
        morseLexikonReversed.put("--..", "Z");
        morseLexikonReversed.put(".----", "1");
        morseLexikonReversed.put("..---", "2");
        morseLexikonReversed.put("...--", "3");
        morseLexikonReversed.put("....-", "4");
        morseLexikonReversed.put(".....", "5");
        morseLexikonReversed.put("-....", "6");
        morseLexikonReversed.put("--...", "7");
        morseLexikonReversed.put("---..", "8");
        morseLexikonReversed.put("----.", "9");
        morseLexikonReversed.put("-----", "0");
        morseLexikonReversed.put("--..--", ",");
        morseLexikonReversed.put(".-.-.-", ".");
        morseLexikonReversed.put("..--..", "?");
    }

    public String toEnglishh(String codeMorse) {
        String[] codes = codeMorse.split(" ");
        String text = "";

        for (String morseCode : codes) {
            if (morseCode.equals("/")) {
                text += " ";
            } else {

                String englishLetter = morseLexikonReversed.get(morseCode);
                if (englishLetter != null) {

                    text += englishLetter;
                } else {

                    text += "Character not supported: (" + morseCode + ") please try again ";
                }
            }
        }
        return text.trim();
    }}