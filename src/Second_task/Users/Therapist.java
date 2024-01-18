package Second_task.Users;

import Second_task.Healing;

public class Therapist extends Doctor implements Healing {
    public Therapist(String name, String location, Speciality speciality) {
        super(name, location, speciality);
    }

    @Override
    public String getHealed() {
        return "I'm therapist and have own treatment plan!";
    }
}
