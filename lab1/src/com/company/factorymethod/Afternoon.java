package com.company.factorymethod;

public class Afternoon implements DayTime {

    @Override
    public void getDateTime() {
        System.out.println("Maybe I shall prepare my bed and have some Netflix.");
    }

}
