import java.util.ArrayList;
import java.util.List;

public class Competition {
    private List<Competitor> competitors;

    // Constructor
    public Competition() {
        this.competitors = new ArrayList<>();
    }

    // Method to add a competitor to the competition
    public void addCompetitor(Competitor competitor) {
        competitors.add(competitor);
    }

    // Method to remove a competitor from the competition
    public void removeCompetitor(Competitor competitor) {
        competitors.remove(competitor);
    }

    // Method to get a list of all competitors in the competition
    public List<Competitor> getAllCompetitors() {
        return competitors;
    }

    // Method to calculate and get the winner of the competition
    public Competitor getWinner() {
        if (competitors.isEmpty()) {
            return null;
        }

        Competitor winner = competitors.get(0);
        for (Competitor competitor : competitors) {
            if (competitor.calculateOverallScore() > winner.calculateOverallScore()) {
                winner = competitor;
            }
        }
        return winner;
    }

    // Method to generate summary statistics (example: frequency of scores)
    public void generateSummaryStatistics() {
        System.out.println("Summary Statistics:");
        System.out.println("Number of competitors: " + competitors.size());

        if (!competitors.isEmpty()) {
            // Calculate and display highest and lowest scores
            double highestScore = competitors.get(0).calculateOverallScore();
            double lowestScore = competitors.get(0).calculateOverallScore();

            for (Competitor competitor : competitors) {
                double overallScore = competitor.calculateOverallScore();

                if (overallScore > highestScore) {
                    highestScore = overallScore;
                }

                if (overallScore < lowestScore) {
                    lowestScore = overallScore;
                }
            }

            System.out.println("Highest Overall Score: " + highestScore);
            System.out.println("Lowest Overall Score: " + lowestScore);

            // Generate and display frequency distribution of scores
            int[] scoreFrequency = new int[6]; // Assuming scores range from 1 to 5

            for (Competitor competitor : competitors) {
                for (int score : competitor.getScores()) {
                    scoreFrequency[score]++;
                }
            }

            System.out.println("Score Frequency Distribution:");
            for (int i = 1; i <= 5; i++) {
                System.out.println("Score " + i + ": " + scoreFrequency[i]);
            }
        }
    }
