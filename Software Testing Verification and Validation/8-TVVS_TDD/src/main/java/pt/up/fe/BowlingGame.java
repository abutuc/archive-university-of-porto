package pt.up.fe;

import java.util.List;

public class BowlingGame {
    private static final String spareLiteral = "/";
    private static final String strikeLiteral = "X";
    private static final int totalNormalRounds = 10;


    public BowlingGame() {}

    public int getScore(List<BowlingFrame> frames) {
        int score = 0;
        int counter = 0;
        boolean trailingSpare = false;
        boolean trailingStrike = false;
        boolean additionalSpareRound = false;
        boolean additionalStrikeRound = false;
        for (BowlingFrame frame : frames) {
            counter++;
            int attempt1Value = 0;
            int attempt2Value = 0;
            try {
                attempt1Value = Integer.parseInt(frame.attempt1());
                if (trailingSpare) {
                    score += attempt1Value;
                    trailingSpare = false;
                }

                if (trailingStrike) {
                    score += attempt1Value;
                }

                score += attempt1Value;

                if (additionalSpareRound) {
                    continue;
                }
            } catch (NumberFormatException exception) {
                if (frame.attempt1().equals(strikeLiteral)) {
                    score += 10;
                    trailingStrike = true;
                    continue;
                }
            }

            try {
                attempt2Value = Integer.parseInt(frame.attempt2());
                score += attempt2Value;

                if (trailingStrike) {
                    score += attempt2Value;
                    trailingStrike = false;
                }
            } catch (NumberFormatException exception) {
                if (frame.attempt2().equals(spareLiteral)) {
                    if (trailingStrike) {
                        score -= attempt1Value;
                        score += 10;
                        trailingStrike = false;
                    }
                    score -= attempt1Value;
                    score += 10;
                    trailingSpare = true;

                    if (counter == totalNormalRounds) {
                        additionalSpareRound = true;
                    }
                }
            }
        }
        return score;
    }

}
