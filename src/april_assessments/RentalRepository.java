package april_assessments;

import java.util.ArrayList;
import java.util.List;

public class RentalRepository {

    private Property property;
    List<Property> properties = new ArrayList<>();


    //This is the Add function
    public List<Property> createProperty(Property property) {
        properties.add(property);
        return properties;
    }


    public List<Property> updateProperty(String propertyId) {
        for (int i = 0; i < properties.size(); i++) {
            if (properties.get(i).getPropertyCode().equals(propertyId)) {
                properties.set(i, property);
                break;
            }
        }
        return properties;
    }

    public List<Property> deleteProperty(String propertyId) {
        for (int i = 0; i < properties.size(); i++) {
            if (properties.get(i).getPropertyCode().equals(propertyId)){
                properties.remove(i);
                break;
            }
        }
        return properties;
    }

    public List<Apartments> viewAllApartments() {
       List<Apartments> apartments = new ArrayList<Apartments>();
       for (Property property: properties) {
           if (property instanceof Apartments) {
               apartments.add((Apartments) property);
           }
       }
        return apartments;
    }

    public List<Houses> viewAllHouses() {
        List<Houses> houses = new ArrayList<Houses>();
        for (Property property: properties) {
            if (property instanceof Houses) {
                houses.add((Houses) property);
            }
        }
        return houses;
    }

    public List<Condos> viewAllCondos() {
        List<Condos> condos = new ArrayList<Condos>();
        for (Property property: properties) {
            if (property instanceof Condos) {
                condos.add((Condos) property);
            }
        }
        return condos;
    }

    public Property viewProperty(String propertyId) {
        for (int i = 0; i < properties.size(); i++) {
            if (properties.get(i).getPropertyCode().equals(propertyId)) {
                return properties.get(i);
            }
        }
        return null;
    }

    public List<Property> viewAllProperties() {
        return properties;
    }

    public List<Property> viewAllOccupiedProperties() {
        List<Property> occupiedProperties = new ArrayList<>();
        for (Property property: properties) {
            if (property.isOccupiedStatus()){
                occupiedProperties.add(property);
            }
        }
        return occupiedProperties;
    }

    public List<Property> viewAllUnoccupiedProperties() {
        List<Property> unOccupiedProperties = new ArrayList<>();
        for (Property property: properties) {
            if (!property.isOccupiedStatus()){
                unOccupiedProperties.add(property);
            }
        }
        return unOccupiedProperties;
    }

    public List<Property> searchByLocation(String location) {
        List<Property> matchingLocation = new ArrayList<>();
        for (Property property: properties) {
            if (property.getLocation().equalsIgnoreCase(location)) {
                matchingLocation.add(property);
            }
        }
        return matchingLocation;
    }

    public Property searchByPropertyCode(String propertyCode) {
        for (Property property: properties) {
            if (property.getPropertyCode().equals(propertyCode)){
                return property;
            }
        }
        return null;
    }

    public int getTotalNumberOfAllProperties() {
        return properties.size();
    }

    public int getTotalNumberOfAllApartments() {
       int count = 0;
       for (Property property: properties) {
           if (property instanceof Apartments) {
               count++;
           }
       }
       return count;
    }

    public int getTotalNumberOfBedroomInApartments() {
        int count = 0;
        for (Property property: properties) {
            if (property instanceof Apartments) {
                count += ((Apartments) property).getNoOfBedrooms();
            }
        }
        return count;
    }

    public int getTotalNumberOfBathroomInApartments() {
        int count = 0;
        for (Property property: properties) {
            if (property instanceof Apartments) {
                count += ((Apartments) property).getNoOfBathrooms();
            }
        }
        return count;
    }

    public double getTotalRentalIncomePerMonthForApartments() {
        double totalIncome = 0.0;
        for (Property property: properties) {
            if (property instanceof  Apartments && property.isOccupiedStatus()) {
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
}
