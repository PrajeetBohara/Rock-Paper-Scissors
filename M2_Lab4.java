/*
 * Lab 4: Rock, Paper, Scissors Game (No GUI)
 * Prajeet Bohara
 * 3/12/23
 */

import java.util.*;
import javax.swing.*;

public class M2_Lab4 {
    public static void main(String[] args) 
    {
        ImageIcon icon = new ImageIcon("RPS.png");
        String Intro = "This is a \"Rock, Paper, Scissors\" game in which you are playing against the computer."
                     + "\nThe program will ask you to choose between rock, paper, or scissors."
                     + "\nThen, computer will randomly choose between rock, paper, or scissors for itself. "
                     + "\nNext, it will display who won and repeat for two more rounds for a total of three rounds."
                     + "\nFinally, at the end of the three rounds, it will display a final score board.";
        
        JOptionPane.showMessageDialog(null, Intro, 
                "Play \"Rock, Paper, Scissors\"                                                                                                                           JPrajeet Bohara",
                0,icon);
        
        int round = 0;
        int player_score = 0;
        int computer_score = 0;
        int ties = 0;
        
        while (round < 3)
        {
            String prompt = "Please, click on one of\n"+
                            "the following buttons \n"+
                            "corresponding to your play\n";
            String[] choices = {"Rock", "Paper", "Scissors"};

            int choice = JOptionPane.showOptionDialog(null, prompt, 
                    "Play \"Rock, Paper, Scissors\"                    Prajeet Bohara",
                    0, 0, icon, choices, choices[0]);

            String player_choice = "";
            String computer_choice = "";

            switch (choice)
            {
                case 0:
                    player_choice = "rock";
                    break;
                case 1:
                    player_choice = "paper";
                    break;
                case 2:
                    player_choice = "scissors";
                    break;
            }        

            String resultsAccumulator = "<html>You chose "+player_choice+" and <br>";

            Random rand = new Random();

            int computer_roll = rand.nextInt(3);

            switch (computer_roll)
            {
                case 0:
                    computer_choice = "rock";
                    break;
                case 1:
                    computer_choice = "paper";
                    break;
                case 2:
                    computer_choice = "scissors";
                    break;
            }        

            resultsAccumulator += "the computer chose "+computer_choice+".<br>";

            ImageIcon result_tiesIcon = new ImageIcon("RPS2.png");
            ImageIcon paperWrapsRockIcon = new ImageIcon("paperWrapsRock.png");
            ImageIcon rockCrushesScissorsIcon = new ImageIcon("rockCrushScissor.png");
            ImageIcon scissorsCutPaperIcon = new ImageIcon("scissorCutPaper.png");

            if (computer_choice.equals(player_choice) )
            {
                resultsAccumulator += "<h2>It's a TIE!</h2>";
                JOptionPane.showMessageDialog(null, resultsAccumulator, 
                    "Rock, Paper, Scissors        Jael Ruiz; Prajeet Bohara",
                    0, result_tiesIcon);
                ties = ties + 1;
            }
            else if (computer_choice.equals("rock") && player_choice.equals("paper"))
            {
                resultsAccumulator += "<h2>Paper wraps rock!</h2> <h2>You WIN!</h2>";
                JOptionPane.showMessageDialog(null, resultsAccumulator, 
                    "Rock, Paper, Scissors                                  Prajeet Bohara",
                    0, paperWrapsRockIcon);
                player_score = player_score + 1;
            }
            else if (computer_choice.equals("rock") && player_choice.equals("scissors"))
            {
                resultsAccumulator += "<h2>Rock crushes scissors!</h2> <h2>You LOSE!</h2>";
                JOptionPane.showMessageDialog(null, resultsAccumulator, 
                    "Rock, Paper, Scissors                                        Prajeet Bohara",
                    0, rockCrushesScissorsIcon);
                computer_score = computer_score + 1;
            }
            else if (computer_choice.equals("paper") && player_choice.equals("scissors"))
            {
                resultsAccumulator += "<h2>Scissors cut paper!</h2> <h2>You WIN!</h2>";
                JOptionPane.showMessageDialog(null, resultsAccumulator, 
                    "Rock, Paper, Scissors                   Prajeet Bohara",
                    0, scissorsCutPaperIcon);
                player_score = player_score + 1;
            }
            else if (computer_choice.equals("paper") && player_choice.equals("rock"))
            {
                resultsAccumulator += "<h2>Paper wraps rock!</h2> <h2>You LOSE!</h2>";
                JOptionPane.showMessageDialog(null, resultsAccumulator, 
                    "Rock, Paper, Scissors                                  Prajeet Bohara",
                    0, paperWrapsRockIcon);
                computer_score = computer_score + 1;
            }
            else if (computer_choice.equals("scissors") && player_choice.equals("rock"))
            {
                resultsAccumulator += "<h2>Rock crushes scissors!</h2> <h2>You WIN!</h2>";
                JOptionPane.showMessageDialog(null, resultsAccumulator, 
                    "Rock, Paper, Scissors                                        Prajeet Bohara",
                    0, rockCrushesScissorsIcon);
                player_score = player_score + 1;
            }
            else 
            {
                resultsAccumulator += "<h2>Scissors cut paper!</h2> <h2>You LOSE!</h2>";
                JOptionPane.showMessageDialog(null, resultsAccumulator, 
                    "Rock, Paper, Scissors                   Prajeet Bohara",
                    0, scissorsCutPaperIcon);
                computer_score = computer_score + 1;
            }
            
            JOptionPane.showMessageDialog(null,"At the end of this round, \nyour score is "+player_score+" and \nthe computer's score is "+computer_score+".",
                    "End of Round Results          Prajeet Bohara",
                    0, icon);

            round += 1;
        }
      
        ImageIcon finalScoreIcon = new ImageIcon("RPS2.png");
        
        String scoreBoard = "<html>Final score board for 3 rounds:"
                          + "<h2>Wins: " +player_score+ "</h2>"
                          + "<h2>Loses: "+computer_score+"</h2>"
                          + "<h2>Ties: "+ties+"</h2>";
        JOptionPane.showMessageDialog(null, scoreBoard, "Score Board                            Prajeet Bohara", 1, finalScoreIcon);
        
        JOptionPane.showMessageDialog(null, "<html><h2>Thanks for playing!</h2> Program is now over.", 
                "End of Game                          Jael Ruiz; Prajeet Bohara", 1,finalScoreIcon);
    
    }
}
    




        
   
    
