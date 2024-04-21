package com.spring.web.anime.projetospringwebanime.models;

import java.util.List;

public class AnimeModel {
    private boolean success;
    private List<AnimeData> data;

    // Getters and setters
    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public List<AnimeData> getData() {
        return data;
    }

    public void setData(List<AnimeData> data) {
        this.data = data;
    }
}
