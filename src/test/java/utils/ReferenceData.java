package utils;

import java.util.HashMap;
import java.util.Map;

public class ReferenceData {
    Map<String, Object> data = new HashMap();
    public void setData(String key, String value){
        data.put(key, value);
    }
    public Object getData(String key){
        return data.get(key);
    }
}
