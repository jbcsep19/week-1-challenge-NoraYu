import java.util.Scanner;

public class Main {
    public static  void main(String[] args){

        Scanner choice= new Scanner(System.in);
        System.out.println("Please entry you First name");
        String name=choice.nextLine();
        System.out.println("WELCOME TO "+name+"'S TINY ADVENTURE!");
        System.out.println("You are in a creepy house! Where would you like to go? ");
        System.out.println("Input 1 if you want to go upstairs; 2 to kitchen, 3 to Patio, 4 to Living Room; 5 to Basement");
        int num1=choice.nextInt();
        switch (num1){
            case 1:
                System.out.println("Upstairs you see a hallway. Next 1 for Bedroom; 2 for Bathroom");
                int num2=choice.nextInt();
                switch (num2) {
                    case 1:
                        System.out.println("Next 1 for Lay on bed; 2 for Open the drawer");
                        int num3 = choice.nextInt();
                        switch (num3){
                            case 1:
                                System.out.println("Next 1 for Sleep; 2 for Just lay awake");
                                int num4 = choice.nextInt();
                                switch (num4) {
                                    case 1:
                                        System.out.println("You awake and find 1000 years has passed.");
                                        break;
                                    case 2:
                                        System.out.println("1 for Try to Sleep, 2 for Try to get out of bed.");
                                        int num5 = choice.nextInt();
                                        switch (num5) {
                                            case 1:
                                                System.out.println("You awake and find 1000 years has passed.");
                                                break;
                                            case 2:
                                                System.out.println("You find you cannot move. You stay in the bed and passed out.");
                                                break; }break;}break;


                            case 2:
                                System.out.println("Find it locked. Next 1 for try to find a key ; 2 for Try to break the lock");
                                int num6=choice.nextInt();
                                switch (num6){
                                    case 1:System.out.println("Cannot find the key. You leave the house safely");
                                         break;
                                    case 2:System.out.println("Find a box in the drawer. 1 for Take it, 2 for Leave it where it is.");
                                         int num7=choice.nextInt();
                                         switch (num7){
                                            case 1: System.out.println("You find you cannot move. You stay in the bed and passed out.");
                                                break;
                                            case 2: System.out.println("You leave the house safely");
                                                break;
                                        }break;}break;}break;

                    case 2:
                        System.out.println("Next 1 Look in mirror; 2 Use the toilet");
                        int num8 = choice.nextInt();
                        switch (num8){
                            case 1:
                                System.out.println("Mirror is dirty, Next 1 for Clean it up; 2 for Leave it as it is");
                                int num9 = choice.nextInt();
                                switch (num9) {
                                    case 1:
                                        System.out.println("You see your past and future through it .");
                                        break;
                                    case 2:
                                        System.out.println("You hear a noise comes through the mirror. 1 for  Clean it up, 2 for Leave the house.");
                                        int num10 = choice.nextInt();
                                        switch (num10) {
                                            case 1:
                                                System.out.println("You see your past and future through it .");
                                                break;
                                            case 2:
                                                System.out.println("You leave the house safely");
                                                break; }break;}break;


                            case 2:
                                System.out.println("Find it cannot flash. Next 1 for Use it ; 2 for Do not use it");
                                int num11=choice.nextInt();
                                switch (num11){
                                    case 1:System.out.println("You stay there forever");
                                        break;
                                    case 2:System.out.println(" 1 for Try to find another restroom in that house, 2 for Leave the house.");
                                        int num12=choice.nextInt();
                                        switch (num12){
                                            case 1: System.out.println("You find it and use it.");
                                                break;
                                            case 2: System.out.println("You leave the house safely");
                                                break;
                                        }break;}break;}break;

                }break;


            case 2:
                System.out.println("Next 1 for Open refrigerator; 2 for Open cabinet");
                int num13=choice.nextInt();
                switch (num13) {
                    case 1:
                        System.out.println("Next 1 for Drink strange milk; 2 for Eat leftovers");
                        int num3 = choice.nextInt();
                        switch (num3){
                            case 1:
                                System.out.println("Next 1 for Sleep; 2 for Just lay awake");
                                int num4 = choice.nextInt();
                                switch (num4) {
                                    case 1:
                                        System.out.println("You awake and find 1000 years has passed.");
                                        break;
                                    case 2:
                                        System.out.println("1 for Try to Sleep, 2 for Try to get out of bed.");
                                        int num5 = choice.nextInt();
                                        switch (num5) {
                                            case 1:
                                                System.out.println("You awake and find 1000 years has passed.");
                                                break;
                                            case 2:
                                                System.out.println("You find you cannot move. You stay in the bed and passed out.");
                                                break; }break;}break;


                            case 2:
                                System.out.println("Find it locked. Next 1 for try to find a key ; 2 for Try to break the lock");
                                int num6=choice.nextInt();
                                switch (num6){
                                    case 1:System.out.println("Cannot find the key. You leave the house safely");
                                        break;
                                    case 2:System.out.println("Find a box in the drawer. 1 for Take it, 2 for Leave it where it is.");
                                        int num7=choice.nextInt();
                                        switch (num7){
                                            case 1: System.out.println("You find you cannot move. You stay in the bed and passed out.");
                                                break;
                                            case 2: System.out.println("You leave the house safely");
                                                break;
                                        }break;}break;}break;

                    case 2:
                        System.out.println("Next 1 Look in mirror; 2 Use the toilet");
                        int num8 = choice.nextInt();
                        switch (num8){
                            case 1:
                                System.out.println("Mirror is dirty, Next 1 for Clean it up; 2 for Leave it as it is");
                                int num9 = choice.nextInt();
                                switch (num9) {
                                    case 1:
                                        System.out.println("You see your past and future through it .");
                                        break;
                                    case 2:
                                        System.out.println("You hear a noise comes through the mirror. 1 for  Clean it up, 2 for Leave the house.");
                                        int num10 = choice.nextInt();
                                        switch (num10) {
                                            case 1:
                                                System.out.println("You see your past and future through it .");
                                                break;
                                            case 2:
                                                System.out.println("You leave the house safely");
                                                break; }break;}break;


                            case 2:
                                System.out.println("Find it cannot flash. Next 1 for Use it ; 2 for Do not use it");
                                int num11=choice.nextInt();
                                switch (num11){
                                    case 1:System.out.println("You stay there forever");
                                        break;
                                    case 2:System.out.println(" 1 for Try to find another restroom in that house, 2 for Leave the house.");
                                        int num12=choice.nextInt();
                                        switch (num12){
                                            case 1: System.out.println("You find it and use it.");
                                                break;
                                            case 2: System.out.println("You leave the house safely");
                                                break;
                                        }break;}break;}break;

                }break;


            case 3:
                System.out.println("Next 1 for Go to the pool; 2 for Open shed");
                break;
            case 4:
                System.out.println("Next 1 for Turn on the TV; 2 for Sit on the couch");
                break;
            case 5:
                System.out.println("Next 1 for Turn on the lights; 2 for Walk in the dark");
                break;



        }

    }
}
