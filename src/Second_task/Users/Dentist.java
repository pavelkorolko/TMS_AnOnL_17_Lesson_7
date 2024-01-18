package Second_task.Users;

import Second_task.Healing;

import javax.xml.stream.Location;

public class Dentist extends Doctor implements Healing {
    public Dentist(String name, String location, Speciality speciality) {
        super(name, location, speciality);
    }

    @Override
    public String getHealed() {
        return "I'm dentist and have own treatment plan!";
    }
}
