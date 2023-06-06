package org.smartphone;

public class Smartphone implements Radio, GPS {
    private String modelName;
    private String brandName;
    private Contact[] contacts;

    private int[] position = {0, 0};

    @Override
    public void startRadio() {
        System.out.println("Radio started");
    }

    @Override
    public void stopRadio() {
        System.out.println("Radio stopped");
    }

    @Override
    public int[] getPosition() {
        return this.position;
    }


}
