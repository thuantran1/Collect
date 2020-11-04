import java.util.Set;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Collect {
	
	public static void main(String[] args) {
		uniqueElements();
		hashAndTree();
	}
	
	/**
	 * shows how a set prints out the unique elements of a list
	 */
	public static void uniqueElements() {
		List<String> list = new ArrayList<String>();
		list.add("dog");
		list.add("cat");
		list.add("dog");
		list.add("fish");
		
		Set<String> hash = new HashSet<String>(list);
		System.out.println(hash);
	}
	
	/**
	 * Show the differences between HashMaps and TreeMaps
	 * HashMaps contain a key along with a vakue and is faster than a TreeMap
	 * TreeMaps are like HashMaps but it also keeps the order of the keys
	 */
	public static void hashAndTree() {
		HashMap<String, Integer> hash = new HashMap<String, Integer>();	//create a HashMap
		
		hash.put("dog", 1);
		hash.put("cat", 2);
		hash.put("fish", 3);
		hash.put("bird", 4);
		hash.put("frog", 5);
		
		TreeMap<String, Integer> tree = new TreeMap<String, Integer>(hash);	//create a TreeMap with the same key and values as hash
		
		System.out.println("Hash: " + hash);
		System.out.println("Trees: " + tree);
		
		
	}
	
}
