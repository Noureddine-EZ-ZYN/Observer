package net.noureddine.obs;

public interface Observable {
    void subscibe(Observer o);
    void unsubscribe(Observer o);
    void notifyObservers();
}
