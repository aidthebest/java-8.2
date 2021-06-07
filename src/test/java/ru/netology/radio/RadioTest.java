package ru.netology.radio;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.net.SocketOption;
import java.sql.SQLOutput;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void setCurrentStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);
        rad.setCurrentStation(1);
        rad.setCurrentStation(8);
        rad.setCurrentStation(9);
        rad.setCurrentStation(10);
        rad.setCurrentStation(-1);
        int expected = 9;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);
        rad.setCurrentVolume(1);
        rad.setCurrentVolume(9);
        rad.setCurrentVolume(10);
        rad.setCurrentVolume(11);
        rad.setCurrentVolume(-1);
        int expected = 10;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void aboveMaxStation() {
        Radio rad = new Radio();
        rad.maxStation(5);
        int expected = 0;
        int actual = rad.getMaxStation();
        assertEquals(expected, actual);
    }

    @Test
    public void bellowMinStation() {
        Radio rad = new Radio();
        rad.prewMinStation(5);
        int expected = 9;
        int actual = rad.getMinStation();
        assertEquals(expected, actual);
    }

    @Test
    public void aboveMaxVolume() {
        Radio rad = new Radio();
        rad.aboveMaxVolume(1);
        int expected = 10;
        int actual = rad.getMaxVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void bellowMinVolume() {
        Radio rad = new Radio();
        rad.bellowMinVolume(1);
        int expected = 0;
        int actual = rad.getMinVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume() {
        Radio rad = new Radio();
        int expected = 10;
        rad.increaseVolume(9);
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void nextStation() {
        Radio rad = new Radio();
        int expected = 0;
        rad.nextStation(8);
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }


    @Test
    public void reduceVolume() {
        Radio rad = new Radio();
        int expected = 0;
        rad.reduceVolume(0);
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void prewStation() {
        Radio rad = new Radio();
        int expected = 9;
        rad.prewStation(0);
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }
}
