package net.jlamothe.foodlog;

import java.util.Date;

public class Log
{
    public Date date;
    public String description;

    public Log(Date date, String description)
    {
        this.date = date;
        this.description = description;
    }
}
