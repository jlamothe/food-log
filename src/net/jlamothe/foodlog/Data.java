package net.jlamothe.foodlog;

import java.util.Vector;
import org.json.JSONArray;
import org.json.JSONObject;

public class Data
{
    public static Vector<Log> logs = new Vector<Log>();

    public static boolean addLog(Log log) {
        logs.add(log);
        return saveLogs();
    }

    public static boolean saveLogs() {
        JSONArray array = new JSONArray();
        for(Log log : logs)
            array.put(log.toJSON());
        // TODO: save the JSON data
        return true;
    }
}
