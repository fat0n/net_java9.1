import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void setVolumeUpMax() {
        Radio rad = new Radio();
        rad.setCurrentVolume(101);

        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeUnderMin() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-5);

        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeInRange() {
        Radio rad = new Radio();
        rad.setCurrentVolume(5);

        int expected = 5;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setChangeVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(5);
        rad.setCurrentVolume(6);

        int expected = 6;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MinusVolumeStart0() {
        Radio rad = new Radio();
        rad.DownVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MinusVolumeStart5() {
        Radio rad = new Radio();
        rad.setCurrentVolume(5);
        rad.DownVolume();

        int expected = 4;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeStart100() {
        Radio rad = new Radio();
        rad.setCurrentVolume(100);
        rad.increaseVolume();

        int expected = 100;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeStart5() {
        Radio rad = new Radio();
        rad.setCurrentVolume(5);
        rad.increaseVolume();

        int expected = 6;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentNumberStationUpMax() {
        Radio rad = new Radio(40);
        rad.setCurrentNumberStation(50);

        int expected = 0;
        int actual = rad.getCurrentNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentNumberStationUnderMin() {
        Radio rad = new Radio(40);
        rad.setCurrentNumberStation(-5);

        int expected = 0;
        int actual = rad.getCurrentNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentNumberStationInRange() {
        Radio rad = new Radio(40);
        rad.setCurrentNumberStation(25);

        int expected = 25;
        int actual = rad.getCurrentNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ChangeCurrentNumberStationInRange() {
        Radio rad = new Radio(40);
        rad.setCurrentNumberStation(5);
        rad.setCurrentNumberStation(6);

        int expected = 6;
        int actual = rad.getCurrentNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NextStationStart39() {
        Radio rad = new Radio(40);
        rad.setCurrentNumberStation(39);
        rad.nextStation();

        int expected = 0;
        int actual = rad.getCurrentNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NextStationStart25() {
        Radio rad = new Radio(40);
        rad.setCurrentNumberStation(25);
        rad.nextStation();

        int expected = 26;
        int actual = rad.getCurrentNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void PrevStationStart0() {
        Radio rad = new Radio(40);
        rad.setCurrentNumberStation(0);
        rad.prevStation();

        int expected = 39;
        int actual = rad.getCurrentNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void PrevStationStart25() {
        Radio rad = new Radio(40);
        rad.setCurrentNumberStation(25);
        rad.prevStation();

        int expected = 24;
        int actual = rad.getCurrentNumberStation();
        Assertions.assertEquals(expected, actual);
    }


}
