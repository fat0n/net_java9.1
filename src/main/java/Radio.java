public class Radio {

    public int currentNumberStation;
    public int currentVolume;

    public int getCurrentVolume(){
        return currentVolume;
    }

    public int getCurrentNumberStation(){
        return currentNumberStation;
    }

    public void setCurrentVolume(int newCurrentVolume){
        if (newCurrentVolume > 10) {
            return;
        }
        if (newCurrentVolume < 0) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setCurrentNumberStation(int newCurrentNumberStation){
        if (newCurrentNumberStation > 9) {
            return;
        }
        if (newCurrentNumberStation < 0) {
            return;
        }
        currentNumberStation = newCurrentNumberStation;
    }

    public void DownVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = 0;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 10;
        }

    }

    public void nextStation() {
        if (currentNumberStation < 9) {
            currentNumberStation = currentNumberStation +1;
        } else {
            currentNumberStation = 0;
        }
    }

    public void prevStation() {
        if (currentNumberStation > 0) {
            currentNumberStation = currentNumberStation -1;
        } else {
            currentNumberStation = 9;
        }
    }

}
