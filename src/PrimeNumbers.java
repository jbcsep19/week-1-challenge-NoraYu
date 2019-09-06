import java.util.Scanner;
public class PrimeNumbers {
    public static void main(String[] args){
        String go_on="Y";
        while(go_on.equalsIgnoreCase("Y")){
            System.out.println("Please enter a number, I will help you check if it's a prime number");
            Scanner numInput=new Scanner(System.in);
            int num=numInput.nextInt();
            Boolean prime_check=true;
            if(num>2){
                for(int i=2;i<num;i++){
                    if(num%i==0){
                        prime_check=false;
                        System.out.println(num+" is not a prime number");
                        break;
                    }
                    else{
                        prime_check=true;
                    }}}
            else if(num==2){prime_check=true;}

            else{
                prime_check=false;
                System.out.println(num+" is not a prime number"); }
            if(prime_check==true){
                System.out.println(num+" is a prime number");}
            System.out.println("Would you like to input another number? (Y/N)");
            go_on=numInput.next();


        } }}

