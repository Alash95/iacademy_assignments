package april_assessments;

import java.util.Arrays;

public class RentalRepositoryUsingArrays {

    private Property[] properties;
    private int size;

    public RentalRepositoryUsingArrays(int capacity) {
        properties = new Property[capacity];
        size = 0;
    }

    public void addProperty(Property property) {
        if (size < properties.length) {
            properties[size++] = property;
        } else {
            System.out.println("Cannot add property - Repository is full");
        }
    }
    
    public void deleteProperty(String propertyId) {
        for (int i = 0; i < size; i++) {
            if (properties[i].getPropertyCode().equals(propertyId)) {
                properties[i] = properties[size - 1];
                properties[size - 1] = null;
                size--;
                break;
            }
        }
    }

    public void updateProperty(String propertyid, Property property) {
        for (int i = 0; i < size; i++) {
            if (properties[i].getPropertyCode().equals(propertyid)) {
                properties[i] = property;
                break;
            }
        }
    }

    public Property viewProperty(String propertyId) {
        for (int i = 0; i < size; i++) {
            if (properties[i].getPropertyCode().equals(propertyId)) {
                return properties[i];
            }
        }
        return null;
    }

    public Property[] viewAllProperties() {
        Property[] allProperties = new Property[size];
        for (int i = 0; i < size; i++) {
            allProperties[i] = properties[i];
        }
        return allProperties;
    }

    public Apartments[] viewAllApartments() {
        int apaCount= 0;
        for (int i = 0; i < size; i++) {
            if (properties[i] instanceof Apartments) {
                apaCount++;
            }
        }
        Apartments[] apartments = new Apartments[apaCount];
        int j = 0;
        for (int i = 0; i < size; i++) {
            if (properties[i] instanceof Apartments) {
                apartments[j] = (Apartments) properties[i];
                j++;
            }
        }
        return apartments;
    }

    public Houses[] viewAllHouses() {
        int houCount= 0;
        for (int i = 0; i < size; i++) {
            if (properties[i] instanceof Houses) {
                houCount++;
            }
        }
        Houses[] houses = new Houses[houCount];
        int j = 0;
        for (int i = 0; i < size; i++) {
            if (properties[i] instanceof Houses) {
                houses[j] = (Houses) properties[i];
                j++;
            }
        }
        return houses;
    }

    public Condos[] viewAllCondos() {
        int conCount= 0;
        for (int i = 0; i < size; i++) {
            if (properties[i] instanceof Condos) {
                conCount++;
            }
        }
        Condos[] condos = new Condos[conCount];
        int j = 0;
        for (int i = 0; i < size; i++) {
            if (properties[i] instanceof Condos) {
                condos[j] = (Condos) properties[i];
                j++;
            }
        }
        return condos;
    }

    public Property[] getAllOccupiedProperties() {
        int occupiedCount = 0;
        for (int i = 0; i < size; i++) {
            if (properties[i].isOccupiedStatus()) {
                occupiedCount++;
            }
        }
        Property[] occupiedProperties = new Property[occupiedCount];
        int j = 0;
        for (int i = 0; i < size; i++) {
            if (properties[i].isOccupiedStatus()) {
                occupiedProperties[j] = properties[i];
                j++;
            }
        }
        return occupiedProperties;
    }

    public Property[] getAllUnoccupiedProperties() {
        int unOccupiedCount = 0;
        for (int i = 0; i < size; i++) {
            if (!properties[i].isOccupiedStatus()) {
                unOccupiedCount++;
            }
        }
        Property[] unOccupiedProperties = new Property[unOccupiedCount];
        int j = 0;
        for (int i = 0; i < size; i++) {
            if (!properties[i].isOccupiedStatus()) {
                unOccupiedProperties[j] = properties[i];
                j++;
            }
        }
        return unOccupiedProperties;
    }

    public Property[] searchByLocation(String location) {
        Property[] matchingProperties = new Property[size];
        int index = 0;
        for (int i = 0; i < size; i++) {
            if (properties[i].getLocation().equalsIgnoreCase(location)) {
                matchingProperties[index] = properties[i];
                index++;
            }
        }
        return Arrays.copyOf(matchingProperties, index);
    }

    public Property searchByPropertyCode(String propertyCode) {
        for (Property property: properties) {
            if (property.getPropertyCode().equals(propertyCode)){
                return property;
            }
        }
        return null;
    }

