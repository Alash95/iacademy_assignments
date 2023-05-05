package april_assessments;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Apartments extends Property {

    private int floorNumber;



    public Apartments(String propertyCode, String location, int noOfBedrooms, int noOfBathrooms,
                      double rentPerMonth, boolean isOccupiedStatus, PropertyCode property, int floorNumber) {
        super(propertyCode, location, noOfBedrooms, noOfBathrooms, rentPerMonth, isOccupiedStatus, property);
        this.floorNumber = floorNumber;
    }

    @Override
    public double rentalIncome() {
        return getNoOfBedrooms() * getRentPerMonth();
    }

    @Override
    public String toString() {
        return  super.toString()  +
                "floorNumber=" + floorNumber + "\n\n";
    }
}
