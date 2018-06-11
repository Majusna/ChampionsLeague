package com.example.android.championsleague;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


import static com.example.android.championsleague.R.id.draw_a;
import static com.example.android.championsleague.R.id.draw_b;
import static com.example.android.championsleague.R.id.draw_c;
import static com.example.android.championsleague.R.id.draw_d;
import static com.example.android.championsleague.R.id.lost_a;
import static com.example.android.championsleague.R.id.lost_b;
import static com.example.android.championsleague.R.id.lost_c;
import static com.example.android.championsleague.R.id.lost_d;
import static com.example.android.championsleague.R.id.played_a;
import static com.example.android.championsleague.R.id.played_b;
import static com.example.android.championsleague.R.id.played_c;
import static com.example.android.championsleague.R.id.played_d;
import static com.example.android.championsleague.R.id.team_a_points;
import static com.example.android.championsleague.R.id.team_b_points;
import static com.example.android.championsleague.R.id.team_c_points;
import static com.example.android.championsleague.R.id.team_d_points;
import static com.example.android.championsleague.R.id.won_a;
import static com.example.android.championsleague.R.id.won_b;
import static com.example.android.championsleague.R.id.won_c;
import static com.example.android.championsleague.R.id.won_d;


public class MainActivity extends AppCompatActivity {

    int pointsForTeamA = 0;
    int playedForTeamA = 0;
    int winsForTeamA = 0;
    int drawForTeamA = 0;
    int lostsForTeamA = 0;

    int pointsForTeamB = 0;
    int playedForTeamB = 0;
    int winsForTeamB = 0;
    int drawForTeamB= 0;
    int lostsForTeamB = 0;

    int pointsForTeamC = 0;
    int playedForTeamC = 0;
    int winsForTeamC = 0;
    int drawForTeamC = 0;
    int lostsForTeamC = 0;

    int pointsForTeamD = 0;
    int playedForTeamD = 0;
    int winsForTeamD = 0;
    int drawForTeamD= 0;
    int lostsForTeamD = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * ********TEAM A ********************
     *
     * Displays the num of played games for team a
     */
    public void displayGamesForTeamA(int points) {
        TextView gamesView = (TextView) findViewById(played_a);
        gamesView.setText(String.valueOf(points));
    }

    /**
     * Displays the given points for team a
     */
    public void displayPointsForTeamA(int points) {
        TextView pointsView = (TextView) findViewById(team_a_points);
        pointsView.setText(String.valueOf(points));
    }

    /**
     * Displays won for team a
     */
    public void displayWonForTeamA(int points) {
        TextView winView = (TextView) findViewById(won_a);
        winView.setText(String.valueOf(points));
    }

    /**
     * Displays draw for team a
     */
    public void displayDrawForTeamA(int points) {
        TextView drawView = (TextView) findViewById(draw_a);
        drawView.setText(String.valueOf(points));
    }

    /**
     * Displays lost for team a
     */
    public void displayLostForTeamA(int points) {
        TextView lostView = (TextView) findViewById(lost_a);
        lostView.setText(String.valueOf(points));
    }


    /**
     * This method is called when w button is clicked
     */

    public void threePointsTemA (View view){
        pointsForTeamA += 3;
        playedForTeamA += 1;
        winsForTeamA +=1;
        displayPointsForTeamA(pointsForTeamA);
        displayGamesForTeamA(playedForTeamA);
        displayWonForTeamA(winsForTeamA );

    }

    /**
     * This method is called when d button is clicked
     */

    public void onePointTemA (View view){
        pointsForTeamA += 1;
        playedForTeamA += 1;
        drawForTeamA  +=1;
        displayPointsForTeamA(pointsForTeamA);
        displayGamesForTeamA(playedForTeamA);
        displayDrawForTeamA(drawForTeamA );

    }

    /**
     * This method is called when l button is clicked
     */

    public void noPointsTemA (View view){
        playedForTeamA += 1;
        lostsForTeamA +=1;
        displayGamesForTeamA(playedForTeamA);
        displayLostForTeamA(lostsForTeamA);

    }

