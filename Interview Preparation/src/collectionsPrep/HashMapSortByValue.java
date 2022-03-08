package collectionsPrep;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class HashMapSortByValue {
	
	
	public static Map<String,Integer> sortByValue(Map<String,Integer> hm){
		LinkedHashMap<String, Integer> sortedHashMap = hm.entrySet().stream().sorted(Entry.comparingByValue())
		.collect(Collectors.toMap(Entry::getKey,Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));
		return sortedHashMap;
	}
	
	public static Map<String,Integer> sortByValueOtherWay(Map<String,Integer> hm){
		
	List<Entry<String, Integer>> entry=	new LinkedList<Map.Entry<String,Integer>>(hm.entrySet()) ;
	entry.sort((e1,e2)->e1.getValue().compareTo(e2.getValue()));
		
		
		return entry.stream().collect(Collectors.toMap(Entry::getKey, Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));
	}
	
	public static void main(String[] args) {
		Map<String,Integer> hm = new HashMap<>();
		hm.put("Ajay", 89);
		hm.put("Puja", 85);
		hm.put("Anil", 90);
		hm.put("Peeyush", 78);
		hm.put("Hash", 97);
		hm.put("Dushyant", 79);
		hm.put("jugal", 95);
		hm.put("Arun", 88);
		
		sortByValueOtherWay(hm).entrySet().forEach(entry->System.out.println("key --"+entry.getKey()+"---value--"+entry.getValue()));;
		
	}

}
