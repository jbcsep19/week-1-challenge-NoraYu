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
                num1=choice.nextInt();
                switch (num1) {
                    case 1:
                        System.out.println("Next 1 for Lay on bed; 2 for Open the drawer");
                        num1 = choice.nextInt();
                        switch (num1){
                            case 1:
                                System.out.println("Next 1 for Sleep; 2 for Just lay awake");
                                num1 = choice.nextInt();
                                switch (num1) {
                                    case 1:
                                        System.out.println("You awake and find 1000 years has passed.");
                                        break;
                                    case 2:
                                        System.out.println("1 for Try to Sleep, 2 for Try to get out of bed.");
                                        num1 = choice.nextInt();
                                        switch (num1) {
                                            case 1:
                                                System.out.println("You awake and find 1000 years has passed.");
                                                break;
                                            case 2:
                                                System.out.println("You find you cannot move. You stay in the bed and passed out.");
                                                break; }break;}break;


                            case 2:
                                System.out.println("Find it locked. Next 1 for try to find a key ; 2 for Try to break the lock");
                                num1=choice.nextInt();
                                switch (num1){
                                    case 1:System.out.println("Cannot find the key. You leave the house safely");
                                         break;
                                    case 2:System.out.println("Find a box in the drawer. 1 for Take it, 2 for Leave it where it is.");
                                         num1=choice.nextInt();
                                         switch (num1){
                                            case 1: System.out.println("You find you cannot move. You stay in the bed and passed out.");
                                                break;
                                            case 2: System.out.println("You leave the house safely");
                                                break;
                                        }break;}break;}break;

                    case 2:
                        System.out.println("Next 1 Look in mirror; 2 Use the toilet");
                        num1 = choice.nextInt();
                        switch (num1){
                            case 1:
                                System.out.println("Mirror is dirty, Next 1 for Clean it up; 2 for Leave it as it is");
                                num1 = choice.nextInt();
                                switch (num1) {
                                    case 1:
                                        System.out.println("You see your past and future through it .");
                                        break;
                                    case 2:
                                        System.out.println("You hear a noise comes through the mirror. 1 for  Clean it up, 2 for Leave the house.");
                                        num1 = choice.nextInt();
                                        switch (num1) {
                                            case 1:
                                                System.out.println("You see your past and future through it .");
                                                break;
                                            case 2:
                                                System.out.println("You leave the house safely");
                                                break; }break;}break;


                            case 2:
                                System.out.println("Find it cannot flash. Next 1 for Use it ; 2 for Do not use it");
                                num1=choice.nextInt();
                                switch (num1){
                                    case 1:System.out.println("You stay there forever");
                                        break;
                                    case 2:System.out.println(" 1 for Try to find another restroom in that house, 2 for Leave the house.");
                                        num1=choice.nextInt();
                                        switch (num1){
                                            case 1: System.out.println("You find it and use it.");
                                                break;
                                            case 2: System.out.println("You leave the house safely");
                                                break;
                                        }break;}break;}break;

                }break;


            case 2:
                System.out.println("Next 1 for Open refrigerator; 2 for Open cabinet");
                num1=choice.nextInt();
                switch (num1) {
                    case 1:
                        System.out.println("Next 1 for Drink strange milk; 2 for Eat leftovers");
                        num1 = choice.nextInt();
                        switch (num1){
                            case 1:
                                System.out.println("The milk tastes bitter, Next 1 for keep drinking; 2 for stop drinking");
                                num1 = choice.nextInt();
                                switch (num1) {
                                    case 1:
                                        System.out.println("You get food poisoning.");
                                        break;
                                    case 2:
                                        System.out.println("You feel bad, 1 Take a nap, 2 for get out and ask for help.");
                                        num1 = choice.nextInt();
                                        switch (num1) {
                                            case 1:
                                                System.out.println("You awake and find 1000 years has passed.");
                                                break;
                                            case 2:
                                                System.out.println("You get out and go to hospital.");
                                                break; }break;}break;


                            case 2:
                                System.out.println("There is a bug in the leftover. Next 1 for stop eating ; 2 for Try to throw up");
                                num1=choice.nextInt();
                                switch (num1){
                                    case 1:System.out.println("You die of starvation... eventually.");
                                        break;
                                    case 2:System.out.println("You feel bad, 1 Take a nap, 2 for get out and ask for help.");
                                        num1=choice.nextInt();
                                        switch (num1){
                                            case 1: System.out.println("You awake and find 1000 years has passed.");
                                                break;
                                            case 2: System.out.println("You get out and go to hospital.");
                                                break;
                                        }break;}break;}break;

                    case 2:
                        System.out.println("Next 1 for Eat can of beans; 2 for Take a plate");
                        num1 = choice.nextInt();
                        switch (num1){
                            case 1:
                                System.out.println("cannot open the can, Next 1 for Look for other thing to eat; 2 for Look for opener");
                                num1 = choice.nextInt();
                                switch (num1) {
                                    case 1:
                                        System.out.println("Find nothing. You die of starvation... eventually.");
                                        break;
                                    case 2:
                                        System.out.println("You find the opener finally But it's broken. 1 for  Fix it, 2 for Leave the house and go find a restaurant.");
                                        num1 = choice.nextInt();
                                        switch (num1) {
                                            case 1:
                                                System.out.println("It cannot be fixed. You die of starvation... eventually. .");
                                                break;
                                            case 2:
                                                System.out.println("You leave the house safely");
                                                break; }break;}break;


                            case 2:
                                System.out.println("There's no food. Next 1 for Leave the house and go find a restaurant; 2 for Looking for food");
                                int num11=choice.nextInt();
                                switch (num11){
                                    case 1:System.out.println("You leave the house safely");
                                        break;
                                    case 2:System.out.println("You find nothing 1 for Give up and stay in the house, 2 for Leave the house.");
                                        num1=choice.nextInt();
                                        switch (num1){
                                            case 1: System.out.println("You die of starvation... eventually. .");
                                                break;
                                            case 2: System.out.println("You leave the house safely");
                                                break;
                                        }break;}break;}break;
                }break;


            case 3:
                System.out.println("Next 1 for Go to the pool; 2 for Open shed");
                num1=choice.nextInt();
                switch (num1) {
                    case 1:
                        System.out.println("Next 1 for Clean the pool; 2 for Swim in the pool");
                        num1 = choice.nextInt();
                        switch (num1){
                            case 1:
                                System.out.println("After cleaning it, you cloth are dirty. Next 1 for Get out and go home; 2 for Don't bother, fill up the pool");
                                num1 = choice.nextInt();
                                switch (num1) {
                                    case 1:
                                        System.out.println("You leave the house safely");
                                        break;
                                    case 2:
                                        System.out.println("The pool is ready. But you are tired 1 for Go home , 2 for Go for a swim.");
                                        num1 = choice.nextInt();
                                        switch (num1) {
                                            case 1:
                                                System.out.println("You leave the house safely");
                                                break;
                                            case 2:
                                                System.out.println("You have an accident in the pool.");
                                                break; }break;}break;


                            case 2:
                                System.out.println("The water is chill. Next 1 for Keep swimming ; 2 for Warm up a little bit");
                                num1=choice.nextInt();
                                switch (num1){
                                    case 1:System.out.println("You have an accident in the pool.");
                                        break;
                                    case 2:System.out.println("you are tired after the warm up. 1 for Go home , 2 for Go for a swim.");
                                        num1=choice.nextInt();
                                        switch (num1){
                                            case 1: System.out.println("You leave the house safely");
                                                break;
                                            case 2: System.out.println("You have an accident in the pool.");
                                                break;
                                        }break;}break;}break;

                    case 2:
                        System.out.println("Next 1 for Take an ax; 2 for Take a hammer");
                        num1 = choice.nextInt();
                        switch (num1){
                            case 1:
                                System.out.println(" Next 1 for Chop a tree; 2 for Throw the ax");
                                num1 = choice.nextInt();
                                switch (num1) {
                                    case 1:
                                        System.out.println("The tree speaks. It don't want you to kill it.");
                                        break;
                                    case 2:
                                        System.out.println("The ax hits your foot. 1 for take some rest, 2 for Leave the house.");
                                        num1 = choice.nextInt();
                                        switch (num1) {
                                            case 1:
                                                System.out.println("Your injury gets worse, You pass out.");
                                                break;
                                            case 2:
                                                System.out.println("You leave the house safely");
                                                break; }break;}break;


                            case 2:
                                System.out.println(" Next 1 for Break the hammer ; 2 Hammer a nail");
                                num1=choice.nextInt();
                                switch (num1){
                                    case 1:System.out.println("There's nothing else to do, so you go home");
                                        break;
                                    case 2:System.out.println(" You hit your finger. 1 for take some rest, 2 for Leave the house.");
                                        num1=choice.nextInt();
                                        switch (num1){
                                            case 1: System.out.println("Your injury gets worse, You pass out.");
                                                break;
                                            case 2: System.out.println("You leave the house safely");
                                                break;
                                        }break;}break;}break;

                }break;


            case 4:
                System.out.println("Next 1 for Turn on the TV; 2 for Sit on the couch");
                num1=choice.nextInt();
                switch (num1) {
                    case 1:
                        System.out.println("Next 1 for Change the channel; 2 for Stay on the first channel");
                        num1 = choice.nextInt();
                        switch (num1){
                            case 1:
                                System.out.println("Next 1 Increase the volume; 2 for Decrease the volume");
                                num1 = choice.nextInt();
                                switch (num1) {
                                    case 1:
                                        System.out.println("The volume is too noisy, Neighbour called the police, You are arrested.");
                                        break;
                                    case 2:
                                        System.out.println("You cannot hear it clearly, 1 Increase the volume, 2 for Leave and go home.");
                                        num1 = choice.nextInt();
                                        switch (num1) {
                                            case 1:
                                                System.out.println("The volume is too noisy, Neighbour called the police, You are arrested.");
                                                break;
                                            case 2:
                                                System.out.println("You get out safely.");
                                                break; }break;}break;


                            case 2:
                                System.out.println("The door bell rings. Next 1 for Go open the door ; 2 for Ignore the door");
                                num1=choice.nextInt();
                                switch (num1){
                                    case 1:System.out.println("The volume is too noisy, Neighbour called the police, You are arrested.");
                                        break;
                                    case 2:System.out.println("It's the owner's mother. She was shocked some stranger broke into her son's house . 1 for Run away, 2 for Open the door.");
                                        num1=choice.nextInt();
                                        switch (num1){
                                            case 1: System.out.println("You leave the house safely.");
                                                break;
                                            case 2: System.out.println("She called police. You are arrested");
                                                break;
                                        }break;}break;}break;

                    case 2:
                        System.out.println("Next 1 Look out the window; 2 Start to eat");
                        num1 = choice.nextInt();
                        switch (num1){
                            case 1:
                                System.out.println("A dear comes to the yard, Next 1 for take a picture of the dear; 2 for Ignore it");
                                num1 = choice.nextInt();
                                switch (num1) {
                                    case 1:
                                        System.out.println("The dear is a witch, She turns you into a dear.");
                                        break;
                                    case 2:
                                        System.out.println("You are sleepy noe. 1 for take a nap, 2 for Leave the house.");
                                        num1 = choice.nextInt();
                                        switch (num1) {
                                            case 1:
                                                System.out.println("You wake up found 1000 years has past.");
                                                break;
                                            case 2:
                                                System.out.println("You leave the house safely");
                                                break; }break;}break;


                            case 2:
                                System.out.println("The food is not fresh. Next 1 for Go home ; 2 for Keep eating");
                                num1=choice.nextInt();
                                switch (num1){
                                    case 1:System.out.println("You get home safely");
                                        break;
                                    case 2:System.out.println("You feel bad, 1 Take a nap, 2 for get out and ask for help.");
                                        num1=choice.nextInt();
                                        switch (num1){
                                            case 1: System.out.println("You awake and find 1000 years has passed.");
                                                break;
                                            case 2: System.out.println("You leave the house safely");
                                                break;
                                        }break;}break;}break;

                }break;


            case 5:
                System.out.println("Next 1 for Turn on the lights; 2 for Walk in the dark");
                num1=choice.nextInt();
                switch (num1) {
                    case 1:
                        System.out.println("Next 1 for Turn the laundry on; 2 for Turn the lights off");
                        num1 = choice.nextInt();
                        switch (num1){
                            case 1:
                                System.out.println("You feel sleepy. Next 1 for go home; 2 for Go find a bedroom");
                                num1 = choice.nextInt();
                                switch (num1) {
                                    case 1:
                                        System.out.println("You get home safely.");
                                        break;
                                    case 2:
                                        System.out.println("The sheet is dirty. 1 for Sleep there anyway, 2 for Go home.");
                                        num1 = choice.nextInt();
                                        switch (num1) {
                                            case 1:
                                                System.out.println("You awake and find 1000 years has passed.");
                                                break;
                                            case 2:
                                                System.out.println("You get home safely.");
                                                break; }break;}break;


                            case 2:
                                System.out.println("You hit the wall. Next 1 for go home; 2 for Keep exploring");
                                num1=choice.nextInt();
                                switch (num1){
                                    case 1:System.out.println("You get home safely.");
                                        break;
                                    case 2:System.out.println("Find a coin on the floor. 1 for Take it, 2 for Leave it where it is and go home.");
                                        num1=choice.nextInt();
                                        switch (num1){
                                            case 1: System.out.println("You find you cannot move. You stay there forever.");
                                                break;
                                            case 2: System.out.println("You leave the house safely");
                                                break;
                                        }break;}break;}break;

                    case 2:
                        System.out.println("Next 1 Open a chest; 2 Open a closet");
                        num1 = choice.nextInt();
                        switch (num1){
                            case 1:
                                System.out.println("It cannot open, Next 1 for Leave it as it is; 2 for fix it");
                                num1 = choice.nextInt();
                                switch (num1) {
                                    case 1:
                                        System.out.println("You go home.");
                                        break;
                                    case 2:
                                        System.out.println("There is a note in it. 1 for Read the note, 2 for Leave the house.");
                                        num1 = choice.nextInt();
                                        switch (num1) {
                                            case 1:
                                                System.out.println("The note says you will stay in the house forever. you find you cannot move");
                                                break;
                                            case 2:
                                                System.out.println("You leave the house safely");
                                                break; }break;}break;


                            case 2:
                                System.out.println("There's a lot of clothes. Next 1 Close it and leave ; 2 for Take a cloth");
                                num1=choice.nextInt();
                                switch (num1){
                                    case 1:System.out.println("You get out safely");
                                        break;
                                    case 2:System.out.println(" 1 for Try it on, 2 for Leave the house.");
                                        num1=choice.nextInt();
                                        switch (num1){
                                            case 1: System.out.println("You are turned into a squirrel after you put on that cloth.");
                                                break;
                                            case 2: System.out.println("You leave the house safely");
                                                break;
                                        }break;}break;}break;

                }break;
                

            default:
                System.out.println("Please input a valid number. Quit and start over ");
                break;

        }
    }
}
