package StructuralUltimateDesignPatterns.bridge.solution.main;

import StructuralUltimateDesignPatterns.bridge.solution.hierarchies.features.AdvancedRemoteControl;
import StructuralUltimateDesignPatterns.bridge.solution.hierarchies.features.RemoteControl;
import StructuralUltimateDesignPatterns.bridge.solution.hierarchies.implementations.SamsungTV;
import StructuralUltimateDesignPatterns.bridge.solution.hierarchies.implementations.SonyTV;

public class BridgeSolutionDemo {
    public static void show() {
        var remoteControl = new AdvancedRemoteControl(new SamsungTV());
//        var remoteControl = new AdvancedRemoteControl(new SonyTV());
//        var remoteControl = new RemoteControl(new SonyTV());
        remoteControl.turnOn();
    }
}
