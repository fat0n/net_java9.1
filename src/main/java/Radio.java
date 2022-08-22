public class Radio {

    public int currentNumberStation;
    public int currentVolume;
    public int minNumberStation = 0;
    public int maxNumberStation;

    public Radio() {
        maxNumberStation = 9;
    }

    public Radio(int size) {
        maxNumberStation = minNumberStation + size - 1;
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentNumberStation() {
        return currentNumberStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 100) {
            return;
        }
        if (newCurrentVolume < 0) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setCurrentNumberStation(int newCurrentNumberStation) {
        if (newCurrentNumberStation > maxNumberStation) {
            return;
        }
        if (newCurrentNumberStation < minNumberStation) {
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
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 100;
        }

    }

    public void nextStation() {
        if (currentNumberStation < maxNumberStation) {
            currentNumberStation = currentNumberStation + 1;
        } else {
            currentNumberStation = 0;
        }
    }

    public void prevStation() {
        if (currentNumberStation > minNumberStation) {
            currentNumberStation = currentNumberStation - 1;
        } else {
            currentNumberStation = maxNumberStation;
        }
    }

}
