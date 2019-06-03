package ua.lviv.iot.woodworkingmachine;

import ua.lviv.iot.woodworkingmachine.manager.MachinesManagerlmpl;
import ua.lviv.iot.woodworkingmachine.models.WoodsworkingMachine;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<WoodsworkingMachine> WoodworkingMachine = new ArrayList<>();
        WoodworkingMachine.add(new WoodsworkingMachine());

        manager.sortByPower(WoodworkingMachine);

        CirucularMachine cirkul = new CirucularMachine ("cirkul" , "drawing", 30, , 20, 40);
        CirucularMachine liniyka = new CirucularMachine ("liniyka" , "painting",  70,  ClassificationType.PRESS_FORGING, 15, 35);
        WoodsworkingMachine cleaner = new WoodsworkingMachine ("cleaner", "drawing", 30 ClassificationType.GORIZONTAL_DRILLING);
        WoodsworkingMachine washer = new WoodsworkingMachine ("washer","painter",  34)
        RamusMachine processing = new RamusMachine( "procesing",  "fills in",  43);
        RamusMachine tuborg = new RamusMachine("tuborg", "empty", 39);

        manager.toAdd(cirkul);
        manager.toAdd(liniyka);
        manager.toAdd(cleaner);
        manager.toAdd(washer);
        manager.toAdd(processing);
        manager.toAdd(tuborg);

        System.out.println(manager.sortByPower(true).toString());
        System.out.println(manager.sortByPower(false));
        System.out.println(manager.sortByVolume(true) );
        System.out.println(manager.sortByVolume(false));
        System.out.println(manager.findBy(ClassificationType.PRESS_FORGING));
        System.out.println(manager.findBy(ClassificationType.GORIZONTAL_DRILLING);



    }
}
