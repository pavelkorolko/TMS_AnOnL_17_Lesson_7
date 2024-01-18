package Second_task;

import Second_task.Users.Doctor;
import Second_task.Users.Patient;
import Second_task.Users.Treatment;

public class Main {
    public static void main(String[] args) {
        Patient patient_1 = new Patient("Josh", 20);

        Treatment treatment_1 = new Treatment("Try everyday rinse your mouth with sufficient amount of tooth water!");
        treatment_1.setPlan(Plan.One);
        patient_1.setTreatment(treatment_1);

        Doctor doctor = patient_1.assignDoctor();

        System.out.println("Assigned specialist: " + doctor.getSpeciality() +
                " to patient " + patient_1.getName() +
                " to whom was assigned treatment: " + patient_1.getTreatment().getDescription());
        System.out.println(doctor.getHealed());
    }
}
