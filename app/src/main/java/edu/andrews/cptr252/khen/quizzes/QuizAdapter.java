package edu.andrews.cptr252.khen.quizzes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class QuizAdapter extends RecyclerView.Adapter<QuizAdapter.ViewHolder>{
    private ArrayList<Quiz> mQuestions;

    /**
     * Constructor for QuizAdapter. Initialize adapter with given list of display.
     * @param questions list of questions to display.
     */
    public QuizAdapter(ArrayList<Quiz> questions){
        mQuestions = questions;
    }
    /**
     * Class to hold reference to widget on a given view
     */
    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        /** TextView that displays quiz question */
        public TextView quizTitleTextView;

        public ViewHolder(View itemView){
            super(itemView);

            quizTitleTextView = itemView.findViewById(R.id.quiz_list_title_textView);

            itemView.setOnClickListener(this);
        }
        /**
         * OnClick listener for question in the question list.
         * Triggered when user clicks a question in the list
         * @param view for question that was clicked.
         */
        @Override
        public void onClick(View view){
            //Get index of question that was clicked
            int position = getAdapterPosition();
            //For now, just display the question title
            if(position != RecyclerView.NO_POSITION){
                Quiz question = mQuestions.get(position);
            }
        }
    }//end ViewHolder
    /**
     * Create a new view to display a question
     * Return the ViewHolder that stores references to the widges on new view
     */
    @Override
    public QuizAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View quizView = inflater.inflate(R.layout.list_item_quiz, parent, false);

        ViewHolder viewHolder = new ViewHolder(quizView);

        return viewHolder;
    }
    /**
     * Display given question in a view referenced by the ViewHolder
     * @param viewHolder Contains references to widgets used to display question
     * @param position Index of the bug in the list
     */
    @Override
    public void onBindViewHolder(QuizAdapter.ViewHolder viewHolder, int position){
        Quiz quiz = mQuestions.get(position);

        TextView quizTitleTextView = viewHolder.quizTitleTextView;

        quizTitleTextView.setText(quiz.getTitle());

    }
    /**
     * Get number of questions in list
     */
    @Override
    public int getItemCount(){
        return mQuestions.size();
    }
}
