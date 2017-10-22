package com.example.yahya.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void displayForTeamA(int score)
    {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText (String.valueOf(score));
    }
    public void displayForTeamB(int score)
    {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText (String.valueOf(score));
    }
            /*add points for team A
            * */
            public void add3Points(View view)
            {
                scoreTeamA = scoreTeamA + 3;
                displayForTeamA(scoreTeamA);
            }
            public void add2Points(View view)
            {
                scoreTeamA = scoreTeamA + 2;
                displayForTeamA(scoreTeamA);
            }
            public void add1Point(View view)
            {
                scoreTeamA = scoreTeamA + 1;
                displayForTeamA(scoreTeamA);
            }
            /*add points for team B
            * */
        public void add3PointsB(View view)
        {
            scoreTeamB = scoreTeamB + 3;
            displayForTeamB(scoreTeamB);
        }
        public void add2PointsB(View view)
        {
            scoreTeamB = scoreTeamB + 2;
            displayForTeamB(scoreTeamB);
        }
        public void add1PointB(View view)
        {
            scoreTeamB = scoreTeamB + 1;
            displayForTeamB(scoreTeamB);
        }
        /*sets score for teams A and B to 0
        * */
    public  void resetScore(View v)
    {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamB(scoreTeamB);
        displayForTeamA(scoreTeamA);
    }
}
