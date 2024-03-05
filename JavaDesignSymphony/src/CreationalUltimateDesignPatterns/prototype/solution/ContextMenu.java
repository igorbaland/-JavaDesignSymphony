package CreationalUltimateDesignPatterns.prototype.solution;

public class ContextMenu {
    public void duplicate(Component component) {
        Component newComponent = component.clone();
        //Add target to our document

        /*
        That's means our contextMenu now knows
            nothing about the circle.class
                Ins only talking to the component interface
        If tomorrow we introduce a new kind of component, our contextMenu is not be going to get affected
            open closed principle
                we can extend our application by introducing new classes

         */
    }
}
