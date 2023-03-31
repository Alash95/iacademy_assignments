package I_Academy.ex02;

public class EPL {

    private String clubName;
    private String clubCaptain;
    private String clubCoach;
    private String clubStadium;

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public String getClubCaptain() {
        return clubCaptain;
    }

    public void setClubCaptain(String clubCaptain) {
        this.clubCaptain = clubCaptain;
    }

    public String getClubCoach() {
        return clubCoach;
    }

    public void setClubCoach(String clubCoach) {
        this.clubCoach = clubCoach;
    }

    public String getClubStadium() {
        return clubStadium;
    }

    public void setClubStadium(String clubStadium) {
        this.clubStadium = clubStadium;
    }

    public void displayMessage() {
        System.out.printf("The club name is %s\nThe club captain is %s\nThe club coach is %s\nThe stadium name is %s\n\n", getClubName(), getClubCaptain(), getClubCoach(), getClubStadium());
    }
}

/*
Use OOP to model epl
5 objects of the class
club name,
club captain
club coach
club stadium
include a display message method that will display the info of each club.
 */
