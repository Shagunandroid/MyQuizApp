package com.shagun.android.apps.quiztime;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

/*
* Created by Shagun Verma on 24-November-2017 by Android Studio 3.0
 */
public class MainActivity extends AppCompatActivity {

    ImageView quizQuestionImageView;
    Button optionA, optionB, optionC;

    // Correct Answer for all questions
    String correctAnswerInQuiz1 = "B";
    String correctAnswerInQuiz2 = "A";
    String correctAnswerInQuiz3 = "C";
    String correctAnswerInQuiz4 = "";
    String correctAnswerInQuiz5 = "";

    // current quiz question number
    int quizQuestionNumber = 1;

    // Score
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        quizQuestionImageView = (ImageView) findViewById(R.id.imageView);
        optionA = (Button) findViewById(R.id.button7);
        optionB = (Button) findViewById(R.id.button6);
        optionC = (Button) findViewById(R.id.button5);

        optionA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(quizQuestionNumber == 1) {
                    if(correctAnswerInQuiz1.equals("A")) {
                        score = score + 2;
                        showMessage("Great Work! You Done it. Your Score " + score);
                    } else {
                        showMessage("Your choice is incorrect! Your Score " + score);
                    }
                    quizQuestionNumber = 2;
                    quizQuestionImageView.setImageResource(R.drawable.quiz2);
                    optionA.setText("A) Monday, Tuesday, Wednesday");
                    optionB.setText("B) Monday, Tuesday");
                    optionC.setText("B) No day");

                } else if(quizQuestionNumber == 2) {
                    if(correctAnswerInQuiz2.equals("A")) {
                        score = score + 4;
                        showMessage("Great Work! You Done it. Your Score " + score);
                    } else {
                        showMessage("Your choice is incorrect! Your Score " + score);
                    }
                    quizQuestionNumber = 3;
                    quizQuestionImageView.setImageResource(R.drawable.quiz3);
                    optionA.setText("A) a = 2");
                    optionB.setText("B) a = 1");
                    optionC.setText("B) a = 3");

                } else if(quizQuestionNumber == 3) {
                    if(correctAnswerInQuiz3.equals("A")) {
                        score = score + 4;
                        showMessage("Great Work! You Done it. Your Score " + score);
                    } else {
                        showMessage("Your choice is incorrect! Your Score " + score);
                    }
                    quizQuestionNumber = 0;
                    quizQuestionImageView.setImageResource(R.drawable.finish);
                    optionA.setText("");
                    optionB.setText("");
                    optionC.setText("Great Job! Your Score : " + score);
                    optionA.setEnabled(false);
                    optionB.setEnabled(false);
                    optionC.setEnabled(false);
                }
            }
        });

        optionB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(quizQuestionNumber == 1) {
                    if(correctAnswerInQuiz1.equals("B")) {
                        score = score + 2;
                        showMessage("Great Work! You Done it. Your Score " + score);
                    } else {
                        showMessage("Your choice is incorrect! Your Score " + score);
                    }
                    quizQuestionNumber = 2;
                    quizQuestionImageView.setImageResource(R.drawable.quiz2);
                    optionA.setText("A) Monday, Tuesday, Wednesday");
                    optionB.setText("B) Monday, Tuesday");
                    optionC.setText("B) No day");

                } else if(quizQuestionNumber == 2) {
                    if(correctAnswerInQuiz2.equals("B")) {
                        score = score + 4;
                        showMessage("Great Work! You Done it. Your Score " + score);
                    } else {
                        showMessage("Your choice is incorrect! Your Score " + score);
                    }
                    quizQuestionNumber = 3;
                    quizQuestionImageView.setImageResource(R.drawable.quiz3);
                    optionA.setText("A) a = 2");
                    optionB.setText("B) a = 1");
                    optionC.setText("B) a = 3");

                } else if(quizQuestionNumber == 3) {
                    if(correctAnswerInQuiz3.equals("B")) {
                        score = score + 4;
                        showMessage("Great Work! You Done it. Your Score " + score);
                    } else {
                        showMessage("Your choice is incorrect! Your Score " + score);
                    }
                    quizQuestionNumber = 0;
                    quizQuestionImageView.setImageResource(R.drawable.finish);
                    optionA.setText("");
                    optionB.setText("");
                    optionC.setText("Great Job! Your Score : " + score);
                    optionA.setEnabled(false);
                    optionB.setEnabled(false);
                    optionC.setEnabled(false);
                }
            }
        });

        optionC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(quizQuestionNumber == 1) {
                    if(correctAnswerInQuiz1.equals("C")) {
                        score = score + 2;
                        showMessage("Great Work! You Done it. Your Score " + score);
                    } else {
                        showMessage("Your choice is incorrect! Your Score " + score);
                    }
                    quizQuestionNumber = 2;
                    quizQuestionImageView.setImageResource(R.drawable.quiz2);
                    optionC.setText("C) No day");

                } else if(quizQuestionNumber == 2) {
                    if(correctAnswerInQuiz2.equals("C")) {
                        score = score + 4;
                        showMessage("Great Work! You Done it. Your Score " + score);
                    } else {
                        showMessage("Your choice is incorrect! Your Score " + score);
                    }
                    quizQuestionNumber = 3;
                    quizQuestionImageView.setImageResource(R.drawable.quiz3);
                    optionC.setText("C) a = 3");

                } else if(quizQuestionNumber == 3) {
                    if(correctAnswerInQuiz3.equals("C")) {
                        score = score + 4;
                        showMessage("Great Work! You Done it. Your Score " + score);
                    } else {
                        showMessage("Your choice is incorrect! Your Score " + score);
                    }
                    quizQuestionNumber = 0;
                    quizQuestionImageView.setImageResource(R.drawable.finish);
                    optionA.setText("");
                    optionB.setText("");
                    optionC.setText("Great Job! Your Score : " + score);
                    optionA.setEnabled(false);
                    optionB.setEnabled(false);
                    optionC.setEnabled(false);
                }
            }
        });

    }

    public void showMessage(String msg) {
        Toast.makeText(this,msg, Toast.LENGTH_LONG).show();
    }
}
