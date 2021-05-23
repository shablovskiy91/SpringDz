package shablovskiy91.athlletics.dz;


public class Athlet {
    private final String name;
    private final String gender;
    private final String distance;
    private final String time;

    public Athlet(String name, String gender, String distance, String time) {
        this.name = name;
        this.gender = gender;
        this.distance = distance;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
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
                gender + " " +
                distance + " " +
                time + " "
                ;
    }
}
