package net.swallowsnest.munchkincounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scorePlayerA = 0;
    int scorePlayerB = 0;
    int eScorePlayerA = 0;
    int eScorePlayerB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gainLevelForPlayerA(View v) {
        scorePlayerA = scorePlayerA + 1;
        eScorePlayerA = eScorePlayerA + 1;
        displayForPlayerA(scorePlayerA);
        displayEForPlayerA(eScorePlayerA);

    }

    public void loseLevelForPlayerA(View v) {
        scorePlayerA = scorePlayerA - 1;
        eScorePlayerA = eScorePlayerA - 1;
        displayForPlayerA(scorePlayerA);
        displayEForPlayerA(eScorePlayerA);
    }

    public void gainLevelForPlayerB(View v) {
        scorePlayerB = scorePlayerB + 1;
        eScorePlayerB = eScorePlayerB + 1;
        displayForPlayerB(scorePlayerB);
        displayEForPlayerB(eScorePlayerB);

    }

    public void loseLevelForPlayerB(View v) {
        scorePlayerB = scorePlayerB - 1;
        eScorePlayerB = eScorePlayerB - 1;
        displayForPlayerB(scorePlayerB);
        displayEForPlayerB(eScorePlayerB);
    }
    public void displayForPlayerA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_a_actual_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForPlayerB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_b_actual_score);
        scoreView.setText(String.valueOf(score));
    }

    /** Handles Extra Points
     *
     * @param v
     */
    public void addExtraForPlayerA(View v) {
        eScorePlayerA = eScorePlayerA + 1;
        displayEForPlayerA(eScorePlayerA);

    }

    public void subtractExtraForPlayerA(View v) {
        eScorePlayerA =  eScorePlayerA - 1;
        displayEForPlayerA(eScorePlayerA);
    }

    public void addExtraForPlayerB(View v) {
        eScorePlayerB = eScorePlayerB + 1;
        displayEForPlayerB(eScorePlayerB);

    }

    public void subtractExtraForPlayerB(View v) {
        eScorePlayerB = eScorePlayerB - 1;
        displayEForPlayerB(eScorePlayerB);
    }

    public void displayEForPlayerA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_a_effective_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayEForPlayerB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_b_effective_score);
        scoreView.setText(String.valueOf(score));
    }

    public void resetScore(View v){
        scorePlayerA = 0;
        scorePlayerB = 0;
        eScorePlayerA = 0;
        eScorePlayerB = 0;
        displayForPlayerA(scorePlayerA);
        displayForPlayerB(scorePlayerB);
        displayEForPlayerA(eScorePlayerA);
        displayEForPlayerB(eScorePlayerB);
    }
}
