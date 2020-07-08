package observerpattern;

import java.util.Observable;

/**
 * @Author Song
 * @Date 2020/5/19 9:31
 * @Version 1.0
 */
public class ObserverApp extends Observable {
    private long curr;

    public ObserverApp(long curr) {
        this.curr = curr;
    }

    public void change(long newStr) {
        this.curr = newStr;
        setChanged();
        notifyObservers(newStr);
    }
}
