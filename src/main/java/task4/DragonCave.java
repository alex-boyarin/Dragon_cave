package task4;

import task4.treasures.Treasure;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static task4.BoxTreasure.listTreasure;


public final class DragonCave {
    private List<Treasure> treasureList;

    public DragonCave() {
        treasureList = listTreasure();
        System.out.println();
    }

    public void showTreasure() {
        treasureList.forEach(System.out::println);
        System.out.println();
    }

    public void buyTreasures(int sum) {
        List<Treasure> selectedTreasures = new ArrayList<>();
        for (Treasure treasure : treasureList) {
            if (sum >= treasure.getCost()) {
                selectedTreasures.add(treasure);
                sum -= treasure.getCost();
            }
        }
        selectedTreasures.forEach(System.out::println);
        System.out.println();
    }

    public void dearestTreasure() {
        treasureList.stream()
                .max(Comparator.comparing(Treasure::getCost))
                .map(treasure -> treasure.toString())
                .ifPresent(x -> System.out.println(x));
        System.out.println();
    }
}
