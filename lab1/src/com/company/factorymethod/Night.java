package com.company.factorymethod;

public class Night implements DayTime {

    @Override
    public void getDateTime() {
        System.out.println("ZZZZZZZ");
    }

}
