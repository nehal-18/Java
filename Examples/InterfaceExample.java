@FunctionalInterface
interface A {
    void display_1();
}

@FunctionalInterface
interface B {
    void display_2();

    default void display_3() {
        System.out.println("Inside display_3");
    }
}

interface C {
    void display_4();

    void display_5();
}

public class InterfaceExample implements A, B, C {
    public static void main(String[] args) {
        InterfaceExample e = new InterfaceExample();
        e.display_1();
        e.display_2();
        e.display_3();
        e.display_4();
        e.display_5();
    }

    @Override
    public void display_4() {
        System.out.println("Unimplemented method 'display_4'");
    }

    @Override
    public void display_5() {
        System.out.println("Unimplemented method 'display_5'");

    }

    @Override
    public void display_2() {
        System.out.println("Unimplemented method 'display_2'");

    }

    @Override
    public void display_1() {
        System.out.println("Unimplemented method 'display_1'");

    }
}