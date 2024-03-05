package StructuralUltimateDesignPatterns.proxy.orm.main;

import StructuralUltimateDesignPatterns.proxy.orm.client.DbContext;

public class ObjectRelationalMapperProxyDemo {
    public static void showProxy() {
        var dbContext = new DbContext();
        var product = dbContext.getProduct(1);
        product.setName("Updated Name");
        dbContext.saveChanges();

        product.setName("Another name");
        dbContext.saveChanges();
    }

    public static void show() {
        var dbContext = new DbContext();

        //we read an object (eg a product) from a database.
        var product = dbContext.getProduct(1);

        //modify the properties of the object in memory.
        product.setName("Updated Name");

        //DBContext should keep track of changed objects in memory
        //When we call saveChanges(), it will automatically generate
        //the right SQL statements to update our database
        dbContext.saveChanges();

        //After saving the changes to the database, we can
        //change our in-memory object again and save the changes.
        product.setName("Another name");
        dbContext.saveChanges();
    }
}
