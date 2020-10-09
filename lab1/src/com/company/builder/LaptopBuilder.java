package com.company.builder;

public class LaptopBuilder {

    private String screen;
    private int ram;
    private String processor;
    private String memoryType;
    private double processorFrequency;
    private int storage;

    public LaptopBuilder setScreen(String screen) {
        this.screen = screen;
        return this;
    }

    public LaptopBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public LaptopBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public LaptopBuilder setMemoryType(String memoryType) {
        this.memoryType = memoryType;
        return this;
    }

    public LaptopBuilder setProcessorFrequency(double processorFrequency) {
        this.processorFrequency = processorFrequency;
        return this;
    }

    public LaptopBuilder setStorage(int storage) {
        this.storage = storage;
        return this;
    }

    public Laptop getLaptop() {
        return new Laptop(screen, ram, processor, memoryType, processorFrequency, storage);
    }
}
