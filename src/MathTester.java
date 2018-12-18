import java.text.DecimalFormat;
import java.util.Scanner;

public class MathTester {
    public static void main(String[] args) {
        Scanner keyboard;
        keyboard = new Scanner(System.in);


        String firstWord;
        String secondWord;
        int firstNumber, secondNumber, total;

        firstWord = "dog";
        secondWord = "house";
        firstNumber = 5;
        secondNumber = 10;
        total = firstNumber + secondNumber;


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


        /*String[] test = new String[1000];

        for(int x=0;x<test.length;x++){
            if((x%2)==0){
                test[x] = "even";
            }
            else if((x%2)!=0){
                test[x] = "odd";
            }
        }

        for(String watch:test){
            System.out.println(watch);
        }*/



        /*String test;
        String hiddenPhrase;

        test = "test";

        System.out.println(test.length());

        String test1;
        test1 = "test1 test";

        String[] run = test1.split(" ");

        System.out.println(run[0]);
        System.out.println(run[1]);

        for(String phrase:run){
            System.out.println(phrase.length());
        }*/



        /*String originalPhrase;
        String hiddenPhrase;

        hiddenPhrase = "";
        originalPhrase = "I am testing a new phrase";

        String[] phrases = originalPhrase.split(" ");

        for(int i=0;i<phrases.length;i++){
            for(int y=0;y<phrases[i].length();y++){
                hiddenPhrase = hiddenPhrase+"-";
            }
            hiddenPhrase = hiddenPhrase+" ";
        }


        System.out.println(hiddenPhrase);*/


        /*String testingPhrase = "testing test";
        String testingLetter;

        for(int x=0;x<5;x++) {
            System.out.println("Pick a letter");
            testingLetter = keyboard.next();

            if (testingPhrase.contains(testingLetter)) {
                System.out.println("Contains");
            } else {
                System.out.println("Doesn't contain.");
            }
        }*/


        /*String testing;
        int position;
        String letter;
        //letter = "t";
        testing = "test phrase";
        String hiddenPhrase = "---- ------";

        printALine("Choose a letter");
        letter = keyboard.next();



        if(testing.contains(letter)){
            while(testing.contains(letter)){
                position = testing.indexOf(letter);
                hiddenPhrase = hiddenPhrase.substring(0,position)+letter+hiddenPhrase.substring(position+1,testing.length());
                testing = testing.replaceFirst(letter," ");
            }
            System.out.println(hiddenPhrase);
        }*/






        /*int [] position = new int[10];
        char[] word = testing.toCharArray();
        for(int x=0;x<word.length;x++){
            if(word[x]==letter){
                position[x] = x+1;
            }
        }

        testing = "-------";
        for(int i=0;i<position.length;i++){
            //if(position[i]==0){break;}
            testing = testing.substring(0,position[i])+letter+testing.substring(position[i]+1,7);

        }
        printALine(testing);*/


        //Used letters

        /*String usedLetters;
        String pickedLetter;
        usedLetters = "";

        for(int x=0;x<10;x++){
            printALine("Your used letters are: "+usedLetters);
            printALine("Pick a letter.");
            pickedLetter = keyboard.nextLine();
            usedLetters +=pickedLetter+", ";
        }*/

        /*String phrase;
        String reversePhrase, reversePhrase1;
        reversePhrase1 = "";
        reversePhrase = "";
        phrase = "test";

        String[] aPhrase = phrase.split("");
        int length = aPhrase.length;

        for(int x=0;x<aPhrase.length;x++){
            reversePhrase = aPhrase[length-x];
            reversePhrase1.equals(reversePhrase1+reversePhrase);
        }
        printALine(reversePhrase);*/


//Reverse
        /*String phrase;
        printALine("Pick a phrase");
        phrase = keyboard.nextLine();
        String newPhrase = "";
        int position;
        String[] letters = phrase.split("");


        for(int x=0;x<letters.length;x++){
            position = letters.length-x;
            newPhrase+=letters[position-1];
        }
        System.out.println(newPhrase);*/


        //Round
        /*double number = 45.3456;
        double roundedNumber;
        roundedNumber = Math.round(number*100);
        roundedNumber = roundedNumber/100;
        doublePrint(roundedNumber);*/


       /* int number, zero, one, two;
        zero=0;
        one=0;
        two=0;
        for(int x=0;x<100;x++){
            number = (int)(Math.random()*3);
            if(number==0){
                zero++;
            }
            else if(number==1){
                one++;
            }
            else if(number==2){
                two++;
            }
            System.out.println(number);

        }
        printALine("One "+one);
        printALine("Zero "+zero);
        printALine("Two "+two);*/


            /*int prices, numberSold;
            double cost, supplyCost, charge, totalEarned,profit;
            String option;
            option ="";
            printALine("\nHow many different prices are you testing?");
            prices=keyboard.nextInt();
            printALine("How much does it cost to make one of your product?");
            cost = keyboard.nextDouble();

            double[] profits = new double[prices+1];
            double[] options = new double[prices+1];

            for(int x=1;x<prices+1;x++){
                printALine("\nHow much of your product are you going to sell for option "+x+"?");
                numberSold = keyboard.nextInt();
                supplyCost = numberSold*cost;
                printALine("The total cost of the supplies for option "+x+" is $"+supplyCost);
                printALine("How much are you charging for your product in option "+x+"?");
                charge = keyboard.nextDouble();
                totalEarned = numberSold*charge;
                printALine("For option "+x+", you earned a total of $"+totalEarned);
                profit = totalEarned-supplyCost;
                //profit = roundProfit(profit);
                printALine("For option "+x+", your total profit was $"+profit+"\n");
                profits[x] = profit;
                options[x] = profit;}
            for(int i=1;i<profits.length;i++){
                printALine("The total profit for option "+i+" is $"+profits[i]);
            }
            for(int y=1;y<profits.length-1;y++){
                if(profits[y]>profits[y+1]){
                    profits[y+1]=profits[y];
                }
            }
            for(int z=1;z<options.length;z++){
                if (options[z]==profits[profits.length-1]){
                    option = "option "+z;
                }
            }
            System.out.println("\nThe largest profit was "+option+" with $"+profits[profits.length-1]);

        }*/

     //Number flip
            /*int number = 28433928;
            String test, newNumber, currentNumber;
            newNumber="";
            int newestNumber;
            test = Integer.toString(number);
            String[] individuals = test.split("");
            for(int x=0;x<individuals.length;x++){
                int testing;
                testing = Integer.parseInt(individuals[x]);
                newestNumber = 10-testing;
                currentNumber=Integer.toString(newestNumber);
                newNumber+=currentNumber;
            }
            printALine(newNumber);*/


            


    }


        public static void doublePrint(double userInput){
            System.out.println(userInput);
        }
        public static void printALine (String userInput){
            System.out.println(userInput);
        }
        public static void intPrint(int userInput){
        System.out.println(userInput);
        }
}
