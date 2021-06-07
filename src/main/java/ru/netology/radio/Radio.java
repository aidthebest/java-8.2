package ru.netology.radio;

public class Radio {
    private int maxVolume = 10;
    private int minVolume = 0;
    private int maxStation = 9;
    private int minStation = 0;
    private int currentStation;
    private int currentVolume;

    public int getMaxStation() {
        return maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
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


    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }


    public void maxStation (int aboveMaxStstion){
        if ((maxStation+aboveMaxStstion)>9) {
            this.maxStation = 0;
        }
    }

    public void prewMinStation (int bellowMinStation){
        if ((minStation-bellowMinStation)<0) {
            this.minStation = 9;
        }
    }

    public void aboveMaxVolume (int currentVolume) {
        if ((currentVolume + 1) >= 10) {
            this.currentVolume = 10;
        }
        else this.currentVolume = (currentVolume + 1);
    }

    public void bellowMinVolume (int currentVolume) {
        if ((currentVolume - 1) <= 0) {
            this.currentVolume = 0;
        }
        else this.currentVolume = (currentVolume - 1);
    }

    public void increaseVolume(int currentVolume) {
        if (currentVolume < 10) {
            this.currentVolume = currentVolume + 1;
        }
        if ((currentVolume + 1) >= 10) {
            this.currentVolume = 10;
        }
    }

    public void nextStation(int currentStation) {
        if (currentStation < 9) {
            this.currentStation = currentStation + 1;
        }
        if ((currentStation + 1) > 9) {
            this.currentStation = 0;
        }
        if (currentStation < 0) {
            this.currentStation = 9;
        }
    }

    public void reduceVolume(int currentVolume) {
        if ((currentVolume - 1) <= 0) {
                this.currentVolume = 0;
            }
        if (currentVolume < 10 && currentVolume > 0) {
            this.currentVolume = currentVolume - 1;
        }
    }

    public void prewStation(int currentStation) {
        if (currentStation <= 9) {
            this.currentStation = currentStation - 1;
        }
        if (this.currentStation < 0) {
            this.currentStation = 9;
        }
        if (currentStation > 9) {
            this.currentStation = 0;
        }
    }

}




