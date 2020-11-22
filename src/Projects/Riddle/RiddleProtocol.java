package Projects.Riddle;

/**
 * Created by Lisa Ramel
 * Date: 2020-11-10
 * Time: 13:52
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */

public class RiddleProtocol {
    private static final int WAITING = 0;
    private static final int SENTRIDDLE = 1;
    private static final int SENTANSWER = 2;

    private static final int NUMJOKES = 3;

    private int state = WAITING;
    private int currentJoke = 0;

    private String[] riddle = { "I have a tail and a head, but no body. What am I?", "The more you take, the more you leave behind. What am I?", "What belongs to you, but other people use it more than you?" };
    private String[] answers = { "A coin", "Footsteps", "My name"};
    private String[] answersOutput = { "A coin!", "Footsteps!", "Your name!"};

    public String processInput(String theInput) {
        String theOutput = null;

        if (state == WAITING) {
            theOutput = "You want a riddle? (y/n)";
                state = SENTRIDDLE;
            }
        else if (state == SENTRIDDLE) {
            if (theInput.equalsIgnoreCase("y")) {
                theOutput = riddle[currentJoke];
                state = SENTANSWER;
            } else {
                theOutput = "Bye";
                state = WAITING;

           }
        }

        else if (state == SENTANSWER) {
            if (theInput.equalsIgnoreCase(answers[currentJoke])) {
                theOutput = "Correct! " + answersOutput[currentJoke] + " Want another one? (y/n)";
                if (currentJoke == (NUMJOKES - 1)) {
                    currentJoke = 0;
                }
                else
                    currentJoke++;
                state = SENTRIDDLE;
            } else {
                theOutput = "Not quite right. Try again? y/n";
                state = SENTRIDDLE;
            }

        }
        return theOutput;
    }
}
