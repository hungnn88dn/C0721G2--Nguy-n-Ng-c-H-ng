package _08_cleancode_refactoring_java.exercise;

public class TennisGame {
    static final int LOVE = 0;
    static final int FIFTEEN = 1;
    static final int THIRTY = 2;
    static final int FORTY = 3;
    static final int DEUCE = 4;

    public static String getScore(String player1Name, String player2Name, int player1Scores, int player2Scores) {
        String score = "";
        int tempScore = 0;
        if (player1Scores == player2Scores) {
            switch (player1Scores) {
                case LOVE:
                    score = "Love-All";
                    break;
                case FIFTEEN:
                    score = "Fifteen-All";
                    break;
                case THIRTY:
                    score = "Thirty-All";
                    break;
                case FORTY:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;
            }
        } else {
            for (int i = FIFTEEN; i <= THIRTY; i++) {
                if (i == FIFTEEN) tempScore = player1Scores;
                else {
                    score += "-";
                    tempScore = player2Scores;
                }
                switch (tempScore) {
                    case LOVE:
                        score += "Love";
                        break;
                    case FIFTEEN:
                        score += "Fifteen";
                        break;
                    case THIRTY:
                        score += "Thirty";
                        break;
                    case FORTY:
                        score += "Forty";
                        break;
                }
            }
        }
        if ((player1Scores >= DEUCE || player2Scores >= DEUCE) && (player1Scores != player2Scores)) {
            score=  showWinPlayer( player1Scores,  player2Scores);
        }
        return score;
    }


    static String showWinPlayer(int player1Scores, int player2Scores) {
        String score= "";
        if ((player1Scores >= DEUCE || player2Scores >= DEUCE) && (player1Scores != player2Scores)) {
            int minusResult = player1Scores - player2Scores;
            if (minusResult == 1) {
                score = "Advantage player1";
            } else if (minusResult == -1) {
                score = "Advantage player2";
            } else if (minusResult >= 2) {
                score = "Win for player1";
            } else score = "Win for player2";
        }
        return score;
    }
}

