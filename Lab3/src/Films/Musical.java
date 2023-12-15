package Films;

import Films.Interfaces.Film;
import Films.Interfaces.Object;

public class Musical implements Film, Object {
    protected String director;
    protected String name;
    protected String duration;
    protected int audience;
    String musical_instrument;
    int number_of_songs;

    public Musical(String director, String name, String duration, int audience, String musical_instrument, int number_of_songs) {
        this.director = director;
        this.name = name;
        this.duration = duration;
        this.audience = audience;
        this.musical_instrument = musical_instrument;
        this.number_of_songs = number_of_songs;
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
    public String getMusical_instrument() {
        return musical_instrument;
    }
    public int getNumber_of_songs() {
        return number_of_songs;
    }
    public void print(){
        System.out.println("Продюсер: " + getDirector() +
                ", фильм: " + getName() +
                ", продолжительность: " + getDuration() +
                ", аудитория: " + getAudience() + "+" +
                ", инструмент: " + getMusical_instrument() +
                ", количество песен: " + getNumber_of_songs());
    }
}
