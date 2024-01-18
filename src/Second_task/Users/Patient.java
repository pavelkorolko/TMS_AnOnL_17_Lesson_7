package Second_task.Users;

import Second_task.Healing;
import Second_task.Plan;

import static Second_task.Plan.One;
import static Second_task.Plan.Two;

public class Patient {
    private String name;
    private int age;
    private Treatment treatment;
    private Doctor doctor;

    public Patient(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setTreatment(Treatment treatment) {
        this.treatment = treatment;
    }

    public Treatment getTreatment() {
        return treatment;
    }

    public Doctor assignDoctor() {
        switch (treatment.getPlan()) {
            case One -> doctor = new Dentist("Peter Liis", "Estonia", Speciality.Dentist);
            case Two -> doctor = new Surgeon("Georg Kask", "Estonia", Speciality.Surgeon);
            default -> doctor = new Therapist("Katrin Liisuoja", "Estonia", Speciality.Therapist);
        }

        return doctor;
    }

    public String getName() {
        return name;
    }
}
