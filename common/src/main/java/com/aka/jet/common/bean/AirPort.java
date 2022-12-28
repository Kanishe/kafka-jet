package com.aka.jet.common.bean;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;


@Data
public class AirPort {
    private String name;
    private List<String> boards = new ArrayList<>();
    //coordinate board
    private int x;
    private int y;

    private void addBoard(String boardName) {
        int indexOfBord = boards.indexOf(boardName);
        if (indexOfBord >= 0) {
            boards.set(indexOfBord, boardName);
        } else {
            boards.add(boardName);
        }
    }

    private void removeBoard(String boardName){
        boards.remove(boardName);
    }
}
