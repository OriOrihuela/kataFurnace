package org.lasencinas.person;

import org.lasencinas.interfaces.Heatable;

public class Girl implements Heatable {

    /* ---- Behaviours ---- */
    @Override
    public void disengage() {

    }

    @Override
    public void engage() {

    }

    public void speak() {
        System.out.println("The girl says: " + '\n' +
                "   Oh my gosh!");
    }
}
