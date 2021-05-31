import models.Ceasar;

import java.util.Scanner;
public class App {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.println("Welcome to my Cipher App! What do you want to do here? " +
                "Enter one of the following option: /n 1.Encode /n 2.Decode /n 3.Exit ");
        int selectedOption=scanner.nextInt();
        scanner.nextLine();

        if(selectedOption ==1){
          System.out.println("Enter a Text");
          String Text=scanner.nextLine().toUpperCase();
          System.out.println("Enter a key");
          int key=scanner.nextInt();
          Ceasar encoding=new Ceasar( key,Text);
          System.out.println(String.format("Your Encrypted text is:",encoding.validEncoding()));
        }else if(selectedOption ==2){
            System.out.println("Enter the Encrypted Text");
            String Text=scanner.nextLine().toUpperCase();
            System.out.println("Enter a key");
            int key=scanner.nextInt();
            Ceasar decoding=new Ceasar(key,Text);
            System.out.println(String.format("Your Decrypted Text is:",decoding.validDecoding()));

        }else if(selectedOption == 3){
            System.exit(0);
        }else{
            System.out.println("Invalid Input");
        }
    }
}