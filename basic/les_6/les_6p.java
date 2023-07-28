package basic.les_6;

import java.util.HashMap;
import java.util.Iterator;

public class les_6p {

    public static void main(String[] args) {
        MySet<Integer> mSet = new MySet<Integer>();
        System.out.println(mSet.add(12));
        System.out.println(mSet.add(14));
        System.out.println(mSet.add(12));
        System.out.println(mSet.remove(12));
        System.out.println(mSet.remove(12));
        System.out.println(mSet.add(5));
        System.out.println(mSet.add(7));
        System.out.println(mSet.size());
        Iterator<Integer> itr = mSet.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println(mSet.toString());
        System.out.println(mSet.get(1));
    }

}

class MySet<E> {
    private HashMap<E, Object> map = new HashMap<>();
    private static final Object O = new Object();

    public boolean add(E num) {
        return map.put(num, O) == null;
    }

    public boolean remove(E num) {
        return map.remove(num) != null;
    }

    public Integer size() {
        return map.size();
    }

    public Iterator<E> iterator() {
        return map.keySet().iterator();
    } 

    public String toString() {
        StringBuilder result = new StringBuilder("[");
        for (E element : map.keySet()) {
            result.append(element).append(", ");
        }
        return result
            .append("]")
            .toString()
            .replace(", ]", "]");
    }

    public E get(Integer num) {
        return (E)map.keySet().toArray()[num];
    }
}