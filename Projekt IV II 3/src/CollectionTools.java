import java.lang.annotation.ElementType;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
public class CollectionTools {



    public static <T> void copyFromArray( T[] arr, Collection<T> coll    ) {
        for ( T a: arr ) {
            coll.add(a);
        }

    }
    public static <T> void copyToArray(Collection<T> coll, T[] arr) {
        int i =0;
        for( Iterator<T> iterator = coll.iterator() ;iterator.hasNext(); i++){

            arr[i]=iterator.next();
        }
    }



    public static <T> T[] toArray(Collection<T> coll, Class<T> elementType) {
        T[] arr = (T[]) Array.newInstance(elementType, coll.size());
        int i =0;
        for( Iterator<T> iterator = coll.iterator() ;iterator.hasNext(); i++){

            arr[i]=iterator.next();
        }
        return arr;
    }


    public static <T> Collection<T> toColl(T[] arr) {
        Collection<T> coll = new ArrayList<T>();
        for (T a : arr) {
            coll.add(a);
        }
        return coll;
    }

}

