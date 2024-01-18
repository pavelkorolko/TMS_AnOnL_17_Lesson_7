package Second_task.Users;

import Second_task.Plan;

public class Treatment {
    private String description;
    private Plan plan;
    public Treatment(String description) {
        this.description = description;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    public Plan getPlan() {
        return plan;
    }

    public String getDescription() {
        return description;
    }
}
