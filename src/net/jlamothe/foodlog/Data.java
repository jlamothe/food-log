package net.jlamothe.foodlog;

import java.util.Vector;

public class Data
{
    public static Vector<Log> logs = new Vector<Log>();

    public static boolean addLog(Log log) {
        logs.add(log);
        // TODO: save
        return true;
    }    
}
