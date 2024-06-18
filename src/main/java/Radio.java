import java.util.Random;

public class Radio {

    private int currentStation;
    private  int currentVolume;


    public int getCurrentStation (){
        return currentStation;
    }

    public int getCurrentVolume(){
        return currentVolume;
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

     public void nextStation() {
        int target = currentStation +1;
        if (target > 9) {
            currentStation =0;
        } else {
            currentStation = target;
        }
    }

    public void prevStation() {
        int target = currentStation -1;
        if (target < 0) {
            currentStation =9;
        } else {
            currentStation = target;
        }
    }

    public void setRandomStation(int newCurrentStation) {
        int target = newCurrentStation;
        setCurrentStation(target);

    }

}
