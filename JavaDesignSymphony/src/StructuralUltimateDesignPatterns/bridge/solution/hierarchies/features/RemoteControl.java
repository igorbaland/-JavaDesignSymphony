package StructuralUltimateDesignPatterns.bridge.solution.hierarchies.features;

import StructuralUltimateDesignPatterns.bridge.solution.hierarchies.implementations.Device;

public class RemoteControl {
    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public void turnOn() {
        device.turnOn();
    }

    public void turnOff() {
       device.turnOff();
    }
}
