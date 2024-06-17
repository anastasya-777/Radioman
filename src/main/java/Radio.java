public class Radio {
    private int amountStation;
    private int minStation = 0;
    private int maxStation;
    private int minVolume = 0;
    private int maxVolume = 100;

    private int currentStation;
    private int currentVolume;

    // Конструктор по умолчанию
    public Radio() {
        this(10); // По умолчанию 10 станций
    }

    // Конструктор с параметром для задания количества станций
    public Radio(int amountStation) {
        this.amountStation = amountStation;
        this.maxStation = amountStation - 1;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getAmountStation() {
        return amountStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setCurrentStation(int station) {
        if (station < minStation) {
            return;
        }
        if (station > maxStation) {
            return;
        }
        currentStation = station;
    }

    public void setCurrentVolume(int volume) {
        if (volume < minVolume) {
            return;
        }
        if (volume > maxVolume) {
            return;
        }
        currentVolume = volume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
    }

    public void nextStation() {
        currentStation = (currentStation + 1) % amountStation;
    }

    public void prevStation() {
        if (currentStation == minStation) {
            currentStation = maxStation;
        } else {
            currentStation--;
        }
    }

    public void setRandomStation() {
        int randomStation = (int) (Math.random() * amountStation);
        setCurrentStation(randomStation);
    }
}
