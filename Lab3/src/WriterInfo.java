import Films.*;
import Films.Cartoons.*;

public class WriterInfo {
    public static void main(String[] args) {
        Puppet_cartoon film1 = new Puppet_cartoon("Я", "PupCart","2h", 12, "Я");
        film1.show();
        HandDrawn_cartoon film2 = new HandDrawn_cartoon("Я", "РисМульт","1h 30min", 14, "Я");
        film2.show();
        Historical film3 = new Historical("Я", "Исторический","2h", 18, "1914-1918", 100);
        film3.print();
        Musical film4 = new Musical("Я", "Мюзикл","1h 30 min", 16, "скрипка", 13);
        film4.print();
        film1.print();
        film2.print();
    }
}