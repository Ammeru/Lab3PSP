package Films;

import Films.Interfaces.Film;
import Films.Interfaces.Object;

public class Historical implements Film, Object {
    protected String director;
    protected String name;
    protected String duration;
    protected int audience;
    protected String historical_period;
    protected int DegreeOCWEvents;

    public Historical(String director, String name, String duration, int audience, String historical_period, int DegreeOCWEvents) {
        this.director = director;
        this.name = name;
        this.duration = duration;
        this.audience = audience;
        this.historical_period = historical_period;
        this.DegreeOCWEvents = DegreeOCWEvents;
    }
    public String getHistorical_period() {
        return historical_period;
    }
    public String getDegreeOCWEvents() {
        String text;
        if (DegreeOCWEvents == 100){
            text = "полностью";
        }
        else { text = "вдохновлён"; }
        return text;
    }
    public String getDirector() {
        return director;
    }
    public String getName() {
        return name;
    }
    public String getDuration() {
        return duration;
    }
    public int getAudience() {
        return audience;
    }
    public void print(){
        System.out.println("Продюсер: " + getDirector() +
                ", фильм: " + getName() +
                ", продолжительность: " + getDuration() +
                ", аудитория: " + getAudience() + "+" +
                ", исторический период: " + getHistorical_period() +
                ", степень соответствия событиям: " + getDegreeOCWEvents());
    }
}
