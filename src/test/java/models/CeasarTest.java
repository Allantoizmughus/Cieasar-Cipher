package models;



import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CeasarTest {
    @Test
   public void isEncoded_inputIsString_true() {
        Ceasar testCeasar=new Ceasar();
        assertEquals(true, testCeasar.isEncoded(""));
    }
     @Test
    public void isEncoded_cipherKey_int(){
         Ceasar testCeasar=new Ceasar();
         assertEquals(testCeasar.isEncoded(2, ""));
     }
}