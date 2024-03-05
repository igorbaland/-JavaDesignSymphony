package CreationalUltimateDesignPatterns.prototype.problem;
//represents box, where we can add the shapes
public class ContextMenu {

    public void duplicate(Component component) {
        /*
        logic for copying/cloning circle
         */
        if (component instanceof  Circle) {
            Circle source = (Circle)component;
            Circle target = new Circle();
            target.setRadius(source.getRadius());
            //Add target to our document
        }
        /*
        Similarly, we need other if blocks or other types of shapes. We need to check if our component is square or a
        a triangle...
         */
    }
}
