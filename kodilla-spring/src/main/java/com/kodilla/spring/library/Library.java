package com.kodilla.spring.library;

import java.util.ArrayList;
import java.util.List;


public final class Library {

    private final List<String> books = new ArrayList<>();
    private LibraryDBController libraryDBController;


    public Library(LibraryDBController libraryDBController) {
        this.libraryDBController = libraryDBController;
    }

    public Library() {
        //do nothing
    }

    public void saveToDB() {
        libraryDBController.saveData();
    }
    public void loadFromDB() {
        libraryDBController.loadData();
    }
}
