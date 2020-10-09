package com.company;

import com.company.builder.Laptop;
import com.company.builder.LaptopBuilder;
import com.company.factorymethod.*;
import com.company.singleton.Singleton;

import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {
        testSingleton();
        testBuilder();
        testFactoryMethod();
    }

    public static void testSingleton() {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);
    }

    public static void testBuilder() {
        LaptopBuilder laptopBuilder = new LaptopBuilder();
        laptopBuilder.setMemoryType("ssd")
                .setProcessor("i5")
                .setProcessorFrequency(2.7)
                .setStorage(1000)
                .setScreen("retina")
                .setRam(32);
        Laptop laptop = laptopBuilder.getLaptop();
        System.out.println(laptop);
    }

    public static void testFactoryMethod() {
        DayFactory dayFactory = new DayFactory();
        LocalTime localTime = LocalTime.now();
        if (localTime.isAfter(LocalTime.of(0,0)) && localTime.isBefore(LocalTime.of(6,0))) {
            dayFactory.displayDayMessage(new Night());
        } else if (localTime.isAfter(LocalTime.of(6,0)) && localTime.isBefore(LocalTime.of(12,0))) {
            dayFactory.displayDayMessage(new Morning());
        } else if (localTime.isAfter(LocalTime.of(12,0)) && localTime.isBefore(LocalTime.of(18,0))) {
            dayFactory.displayDayMessage(new Noon());
        } else {
            dayFactory.displayDayMessage(new Afternoon());
        }
    }
}
