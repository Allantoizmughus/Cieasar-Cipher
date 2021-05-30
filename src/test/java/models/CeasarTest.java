package models;



import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CeasarTest {
    @Test
    public void isEncoded_notEmptyInput(){
        Ceasar testCeasar=new Ceasar();
        assertEquals(true, testCeasar.isNotEmpty());
    }

    @Test
    public void isEncoded_checkInstances(){
        Ceasar testCeasar=new Ceasar();
        assertEquals(true, testCeasar instanceof Ceasar);
    }
    @Test
   public void isEncoded_inputIsString_true() {
        Ceasar testCeasar=new Ceasar();
        assertEquals("",testCeasar.getText());
    }
     @Test
    public void isEncoded_cipherKey_int(){
         Ceasar testCeasar=new Ceasar();
         assertEquals(2,testCeasar.getKey());
     }
}