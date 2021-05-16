package shablovskiy91.athlletics.dz;


public class Athlet {
    private final String name;
    private final String sex;
    private final String distance;
    private final String time;

    public Athlet(String name, String sex, String distance, String time) {
        this.name = name;
        this.sex = sex;
        this.distance = distance;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public String getDistance() {
        return distance;
    }

    public String getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "Легкоатлет " +
                name + " " +
                sex + " " +
                distance + " " +
                time + " "
                ;
    }
}
