package models;

public class Ceasar {
    private int mkey;
    private String mText;
    public void isEncoded(int key, String Text){
        mkey=key;
        mText=Text;
    }
   public  boolean isEncoded(String Text){
       return true;
   }
}
