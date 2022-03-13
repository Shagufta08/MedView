package com.example.medview.models;

public class SliderScreenItem {
    int title;

    public int getTitle() {
        return title;
    }

    public void setTitle(int title) {
        this.title = title;
    }

    public int getDescription() {
        return description;
    }

    public void setDescription(int description) {
        this.description = description;
    }

    public int getScreenImg() {
        return screenImg;
    }

    public void setScreenImg(int screenImg) {
        this.screenImg = screenImg;
    }

    int description;
    int screenImg;

    public SliderScreenItem(int title, int description, int screenImg) {
        this.title = title;
        this.description = description;
        this.screenImg = screenImg;
    }
}
