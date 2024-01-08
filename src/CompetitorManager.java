import java.util.ArrayList;
import java.util.List;

public class CompetitorManager {
    private List<Competitor> competitors;

    // Constructor
    public CompetitorManager() {
        this.competitors = new ArrayList<>();
    }

    // Method to register a competitor
    public void registerCompetitor(Competitor competitor) {
        competitors.add(competitor);
    }

    // Method to search for a competitor by competitorNumber
    public Competitor searchCompetitor(int competitorNumber) {
        for (Competitor competitor : competitors) {
            if (competitor.getCompetitorNumber() == competitorNumber) {
                return competitor;
            }
        }
        return null; // If not found
    }

    // Method to get a list of all competitors
    public List<Competitor> getAllCompetitors() {
        return competitors;
    }

    // Method to remove a competitor
    public void removeCompetitor(Competitor competitor) {
        competitors.remove(competitor);
    }

    // Method to update competitor details
    public void updateCompetitorDetails(Competitor updatedCompetitor) {
        // Find the competitor in the list and update details
        for (int i = 0; i < competitors.size(); i++) {
            Competitor currentCompetitor = competitors.get(i);
            if (currentCompetitor.getCompetitorNumber() == updatedCompetitor.getCompetitorNumber()) {
                competitors.set(i, updatedCompetitor);
                break;
            }
        }
    }
}
