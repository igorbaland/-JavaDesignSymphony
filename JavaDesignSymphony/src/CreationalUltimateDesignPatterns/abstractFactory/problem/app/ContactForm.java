package CreationalUltimateDesignPatterns.abstractFactory.problem.app;

import CreationalUltimateDesignPatterns.abstractFactory.problem.Theme;
import CreationalUltimateDesignPatterns.abstractFactory.problem.ant.AntButton;
import CreationalUltimateDesignPatterns.abstractFactory.problem.ant.AntTextBox;
import CreationalUltimateDesignPatterns.abstractFactory.problem.material.MaterialButton;
import CreationalUltimateDesignPatterns.abstractFactory.problem.material.MaterialTextBox;

public class ContactForm {
    public void render(Theme theme) {
        //let's imagine we want to allow the users to change theme at the runtime.
        //added  enum Theme

        //in a real situation, we are going to have a form class, which is composite. Instead of rendering these
        // individual widgets, we are going to add them to our form.
        if (theme == Theme.ANT) {
            new AntTextBox().render();
            new AntButton().render();
        } else if (theme == Theme.MATERIAL) {
            new MaterialTextBox().render();
            new MaterialButton().render();
        }
    }
}
