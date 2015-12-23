package com.example.raj.newrecyclerview;

/**
 * Created by raj on 23/12/15.
 */
public class DataProvider {
    private int img_res;
    private String name;

    public DataProvider(int img_res,String name){
        this.setImg_res(img_res);
        this.setName(name);


    }

    public int getImg_res() {
        return img_res;
    }

    public void setImg_res(int img_res) {
        this.img_res = img_res;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
