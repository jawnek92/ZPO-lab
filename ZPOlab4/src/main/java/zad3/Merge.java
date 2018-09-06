package zad3;

import java.util.Map;

public class Merge {
    public static void mergeContainsKey(Map<String, Integer> map, String key){
        if(map.containsKey(key)){
            Integer value = map.get(key);
            map.replace(key, map.get(key), value+1);
        }else{
            map.put(key, 1);
        }
    }

    public static void mergeWithGetAndNullCheck(Map<String, Integer> map, String key){

        if(map.get(key)!=null){
            map.replace(key, map.get(key),map.get(key)+1);
        }else {
            map.put(key, 1);
        }
    }

    public static void mergeWithGetOrDefault(Map<String, Integer> map, String key){
        if (map.getOrDefault(key, 0) != 0){
            map.replace(key, map.get(key), map.get(key)+1);
        }else {
            map.put(key, 1);
        }
    }
    public static void mergePutIfAbsent(Map<String, Integer> map, String key){
        if((map.putIfAbsent(key, 1)) != null) {
            map.replace(key, map.get(key), map.get(key)+1);
        }
    }
}
