package AbstarctAssignment;

public class AbstractBankDenominationAssignment {
        public static void main(String[] args) {
            // creating object of class
            SbiBank sb = new SbiBank();
            // calling method
            sb.denominations();
            // creating object of class
            IciciBank ic = new IciciBank();
            // calling method
            ic.denominations();
            // creating object of class
            HdfcBank hd = new HdfcBank();
            // calling method
            hd.denominations();
        }
    }

