package ar.unahur.edu.po2.turner;

import java.util.ArrayList;
import java.util.List;

public class Turner {
    private List<Integer> deliveredTurns = new ArrayList<>();
    private List<Integer> attendedTurns = new ArrayList<>();
    private final Integer maxNumberOfTurns;
    private Integer actualPosition = 0;

    public Turner(int maxNumberOfTurns) {
        this.maxNumberOfTurns = maxNumberOfTurns;
        this.createTurner(maxNumberOfTurns);
    }

    private void createTurner(int numberOfTurns) {
        for (int i = 1; i <= numberOfTurns; i++) {
            deliveredTurns.add(i);
        }
    }

    public List<Integer> getTurns() {
        return deliveredTurns;
    }

    public List<Integer> getAttendedTurns() {
        return attendedTurns;
    }

    public Integer getActualTurn() {
        return deliveredTurns.get(actualPosition);
    }

    public Integer deliverTurn() {
        attendedTurns.add(deliveredTurns.get(actualPosition));
        deliveredTurns.remove(deliveredTurns.get(actualPosition));
        return attendedTurns.getLast();
    }

    public void nextTurn() {
        if (actualPosition < maxNumberOfTurns) {
            actualPosition++;
        }else {
            actualPosition = 1;
        }
    }

    public Integer totalDeliverTurns() {
        return deliveredTurns.size();
    }

    public Integer totalAttendedTurns() {
        return attendedTurns.size();
    }
}