    /**
     * ************** TEAM B **************************
     *
     * Displays the num of played games for team b
     */
    public void displayGamesForTeamB(int points) {
        TextView gamesView = (TextView) findViewById(played_b);
        gamesView.setText(String.valueOf(points));
    }

    /**
     * Displays the given points for team b
     */
    public void displayPointsForTeamB(int points) {
        TextView pointsView = (TextView) findViewById(team_b_points);
        pointsView.setText(String.valueOf(points));
    }

    /**
     * Displays won for team b
     */
    public void displayWonForTeamB(int points) {
        TextView winView = (TextView) findViewById(won_b);
        winView.setText(String.valueOf(points));
    }

    /**
     * Displays draw for team b
     */
    public void displayDrawForTeamB(int points) {
        TextView drawView = (TextView) findViewById(draw_b);
        drawView.setText(String.valueOf(points));
    }

    /**
     * Displays lost for team b
     */
    public void displayLostForTeamB(int points) {
        TextView lostView = (TextView) findViewById(lost_b);
        lostView.setText(String.valueOf(points));
    }


    /**
     * This method is called when w button is clicked
     */

    public void threePointsTemB (View view){
        pointsForTeamB += 3;
        playedForTeamB += 1;
        winsForTeamB +=1;
        displayPointsForTeamB(pointsForTeamB);
        displayGamesForTeamB(playedForTeamB);
        displayWonForTeamB(winsForTeamB );

    }

    /**
     * This method is called when d button is clicked
     */

    public void onePointTemB (View view){
        pointsForTeamB += 1;
        playedForTeamB += 1;
        drawForTeamB  +=1;
        displayPointsForTeamB(pointsForTeamB);
        displayGamesForTeamB(playedForTeamB);
        displayDrawForTeamB(drawForTeamB );

    }

    /**
     * This method is called when l button is clicked
     */

    public void noPointsTemB (View view){
        playedForTeamB += 1;
        lostsForTeamB +=1;
        displayGamesForTeamB(playedForTeamB);
        displayLostForTeamB(lostsForTeamB);

    }

    /**
     * ************** TEAM C  *************************
     *
     * Displays the num of played games for team C
     */
    public void displayGamesForTeamC(int points) {
        TextView gamesView = (TextView) findViewById(played_c);
        gamesView.setText(String.valueOf(points));
    }

    /**
     * Displays the given points for team c
     */
    public void displayPointsForTeamC(int points) {
        TextView pointsView = (TextView) findViewById(team_c_points);
        pointsView.setText(String.valueOf(points));
    }

    /**
     * Displays won for team c
     */
    public void displayWonForTeamC(int points) {
        TextView winView = (TextView) findViewById(won_c);
        winView.setText(String.valueOf(points));
    }

    /**
     * Displays draw for team c
     */
    public void displayDrawForTeamC(int points) {
        TextView drawView = (TextView) findViewById(draw_c);
        drawView.setText(String.valueOf(points));
    }

    /**
     * Displays lost for team c
     */
    public void displayLostForTeamC(int points) {
        TextView lostView = (TextView) findViewById(lost_c);
        lostView.setText(String.valueOf(points));
    }


    /**
     * This method is called when w button is clicked
     */

    public void threePointsTemC (View view){
        pointsForTeamC += 3;
        playedForTeamC += 1;
        winsForTeamC +=1;
        displayPointsForTeamC(pointsForTeamC);
        displayGamesForTeamC(playedForTeamC);
        displayWonForTeamC(winsForTeamC );

    }

    /**
     * This method is called when d button is clicked
     */

    public void onePointTemC (View view){
        pointsForTeamC += 1;
        playedForTeamC += 1;
        drawForTeamC  +=1;
        displayPointsForTeamC(pointsForTeamC);
        displayGamesForTeamC(playedForTeamC);
        displayDrawForTeamC(drawForTeamC);

    }

    /**
     * This method is called when l button is clicked
     */

