package com.improve10x.logicalproblems.namegreeting;

public class NameGreetingControllerImpl implements NameGreetingController {
    @Override
    public String strNameGreeting(String name) {
            String greetingName = "Hello " + name + "!";
            return greetingName;
    }
}
