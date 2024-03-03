package StructuralUltimateDesignPatterns.bridge.problem.controlls.sony;

import StructuralUltimateDesignPatterns.bridge.problem.controlls.AdvancedRemoteControl;

public class SonyAdvancedRemoteControl extends AdvancedRemoteControl {
    @Override
    public void setChannel(int number) {
        System.out.println("Sony: setChannel" + number);
    }

    @Override
    public void turnOn() {
        //we could have this class extend our SonyRemoteControl and then we would inherit the implementations of these
        //two methods. Let's not worry about that yet. For now, let's duplicate this code, even thought this is a bad
        //approach, Because we want to get to the meat of the  problem.
        System.out.println("Sony: turnOn");
    }

    @Override
    public void turnOff() {
        System.out.println("Sony: turnOff");
    }
}
