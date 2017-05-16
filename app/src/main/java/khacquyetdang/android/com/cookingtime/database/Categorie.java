package khacquyetdang.android.com.cookingtime.database;

/**
 * Created by dang on 16-May-17.
 */

public class Categorie {
    private String title;
    private String description;
    private int imgUrl;

    public Categorie(String name, String description, int imgUrl) {
        this.title = name;
        this.description = description;
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
}
