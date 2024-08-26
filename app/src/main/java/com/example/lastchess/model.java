package com.example.btl_android;

public class model
{
 String name,lass_id,id;
 int image;

    public model() {
    }

    public model(String name, String lass_id, String id, int image) {
        this.name = name;
        this.lass_id = lass_id;
        this.id = id;
       this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLass_id() {
        return lass_id;
    }

    public void setLass_id(String lass_id) {
        this.lass_id = lass_id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
       this.id = id;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
