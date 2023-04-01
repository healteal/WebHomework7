package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Iphone implements Phone {
    @Value("${phone.iphoneNumber}")
    String anotherPhone;

    public void incomingCall() {
        System.out.println("incoming call from " + anotherPhone);
    }

    public void outgoingCall() {
        System.out.println("outgoing call to " + anotherPhone);
    }
}
