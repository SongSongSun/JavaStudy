package facade;

import facade.subclasses.BrickLayer;
import facade.subclasses.BrickWorker;
import facade.subclasses.Mason;

/**
 * @Author Song
 * @Date 2020/7/8 11:18
 * @Version 1.0
 * @Description 包工头  门面类
 */
public class LabourContractor {
    private Mason mason = new Mason();
    private BrickWorker brickWorker = new BrickWorker();
    private BrickLayer brickLayer = new BrickLayer();

    public void buildHouse() {
        mason.mix();
        brickWorker.carry();
        brickLayer.neat();
        System.out.println("房子已经建好了");
    }
}
