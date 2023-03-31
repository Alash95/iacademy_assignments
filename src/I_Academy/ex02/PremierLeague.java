package I_Academy.ex02;

public class PremierLeague {
    public static void main(String[] args) {

        EPL chelsea = new EPL();
        EPL arsenal = new EPL();
        EPL manCity = new EPL();
        EPL ManUtd = new EPL();
        EPL Tottenham = new EPL();

        chelsea.setClubName("Chelsea");
        chelsea.setClubCaptain("Reece James");
        chelsea.setClubCoach("Graham Potter");
        chelsea.setClubStadium("Stamford Bridge");

        chelsea.displayMessage();

        arsenal.setClubName("Arsenal");
        arsenal.setClubCaptain("Martin Odegaard");
        arsenal.setClubCoach("Mikel Arteta");
        arsenal.setClubStadium("Emirates Stadium");

        arsenal.displayMessage();


    }
}
