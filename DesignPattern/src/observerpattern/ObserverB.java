package observerpattern;

import java.text.MessageFormat;
import java.util.Observable;
import java.util.Observer;

/**
 * @Author Song
 * @Date 2020/5/19 11:23
 * @Version 1.0
 */
public class ObserverB implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println(MessageFormat.format("ObserverB -> {0} changed, Begin to Work. agr is:{1}", o.getClass().getSimpleName(), arg));
    }
}
