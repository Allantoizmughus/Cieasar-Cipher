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
     @Test
    public void isEncoded_isValidInputText_String(){
         Ceasar testCeasar=new Ceasar();
         assertEquals(true,testCeasar.isValidInputText());
     }
     @Test
    public void isEncoded_isValidKey_int(){
        Ceasar testCeasar=new Ceasar();
        assertEquals(true,testCeasar.isValidKey());
     }
     @Test
    public void isEncoded_validEncoding(){
         Ceasar testCeasar=new Ceasar();
         assertEquals("",testCeasar.validEncoding());
     }
     @Test
    public void isEncoded_isValidOutputText_String(){
         Ceasar testCeasar=new Ceasar();
         assertEquals(true,testCeasar.isValidOutputText());
     }
     @Test
    public void isEncoded_validDecoding(){
         Ceasar testCeasar=new Ceasar();
         assertEquals("", testCeasar.validDecoding());
     }
}