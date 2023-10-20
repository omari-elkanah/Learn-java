import java.util.Scanner;
public class Main2{
    static void Method1(){
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome ");
        System.out.println("1 or 2");
        String choice=input.nextLine();
        if (choice=="1"){
            System.out.println("Have at it");
        }else if (choice=="2") {
            System.out.println("Goodbye");
        }   
    }
    static void Method2(String Address, int age, char gender){

    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your name");
        String value=scanner.nextLine();
        
        if (value=="admin"){
            Method1();
        }
        
        System.out.println("Enter your age");
        Integer age=scanner.nextInt();
        
        if (age >= 18){
            System.out.println("You can drink");
        }else{
            System.out.println("No drinking for you");
        }
        //String[] Names={"John","Doe"};
        //System.out.println(Names[0]);
        
        System.out.println("Bye.....Thank you come again");
        
    }
}