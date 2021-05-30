package models;



import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CeasarTest {
    @Test
   public void isEncoded_inputIsString_true() {
        Ceasar testCeasar=new Ceasar();
        assertEquals(true, testCeasar.isEncoded(""));
    }
}