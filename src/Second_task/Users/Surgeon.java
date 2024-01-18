package Second_task.Users;

import Second_task.Healing;

public class Surgeon extends Doctor implements Healing {
    public Surgeon(String name, String location, Speciality speciality) {
        super(name, location, speciality);
    }

    @Override
    public String getHealed() {
        return "I'm surgeon and have own treatment plan!";
    }
}
