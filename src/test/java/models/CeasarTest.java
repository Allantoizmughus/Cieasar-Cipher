package models;

import org.junit.jupiter.api.Test;
import org.testng.Assert;


import static org.junit.jupiter.api.Assertions.*;

class CeasarTest {
    @Test
    public void isEncoded_isNotEmpty_true(){
        Ceasar testCeasar=new Ceasar(1,"Allan");
        assertEquals(true,testCeasar.isNotEmpty());
    }

    @Test
    public void isEncoded_checkInstances(){
        Ceasar testCeasar=new Ceasar(1,"allan");
        assertTrue(true);
    }
    @Test
   public void isEncoded_inputIsString_true() {
        Ceasar testCeasar=new Ceasar(1,"allan");
        assertEquals("allan",testCeasar.getText());
    }
//     @Test
//    public void isEncoded_cipherKey_int(){
//         Ceasar testCeasar=new Ceasar();
//         assertEquals(2,testCeasar.getKey());
//     }
     @Test
    public void isEncoded_isValidInputText_String(){
         Ceasar testCeasar=new Ceasar(1,"allan");
         assertEquals(true,testCeasar.isValidInputText());
     }
     @Test
    public void isEncoded_isValidKey_int(){
        Ceasar testCeasar=new Ceasar(1,"allan");
         assertFalse(testCeasar.isValidKey());
     }
     @Test
    public void isEncoded_validEncoding(){
         Ceasar testCeasar=new Ceasar(1,"bob");
         assertEquals("AAA",testCeasar.validEncoding());
     }
     @Test
    public void isEncoded_isValidOutputText_String(){
         Ceasar testCeasar=new Ceasar(1,"allan");
         assertTrue(testCeasar.isValidOutputText());
     }
     @Test
    public void isEncoded_validDecoding(){
         Ceasar encoding=new Ceasar(1,"a");
         assertEquals("Y", encoding.validDecoding());
     }
}