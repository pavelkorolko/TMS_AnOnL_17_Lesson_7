package Second_task.Users;

import Second_task.Healing;

public abstract class Doctor implements Healing {
    private String name;
    private String location;
    private Speciality speciality;

    public Doctor(String name, String location, Speciality speciality) {
        this.name = name;
        this.location = location;
        this.speciality = speciality;
    }

    public Speciality getSpeciality() {
        return speciality;
    }
}
