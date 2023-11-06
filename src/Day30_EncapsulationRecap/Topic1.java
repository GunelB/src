package Day30_EncapsulationRecap;

import Day30_CollectionFramework.A;

public class Topic1 {
    public static void main(String[] args) {
        A MyAClass = new A();
        MyAClass.PublicField = "Test";
    }
}


class C extends A {
    public void BMethod(){

    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}