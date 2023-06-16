package observer;

public class SpreedSheet implements Observer {

    @Override
    public void update(int value) {
        System.out.println("SpreedSheet got notified: " + value);
    }

}
