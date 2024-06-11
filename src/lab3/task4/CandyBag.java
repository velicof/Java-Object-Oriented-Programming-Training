package lab3.task4;

import lab3.task1.CandyBox;

import java.util.ArrayList;
import java.util.List;

public class CandyBag {
    private List<CandyBox> candyBoxes = new ArrayList<>();

    public void addCandyBox(CandyBox candyBox) {
        candyBoxes.add(candyBox);
    }

    public List<CandyBox> getCandyBoxes() {
        return candyBoxes;
    }


}
