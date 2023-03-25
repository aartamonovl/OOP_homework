package HW7;

public class SmartPhone extends MobilePhone implements SendEmail{
    private String email;

    public SmartPhone(String brand, String phoneNumber, Double diagonalDisplay, String email) {
        super(brand, phoneNumber, diagonalDisplay);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void call(String phoneNumber) {
        System.out.printf("Вызов абонента %s со смартфона", phoneNumber);
    }

    @Override
    public void answer() {
        System.out.println("Ответ на звонок со смартфона");
    }

    @Override
    public void sendMessage(String phoneNumber) {
        System.out.printf("Отправка сообщения на номер %s со смартфона", phoneNumber);
    }

    @Override
    public void acceptMessage() {
        System.out.println("Прием сообщения на смартфон");
    }

    @Override
    public void sendEmail(String email) {
        System.out.printf("Отправка email-сообщения на email %s со смартфона", email);
    }

    @Override
    public void acceptEmail() {
        System.out.println("Прием email-сообщения на смартфон");
    }
}
