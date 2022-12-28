package com.aka.jet.common;


import com.aka.jet.common.bean.AirPort;

import java.util.Arrays;

public class CommonApplication {

    public static void main(String[] args) {
        AirPort airPort = new AirPort();
        airPort.setBoards(Arrays.asList("S","VNU"));
        System.out.print(airPort.getBoards());
        airPort.addBoard("VNU");
        System.err.printf(airPort.toString());
    }

}
