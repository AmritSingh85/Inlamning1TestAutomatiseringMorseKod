import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestConverter {
    @Test
    public void testConversionToAlphabetWords() {
        Converter converter = new Converter();
        assertEquals("HEJSAN  JAG  HETER  MORSE", converter.convertMorseToAlphabet(".... . .--- ... .- -.   .--- .- --.   .... . - . .-.   -- --- .-. ... . "));
    }
    @Test
    public void testConversionToMorseWords() {
        Converter converter = new Converter();
        assertEquals(".... . .--- ... .- -.     .--- .- --.     .... . - . .-.     -- --- .-. ... . ", converter.convertAlphabetToMorse("HEJSAN  JAG  HETER  MORSE"));
    }

    @Test
    public void testConversionToMorse() {
        Converter converter = new Converter();
        Assert.assertEquals(".- ", converter.convertAlphabetToMorse("A"));
    }

    @Test
    public void testConversionToText() {
        Converter converter = new Converter();
        assertEquals("A", converter.convertMorseToAlphabet(".- "));
    }

    @Test
    public void testUnknownChar() {
        Converter converter = new Converter();
        assertEquals("? ", converter.convertAlphabetToMorse("Å"));
    }
}
