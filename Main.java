package csc264;

import java.util.*;

public class Main {

    public static void main(String[] args)
    {

	    //Local Constants

        final Scanner        cin = new Scanner(System.in);

        //Local Variables
        Question question;
        final int       FIVE = 5;
        final int       ONE  = 1;
        final int       SIX  = 6;
        final boolean   ADD  = true;
        final boolean   SUB  = false;
        final LinkedList<Integer> num = new LinkedList<Integer>();
        final List<Question> ques;


        //*********** BEGIN main Method **********//

        //Add two numbers to the queue
        num.add(FIVE);
        num.add(ONE);




        question = new Question(num, ADD);
        ques     = new Stack<Question>();
        ques.add(question);

        cout(question.getQuestion());
        question.setUserAnswer((cin.nextLine()));



        question = new Question(num, SUB);
        ques.add(question);
        question.getQuestion();
        question.setUserAnswer(cin.nextLine());


        //FOR(EACH QUESTION)
        for(Question currentQuestion : ques)
        {
            cout(currentQuestion.toString());

        }








    }

    private static void cout(String string)
    {
        System.out.println(string);
    }
}
