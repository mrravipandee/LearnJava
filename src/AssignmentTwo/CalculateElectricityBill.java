package AssignmentTwo;

public class CalculateElectricityBill {

    public CalculateElectricityBill(int units) {

        double payBill = 0;

        if (units < 100)
        {
            payBill = units * 9;
        }
        else if (units < 200)
        {
            payBill = units * 8.5;
        }
        else if (units < 500)
        {
            payBill = units * 8.3;
        }
        else if (units > 500)
        {
            payBill = units * 8;
        }

        System.out.println("Your bill is: "+payBill);
    }

    public static void main(String[] args) {

        CalculateElectricityBill calculateElectricityBill = new CalculateElectricityBill(80);
        CalculateElectricityBill calculateElectricityBill1 = new CalculateElectricityBill(180);
        CalculateElectricityBill calculateElectricityBill2 = new CalculateElectricityBill(280);
        CalculateElectricityBill calculateElectricityBill3 = new CalculateElectricityBill(380);
        CalculateElectricityBill calculateElectricityBill4 = new CalculateElectricityBill(480);
        CalculateElectricityBill calculateElectricityBill5 = new CalculateElectricityBill(580);

    }
}