    public int getTotalNumberOfProperties() {
        Property[] properties = new Property[size];
        int count = 0;
        for (Property property: properties) {
            count++;

        }
        return count;
    }

    public int getTotalNumberofApartments() {
        int count = 0;
        for (Property property: properties) {
            if (property instanceof Apartments) {
                count++;
            }
        }
        return count;
    }

    public int getTotalNumberOfBedroomsInApartments() {
        int count = 0;
        for (Property property: properties) {
            if (property instanceof Apartments) {
                count += ((Apartments) property).getNoOfBedrooms();
            }
        }
        return count;
    }

    public int getTotalNumberOfBathroomsInApartments() {
        int count = 0;
        for (Property property: properties) {
            if (property instanceof Apartments) {
                count += ((Apartments) property).getNoOfBathrooms();
            }
        }
        return count;
    }

    public double getTotalRentalIncomePerMonthFromApartments() {
        double totalIncome = 0.0;
        for (Property property : properties) {
            if (property instanceof Apartments && property.isOccupiedStatus()) {
                totalIncome += ((Apartments) property).rentalIncome();
            }
        }
        return totalIncome;
    }

    public int getTotalNumberOfOccupiedApartments() {
        int count = 0;
        for (Property property: properties) {
            if (property instanceof Apartments && property.isOccupiedStatus()) {
                count++;
            }
        }
        return count;
    }

    public int getTotalNumberOfUnoccupiedApartments() {
        int count = 0;
        for (Property property: properties) {
            if (property instanceof Apartments && !property.isOccupiedStatus()) {
                count++;
            }
        }
        return count;
    }

    public int getTotalNumberOfAllCondos() {
        int count = 0;
        for (Property property: properties) {
            if (property instanceof Condos) {
                count++;
            }
        }
        return count;
    }

    public int getTotalNumberOfBedroomInCondos() {
        int count = 0;
        for (Property property: properties) {
            if (property instanceof Condos) {
                count += ((Condos) property).getNoOfBedrooms();
            }
        }
        return count;
    }

    public int getTotalNumberOfBathroomInCondos() {
        int count = 0;
        for (Property property: properties) {
            if (property instanceof Condos) {
                count += ((Condos) property).getNoOfBathrooms();
            }
        }
        return count;
    }

    public double getTotalRentalIncomePerMonthForCondos() {
        double totalIncome = 0.0;
        for (Property property: properties) {
            if (property instanceof  Condos && property.isOccupiedStatus()) {
                totalIncome += ((Condos) property).rentalIncome();
            }
        }
        return totalIncome;
    }

    public int getTotalNumberOfOccupiedCondos() {
        int count = 0;
        for (Property property: properties) {
            if (property instanceof Condos && property.isOccupiedStatus()) {
                count++;
            }
        }
        return count;
    }

    public int getTotalNumberOfUnoccupiedCondos() {
        int count = 0;
        for (Property property: properties) {
            if (property instanceof Condos && !property.isOccupiedStatus()) {
                count++;
            }
        }
        return count;
    }

    public int getTotalNumberOfAllHouses() {
        int count = 0;
        for (Property property: properties) {
            if (property instanceof Houses) {
                count++;
            }
        }
        return count;
    }

    public int getTotalNumberOfBedroomInHouses() {
        int count = 0;
        for (Property property: properties) {
            if (property instanceof Houses) {
                count += ((Houses) property).getNoOfBedrooms();
            }
        }
        return count;
    }

    public int getTotalNumberOfBathroomInHouses() {
        int count = 0;
        for (Property property: properties) {
            if (property instanceof Houses) {
                count += ((Houses) property).getNoOfBathrooms();
            }
        }
        return count;
    }

    public double getTotalRentalIncomePerMonthForHouses() {
        double totalIncome = 0.0;
        for (Property property: properties) {
            if (property instanceof  Houses && property.isOccupiedStatus()) {
                totalIncome += ((Houses) property).rentalIncome();
            }
        }
        return totalIncome;
    }

    public int getTotalNumberOfOccupiedHouses() {
        int count = 0;
        for (Property property: properties) {
            if (property instanceof Houses && property.isOccupiedStatus()) {
                count++;
            }
        }
        return count;
    }

    public int getTotalNumberOfUnoccupiedHouses() {
        int count = 0;
        for (Property property: properties) {
            if (property instanceof Houses && !property.isOccupiedStatus()) {
                count++;
            }
        }
        return count;
    }



















}
