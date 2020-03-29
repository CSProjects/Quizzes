package edu.andrews.cptr252.khen.quizzes;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Date;
import java.util.UUID;

public class Quiz {
    private UUID qId;
    private static final String JSON_ID = "id";
    /** JSON attribute for bug title */
    private static final String JSON_TITLE = "title";
    /** JSON attribute for bug description */
    private static final String JSON_DESCRIPTION = "description";
    /** JSON attribute for bug date */
    private static final String JSON_DATE = "date";
    /** JSON attribute for bug solved status */
    private static final String JSON_SOLVED = "solved";

    /**
     * Create a new bug
     */
    public Quiz (){
        //Generate unique identifier for a new bug
        qId = UUID.randomUUID();
    }
    public Quiz(JSONObject json) throws JSONException {
        qId = UUID.fromString(json.getString(JSON_ID));

    }

}
