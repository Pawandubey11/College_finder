package project;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class College_finder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("WELCOME TO FINDING COLLEGEWALLAH");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println();

        System.out.println("There are 200 courses available in Greater Noida.");
        System.out.println("Choose a course:");

        // Display course options
        displayCourses();

        int course = scanner.nextInt();

        switch (course) {
            case 1:
                handleBTech(scanner, name);
                break;
            case 2:
                handleBCA(scanner, name);
                break;
            case 3:
                handleBBA(scanner, name);
                break;
            case 4:
                handleMCA(scanner, name);
                break;
            case 5:
                handleMBA(scanner, name);
                break;
            case 6:
                handlePGPM(scanner, name);
                break;
            case 7:
                handleGenericCourse(scanner, name, "B.A");
                break;
            case 8:
                handleGenericCourse(scanner, name, "M.OPTOM");
                break;
            case 9:
                handleGenericCourse(scanner, name, "AFTER 10TH DIPLOMA");
                break;
            case 10:
                handleGenericCourse(scanner, name, "BPT");
                break;
            case 11:
                handleGenericCourse(scanner, name, "BLLB");
                break;
            case 12:
                handleGenericCourse(scanner, name, "CERTIFICATE");
                break;
            case 13:
                handleGenericCourse(scanner, name, "BMLT");
                break;
            case 14:
                handleMCA(scanner, name);
                break;
            case 15:
                handleGenericCourse(scanner, name, "B.ED");
                break;
            case 16:
                handleGenericCourse(scanner, name, "B.COM");
                break;
            case 17:
                handleGenericCourse(scanner, name, "B.DES");
                break;
            case 18:
                handleGenericCourse(scanner, name, "BMRIT");
                break;
            case 19:
                handleGenericCourse(scanner, name, "BHM");
                break;
            case 20:
                handleGenericCourse(scanner, name, "B.SC");
                break;
            case 21:
                handleGenericCourse(scanner, name, "UG");
                break;
            case 22:
                handleGenericCourse(scanner, name, "CERTIFICATE");
                break;
            case 23:
                handleGenericCourse(scanner, name, "B.VOC");
                break;
            case 24:
                handleGenericCourse(scanner, name, "M.LIB.I.SC.");
                break;
            default:
                System.out.println("Invalid course selection.");
                break;
        }

        scanner.close();
    }

    private static void displayCourses() {
        System.out.println("1. B.TECH");
        System.out.println("2. BCA");
        System.out.println("3. BBA");
        System.out.println("4. MCA");
        System.out.println("5. MBA");
        System.out.println("6. PGDM");
        System.out.println("7. M.SC.");
        System.out.println("8. BPT");
        System.out.println("9. B.PHARMA");
        System.out.println("10. B.A.LL.B");
        System.out.println("11. AFTER 10TH DIPLOMA");
        System.out.println("12. B.A");
        System.out.println("13. LLB");
        System.out.println("14. BMLT");
        System.out.println("15. B.ED");
        System.out.println("16. B.COM");
        System.out.println("17. M.OPTOM");
        System.out.println("18. BMRIT");
        System.out.println("19. B.DES");
        System.out.println("20. BHM");
        System.out.println("21. B.SC System.out.println");

        System.out.println("23. CERTIFICATE");
        System.out.println("24. B.VOC");
        System.out.println("25. M.LIB.I.SC.");
    }

    private static void handleBTech(Scanner scanner, String name) {
        System.out.println("Enter your 12th marks in PCM:");
        System.out.print("Enter Math marks: ");
        int math = scanner.nextInt();
        System.out.print("Enter Chemistry marks: ");
        int chemistry = scanner.nextInt();
        System.out.print("Enter Physics marks: ");
        int physics = scanner.nextInt();

        int totalMarks = math + chemistry + physics;

        if (totalMarks >= 180) {
            System.out.println("You are eligible for B.Tech.");
            showColleges(scanner, totalMarks, name, "B.Tech");
        } else {
            System.out.println("Sorry, you are not eligible for B.Tech.");
        }
    }

    private static void handleBCA(Scanner scanner, String name) {
        System.out.println("Enter your 12th marks in any stream:");
        System.out.print("Enter your percentage: ");
        float percentage = scanner.nextFloat();

        if (percentage >= 50) {
            System.out.println("You are eligible for BCA.");
            showColleges(scanner, percentage, name, "BCA");
        } else {
            System.out.println("Sorry, you are not eligible for BCA.");
        }
    }

    private static void handleBBA(Scanner scanner, String name) {
        System.out.println("Enter your 12th marks in any stream:");
        System.out.print("Enter your percentage: ");
        float percentage = scanner.nextFloat();

        if (percentage >= 50) {
            System.out.println("You are eligible for BBA.");
            showColleges(scanner, percentage, name, "BBA");
        } else {
            System.out.println("Sorry, you are not eligible for BBA.");
        }
    }

    private static void handleMCA(Scanner scanner, String name) {
        System.out.println("Enter your graduation marks:");
        System.out.print("Enter your percentage: ");
        float percentage = scanner.nextFloat();

        if (percentage >= 50) {
            System.out.println("You are eligible for MCA.");
            showColleges(scanner, percentage, name, "MCA");
        } else {
            System.out.println("Sorry, you are not eligible for MCA.");
        }
    }

    private static void handleMBA(Scanner scanner, String name) {
        System.out.println("Enter your graduation marks:");
        System.out.print("Enter your percentage: ");
        float percentage = scanner.nextFloat();

        if (percentage >= 50) {
            System.out.println("You are eligible for MBA.");
            showColleges(scanner, percentage, name, "MBA");
        } else {
            System.out.println("Sorry, you are not eligible for MBA.");
        }
    }

    private static void handlePGPM(Scanner scanner, String name) {
        handleGenericCourse(scanner, name, "PGPM");
    }

    private static void handleGenericCourse(Scanner scanner, String name, String course) {
        System.out.println("Enter your graduation marks:");
        System.out.print("Enter your percentage: ");
        float percentage = scanner.nextFloat();

        if (percentage >= 50) {
            System.out.println("You are eligible for " + course + ".");
            showColleges(scanner, percentage, name, course);
        } else {
            System.out.println("Sorry, you are not eligible for " + course + ".");
        }
    }

    private static void showColleges(Scanner scanner, float marks, String name, String course) {
        List<secondCopy.College> colleges = new ArrayList<>();

        if (course.equals("B.Tech")) {
            colleges.add(new secondCopy.College("IILM University", "Greater Noida", "PCM: 60% or above", "Scholarship available for top scorers", "85%", "Excellent infrastructure, Labs, Research facilities", "admissions@iilm.edu.in"));
            colleges.add(new secondCopy.College("Shiv Nadar University", "Greater Noida", "PCM: 60% or above", "Scholarship available for top scorers", "85%", "Hostel, Labs, Research facilities", "admissions@snu.edu.in"));
            colleges.add(new secondCopy.College("Galgotias University", "Greater Noida", "PCM: 60% or above", "Scholarship available for meritorious students", "80%", "Hostel, Labs, Sports facilities", "admissions@galgotiasuniversity.edu.in"));
            colleges.add(new secondCopy.College("Noida Institute of Engineering and Technology", "Greater Noida", "PCM: 60% or above", "Scholarship available for top scorers", "78%", "Labs, Library", "info @niet.co.in"));
            colleges.add(new secondCopy.College("Indraprastha Engineering College", "Greater Noida", "PCM: 60% or above", "Scholarship available for top scorers", "82%", "Excellent infrastructure, Labs", "info@ipec.org.in"));
            colleges.add(new secondCopy.College("Babu Banarasi Das Institute of Technology", "Greater Noida", "PCM: 60% or above", "Scholarship available for top scorers", "80%", "Hostel, Labs", "admissions@bbdit.ac.in"));
            colleges.add(new secondCopy.College("Sharda University", "Greater Noida", "PCM: 60% or above", "Scholarship available for top scorers", "85%", "Hostel, Labs", "admissions@sharda.ac.in"));
        } else if (course.equals("BCA")) {
            colleges.add(new secondCopy.College("IILM University", "Greater Noida", "12th: 50% or above", "Scholarship available for top scorers", "80%", "Computer Labs, Library", "admissions@iilm.edu.in"));
            colleges.add(new secondCopy.College("Shiv Nadar University", "Greater Noida", "12th: 50% or above", "Scholarship available for top scorers", "80%", "Computer Labs, Library", "admissions@snu.edu.in"));
            colleges.add(new secondCopy.College("Galgotias University", "Greater Noida", "12th: 50% or above", "Scholarship available for students with 75% or above in 12th", "85%", "Hostel, Wi-Fi, Labs", "admissions@galgotiasuniversity.edu.in"));
            colleges.add(new secondCopy.College("Noida Institute of Engineering and Technology", "Greater Noida", "12th: 50% or above", "Scholarship available for top scorers", "82%", "Computer Labs, Library", "info@niet.co.in"));
        } else if (course.equals("BBA")) {
            colleges.add(new secondCopy.College("IILM University", "Greater Noida", "12th: 50% or above", "Scholarship available for top scorers", "85%", "Library, Sports Facilities", "admissions@iilm.edu.in"));
            colleges.add(new secondCopy.College("Shiv Nadar University", "Greater Noida", "12th: 50% or above", "Scholarship available for top scorers", "85%", "Library, Sports Facilities", "admissions@snu.edu.in"));
            colleges.add(new secondCopy.College("Galgotias University", "Greater Noida", "12th: 50% or above", "Scholarship available for top scorers", "80%", "Library, Sports Facilities", "admissions@galgotiasuniversity.edu.in"));
            colleges.add(new secondCopy.College("Indraprastha Institute of Management", "Greater Noida", "12th: 50% or above", "Scholarship available for top scorers", "78%", "Library, Labs", "info@iim.ac.in"));
        } else if (course.equals("MCA")) {
            colleges.add(new secondCopy.College("IILM University", "Greater Noida", "Graduation: 50% or above", "Scholarship available for top scorers", "80%", "Computer Labs, Library", "admissions@iilm.edu.in"));
            colleges.add(new secondCopy.College("Shiv Nadar University", "Greater Noida", "Graduation: 50% or above", "Scholarship available for top scorers", "80%", "Computer Labs, Library", "admissions@snu.edu.in"));
            colleges.add(new secondCopy.College("Galgotias University", "Greater Noida", "Graduation: 50% or above", "Scholarship available for top scorers", "82%", "Computer Labs, Library", "admissions@galgotiasuniversity.edu.in"));
        } else if (course.equals("MBA")) {
            colleges.add(new secondCopy.College("IILM University", "Greater Noida", "Graduation: 50% or above", "Scholarship available for top scorers", "85%", "Library, Labs", "admissions@iilm.edu.in"));
            colleges.add(new secondCopy.College("Shiv Nadar University", "Greater Noida", "Graduation: 50% or above", "Scholarship available for top scorers", "85%", "Library, Labs", "admissions@snu.edu.in"));
            colleges.add(new secondCopy.College("Galgotias University", "Greater Noida", "Graduation: 50% or above", "Scholarship available for top scorers", "80%", "Library, Labs", "admissions@galgotiasuniversity.edu.in"));
        } else if (course.equals("B.COM")) {
            colleges.add(new secondCopy.College("IILM University", "Greater Noida", "12th: 50% or above", "Scholarship available for top scorers", "85%", "Library, Computer Labs", "admissions@iilm.edu.in"));
            colleges.add(new secondCopy.College("Shiv Nadar University", "Greater Noida", "12th: 50% or above", "Scholarship available for top scorers", "85%", "Library, Computer Labs", "admissions@snu.edu.in"));
            colleges.add(new secondCopy.College("Galgotias University", "Greater Noida", "12th: 50% or above", "Scholarship available for top scorers", "80%", "Library, Computer Labs", "admissions@galgotiasuniversity.edu.in"));
            colleges.add(new secondCopy.College("Noida Institute of Engineering and Technology", "Greater Noida", "12th: 50% or above", "Scholarship available for top scorers", "78%", "Library, Computer Labs", "info@niet.co.in"));
            colleges.add(new secondCopy.College("Indraprastha Institute of Management", "Greater Noida", "12th: 50% or above", "Scholarship available for top scorers", "78%", "Library, Labs", "info@iim.ac.in"));
            colleges.add(new secondCopy.College("Babu Banarasi Das Institute of Technology", "Greater Noida", "PCM: 60% or above", "Scholarship available for top scorers", "80%", "Hostel, Labs", "admissions@bbdit.ac.in"));
            colleges.add(new secondCopy.College("Sharda University", "Greater Noida", "PCM: 60% or above", "Scholarship available for top scorers", "85%", "Hostel, Labs", "admissions@sharda.ac.in"));
            colleges.add(new secondCopy.College("Indraprastha Engineering College", "Greater Noida", "PCM: 60% or above", "Scholarship available for top scorers", "82%", "Excellent infrastructure, Labs", "info@ipec.org.in"));
        } else if (course.equals("M.Tech")) {
            colleges.add(new secondCopy.College("IILM University", "Greater Noida", "B.Tech: 50% or above", "Scholarship available for top scorers", "80%", "Research facilities, Labs", "admissions@iilm.edu.in"));
            colleges.add(new secondCopy.College("Shiv Nadar University", "Greater Noida", "B.Tech: 50% or above", "Scholarship available for top scorers", "85%", "Research facilities, Labs", "admissions@snu.edu.in"));
            colleges.add(new secondCopy.College("Galgotias University", "Greater Noida", "B.Tech: 50% or above", "Scholarship available for top scorers", "82%", "Research facilities, Labs", "admissions@galgotiasuniversity.edu.in"));
        } else if (course.equals("PhD")) {
            colleges.add(new secondCopy.College("IILM University", "Greater Noida", "Master's Degree: 55% or above", "Scholarship available for top scorers", "80%", "Research facilities, Library", "admissions@iilm.edu.in"));
            colleges.add(new secondCopy.College("Shiv Nadar University", "Greater Noida", "Master's Degree: 55% or above", "Scholarship available for top scorers", "85%", "Research facilities, Library", "admissions@snu.edu.in"));
            colleges.add(new secondCopy.College("Galgotias University", "Greater Noida", "Master's Degree: 55% or above", "Scholarship available for top scorers", "82%", "Research facilities, Library", "admissions@galgotiasuniversity.edu.in"));
        }

        System.out.println("You are eligible for the following colleges in Greater Noida for " + course + ":");
        for (int i = 0; i < colleges.size(); i++) {
            System.out.println((i + 1) + ". " + colleges.get(i).getName());
        }

        System.out.print("Select a college by number: ");
        int collegeChoice = scanner.nextInt();

        if (collegeChoice >= 1 && collegeChoice <= colleges.size()) {
            displayCollegeDetails(colleges.get(collegeChoice - 1));
        } else {
            System.out.println("Invalid college selection.");
        }
    }

    static void displayCollegeDetails(secondCopy.College college) {
        System.out.println("College Name: " + college.getName());
        System.out.println("Location: " + college.getLocation());
        System.out.println("Eligibility Criteria: " + college.getEligibilityCriteria());
        System.out.println("Scholarship Information: " + college.getScholarshipInfo());
        System.out.println("Placement Percentage: " + college.getPlacementPercentage());
        System.out.println("Facilities: " + college.getFacilities());
        System.out.println("Contact Information: " + college.getContactInfo());
    }

    static class College {
        private String name;
        private String location;
        private String eligibilityCriteria;
        private String scholarshipInfo;
        private String placementPercentage;
        private String facilities;
        private String contactInfo;

        public College(String name, String location, String eligibilityCriteria, String scholarshipInfo, String placementPercentage, String facilities, String contactInfo) {
            this.name = name;
            this.location = location;
            this.eligibilityCriteria = eligibilityCriteria;
            this.scholarshipInfo = scholarshipInfo;
            this.placementPercentage = placementPercentage;
            this.facilities = facilities;
            this.contactInfo = contactInfo;
        }

        public String getName() {
            return name;
        }

        public String getLocation() {
            return location;
        }

        public String getEligibilityCriteria() {
            return eligibilityCriteria;
        }

        public String getScholarshipInfo() {
            return scholarshipInfo;
        }

        public String getPlacementPercentage() {
            return placementPercentage;
        }

        public String getFacilities() {
            return facilities;
        }

        public String getContactInfo() {
            return contactInfo;
        }
    }
}
