import java.util.Scanner;
public class Main{
public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);
    System.out.println("Hello world");
    System.out.println(12 + 10);
    System.out.println(100);
    String name="Jamba ";
    String name2="Gerad";
    System.out.println("Your name is " +name.toUpperCase()+ " of length "+name.length());
    System.out.println("Your full name is "+name.concat(name2));
    double num1 = (-101.11);
    System.out.println(Math.min(0,1));
    System.out.println(Math.max(2,4));
    System.out.println(Math.sqrt(121));
    System.out.println(Math.abs(num1));
    
    if (num1>=6){
        System.out.println();
    }else if(num1>=-102){
        System.out.println();
    }else{
        System.out.println();
    }
    String time ="22:00";
    String result = (time=="21:00")? "Have a nice day":"wee mzee";
    System.out.println(result);
    
    while (num1<6){
        System.out.println("Not yet");
        num1+=50;
    }
    if (num1>6){
    System.out.println("Now");
    }
    switch(time){
        case"11:00":
            System.out.println("11 a.m");
        break;
        case("22:00"):
            System.out.println("Time to sleep");
        break;
    }
    int num2, i;
    for(num2=-1 ; num2<2 ; num2++){
        System.out.println(num2);
        for(i=10; i>7; i--){
            System.out.println(i);
        if (i==9){
            break;
        }}
    }
    String [][] chelsea={{"Jackson","Sterling","Mudryk"}, {"Gallagher","Enzo"}, {"Gusto","Silva"}};
    System.out.println(chelsea);
    String []stuffs={};
    for(String j:stuffs){
        System.out.println(j);
    }
    System.out.println("Go again?");
    String exit=scanner.nextLine();
    System.out.println(exit);
}
}