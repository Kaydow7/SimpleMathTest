package csc264;

import java.util.LinkedList;
import java.util.Queue;

/**
 * The class provides methods for the Question class
 */
public class Question
{
    //Class Constants
    final private   String    SUB               = " - ";
    final private   String    ADD               = " + ";
    final private   String    EQU               = " = ";
    final private   boolean   IS_CORRECT        = true;
    final private   boolean   INCORRECT         = false;

    //Class Variables
    private String          answer;              //The answer to the question
    private StringBuilder   question;            //The question
    private String          userAnswer;          //The user's answer
    private boolean         userCorrect;         //A flag representing if the user has the correct answer.


    public Question(LinkedList<Integer> numbers, boolean operand)
    {


        this.question = new StringBuilder(numbers.getFirst());

        //IF(The operator is addition)
        if(operand)
        {
            //Construct the question
            question.append(ADD + numbers.getLast() + EQU);



            //Set the answer
            answer = (String.valueOf((numbers.remove() + numbers.remove())));

        }

        else

        {

            //Construct the question
            question.append(" - " + numbers.peek() + EQU);

            //Set the answer
            answer = (String.valueOf(numbers.remove() - numbers.remove()));

        }
    }//END CONSTRUCTOR

    public String getQuestion()
    {
        //Local Constants

        //Local Variable

        //********* BEGIN getQuestion Method *********//

        //Return the question
        return question.toString();


    }//END PROMPT METHOD

    private boolean getUserCorrect()
    {
        //Local Constants

        //Local Variables

        //******** BEGIN getUserCorrect Method ********//

        return userCorrect;

    }//END getUserCorrect Method


    public void setUserAnswer(String userAnswer)
    {

        //Local Constants

        //Local Variables

        this.userAnswer = userAnswer;

        if(userAnswer.equals(answer))
        {
            //Set the correct flag to correct
            userCorrect = IS_CORRECT;

        }
        else
        {
            userCorrect = INCORRECT;
        }

    }//END setUserAnswer Method

    public boolean isEqual(Question otherQuestion)
    {

        //Local Constants
        final boolean IS_EQUAL = false;
        final boolean NOT_EQUAL= true;

        //Local Variables
        boolean compareFlag;

        //********* BEGIN isEqual Method **************//


        //IF(The questions are the same)
        if(this.question.equals(otherQuestion.getQuestion()))
        {
            //Set the compare flag to equal
            compareFlag = IS_EQUAL;
        }
        else
        {
            //The questions are not the same
            //Set the compare flag to not equal
            compareFlag = NOT_EQUAL;
        }

        //Return the compareFlag
        return compareFlag;

    }//END isEqual method

    public String toString()
    {
        //Local Constants
        final String COR = "You Are [ Correct ]";
        final String INC = "You Are [ Incorrect ]";

        //Local Variables
        StringBuilder output;


        //********** BEGIN toString Method **********//


        //Istantate the output with the question
        output = new StringBuilder(question.toString());

        //Append the answer
        output.append(answer);

        //IF(The user is correct)
        if(getUserCorrect())
        {
            //Append the correct statement to the output
            output.append(COR);
        }
        else
        {
            //Append the incorrect statement to the output
            output.append(INC);

        }

        output.append(userAnswer);


        //return the question
        return output.toString();


    }




}
