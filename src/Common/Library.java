package Common;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import Model.TransferStation;

public class Library {
    public static int getInt(String promt, int m, int n) {
        int a = -1;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print(promt + ": ");
            try {
                String s = sc.nextLine();
                a = Integer.parseInt(s);
                if (a >= m && a <= n) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Please enter a number between " + m + " and " + n);
            }
        }
        return a;
    }

    public void setData(ArrayList<TransferStation> dataTS, String fileName) throws FileNotFoundException {
        File f = new File(fileName);
        if (f.exists()) {
            Scanner sc = new Scanner(f);
            String senteces = sc.nextLine();
            String[] list = senteces.split(" ");
            for (String string : list) {
                TransferStation transferStation = new TransferStation();
                transferStation.setWeight(Integer.parseInt(string));
                dataTS.add(transferStation);
            }
        }
    }
}
