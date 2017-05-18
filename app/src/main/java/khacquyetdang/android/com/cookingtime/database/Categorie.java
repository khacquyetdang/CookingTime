package khacquyetdang.android.com.cookingtime.database;

import java.util.ArrayList;

/**
 * Created by dang on 16-May-17.
 */

public class Categorie {
    private String title;
    private String shortDescription;
    private String description;
    private int imgUrl;
    private ArrayList<Plat> plats;

    public ArrayList<Plat> getPlats() {
        return plats;
    }

    public void setPlats(ArrayList<Plat> plats) {
        this.plats = plats;
    }

    /**
     * @param name name of the plat
     * @param shortDescription short description of the plat
     * @param imgUrl the image ressource
     */
    public Categorie(String name, String shortDescription, int imgUrl) {
        this.title = name;
        this.shortDescription = shortDescription;
        this.imgUrl = imgUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(int imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }
}
