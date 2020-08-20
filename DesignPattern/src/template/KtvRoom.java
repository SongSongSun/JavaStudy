package template;

/**
 * @Author Song
 * @Date 2020/7/20 14:49
 * @Version 1.0
 * @Description
 */
public abstract class KtvRoom {
    public void procedure() {
        openDevice();
        orderSong();
        orderExtra();
        pay();
    }

    private void openDevice() {
        System.out.println("");
    }

    protected abstract void orderSong();

    private void orderExtra() {
    }


    private void pay() {

    }
}
