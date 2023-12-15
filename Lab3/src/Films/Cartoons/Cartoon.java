package Films.Cartoons;

import Films.Interfaces.Film;
import Films.Interfaces.Object;

abstract class Cartoon implements Film, Object {
    protected String director;
    protected String name;
    protected String duration;
    protected int audience;
    protected String painter;
    protected String grafic_style;

    public Cartoon(String director, String name, String duration, int audience) {
        this.director = director;
        this.name = name;
        this.duration = duration;
        this.audience = audience;
    }
    public String getDirector(){
        return director;
    }
    public String getName(){
        return name;
    }
    public String getDuration(){
        return duration;
    }
    public int getAudience(){
        return audience;
    }
    abstract String getPainter();
    abstract void show();
    public void print(){
        System.out.println("Ну типа принт");
    }
}
