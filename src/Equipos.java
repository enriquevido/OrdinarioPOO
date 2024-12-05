import lab_lis_ordinario.*;

import java.util.ArrayList;
import java.util.List;

public class Equipos {
    public static void main(String[] args) {
        List<Computer> computers = new ArrayList<>();

        Desktop desktop1 = new Desktop("2016", "Acer", "Linux", 60.5);
        computers.add(desktop1);
        Laptop laptop1 = new Laptop("2024", "Apple", "MacOs", 2000, 2.2);
        computers.add(laptop1);
        Notebook notebook1 = new Notebook("2022", "Lenovo", "Windows", 1500, 1.4);
        computers.add(notebook1);

        System.out.println("No.\tModelo\tMarca\tSO\t\tTipo");
        for(int i = 0; i < computers.size(); i++){
            System.out.println((i+1) + "\t" + computers.get(i).toString());
        }
    }

}
