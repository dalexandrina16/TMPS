package com.company.factorymethod;

public class Morning implements DayTime{


    @Override
    public void getDateTime() {
        System.out.println("Hmmm, the sun is about to rise, I think I may have some pancakes.");
    }
}
