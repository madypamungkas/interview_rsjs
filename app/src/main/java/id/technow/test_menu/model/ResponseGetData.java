package id.technow.test_menu.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class ResponseGetData {
    // model sudah sesuai

    @SerializedName("menus")
    private ArrayList<ModelMenu> menu;

    public ResponseGetData(ArrayList<ModelMenu> data) {
        this.menu = data;
    }

    public ArrayList<ModelMenu> getData() {
        return menu;
    }

    public void setData(ArrayList<ModelMenu> data) {
        this.menu = data;
    }
}
