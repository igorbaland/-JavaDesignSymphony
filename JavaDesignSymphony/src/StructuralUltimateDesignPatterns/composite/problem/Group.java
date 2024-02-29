package StructuralUltimateDesignPatterns.composite.problem;

import java.util.ArrayList;
import java.util.List;

public class Group {
    public List<Object> objects = new ArrayList<>();

    public void add(Object object) {
        objects.add(object);
    }

    public void render() {
        /*
        If we have move, resize (methods)
            we have to repeat the same structure. We will have to iterate over all the objects in this group. For each
            object, we would have to see, if we are dealing with a shape... Then we will have to convert it to a
            shape, otherwise we have to convert to the group instance...
        Thi makes ou implementation a little bit complex and quite frankly, ugly.

        The composite pattern allow us to treats these objects the same way. Whatever we are dealing with an individual
        shape or group.
         */
        for (var shape : objects) {
            if ( shape instanceof Shape)
                ((Shape)shape).render();
            else
                ((Group)shape).render();
        }

    }
}
