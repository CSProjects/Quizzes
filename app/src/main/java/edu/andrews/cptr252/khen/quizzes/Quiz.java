package edu.andrews.cptr252.khen.quizzes;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Date;
import java.util.UUID;

public class Quiz {
    private UUID qId;
    private String qTitle;
    private String mDescription;


    private static final String JSON_ID = "id";
    /** JSON attribute for bug title */
    private static final String JSON_TITLE = "title";
    /** Question of Quiz */


    /**
     * Create a new bug
     */
    public Quiz (){
        //Generate unique identifier for a new bug
        qId = UUID.randomUUID();
    }
    /**
     * return unique id for Quiz
     * @return Quiz id
     */
    public String getTitle(){
        return qTitle;
    }
    /**
     * Set new title for quiz
     * @param title New title
     */
    public void setTitle(String title){
        qTitle = title;
    }
    public String getDescription(){return mDescription; }
    public void setDescription(String description) { mDescription = description; }


}
