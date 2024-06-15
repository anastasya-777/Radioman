public class Radio {
    private int currentStation;
    private int currentVolume;

    public Radio() {
        
        this.currentStation = 0;
        this.currentVolume = 0;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int station) {
        if (station >= 0) {
            if (station <= 9) {
                this.currentStation = station;
            }
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int volume) {
        if (volume >= 0) {
            if (volume <= 10) {
                this.currentVolume = volume;
            }
        }
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }

    public void nextStation() {
        currentStation = (currentStation + 1) % 10;
    }

    public void previousStation() {
        if (currentStation > 0) {
            currentStation--;
        } else {
            currentStation = 9;
        }
    }

    public void prevStation() {
        if (currentStation == 0) {
            currentStation = 9; 
        } else {
            currentStation--;
        }
    }

}
