package org.example.behavioral.chain;

public class AuthorizationHandler implements Handler{
    @Override
    public void handleRequest() {
        System.out.println("AuthorizationHandler.handleRequest");
    }
}
