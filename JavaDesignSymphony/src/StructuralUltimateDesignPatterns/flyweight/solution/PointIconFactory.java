package StructuralUltimateDesignPatterns.flyweight.solution;

import java.util.HashMap;
import java.util.Map;

public class PointIconFactory {
    private Map<PointType, PointIcon> icons = new HashMap<>();

    /*
    this is how we can implement a cache or a pool of objects to reuse. This factory is purely responsible for creating
    PointIcon object. This is the only place in our application where we are creating a pointIcon object.

    So we rely on this factory to make sure that we don't end up creating the same icon multiple times in memory.
     */
    public PointIcon getPointIcon(PointType type) {
        //cash or pool of objects, that we can reuse.
        // Java -> Map/HashMap, C#/Python -> Dictionary
        //key -> value
        //PointType -> PointIcon
        if(!icons.containsKey(type)) {
            //icon, in a real application, we should call a method for reading that icon from the file
            //hospital.jpg, caf.jpg ...
            var icon = new PointIcon(type, null);
            icons.put(type, icon);
        }

        //at this point we know that we definitely have an icon for the given type. So we just need to return it.
        return icons.get(type);
    }
}
