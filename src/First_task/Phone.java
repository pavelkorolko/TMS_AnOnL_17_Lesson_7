package First_task;

public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    private Phone() {
        this.weight = 1200;
    }

    public Phone(String number, String model) {
        this();
        this.number = number;
        this.model = model;
    }

    public String receiveCall(String caller) {
        return "Calling " + caller;
    }

    public String receiveCall(String caller, String number) {
        return "Calling " + caller + " and number " + number;
    }

    public String getNumber() {
        return number;
    }

    public void sendMessage(String... message) {
        for (String value : message) {
            System.out.print(value + " ");
        }
    }
}
