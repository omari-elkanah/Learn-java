import java.util.Scanner;
public class Main2{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is 1+2?");
        
        String value=scanner.nextLine();
        
        if (value=="3"){
            System.out.println("Correct");
        }else{
            System.out.println("Wrong");
        }
        System.out.println("The answer is 3");

        String[] Names={"John","Doe"};
        System.out.println(Names[0]);
    }
}