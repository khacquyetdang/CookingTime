package khacquyetdang.android.com.cookingtime.database;

import java.io.Serializable;

/**
 * Created by dang on 17/05/2017.
 */

public class Plat implements Serializable {
    private String name;
    private String shortDescription;

    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

    private String recipe;
    private int timesInMinutes;
    private int img_url;

    public Plat(String name, String shortDescription, int img_url) {
        this.name = name;
        this.shortDescription = shortDescription;
        this.img_url = img_url;
    }

    public Plat(String name, String shortDescription, int img_url, int timesInMinutes) {
        this.name = name;
        this.shortDescription = shortDescription;
        this.img_url = img_url;
        this.timesInMinutes = timesInMinutes;
    }

    public Plat(String name, String shortDescription, String recipe, int img_url, int timesInMinutes) {
        this.name = name;
        this.shortDescription = shortDescription;
        this.img_url = img_url;
        this.timesInMinutes = timesInMinutes;
        this.recipe = recipe;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
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
