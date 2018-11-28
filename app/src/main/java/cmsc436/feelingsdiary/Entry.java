package cmsc436.feelingsdiary;

import java.io.Serializable;

public class Entry implements Serializable {

    private String date;
    private String rating;
    private String entry;

    // for Firebase
    public Entry() {}

    public Entry(String date, String rating, String entry) {
        this.date = date;
        this.rating = rating;
        this.entry = entry;
    }

    // for Firebase
    public String getDate() {
        return date;
    }

    public String getRating() {
        return rating;
    }

    public String getEntry() {
        return entry;
    }
}
