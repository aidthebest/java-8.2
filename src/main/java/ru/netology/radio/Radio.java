package ru.netology.radio;

public class Radio {
    private int maxStation = 9;
    private int minStation = 0;
    private int currentStation;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;
    }



    public void nextStation() {
        if ((currentStation + 1) > maxStation) {
            currentStation = minStation;
        }
        else this.currentStation = currentStation +1;
    }
    public void prewStation() {
        if ((currentStation -1) < minStation){
            currentStation = maxStation;
        }
        else this.currentStation = currentStation - 1;

    }

}




