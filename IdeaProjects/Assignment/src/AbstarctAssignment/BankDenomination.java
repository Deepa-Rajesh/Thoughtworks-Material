package AbstarctAssignment;

// Java assignment for Abstract class
// class with abstract method
abstract class BankDenomination {
   // Abstract method with signature
    public abstract void denominations();
}
// base class using abstract method and providing body to method
class SbiBank extends BankDenomination {
    public void denominations(){
        System.out.println("Available denomination in SBI: 2000, 500, 200" );
    }
}
// base class using abstract method and providing body to method
class IciciBank extends BankDenomination {
    public void denominations(){
        System.out.println("Available denomination in ICICI: 2000, 1000, 200" );
    }
}
// base class using abstract method and providing body to method
class HdfcBank{
    public void denominations(){
        System.out.println("Available denomination in HDFC: 500, 200, 100" );
    }
}

//main class
