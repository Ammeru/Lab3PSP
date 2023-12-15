public abstract class FilmOld {
    protected String director;
    protected String name;
    protected String duration;
    protected int audience;

    public FilmOld(String director, String name, String duration, int audience) {
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
    public void show(){
        System.out.println("Продюсер: " + getDirector() +
                ", фильм: " + getName() +
                ", продолжительность: " + getDuration() +
                ", аудитория: " + getAudience() + "+");
    }

}
