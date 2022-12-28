package com.aka.jet.common.bean;

import java.util.ArrayList;
import java.util.List;

public class Route {
    private String boardName;
    private List<RoutePath> path = new ArrayList<>();

    public boolean notAssigned(){
        return boardName == null;
    }
}
