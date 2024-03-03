package StructuralUltimateDesignPatterns.bridge.solution.hierarchies.features;

import StructuralUltimateDesignPatterns.bridge.solution.hierarchies.implementations.Device;

public class AdvancedRemoteControl extends RemoteControl{
    public AdvancedRemoteControl(Device device) {
        super(device);
    }

    private void setChannel(int number) {
        device.setChannel(number);
    }
}
