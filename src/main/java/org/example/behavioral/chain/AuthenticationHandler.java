package org.example.behavioral.chain;

public class AuthenticationHandler implements Handler {
    private final AuthorizationHandler authorizationHandler = new AuthorizationHandler();

    @Override
    public void handleRequest() {
        System.out.println("AuthenticationHandler.handleRequest");
        authorizationHandler.handleRequest();
    }
}
