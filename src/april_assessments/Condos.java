package april_assessments;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Condos extends Property{

    private int noOfFloors;
    private String amenities;

    public Condos(String propertyCode, String location, int noOfBedrooms, int noOfBathrooms,
                  double rentPerMonth, boolean isOccupiedStatus, PropertyCode property, int noOfFloors, String amenities) {
        super(propertyCode, location, noOfBedrooms, noOfBathrooms, rentPerMonth, isOccupiedStatus, property);
        this.noOfFloors = noOfFloors;
        this.amenities = amenities;
    }

     @Override
    public double rentalIncome() {
        return getNoOfFloors() * getNoOfBedrooms() * getRentPerMonth();
    }

    @Override
    public String toString() {
        return   super.toString() +
                "noOfFloors=" + noOfFloors + "," +'\n' +
                "amenities='" + amenities + "\n\n";
    }
}
