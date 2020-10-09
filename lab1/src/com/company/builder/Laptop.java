package com.company.builder;

public class Laptop {

    private String screen;
    private int ram;
    private String processor;
    private String memoryType;
    private double processorFrequency;
    private int storage;

    public Laptop(String screen, int ram, String processor, String memoryType, double processorFrequency, int storage) {
        this.screen = screen;
        this.ram = ram;
        this.processor = processor;
        this.memoryType = memoryType;
        this.processorFrequency = processorFrequency;
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "screen='" + screen + '\'' +
                ", ram=" + ram +
                ", processor='" + processor + '\'' +
                ", memoryType='" + memoryType + '\'' +
                ", processorFrequency=" + processorFrequency +
                ", storage=" + storage +
                '}';
    }
}
