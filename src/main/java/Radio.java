import java.util.Random;

public class Radio {

    public Radio() {
        // Конструктор класса Radio
    }


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
        if (currentStation < 9) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void prevStation() {
        if (currentStation > 0) {
            currentStation--;
        } else {
            currentStation = 9;
        }
    }

    public void setRandomStation() {
        Random random = new Random(); // Создаем экземпляр генератора случайных чисел
        currentStation = random.nextInt(10); // Генерируем случайное число от 0 до 9 и устанавливаем как текущую станцию
    }

}
