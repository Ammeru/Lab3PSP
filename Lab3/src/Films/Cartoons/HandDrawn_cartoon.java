package Films.Cartoons;

public class HandDrawn_cartoon extends Cartoon{
    public HandDrawn_cartoon(String director, String name, String duration, int audience,String painter) {
        super(director, name, duration, audience);
        this.painter = painter;
        this.grafic_style = "Рисованный";
    }
    public String getPainter() {
        return painter;
    }
    public void show(){
        System.out.println("Продюсер: " + getDirector() +
                ", фильм: " + getName() +
                ", продолжительность: " + getDuration() +
                ", аудитория: " + getAudience() + "+" +
                ", художник: " + getPainter() +
                ", графический стиль: " + grafic_style);
    }
}
