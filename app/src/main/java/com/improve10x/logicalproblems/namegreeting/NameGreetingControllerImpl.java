package com.improve10x.logicalproblems.namegreeting;

public class NameGreetingControllerImpl implements NameGreetingController {
    @Override
    public String strNameGreeting(String name) {
        try {
            String greetingName = "Hello " + name + "!";
            return greetingName;
        } catch (Exception ex) {
            return "";
        }
    }
}
