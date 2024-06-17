public class Radio {
    private int amountStation = 10;
    private int minStation = 0;
    private int maxStation = 9;
    private int minVolume = 0;
    private int maxVolume = 10;


    private int currentStation;
    private  int currentVolume;


    public int getCurrentStation (){
        return currentStation;
    }

    public int getCurrentVolume(){
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
        if (station < 0) {
            return;
        }
        if (station > 9) {
            return;
        }
        currentStation = station;
    }

    public void setCurrentVolume(int volume) {
        if (volume < 0) {
            return;
        }
        if (volume > 10) {
            return;
        }
        currentVolume = volume;
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

    public void nextStation(){
        currentStation++;
        if (currentStation > maxStation){
            currentStation = minStation;
        }
    }

    public void prevStation(){
        if (currentStation == minStation){
            currentStation = maxStation; // Переключение на последнюю станцию
        } else {
            currentStation--; // Переключение на предыдущую станцию
        }
    }

    public void setRandomStation() {
        int randomStation = (int) (Math.random() * amountStation);
        setCurrentStation(randomStation);
    }


}
