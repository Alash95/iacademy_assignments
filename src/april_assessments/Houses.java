package april_assessments;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Houses extends Property {

    private int noOfFloors;
    private double yardSize;

    public Houses(String propertyCode, String location, int noOfBedrooms, int noOfBathrooms, double rentPerMonth,
                  boolean isOccupiedStatus, PropertyCode property, int noOfFloors, double yardSize) {
        super(propertyCode, location, noOfBedrooms, noOfBathrooms, rentPerMonth, isOccupiedStatus, property);
        this.noOfFloors = noOfFloors;
        this.yardSize = yardSize;
    }

    @Override
    public double rentalIncome() {
        return getRentPerMonth() * getNoOfBedrooms() * getNoOfFloors();
    }

    @Override
    public String toString() {
        return  super.toString() +
                "noOfFloors=" + noOfFloors + "," +'\n' +
                "yardSize=" + yardSize + "\n\n";
    }
}
