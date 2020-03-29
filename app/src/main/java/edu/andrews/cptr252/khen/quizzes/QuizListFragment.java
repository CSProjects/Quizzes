package edu.andrews.cptr252.khen.quizzes;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class QuizListFragment extends Fragment {
    private ArrayList<Quiz> mQuestions;
    private RecyclerView mRecyclerView;
    private QuizAdapter mQuizAdapter;

    public QuizListFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        getActivity().setTitle(R.string.quiz_list_label);
        mQuestions = QuizList.getInstance(getActivity()).getQuestions();
        mQuizAdapter = new QuizAdapter(mQuestions);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_quiz_list, container, false);
        mRecyclerView = v.findViewById(R.id.quiz_list_recyclerView);
        mRecyclerView.setAdapter(mQuizAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        return v;
    }
}
