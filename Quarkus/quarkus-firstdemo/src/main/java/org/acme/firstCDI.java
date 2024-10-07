package org.acme;

import jakarta.enterprise.context.RequestScoped;

@RequestScoped
public class firstCDI {
    public String getFirst(){
        return " Hello from CDI";
    }
}
