package First_task;

public class Main {
    public static void main(String[] args) {
        Phone phone_1 = new Phone("+372 556 565 55", "Xiaomi", 1000);
        Phone phone_2 = new Phone("+380 546 565 44", "SamsungX", 1300);
        Phone phone_3 = new Phone("+381 547 565 99", "SamsungY", 1100);

        System.out.println(phone_1.getNumber());
        System.out.println(phone_2.getNumber());
        System.out.println(phone_3.getNumber());

        System.out.println(phone_1.receiveCall("Josh"));
        System.out.println(phone_1.receiveCall("John", "+90 988 344 33"));

        phone_1.sendMessage("+372 556 565 55", "+380 546 565 44", "+90 323 442 11");

    }
}