package Lesson_2;

import java.util.Map;
import java.util.HashMap;

public class task_1 {
    public static void main(String[] args) {
        Map<String, String> SqlRequest = new HashMap<>();
        SqlRequest.put("name","Ivanov");
        SqlRequest.put("country","Russia");
        SqlRequest.put("city","Moscow");
        SqlRequest.put("age",null);
        StringBuilder ResultStr = new StringBuilder();
        for (Map.Entry<String,String> pair : SqlRequest.entrySet()){
            if (pair.getValue() != null){
                ResultStr.append(pair.getKey() + " = " + pair.getValue() + " and ");
            }
        }
        ResultStr.delete(ResultStr.length()-5, ResultStr.length());
        System.out.println(ResultStr);
    }
}
