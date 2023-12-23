package ru.netology.radiojava;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadoiTest {


    @Test
    public void testSetCurrentStationRegularFlow() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);
        int actual = radio.getCurrentStation();
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetCurrentStationBelowZero() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);
        radio.setCurrentStation(-5);
        int actual = radio.getCurrentStation();
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetCurrentStationOverNine() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);
        radio.setCurrentStation(12);
        int actual = radio.getCurrentStation();
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextRegularFlow() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);
        radio.next();
        int actual = radio.getCurrentStation();
        int expected = 6;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextResetToZero() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        radio.next();
        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevRegularFlow() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);
        radio.prev();
        int actual = radio.getCurrentStation();
        int expected = 4;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevResetToNine() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        radio.prev();
        int actual = radio.getCurrentStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetVolumRegularFlow() {
        Radio radio = new Radio();

        radio.setCurrentVolume(50);
        int actual = radio.getCurrentVolume();
        int expected = 50;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetVolumRegularFlowUp() {
        Radio radio = new Radio();

        radio.setCurrentVolume(50);
        radio.setCurrentVolume(150);
        int actual = radio.getCurrentVolume();
        int expected = 50;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetVolumRegularFlowDown() {
        Radio radio = new Radio();

        radio.setCurrentVolume(50);
        radio.setCurrentVolume(-50);
        int actual = radio.getCurrentVolume();
        int expected = 50;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIncreaseVolumUp() {
        Radio radio = new Radio();

        radio.setCurrentVolume(50);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 51;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIncreaseVolumDown() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 100;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testDecreaseVolumUp() {
        Radio radio = new Radio();

        radio.setCurrentVolume(50);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 49;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testDecreaseVolumDown() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }


}
