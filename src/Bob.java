import java.util.Scanner;

public class Bob {

    Password password = new Password("pass");

    public static void main(String[] args) {

        Password.checkPass("0pass1");
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("This is Bob!");
        System.out.println("Let's start by greeting him");


        String userInput;
        boolean greeting;

        do{
            userInput = sc.nextLine();
            greeting = (!userInput.equalsIgnoreCase("bye"));

            if(userInput.endsWith("?")){
                System.out.println("Sure");
            }else if(userInput.endsWith("!")){
                System.out.println("Whoa, chill out!");
            }else if(userInput.trim().equals("")){
                System.out.println("Fine. Be that way!");
            }else{
                System.out.println("Whatever");
            }

        }while(greeting);

    }
}
