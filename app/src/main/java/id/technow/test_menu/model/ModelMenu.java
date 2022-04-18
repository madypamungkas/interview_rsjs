package id.technow.test_menu.model;

import com.google.gson.annotations.SerializedName;
// model sudah sesuai

public class ModelMenu {
    @SerializedName("name")
    private String name;
    @SerializedName("id")
    private int id;

    public ModelMenu(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }
}
