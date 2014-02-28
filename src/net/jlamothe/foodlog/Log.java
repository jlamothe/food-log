package net.jlamothe.foodlog;

import java.util.Date;
import java.util.TimeZone;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import org.json.JSONException;
import org.json.JSONObject;

public class Log
{
    public Date date;
    public String description;

    public Log(Date date, String description)
    {
        this.date = date;
        this.description = description;
    }

    public String toJSON() {
        JSONObject obj = new JSONObject();
        TimeZone tz = TimeZone.getTimeZone("UTC");
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
        df.setTimeZone(tz);
        try {
            obj.put("date", df.format(date));
            obj.put("description", description);
        }
        catch(JSONException e)
        {
            return null;
        }
        return obj.toString();
    }
}
