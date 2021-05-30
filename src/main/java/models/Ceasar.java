package models;

public class Ceasar {
    private int key;
    private String Text;
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
}
