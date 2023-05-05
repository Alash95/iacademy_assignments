package april_assessments;

public class PropertyCodeGenerator {

    private static int apaCount = 1;
    private static int conCount = 1;
    private static int houCount = 1;

    public static String propertyCode(PropertyCode propertyCode) {
        String codePrefix = "";

        switch (propertyCode) {
            case APA: {
                codePrefix = "APA" + String.format("%03d", apaCount++);
            }
            break;
            case CON: {
                codePrefix = "CON" + String.format("%03d", conCount++);
            }
            break;
            case HOU: {
                codePrefix = "HOU" + String.format("%03d", houCount++);
            }
            break;
            default:
        }
        return codePrefix;
//        if (property instanceof Apartments) {
//            codePrefix = "APA";
//            return codePrefix + String.format("%03d", apaCount++);
//        } else if (property instanceof Condos) {
//            codePrefix = "CON";
//            return codePrefix + String.format("%03d",conCount++);
//        } else if (property instanceof Houses) {
//            codePrefix = "HOU";
//            return codePrefix + String.format("%03d", houCount++);
//        }
//        throw new IllegalArgumentException("Code does not match any property");
    }

    public static void main(String[] args) {
        Property apartment1 = new Apartments(20);
        Property house1 = new Houses(6, 12.5);
        Property condo1 = new Condos(3, "pool");

        String code1 =  PropertyCodeGenerator.propertyCode(PropertyCode.APA);
        String code2 =  PropertyCodeGenerator.propertyCode(PropertyCode.HOU);
        String code3 =  PropertyCodeGenerator.propertyCode(PropertyCode.CON);

        System.out.println("Code for apartment1: " + code1);
        System.out.println("Code for house1: " + code2);
        System.out.println("Code for condo1: " + code3);

        Property apartment2 = new Apartments(10);
        String code4 =  PropertyCodeGenerator.propertyCode(PropertyCode.APA);
        System.out.println("Code for apartment2: " + code4);


    }

}
