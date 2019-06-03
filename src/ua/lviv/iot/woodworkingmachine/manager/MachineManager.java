package ua.lviv.iot.woodworkingmachine.manager;

import java.util.List;

public interface MachineManager {
    List<WoodworkingMachine> findBy(String name);

    void sortByVolume (List<WoodworkingMachine> MachinesManager , boolean reverse);
    void sortByPower (List<WoodworkingMachine> MachinesManager , boolean reverse);


    public List<WoodworkingMachine> findBy(final String name) {
        return machinesList.stream().filter(machine -> machine.getName().equals(name)).collect(Collectors.toList());
    }

    public List<WoodworkingMachine> sortByVolume(List<WoodworkingMachine> machinesList, boolean reverse) {
        Comparator<WoodworkingMachine> comparator = ((WoodworkingMachine k1, WoodworkingMachine k2) -> (int) (k1.getVolume() - k2.getVolume()));
        machinesList.sort(comparator);
        if (reverse) {
            Collections.reverse(machinesList);
        }
        return machinesList;
    }


    public List<WoodworkingMachine> sortByPower(List<WoodworkingMachine> machinesList, boolean reverse) {
        Comparator<WoodworkingMachine> comparator = ((WoodworkingMachine k1, WoodworkingMachine k2) -> (int) (k1.getPower() - k2.getPower()));
        machinesList.sort(comparator);
        if (reverse) {
            Collections.reverse(machinesList);
        }
        return machinesList;
    }

    public List<WoodsworkingMachine> sortByPower(boolean ascending) {
        if (ascending) {
            Collections.sort(machinesList, Comparator.comparing(WoodsworkingMachine::getPower).reversed());
        } else {
            Collections.sort(machinesList, Comparator.comparing(WoodsworkingMachine::getPower));
        }
        return machinesList;
    }
}
