package CreationalUltimateDesignPatterns.prototype.solution;

public interface Component {
    void render();
    //Component object, because at this point we don't know about any concrete components like circle, square...
    //Every component know how to clone itself and that's why we get a clone object here
    //here, our component is acting as a prototype
    Component clone();
}
