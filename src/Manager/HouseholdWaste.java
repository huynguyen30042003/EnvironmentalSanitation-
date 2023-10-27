package Manager;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import Common.Library;
import Model.Pay;
import Model.TransferStation;
import Model.Truck;
import Views.Menu;

public class HouseholdWaste extends Menu<String> {
    static String[] options = { "cacl", "exit" };
    ArrayList<TransferStation> dataTS = new ArrayList<>();
    Truck truck = new Truck();
    Pay pay = new Pay();
    double total;
    Library library = new Library();

    public HouseholdWaste() {
        super("  Collecting household waste  ", options);
    }

    @Override
    public void execute(int n) throws FileNotFoundException, IOException {
        switch (n) {
            case 1:
                library.setData(dataTS, "data.txt");
                for (TransferStation TS : dataTS) {
                    if (truck.getWeight() + TS.getWeight() <= truck.getMaxWeight()) {
                        truck.setWeight(truck.getWeight() + TS.getWeight());
                        truck.setTime(truck.getTime() + 8);
                    } else {
                        truck.setWeight(TS.getWeight());
                        truck.setTime(truck.getTime() + 38);
                        pay.setDump(pay.getDump() + 57000);
                    }
                }
                truck.setTime(truck.getTime() + 30);
                pay.setDump(pay.getDump() + 57000);
                total = ((double) truck.getTime() / 60) * 120000 + (double) pay.getDump();
                System.out.println("The total cost is  " + total + " VND");
                break;
            case 2:
                System.exit(0);
                break;
        }
    }

    public static void main(String[] args) throws IOException {
        new HouseholdWaste().run();
    }
}
