package org.lasencinas.person;

import org.lasencinas.interfaces.Heatable;

public class Girl implements Heatable {

    /* ---- Behaviours ---- */
    public void speak() {
        System.out.println("The girl says: " + '\n' +
                "   Oh my gosh!");
    }
}
