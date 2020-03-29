package edu.andrews.cptr252.khen.quizzes;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class QuizDetailsFragment extends Fragment {
    /** Quiz that is being edited */
    private Quiz mQuiz;
    /** Reference to title field for bug */
    private EditText mTitleField;

    public QuizDetailsFragment() {
        // Required empty public constructor
    }
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        mQuiz = new Quiz();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_quiz_details, container, false);

        mTitleField = v.findViewById(R.id.quiz_title);
        mTitleField.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                //intentional blank
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mQuiz.setTitle(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {
                //intentional blank
            }
        });
        return v;
    }
}
