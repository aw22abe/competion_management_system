import java.util.List;

public class Competitor {
    private int competitorNumber;
    private String competitorName;
    private int age;
    private String gender;
    private String country;
    private List<Integer> scores;

    // Constructor
    public Competitor(int competitorNumber, String competitorName, int age, String gender, String country, List<Integer> scores) {
        this.competitorNumber = competitorNumber;
        this.competitorName = competitorName;
        this.age = age;
        this.gender = gender;
        this.country = country;
        this.scores = scores;
    }

    // Getter methods
    public int getCompetitorNumber() {
        return competitorNumber;
    }

    public String getCompetitorName() {
        return competitorName;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getCountry() {
        return country;
    }

    public List<Integer> getScores() {
        return scores;
    }

    public double calculateOverallScore() {
        if (scores.isEmpty()) {
            return 0.0;
        }

        double sum = 0;
        for (int score : scores) {
            sum += score;
        }

        return sum / scores.size();
    }

    @Override
    public String toString() {
        return competitorNumber + "\t" + competitorName + "\t" + age + "\t" + gender + "\t" + country + "\t" + scores.toString();
    }
}
