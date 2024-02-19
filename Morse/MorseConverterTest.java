package Morse;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MorseConverterTest {



    @Test
    public void testEngToMorseCode() {
        textToMorseConverter converter = new textToMorseConverter();
        String actual = converter.toMorse("HELLO BROTHER");
        String expected = ".... . .-.. .-.. --- / -... .-. --- - .... . .-.";
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testMorseCodeToEng() {
        morseTotextConverter converter = new morseTotextConverter();
        String actual = converter.toEnglishh(".... . .-.. .-.. --- / -... .-. --- - .... . .-.");
        String expected = "HELLO BROTHER";
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void invalidCharacterToMorse() {
        textToMorseConverter converter = new textToMorseConverter();
        String actual = converter.toMorse("/&&&");
        String expected = "Character not supported: (/) Character not supported: (&) Character not supported: (&) Character not supported: (&)";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void invalidCharacterToEng() {
        morseTotextConverter converter = new morseTotextConverter();
        String actual = converter.toEnglishh("/&&&");
        String expected = "Character not supported: (/&&&) please try again";
        Assertions.assertEquals(expected, actual);
    }

    }