import java.util.Scanner;
public class PrimeList {
    public static void main(String[] args){
        System.out.println("Please enter a number, I will help you check if all the numbers less and equal to it are prime number");
        Scanner numInput=new Scanner(System.in);
        int num=numInput.nextInt();
        Boolean prime_check=true;
        if(num<=0){prime_check=false;
            System.out.println(num+" is not a prime number"); }
        for(int j=1; j<num+1; j++){
            if(j>2){
                for(int i=2;i<j;i++){
                  if(j%i==0){
                       prime_check=false;
                       System.out.println(j+" is not a prime number ");
                       break;
                        }
                  else{
                        prime_check=true;

                        }}
                }
            else if(j==2){System.out.println(j+" is a prime number");}
            else{
                prime_check=false;
                System.out.println(j+" is not a prime number"); }
         if(prime_check==true){
              System.out.println(j+" is a prime number");}
    }}}