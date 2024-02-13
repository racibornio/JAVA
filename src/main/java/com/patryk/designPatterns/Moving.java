package com.patryk.designPatterns;

public interface Moving {

    /** Each class implementing the interface will have to implement each method unless it's the abstract class
     *
     * From Java 8 the interface can contain default method so classes that implement the interface may use them or replace with their own implementation
     *
     * From Java 8 interfaces may contain static methods. They are similar to static methods in classes and cannot be inherited in classes that implement the interface
     *
     * Interfaces may contain constant values that are always public, static and final. They are used as global constant
     *
     * Java doesn't support inheritance from multiple classes however a similar effect may be obtained with interfaces - a class may implement many interfaces so a number of behaviors may be exposed to the class objects
     *
     * Types - interfaces are used to define the general type so it allows for elastic program designing and allows passing on objects of different classes that implement the same interface
     * */

    void run();

    void stop();

}
