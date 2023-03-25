
package HW7;
public class LandlinePhone extends Phone implements Callable{
    public LandlinePhone(String brand, String phoneNumber) {
        super(brand, phoneNumber);
    }

    @Override
    public void call(String phoneNumber) {
        System.out.printf("Вызов абонента %s с домашнего телефона", phoneNumber);
    }

    @Override
    public void answer() {
        System.out.println("Ответ на звонок с домашнего телефона");
    }
}
