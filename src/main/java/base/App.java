package base;

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

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main( String[] args ) {
        App myApp = new App();

        String verb = myApp.enterA("verb");
        String adjective = myApp.enterA("adjective");
        String noun = myApp.enterA("noun");
        String adverb = myApp.enterA("adverb");

        myApp.generateStory(verb, adjective, noun, adverb);
    }

    public void generateStory(String verb, String adj, String noun, String adverb){
        String madlib = String.format("Do you %s your %s %s %s? " +
                "That's hilarious!", verb, adj, noun, adverb);
        System.out.println(madlib);
    }

    public String enterA(String type){
        System.out.print("Enter a(n) " + type);
        String input = in.nextLine();
        return input;
    }

}
