package hash_tables;

import linked_lists.LinkedList;
import linked_lists.Node;

import java.util.ArrayList;

//K - KEY type
//V - VALUE type
public class HashTable<K, V> {
    private static final int INITIAL_CAPACITY = 16;
    private static final float LOAD_FACTOR = 0.75F; // 75% full

    private int size;
    private ArrayList[] tables;

    public HashTable() {
        this(INITIAL_CAPACITY);
    }

    public HashTable(int capacity) {
        this.tables = new ArrayList[capacity];
    }

    public int hash(K key) {
        //qikjo e kthen ne vlere pozitive edhe ne madhesine e size te hashTable
        return (key.hashCode() & 0x7FFFFFFF) % tables.length;
    }

    public void put(K key, V value) {
        int hashIndex = hash(key); // gjeje hash indexksin e ketij qelesi
        Entry<K, V> newEntry = new Entry<>(key, value); // krijo entry te ri per hashtabele
        if (tables[hashIndex] == null) { //shiko a eshte inicialy arraylista nese null ska elemente
            tables[hashIndex] = new ArrayList<Entry<K, V>>();
            tables[hashIndex].add(newEntry);//ruaje elementin ne array liste
        } else {
            for (Object entryObj : tables[hashIndex]) { //nese ekziston key atehere beje update
                Entry<K, V> entry = (Entry<K, V>) entryObj;
                if (entry.getKey().equals(key)) {
                    entry.setValue(value);
                    return;
                }
            }
            tables[hashIndex].add(newEntry); // nese nuk ekziston isnerto
        }
        size++;
    }


    public V get(K key) {
        int hashIndex = hash(key);
        if (tables[hashIndex] == null) {
            return null;
        }

        for (Object entryObj : tables[hashIndex]) {
            Entry<K, V> entry = (Entry<K, V>) entryObj;
            if (entry.getKey().equals(key)) {
                return entry.getValue();
            }
        }


        return null;
    }

    public V remove(K key) {
        return null;
    }

    public boolean containsKey(K key) {
        return get(key) != null;
    }

    public boolean containsValue(V value) {
        return false;
    }

    public int size() {
        return size;
    }

    public K[] keys() {
        return null;
    }

    public V[] values() {
        return null;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {

    }


}







