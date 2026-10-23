package net.noureddine.obs;

public class ObserverImpl implements Observer {
    @Override
    public void update(int newState) {
        System.out.println("********OBS Impl 1*******");
        System.out.println("New State ="+newState);
        System.out.println("********OBS Impl 1*******");
    }
}