    public void noPointsTemC (View view){
        playedForTeamC += 1;
        lostsForTeamC +=1;
        displayGamesForTeamC(playedForTeamC);
        displayLostForTeamC(lostsForTeamC);

    }

    /**
     * *********** TEAM D  **************
     *
     * Displays the num of played games for team d
     */
    public void displayGamesForTeamD(int points) {
        TextView gamesView = (TextView) findViewById(played_d);
        gamesView.setText(String.valueOf(points));
    }

    /**
     * Displays the given points for team d
     */
    public void displayPointsForTeamD(int points) {
        TextView pointsView = (TextView) findViewById(team_d_points);
        pointsView.setText(String.valueOf(points));
    }

    /**
     * Displays won for team d
     */
    public void displayWonForTeamD(int points) {
        TextView winView = (TextView) findViewById(won_d);
        winView.setText(String.valueOf(points));
    }

    /**
     * Displays draw for team d
     */
    public void displayDrawForTeamD(int points) {
        TextView drawView = (TextView) findViewById(draw_d);
        drawView.setText(String.valueOf(points));
    }

    /**
     * Displays lost for team d
     */
    public void displayLostForTeamD(int points) {
        TextView lostView = (TextView) findViewById(lost_d);
        lostView.setText(String.valueOf(points));
    }


    /**
     * This method is called when w button is clicked
     */

    public void threePointsTemD (View view){
        pointsForTeamD += 3;
        playedForTeamD += 1;
        winsForTeamD +=1;
        displayPointsForTeamD(pointsForTeamD);
        displayGamesForTeamD(playedForTeamD);
        displayWonForTeamD(winsForTeamD );

    }

    /**
     * This method is called when d button is clicked
     */

    public void onePointTemD (View view){
        pointsForTeamD += 1;
        playedForTeamD += 1;
        drawForTeamD  +=1;
        displayPointsForTeamD(pointsForTeamD);
        displayGamesForTeamD(playedForTeamD);
        displayDrawForTeamD(drawForTeamD );

    }

    /**
     * This method is called when l button is clicked
     */

    public void noPointsTemD (View view){
        playedForTeamD += 1;
        lostsForTeamD +=1;
        displayGamesForTeamD(playedForTeamD);
        displayLostForTeamD(lostsForTeamD);

    }



    /**
     * This method is called when reset button is clicked
     */

    public void reset (View view){
        pointsForTeamA = 0;
        playedForTeamA = 0;
        winsForTeamA = 0;
        drawForTeamA = 0;
        lostsForTeamA = 0;
        displayPointsForTeamA(pointsForTeamA);
        displayGamesForTeamA(playedForTeamA);
        displayWonForTeamA(winsForTeamA);
        displayDrawForTeamA(drawForTeamA);
        displayLostForTeamA(lostsForTeamA);
        pointsForTeamB = 0;
        playedForTeamB = 0;
        winsForTeamB = 0;
        drawForTeamB = 0;
        lostsForTeamB = 0;
        displayPointsForTeamB(pointsForTeamB);
        displayGamesForTeamB(playedForTeamB);
        displayWonForTeamB(winsForTeamB);
        displayDrawForTeamB(drawForTeamB);
        displayLostForTeamB(lostsForTeamB);
        pointsForTeamC = 0;
        playedForTeamC = 0;
        winsForTeamC = 0;
        drawForTeamC = 0;
        lostsForTeamC = 0;
        displayPointsForTeamC(pointsForTeamC);
        displayGamesForTeamC(playedForTeamC);
        displayWonForTeamC(winsForTeamC);
        displayDrawForTeamC(drawForTeamC);
        displayLostForTeamC(lostsForTeamC);
        pointsForTeamD = 0;
        playedForTeamD = 0;
        winsForTeamD = 0;
        drawForTeamD = 0;
        lostsForTeamD = 0;
        displayPointsForTeamD(pointsForTeamD);
        displayGamesForTeamD(playedForTeamD);
        displayWonForTeamD(winsForTeamD);
        displayDrawForTeamD(drawForTeamD);
        displayLostForTeamD(lostsForTeamD);


    }
}



