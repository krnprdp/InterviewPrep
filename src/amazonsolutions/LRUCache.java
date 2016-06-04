package amazonsolutions;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LRUCache {
  
  public static int lruCountMiss (int max_cache_size,int [] pages) {
    int missedCount = 0;
    HashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
    for (int i = 0; i < pages.length; i++) {
      if (map.containsKey(pages[i])) {
        map.remove(pages[i]);
        map.put(pages[i], null);
      } else if (map.size() == max_cache_size) {
        map.remove(map.keySet().iterator().next());
        missedCount++;
      } else {
        missedCount++;
        map.put(pages[i], null);
      }
    }
    return missedCount;
  }

  public static void main(String[] args) {
    int[] pages = {7,0,1,2,0,3,0,4,2,3,0,3,2,1,2,0};
    System.out.println(lruCountMiss(3, pages));
    System.out.println(lruCountMiss(3, pages));
  }


}