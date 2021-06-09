package ru.netology.radio;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.net.SocketOption;
import java.sql.SQLOutput;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void prewStation() {
        Radio rad = new Radio();
        int expected = 9;
        rad.setCurrentStation(0);
        rad.prewStation();
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }
    //
    @Test
    public void prewStation2() {
        Radio rad = new Radio();
        int expected = 0;
        rad.setCurrentStation(1);
        rad.prewStation();
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void prewStation3() {
        Radio rad = new Radio();
        int expected = 8;
        rad.setCurrentStation(9);
        rad.prewStation();
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void prewStation4() {
        Radio rad = new Radio();
        int expected = 9;
        rad.setCurrentStation(-1);
        rad.prewStation();
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void nextStation() {
        Radio rad = new Radio();
        int expected = 9;
        rad.setCurrentStation(8);
        rad.nextStation();
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void nextStation2() {
        Radio rad = new Radio();
        int expected = 0;
        rad.setCurrentStation(9);
        rad.nextStation();
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void nextStation3() {
        Radio rad = new Radio();
        int expected = 1;
        rad.setCurrentStation(0);
        rad.nextStation();
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }
}
