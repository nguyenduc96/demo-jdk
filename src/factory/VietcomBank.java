package factory;

public class VietcomBank implements Bank{
    @Override
    public void getBankName() {
        System.out.println("Vietcom bank");
    }
}
