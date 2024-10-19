/*Implement a hash table using linear probing with a table size of 10 and
 *  a hash function of x % 10 for indexing. 
 * The hash table should efficiently store and retrieve key-value pairs.*/

package Hashing_dsa;

public class LinearProbingHashTable {

	private static final int TABLE_SIZE = 10;
	private Integer[] keys;
	private String[] values;

	public LinearProbingHashTable() {
		keys = new Integer[TABLE_SIZE];
		values = new String[TABLE_SIZE];
	}

	private int hash(int key) {
		return key % TABLE_SIZE;
	}

	public void put(int key, String value) {
		int index = hash(key);
		while (keys[index] != null) {

			if (keys[index].equals(key)) {
				values[index] = value;
				return;
			}
			// Linear probing to find the next empty slot
			index = (index + 1) % TABLE_SIZE;
		}
		keys[index] = key;
		values[index] = value;
	}

	public String get(int key) {
		int index = hash(key);
		while (keys[index] != null) {
			if (keys[index].equals(key)) {
				return values[index];
			}

			index = (index + 1) % TABLE_SIZE;
		}

		return null;
	}

	public static void main(String[] args) {
		LinearProbingHashTable hashTable = new LinearProbingHashTable();
		hashTable.put(1, " Vaibhav");
		hashTable.put(2, " Nitin");
		hashTable.put(11, " Shyam");
		hashTable.put(5, " Rahul");
		hashTable.put(6, " Rama");
		hashTable.put(7, " Ravi");

		System.out.println("Key: 1 		Value:  " + hashTable.get(1));
		System.out.println("Key: 2		Value:  " + hashTable.get(2));
		System.out.println("Key: 5		Value:  " + hashTable.get(5));
		System.out.println("Key: 6		Value:  " + hashTable.get(6));
		System.out.println("Key: 7		Value:  " + hashTable.get(7));
		System.out.println("Key: 11		Value:  " + hashTable.get(11));
		System.out.println("Key: 3 		Value:  " + hashTable.get(3));
	}
}
