package septemberDailyHomework;

import static org.testng.Assert.assertEquals;

import org.junit.Test;

public class BowlingGameWinner {
	/*
	 * Input1=int[] player1 = {4, 10, 7, 9}; int[] player2 = {6, 5, 2, 3};,Output: 1
	 * Input2: player1 = [3,5,7,6], player2 = [8,10,10,2], Output: 2
	 * Input3: player1 = [2,3], player2 = [4,1] ,Output: 0
	 * pseudo code
	 * 1-Get the number of turns in the game
	 * 2-Initialize scores for both players
	 * 3-Create an array to store the number of pins hit in the previous two turns
	 * 4-Loop through each turn in the game
	 *    a)Get the number of pins hit by each player in this turn
	 *    b)Calculate the value of the current turn for player 1
	 *    c)Calculate the value of the current turn for player 2
	 *    d)Update the scores for both players
	 *    e)Update the previous turns array with the sum of pins hit by both players in this turn
	 *    f)Check for the special case where we only have one previous turn
	 * 5)Determine the winner based on the final scores  -if (score1 > score2)
	 */

    public static int findWinner(int[] player1, int[] player2) {
        int n = player1.length;
        int score1 = 0, score2 = 0;
        int[] prevTurns = new int[2]; // To store the number of pins hit in the previous two turns

        for (int i = 0; i < n; i++) {
            int x1 = player1[i];
            int x2 = player2[i];

            // Calculate the value of the current turn for both players
            int value1 = (x1 == 10 || (i > 0 && x1 + prevTurns[i % 2] == 10)) ? 2 * x1 : x1;
            int value2 = (x2 == 10 || (i > 0 && x2 + prevTurns[i % 2] == 10)) ? 2 * x2 : x2;

            // Update the scores and the previous turns array
            score1 += value1;
            score2 += value2;
            prevTurns[i % 2] = x1 + x2;

            // Check for the special case where we only have one previous turn
            if (i == 1) {
                prevTurns[(i - 1) % 2] = x1;
            }

        }

        // Determine the winner based on the scores
        if (score1 > score2) {
            return 1;
        } else if (score2 > score1) {
            return 2;
        } else {
            return 0;
        }
    }

    @Test
    public void testBowlingGameWinner() {
        int[] player1 = {4, 10, 7, 9};
        int[] player2 = {6, 5, 2, 3};
        assertEquals(1, findWinner(player1, player2));

        int[] player3 = {3, 5, 7, 6};
        int[] player4 = {8, 10, 10, 2};
        assertEquals(2, findWinner(player3, player4));

        int[] player5 = {2, 3};
        int[] player6 = {4, 1};
        assertEquals(0, findWinner(player5, player6));
    }
}


