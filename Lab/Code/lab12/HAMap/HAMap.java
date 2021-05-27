import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
 *  Hash-based Map
 */
public class HAMap<K, V> implements Iterable<K> {

    /**
     * Represents a key-value pair.
     */
    private class Entry {
        K key;
        V value;

        Entry(K k, V v) {
            key = k;
            value = v;
        }
    }

    private static final int DEFAULT_CAPACITY = 16;
    private static final double DEFAULT_LOAD_FACTOR = 1.5;

    private ArrayList<ArrayList<Entry>> buckets;
    private HashSet<K> keySet;
    private int numBuckets;
    private int numEntries;
    private final double loadFactor;

    /**
     * @return a set of the keys contained in this map.
     */
    public HashSet<K> keySet() {
        return keySet;
    }

    /**
     * @return the number of entries in this map.
     */
    public int size() {
        return numEntries;
    }

    /**
     * @return the number of buckets in this map.
     */
    public int getNumBuckets() {
        return numBuckets;
    }

    /*
     ***************************
     * DO NOT MODIFY CODE ABOVE
     ***************************
     */


    /*
     ***** HELPER METHODS START *****
     */


    // INCLUDE your helper methods in EACH of your submissions that use them





    /*
     ***** HELPER METHODS END *****
     */


    // LAB EXERCISE 12.2 CONSTRUCTORS

    public HAMap(int initialCapacity, double loadFactor) {
        buckets = new ArrayList<>();
        for (int i = 0; i < initialCapacity; i++) {
            buckets.add(new ArrayList<>());
        }
        keySet = new HashSet<>();
        numBuckets = initialCapacity;
        numEntries = 0;
        this.loadFactor = loadFactor;
    }



    public HAMap() {

        this(DEFAULT_CAPACITY, DEFAULT_LOAD_FACTOR);

    }

    public HAMap(int initialCapacity) {

        this(initialCapacity, DEFAULT_LOAD_FACTOR);

    }



    // LAB EXERCISE 12.3 CLEAR

    /**
     * Removes all of the entries from this map.
     */
    public void clear() {
        buckets = new ArrayList<>();
        for (int i = 0; i < numBuckets; i++) {
            buckets.add(new ArrayList<>());
        }
        keySet = new HashSet<>();
        numEntries = 0;
    }


    // LAB EXERCISE 12.4 CONTAINS KEY and ITERATOR

    /**
     * @param key to be checked
     * @return true iff this map contains an entry with the specified key
     */
    public boolean containsKey(K key) {
		
		
		return keySet.contains(key);
    }

    /**
     * @return an Iterator that iterates over the stored keys
     */
    @Override
    public Iterator<K> iterator() {

        return keySet.iterator();
    }


    // EXERCISE 12.1 GET

    /**
     * @param key of the value to be returned
     * @return the value to which the specified key is mapped
     *         null if this map contains no entries of the key
     */
    private int reduce(K key,int capacity ){
        return Math.floorMod(key.hashCode(),capacity);
    }


    public V get(K key) {

        if (containsKey(key)){
            int reduce = reduce(key,buckets.size());
            ArrayList<Entry> items = buckets.get(reduce);
            for(Entry a : items){
                if(a.key == key)
                    return a.value;
            }

        }
        return null;
    }


    // EXERCISE 12.2 PUT

    /**
     * Associates the specified value with the specified key in this map.
     * If the map previously contained an entry with that key, the old value is replaced.
     * The key is not null.
     * @param key of the entry to be added
     * @param value of the entry to be added
     */
    private void resize(int newCapacity){
        ArrayList<ArrayList<Entry>> newBuckets = new ArrayList<>();
        for (int i = 0; i < newCapacity; i++) {
            newBuckets.add(new ArrayList<>());
        }

        for(K key:this){
            int newIndex=reduce(key,newCapacity);
            newBuckets.get(newIndex).add(new Entry(key,get(key)));

        }

        buckets=newBuckets;
        numBuckets=newCapacity;

    }

    public void put(K key, V value) {
        if((double)numEntries / (double)numBuckets >= loadFactor){
            resize(2 * numBuckets);
        }

        assert (key != null);
        int index = reduce(key,buckets.size());
        ArrayList<Entry> items = buckets.get(index);
        for(Entry e :items){
            if(e.key.equals(key)){
                e.value = value;
                return;
            }
        }
        items.add(new Entry(key,value));
        keySet.add(key);
        numEntries++;
    }



    // EXERCISE 12.3 REMOVE

    /**
     * Removes the entry for the specified key only if it is
     * currently mapped to the specified value.
     * @param key of the entry to be removed
     * @param value of the entry to be removed
     * @return the value if entry found,
     *         null otherwise
     */
    public V remove(K key, V value) {
        if (key == null || !keySet.contains(key))
            return null;
        int index = reduce(key, buckets.size());
        ArrayList<Entry> items = buckets.get(index);
        for (Entry e : items) {
            if (e.key.equals(key)) {
                if (e.value.equals(value)) {

                    items.remove(e);
                    keySet.remove(key);
                    numEntries--;
                    return e.value;
                }
            }
        }
        return null;
    }

}
