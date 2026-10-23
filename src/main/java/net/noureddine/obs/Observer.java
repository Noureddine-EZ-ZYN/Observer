package net.noureddine.obs;
@FunctionalInterface
public interface Observer {
    void update(int newState);
}
