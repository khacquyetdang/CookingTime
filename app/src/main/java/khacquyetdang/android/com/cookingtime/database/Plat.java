package khacquyetdang.android.com.cookingtime.database;

/**
 * Created by dang on 17/05/2017.
 */

public class Plat {
    private String name;
    private String description;
    private int timesInMinutes;
    private int img_url;

    public Plat(String name, String description, int img_url) {
        this.name = name;
        this.description = description;
        this.img_url = img_url;
    }

    public Plat(String name, String description, int img_url, int timesInMinutes) {
        this.name = name;
        this.description = description;
        this.img_url = img_url;
        this.timesInMinutes = timesInMinutes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTimesInMinutes() {
        return timesInMinutes;
    }

    public void setTimesInMinutes(int timesInMinutes) {
        this.timesInMinutes = timesInMinutes;
    }

    public int getImg_url() {
        return img_url;
    }

    public void setImg_url(int img_url) {
        this.img_url = img_url;
    }
}
