import java.util.Collection;
import java.util.Iterator;
import java.util.Set;


public class  MinMaxWrapper<T extends Comparable<T>> implements Set<T> {


    private Set<T> theSet;
    public MinMaxWrapper(Set<T> set) {
        this.theSet = set;
    }

    public <T extends Comparable<T>> T getMinimum() {
        if (theSet.size() <= 0)
            throw new IllegalArgumentException();

        T t = null;
        T t1 = null;
        int i =0;
        for( Iterator<T> iterator = (Iterator<T>)theSet.iterator() ;iterator.hasNext(); i++){
            if(i==0){
                t=iterator.next();
            }
            else {
                t1=iterator.next();
                if (t1.compareTo(t) < 0)
                    t = t1;
            }
        }

        return t;
    }



    public <T extends Comparable<T>> T getMaximum() {
        if (theSet.size() <= 0)
            throw new IllegalArgumentException();

        T t = null;
        T t1 = null;
        int i =0;
        for( Iterator<T> iterator = (Iterator<T>)theSet.iterator() ;iterator.hasNext(); i++){


            if(i==0){
                t=iterator.next();
            }
            else {
                t1=iterator.next();
                if (t1.compareTo(t) > 0)
                    t = t1;
            }
        }
            return t;
    }



    @Override
    public int size() {
        return this.theSet.size();
    }

    @Override
    public boolean isEmpty() {
        return this.theSet.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return this.theSet.contains(o);
    }

    @Override
    public Iterator<T> iterator() {
        return theSet.iterator();
    }

    @Override
    public Object[] toArray() {
        return this.theSet.toArray();
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return this.theSet.toArray(a);
    }

    @Override
    public boolean add(T t) {
        return this.theSet.add(t);
    }

    @Override
    public boolean remove(Object o) {
        return this.theSet.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return this.theSet.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return this.theSet.addAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return this.theSet.retainAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return this.theSet.removeAll(c);
    }

    @Override
    public void clear() {
        this.theSet.clear();
    }
}
