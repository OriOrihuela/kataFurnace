package org.lasencinas.person;

import org.lasencinas.interfaces.Temperable;

public class Man implements Temperable {

    /* ---- Behaviours ---- */
    @Override
    public void read() {

    }

    public void speak() {
        System.out.println("The man says: " + '\n' +
                "   Let's do it!" + '\n');
    }
}
