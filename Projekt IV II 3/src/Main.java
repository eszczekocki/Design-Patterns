import java.io.Console;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Collection<String> collection = new ArrayList<String>();
        collection.add("First String");
        collection.add("Sec String");
        collection.add("Third String");
        String[] arr = CollectionTools.toArray(collection, String.class);
        Collection<String> coll= CollectionTools.toColl(arr);

        Collection<String> collectionToCopy = new ArrayList<String>();
        CollectionTools.copyFromArray(arr,collectionToCopy);

        String[] arr1= new String[3];
        CollectionTools.copyToArray(collectionToCopy,arr1);


        for (String a: arr) {
            System.out.println("From Array " + a);

        }
        for (String a: coll) {
            System.out.println("From Collection " +a);

        }

        for (String a: collectionToCopy) {
            System.out.println("From Copy from array Collection " +a);

        }

        for (String a: arr1) {
            System.out.println("From copy to Array " + a);

        }


        HashSet<Integer> arrInt = new HashSet<Integer>();
        for(int i =0 ; i< 50; i++){
            arrInt.add(new Random().nextInt());
        }


        MinMaxWrapper<Integer> wrapper = new MinMaxWrapper<Integer>(new HashSet<Integer>(arrInt));
        System.out.println("Min : "+wrapper.getMinimum()+" max: "+wrapper.getMaximum());



        }
    }

