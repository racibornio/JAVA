package com.patryk.foundations;

public class AutoClose implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("Overriden method close() successfully invoked.");
    }

    public void doTask() {
        System.out.println("Task invoked.");
    }


}
