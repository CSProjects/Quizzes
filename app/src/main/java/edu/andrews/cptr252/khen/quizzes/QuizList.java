package edu.andrews.cptr252.khen.quizzes;

import android.content.Context;

import java.util.ArrayList;

public class QuizList {
    /** instance variable for QuizList */
    private static QuizList sOurInstance;

    /** List of questions */
    private ArrayList<Quiz> mQuestions;
    /** Reference to information about app environment */
    private Context mAppContext;

    private QuizList(Context appContext){
        mAppContext = appContext;
        mQuestions = new ArrayList<>();
        for(int i = 0; i < 100; i++){
            Quiz question = new Quiz();
            question.setTitle("Question #" + i);
            mQuestions.add(question);
        }
    }

    /**
     * Return only one instance of the quiz list
     * @param c is the Application context
     * @return Reference to the quiz list
     */
    public static QuizList getInstance(Context c){
        if(sOurInstance == null){
            sOurInstance = new QuizList(c.getApplicationContext());
        }
        return sOurInstance;
    }
    /**
     * Return the list of questions
     * @return Array of quiz questions
     */
    public ArrayList<Quiz> getQuestions() { return mQuestions;}

}
