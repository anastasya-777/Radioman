import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetValidStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        int expected = 5;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetBelowMinimumStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        int expected = 0; // Предполагая, что начальная станция равна 0
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetAboveMaximumStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        int expected = 0; // Предполагая, что начальная станция равна 0
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetValidVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        int expected = 5;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetBelowMinimumVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int expected = 0; // Предполагая, что начальная громкость равна 0
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetAboveMaximumVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        int expected = 0; // Предполагая, что начальная громкость равна 0
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.increaseVolume();
        int expected = 6;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseVolumeAboveMaximum() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.decreaseVolume();
        int expected = 4;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseVolumeBelowMinimum() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGoToNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.nextStation();
        int expected = 6;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldWrapToFirstStationFromLast() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.nextStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGoToPreviousStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.prevStation();
        int expected = 4;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldWrapToLastStationFromFirst() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prevStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

   @Test
public void setStationToNine() {
    Radio radio = new Radio();
    radio.setRandomStation(5);
    int expected = 5;
    int actual = radio.getCurrentStation();
    Assertions.assertEquals(expected, actual);
}

@Test
public void stayWithinRange() {
    Radio radio = new Radio();
    radio.setRandomStation(9); // Предполагая, что максимум - 9
    int expected = 9; // или другое значение, если станция не изменяется
    int actual = radio.getCurrentStation();
    Assertions.assertEquals(expected, actual);
}
}
