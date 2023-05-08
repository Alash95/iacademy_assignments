package I_Academy.generics.collection;

import java.util.*;

public class TestingCollection {

    public static void main(String[] args) {
        List<String> collection = new ArrayList<>();
        collection.add("tobi");
        collection.add("oyin");
        collection.add("serah");
        collection.add("noah");
        collection.add("ridoh");
        collection.add("adeolu");
        collection.add("pelumi");
        collection.add("chidinma");
        collection.add("noah");
        collection.add("kenny");

        System.out.println(collection.size());
        collection.set(3, "carpenter");
        System.out.println(collection.get(3));
        collection.add(0, "Musa");
        System.out.println(collection.get(0));
        System.out.println(collection.get(1));

        for (String collections: collection) {
            System.out.println(collections);
        }

        Enumeration<String> enumeration = Collections.enumeration(collection);
        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }

        Iterator<String> collectionIterator = collection.iterator();
        while (collectionIterator.hasNext()) {
            System.out.println(collectionIterator.next());
        }




    }
}
