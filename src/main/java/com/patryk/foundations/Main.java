package com.patryk.foundations;

public class Main {

    public static void main(String[] args) {

        ObjectsComparison ocnull = null;
        // System.out.println("ocnull hashcode = " + ocnull.hashCode()); - throws exception - no object with corresponding resources
        System.out.println("ocnull = " + ocnull);

        ObjectsComparison oc1 = new ObjectsComparison();
        ObjectsComparison oc2 = new ObjectsComparison();

        oc1.setaValue(1);
        oc2.setaValue(1);

        // this won't compare the value of objects but their addresses in the memory
        boolean areNotEmptyObjectsEqual = oc1 == oc2;
        System.out.println("Are objects equal by '=='? -> " + areNotEmptyObjectsEqual + " as \noc1 is " + oc1 + " and \noc2 is " + oc2);

        // comparing the same as above but using 'equals()' method
        boolean areObjectsEqualByEqualsMethod = oc1.equals(oc2);
        System.out.println("Are objects equal by 'equals()'? -> " + areObjectsEqualByEqualsMethod);

        // default implementation of 'equals()' works the same as '==' operator so in order to compare two objects by their content the 'equals()' method should be overriden in your class


        // objects passed on as parameters
        ObjectsAsParameters objectsAsParameters = new ObjectsAsParameters();
        objectsAsParameters.door = 1;

        ObjectsAsParameters objectsAsParameters1 = new ObjectsAsParameters(objectsAsParameters);
        System.out.println("Door :" + objectsAsParameters1.door);


        // overriding constructors
        OverridenConstructor constructor1 = new OverridenConstructor(100);
        OverridenConstructor constructor2 = new OverridenConstructor(99.9);
        OverridenConstructor constructor3 = new OverridenConstructor(200, 88.8);

        System.out.println("Constructor1 :");
        constructor1.displayNumbers();

        System.out.println("Constructor2 :");
        constructor2.displayNumbers();

        System.out.println("Constructor3 :");
        constructor3.displayNumbers();

        // garbage collector
        Finalize finalize = null;
        for (int i = 0; i < 10; i++) {
            finalize = new Finalize();
        }
        System.gc();
        /* finalize() is deprecated and may be soon removed from Java
         * try-with-resources is recommended
         * or the interface AutoCloseable
         */

        try (AutoClose autoClose = new AutoClose()) {
            autoClose.doTask();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Abstract classes
        AbstractClassExtended abstractClassExtended1 = new AbstractClassExtended();
        abstractClassExtended1.helloAbstract();
        AbstractClass.nonAbstractMethodFromAbstractClass();

        Point point = new Point(1, 2);
        Point3D point3D = new Point3D(point, 3);
        System.out.println("Fields: " + point3D.x + ", " + point3D.y + ", " + point3D.z);

        // Below only sub-class's field is initiated so the fields inherited by super() are set to 0 by default
        Point3D point3Dsimple = new Point3D(15);
        System.out.println("Simple invoke - x: " + point3Dsimple.x + ", y: " + point3Dsimple.y + ", z: " + point3Dsimple.z);

        // inheritance of methods - B in A
        B b = new B();
        b.f();

    }
}