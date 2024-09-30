package ar.unahur.edu.po2.turner;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TurnerTest {
    Turner turner= new Turner(5);

    @Test
    public void createTurnerWithMaxTurnsToDeliver() {
        List<Integer> expectedValue = List.of(1,2,3,4,5);
        List<Integer> actualValue = turner.getTurns();
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void attendSecondTurnAndVerifyThatItAppearsInAttendedTurnsAndNotInTurnsDelivered() {
        turner.nextTurn();
        turner.deliverTurn();
        List<Integer> expectedValue = List.of(1, 3, 4, 5);
        List<Integer> actualValue = turner.getTurns();
        assertEquals(expectedValue, actualValue);
        List<Integer> expectedValue2 = List.of(2);
        List<Integer> actualValue2 = turner.getAttendedTurns();
        assertEquals(expectedValue2, actualValue2);
    }

    @Test
    public void countDeliveredTurns(){
        turner.deliverTurn();
        turner.deliverTurn();
        turner.deliverTurn();
        Integer expectedValue = 2;
        Integer actualValue = turner.totalDeliverTurns();
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void countAttendedTurns() {
        turner.deliverTurn();
        turner.deliverTurn();
        turner.deliverTurn();
        Integer expectedValue = 3;
        Integer actualValue = turner.totalAttendedTurns();
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void getActualTurn(){
        turner.nextTurn();
        turner.deliverTurn();
        turner.deliverTurn();
        turner.deliverTurn();
        Integer expectedValue = 5;
        Integer actualValue = turner.getActualTurn();
        assertEquals(expectedValue, actualValue);
    }
}