package models;

public class Ceasar {
    private int key;
    private String Text;

    public Ceasar(int key, String Text) {

    }

    public Ceasar() {

    }

    public void isEncoded(int key, String Text){
        this.key=key;
        this.Text=Text;
    }
//   public  boolean isEncoded(String Text){
//       return true;
//   }
    public boolean isNotEmpty(){
        return !Text.trim().isEmpty();
    }
    public String getText(){
        return Text;
    }
   public int getKey(){
        return key;
   }
   public boolean isValidInputText(){
       char[] chars = Text.toCharArray();

       for (char c : chars) {
           if(!Character.isLetter(c) && c != ' ') {
               return false;
           }
       }
       return true;
   }
   public boolean isValidKey(){
       return key >1 && key < 26;
   }
   public String validEncoding(){
       String encoded = "";
       String[] encodedArray = Text.split("");
       String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
       for (int i = 0; i<encodedArray.length;i++)
       {
           if (Text.charAt(i) == ' ')
           {
               encoded += " ";
           }
           else
           {
               int charPosition = alphabet.indexOf(Text.charAt(i));
               int Key = (key + charPosition) % 26;
               encoded += alphabet.charAt(key);
           }
       }
       return encoded.toUpperCase();
   }
   public boolean isValidOutputText(){

       char[] chars = Text.toCharArray();

       for (char c : chars) {
           if(!Character.isLetter(c) && c != ' ') {
               return false;
           }
       }
       return true;
   }
   public String validDecoding(){

       String decodedValue = "";
       String[] encodedArray = Text.split("");
       String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
       for (int i = 0; i<encodedArray.length;i++)
       {
           if (Text.charAt(i) == ' ')
           {
               decodedValue += " ";
           }
           else
           {
               int charPosition = alphabet.indexOf(Text.charAt(i));
               int keyVal = (charPosition - key) % 26;

               if (keyVal < 0)
               {
                   keyVal = alphabet.length() + keyVal;
               }

               char replaceValue = alphabet.charAt(keyVal);
               decodedValue += replaceValue;
           }
       }
       return decodedValue;
   }
}


