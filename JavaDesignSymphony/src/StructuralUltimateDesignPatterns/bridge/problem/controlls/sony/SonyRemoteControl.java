package StructuralUltimateDesignPatterns.bridge.problem.controlls.sony;

import StructuralUltimateDesignPatterns.bridge.problem.controlls.RemoteControl;

public class SonyRemoteControl extends RemoteControl {
    @Override
    public void turnOn() {
        System.out.println("Sony: turnOn");
        //in a real world app, this where we are going to use the third party library provided by sony to talk to a
        // Sony TV. Implementation details.
    }

    @Override
    public void turnOff() {
        System.out.println("Sony: TurnOff");
    }
}
