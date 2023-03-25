package HW7;

import java.sql.SQLOutput;

public class MobilePhone extends Phone implements Callable, SendMessage{
    private Double diagonalDisplay;

    public MobilePhone(String brand, String phoneNumber, Double diagonalDisplay) {
        super(brand, phoneNumber);
        this.diagonalDisplay = diagonalDisplay;
    }

    public Double getDiagonalDisplay() {
        return diagonalDisplay;
    }

    public void setDiagonalDisplay(Double diagonalDisplay) {
        this.diagonalDisplay = diagonalDisplay;
    }

    @Override
    public void call(String phoneNumber) {
        System.out.printf("Вызов абонента %s с мобильного телефона", phoneNumber);
    }

    @Override
    public void answer() {
        System.out.println("Ответ на звонок с мобильного телефона");
    }

    @Override
    public void sendMessage(String phoneNumber) {
        System.out.printf("Отправка сообщения на номер %s с мобильного телефона", phoneNumber);
    }

    @Override
    public void acceptMessage() {
        System.out.println("Прием сообщения на мобильный телефон");
    }
}
