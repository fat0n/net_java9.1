import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void setVolumeUpMax(){
        Radio rad = new Radio();
        rad.setCurrentVolume(11);

        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeInRange(){
        Radio rad = new Radio();
        rad.setCurrentVolume(5);

        int expected = 5;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setChangeVolume(){
        Radio rad = new Radio();
        rad.setCurrentVolume(5);
        rad.setCurrentVolume(6);

        int expected = 6;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MinusVolumeStart0(){
        Radio rad = new Radio();
        rad.DownVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MinusVolumeStart5(){
        Radio rad = new Radio();
        rad.setCurrentVolume(5);
        rad.DownVolume();

        int expected = 4;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeStart10(){
        Radio rad = new Radio();
        rad.setCurrentVolume(10);
        rad.increaseVolume();

        int expected = 10;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeStart5(){
        Radio rad = new Radio();
        rad.setCurrentVolume(5);
        rad.increaseVolume();

        int expected = 6;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentNumberStationUpMax(){
        Radio rad = new Radio();
        rad.setCurrentNumberStation(50);

        int expected = 0;
        int actual = rad.getCurrentNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentNumberStationInRange(){
        Radio rad = new Radio();
        rad.setCurrentNumberStation(5);

        int expected = 5;
        int actual = rad.getCurrentNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ChangeCurrentNumberStationInRange(){
        Radio rad = new Radio();
        rad.setCurrentNumberStation(5);
        rad.setCurrentNumberStation(6);

        int expected = 6;
        int actual = rad.getCurrentNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NextStationStart9(){
        Radio rad = new Radio();
        rad.setCurrentNumberStation(9);
        rad.nextStation();

        int expected = 0;
        int actual = rad.getCurrentNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NextStationStart5(){
        Radio rad = new Radio();
        rad.setCurrentNumberStation(5);
        rad.nextStation();

        int expected = 6;
        int actual = rad.getCurrentNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void PrevStationStart0(){
        Radio rad = new Radio();
        rad.setCurrentNumberStation(0);
        rad.prevStation();

        int expected = 9;
        int actual = rad.getCurrentNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void PrevStationStart5(){
        Radio rad = new Radio();
        rad.setCurrentNumberStation(5);
        rad.prevStation();

        int expected = 4;
        int actual = rad.getCurrentNumberStation();
        Assertions.assertEquals(expected, actual);
    }


}
