package net.noureddine;

import net.noureddine.obs.*;

public class Main {
    static void main() {
        ObservableImpl observable =new ObservableImpl();
        Observer o1 =new ObserverImpl();
        Observer o2 =new ObserverImpl2();

        observable.subscibe(newState -> {
            System.out.println("++++++OBS Impl 3++++++++");
            System.out.println("Res="+ newState*Math.cos(newState));
            System.out.println("++++++OBS Impl 3++++++++");
        });

        observable.subscibe(o1);
        observable.subscibe(o2);
        observable.setState(40);
        observable.setState(90);
        observable.setState(10);
        observable.unsubscribe(o2);
        observable.setState(5040);
    }
}
