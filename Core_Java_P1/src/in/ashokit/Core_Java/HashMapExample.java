package in.ashokit.Core_Java;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<Integer, String> resultMap = new HashMap<>();
		
		resultMap.put(101, "PASS");
		resultMap.put(102, "FAIL");
		resultMap.put(103, "FAIL");
		resultMap.put(104, "null");
		resultMap.put(105, "null");
		resultMap.put(106, "PASS");
		
		Set<Integer> keys = resultMap.keySet();
		for(Integer i : keys) {
			System.out.println(i);
		}
		
		System.out.println("====");
		
		Collection<String> c = resultMap.values();
		for(String s : c) {
			System.out.println(s);
		}
		
		System.out.println("====");
		
		Set<Map.Entry<Integer, String>> entries = resultMap.entrySet();
		for(Entry<Integer, String> e : entries) {
			System.out.println(e.getKey()+" : "+e.getValue());
		}
	}

}
