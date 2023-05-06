package april_assessments;

public class ArrayListTesting {

    public static void main(String[] args) {

//        Apartments apa1 = PropertyCodeGenerator.propertyCode(new Apartments( "Lagos", 3, 2, 2000,true,12));
//        Apartments apa2 = new Apartments("apa002", "Abuja", 4, 3, 1000,false,10);
//        Apartments apa3 = new Apartments("apa003", "Ondo", 3, 2, 4000,true,13);
//        Apartments apa4 = new Apartments("apa004", "Ibadan", 4, 3, 6000,false,11);

        Property apa1 = new Apartments("1", "Gbagada", 3,
                2, 2000, true, PropertyCode.APA, 2);
        Property apa2 = new Apartments("2", "Badagry", 3,
                2, 4500, false, PropertyCode.APA, 2);
        Property apa3 = new Apartments("3", "Onipanu", 3,
                2, 4500, false, PropertyCode.APA, 2);
        Property apa4 = new Apartments("4", "Ikorodu", 3,
                2, 4500, true, PropertyCode.APA, 2);
        Property apa5 = new Apartments("5", "Ikotun", 3,
                2, 4500, true, PropertyCode.APA, 2);
        Property apa6 = new Apartments("6", "Palmgroove", 3,
                2, 4500, false, PropertyCode.APA, 2);
        Property apa7 = new Apartments("7", "Oshodi", 3,
                2, 4500, true, PropertyCode.APA, 2);
        Property apa8 = new Apartments("8", "Ketu", 3,
                2, 4500, true, PropertyCode.APA, 2);
        Property condos1 = new Condos("1", "Ikeja", 3, 2,
                3500, true, PropertyCode.CON, 4,"Pool");
        Property condos2 = new Condos("1", "Mile12", 3, 2,
                3500, false, PropertyCode.CON, 4,"Pool");
        Property condos3 = new Condos("2", "Mile2", 3, 2,
                3500, true, PropertyCode.CON, 4,"Pool");
        Property house1 = new Houses("1", "Apapa", 3, 2,
                3500, true, PropertyCode.HOU, 4,3.5);
        Property house2 = new Houses("2", "Magodo", 3, 2,
                3500, true, PropertyCode.HOU, 4,3.5);


        RentalRepository rentalRepository = new RentalRepository();

        rentalRepository.createProperty(apa1);
        rentalRepository.createProperty(apa2);
        rentalRepository.createProperty(apa3);
        rentalRepository.createProperty(apa4);
        rentalRepository.createProperty(apa5);
        rentalRepository.createProperty(apa6);
        rentalRepository.createProperty(apa7);
        rentalRepository.createProperty(apa8);
        rentalRepository.createProperty(condos1);
        rentalRepository.createProperty(condos2);
        rentalRepository.createProperty(condos3);
        rentalRepository.createProperty(house1);
        rentalRepository.createProperty(house2);

//        System.out.println(rentalRepository.viewAllProperties());
//        System.out.println(rentalRepository.deleteProperty("APA001"));
//        System.out.println(rentalRepository.viewAllApartments());
//        System.out.println(rentalRepository.viewAllCondos());
//        System.out.println(rentalRepository.viewAllHouses());
//        System.out.println(rentalRepository.viewProperty("APA002"));
//        System.out.println(rentalRepository.updateProperty("APA002"));
//        System.out.println(rentalRepository.viewAllOccupiedProperties());
//        System.out.println(rentalRepository.viewAllUnoccupiedProperties());
//        System.out.println(rentalRepository.searchByPropertyCode("APA007"));
//        System.out.println(rentalRepository.searchByLocation("Apapa"));
//        System.out.println(rentalRepository.getTotalNumberOfAllApartments());
//        System.out.println(rentalRepository.getTotalNumberOfAllProperties());
        System.out.println(rentalRepository.getTotalNumberOfBathroomInApartments());







    }
}
