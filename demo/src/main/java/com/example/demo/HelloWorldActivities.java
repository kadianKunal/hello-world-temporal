package com.example.demo;

import io.temporal.activity.ActivityInterface;

@ActivityInterface
public interface HelloWorldActivities {

    String composeGreeting(String name);
}
