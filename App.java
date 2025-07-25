class Television {

    private String brand;
    private int size;
    private int channel;
    private int volume;

    public Television(String tvBrand, int tvSize) {
        brand = tvBrand;
        size = tvSize;
        channel = 1;
        volume = 5;
    }

    // Простые методы управления
    public void powerOn() {
        System.out.println(brand + " включен!");
    }

    public void changeChannel(int newChannel) {
        channel = newChannel;
        System.out.println("Переключили на " + channel + " канал");
    }

    public void volumeUp() {
        volume++;
        System.out.println("Громкость: " + volume);
    }

    public void volumeDown() {
        volume--;
        System.out.println("Громкость: " + volume);
    }
}

public class App {
    public static void main(String[] args) {

        Television livingRoomTV = new Television("Samsung", 42);
        Television kitchenTV = new Television("LG", 32);

        livingRoomTV.powerOn();
        livingRoomTV.changeChannel(5);
        livingRoomTV.volumeUp();

        kitchenTV.powerOn();
        kitchenTV.changeChannel(3);
        kitchenTV.volumeDown();
    }
}