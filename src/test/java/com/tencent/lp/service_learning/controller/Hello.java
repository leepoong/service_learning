package com.tencent.lp.service_learning.controller;

import com.google.protobuf.InvalidProtocolBufferException;
import org.junit.Test;

public class Hello {
    @Test

    public void run() throws InvalidProtocolBufferException {
        new Hello().run2((a, b) -> a + b);

        new Hello().run2((a, b) -> a + b);

        InterfaceA a = (c, b) -> {
            if (c == 3) {
                return c + b;
            } else {
                return c - b;
            }
        };
    }

    public void run2(InterfaceA a) {
        System.out.println(a.add(3, 6));
    }
}
