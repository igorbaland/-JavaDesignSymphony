package StructuralUltimateDesignPatterns.bridge.problem.controlls;
/*
different types of remote control
    basic remote control(turnOn, turnOff)
    advanced remote control(setChannel)
    movie remote control(play, pause, rewind)
 */
public abstract class RemoteControl {
    /*
        We have a problem here and turnOff()
            At the time of implementing this class, we don't know how to turn a TV on or off, because that will be
            dependent on the type of TV we want talk to. For example, if we want to talk to a Sony TV, we should use
            some software library provided by Sony. This library knows how to talk to the hardware inside a Sony TV.
            Technically, we should declare these methods as abstract and implement them later on.
    */
    public abstract void turnOn();

    public abstract void turnOff();
}
