package challenge1;

        /*
         *  UCF COP3330 Summer 2021 Assignment 4 Solution
         *  Copyright 2021 Brianne Juntunen
         */

/*
Exercise 4 - Mad Lib
Mad libs are a simple game where you create a story
template with blanks for words. You, or another player,
then construct a list of words and place them into the
story, creating an often silly or funny story as a result.

Create a simple mad-lib program that prompts for a noun,
a verb, an adverb, and an adjective and injects those into
a story that you create.

Example Output
Enter a noun: dog
Enter a verb: walk
Enter an adjective: blue
Enter an adverb: quickly
Do you walk your blue dog quickly? That's hilarious!

Constraints
Use a single output statement for this program.
If your language supports string interpolation or string
substitution, use it to build up the output.

Challenges
Add more inputs to the program to expand the story.
Implement a branching story, where the answers to questions
determine how the story is constructed.
 */
import java.util.Scanner;

public class AppC1 {
    static Scanner in = new Scanner(System.in);

    public static void main( String[] args ) {
        challenge1.AppC1 myApp = new challenge1.AppC1();

        //Sentence 1
        String verb = myApp.enterA("verb");
        String adjective = myApp.enterA("adjective");
        String noun = myApp.enterA("noun");
        String adverb = myApp.enterA("adverb");

        //Sentence 2
        String verb2 = myApp.enterA("verb");
        String adjective2 = myApp.enterA("adjective");
        String noun2 = myApp.enterA("noun");
        String adverb2 = myApp.enterA("adverb");

        String madLib = myApp.generateStory(verb, adjective, noun, adverb,
                verb2, adjective2, noun2, adverb2);
        myApp.printMadLib(madLib);
    }

    public void printMadLib(String madlib){
        System.out.println(madlib);
    }

    public String generateStory(String verb, String adj, String noun, String adverb,
                                String verb2, String adj2, String noun2, String adverb2){
        String madlib = String.format("Do you %s your %s %s %s? " +
                "Can you %s your %s %s %s? Of course not!",
                verb, adj, noun, adverb, verb2, adj2, noun2, adverb2);
        return madlib;
    }

    public String enterA(String type){
        if(type.equalsIgnoreCase("adjective")
                || type.equalsIgnoreCase("adverb")){
            System.out.print("Enter an " + type + ": ");
        } else {
            System.out.print("Enter a " + type + ": ");
        }
        String input = in.nextLine();
        return input;
    }

}
