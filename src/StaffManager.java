import java.util.ArrayList;
import java.util.List;

public class StaffManager {
    private List<Staff> staffList;

    // Constructor
    public StaffManager() {
        this.staffList = new ArrayList<>();
    }

    // Method to add a staff member
    public void addStaff(Staff staff) {
        staffList.add(staff);
    }

    // Method to search for a staff member by name
    public Staff searchStaffByName(String name) {
        for (Staff staff : staffList) {
            if (staff.getName().equals(name)) {
                return staff;
            }
        }
        return null; // If not found
    }

    // Method to get a list of all staff members
    public List<Staff> getAllStaff() {
        return staffList;
    }

    // Method to remove a staff member
    public void removeStaff(Staff staff) {
        staffList.remove(staff);
    }

    // Method to update staff details
    public void updateStaffDetails(Staff updatedStaff) {
        // Find the staff member in the list and update details
        for (int i = 0; i < staffList.size(); i++) {
            Staff currentStaff = staffList.get(i);
            if (currentStaff.getName().equals(updatedStaff.getName())) {
                staffList.set(i, updatedStaff);
                break;
            }
        }
    }
}
