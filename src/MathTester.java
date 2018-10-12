import java.util.Random;
import java.util.Scanner;

public class MathTester {
    public static void main(String[] args) {
        Scanner keyboard;
        keyboard = new Scanner(System.in);


        String firstWord;
        String secondWord;
        int firstNumber,secondNumber,total;

        firstWord="dog";
        secondWord ="house";
        firstNumber = 5;
        secondNumber = 10;
        total = firstNumber+secondNumber;


        /*System.out.println(firstWord+secondWord);
        System.out.println(firstWord+(firstNumber+secondNumber));
        System.out.println("firstNumber + secondNumber is "+ (firstNumber + secondNumber));
        System.out.println("firstNumber - secondNumber is "+ (firstNumber-secondNumber));
        System.out.println("secondNumber / firstNumber is "+ (secondNumber/firstNumber));
        System.out.println("firstNumber * secondNumber is "+ (firstNumber*secondNumber));
        System.out.println("The modulus of the secondNumber by the firstNumber is "+ (secondNumber%firstNumber));*/

        /*int[] number = new int[15];
        for(int value=1; value<number.length+1; value++){
            System.out.println(value);
        }

        for(int i=1;i<number.length;i++){
            number[i]=i;
        }

        for(int value:number){
            System.out.println(value);
        }*/



        /*String[] choice = new String[3];
        int number;

        choice[0]= "Rock!";
        choice[1]= "Paper!";
        choice[2]= "Scissors!";

        number = (int)(Math.random()*4);

        for(int x=0;x<10;x++){
            number = (int)(Math.random()*3);
            System.out.println(choice[number]);
        }
        */


    //fib

        /*int first, second, next1, next;
        first = 1;
        next1 = 1;
        next = 2;

        System.out.println("One");
        next1=keyboard.nextInt();
        System.out.println("two");
        next=keyboard.nextInt();



        for(int x=0;x<15;x++){
            next1 = next1+next;
            System.out.println(next1);
            next = next+next1;
            System.out.println(next);
            }*/


        /*int[] number = new int[20];

        for(int x=0;x<number.length;x++){
            number[x]=x;
            System.out.println(number[x]);
        }

        for(int value: number){
            System.out.println(value*2);
        }
*/


        /*int[] number = new int[20];

        for(int x=1;x<=number.length;x++){
            if((x%2)!=0){
                System.out.println(x+"odd");
            }
            else if((x%2)==0){
                System.out.println(x+"even");
            }
        }*/
























    }
}
