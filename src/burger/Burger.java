package burger;

import java.util.ArrayList;
import java.util.Scanner;

public class Burger {

    private String nimetus;
    private String lihaTüüp;
    private String saiaTüüp;
    private double hind;
    private ArrayList<String> lisandid = new ArrayList<String>();
    private double lisandiHind = 0.5;
    int lisandiloendur = 0;

    public Burger(String nimetus, String lihaTüüp, String saiaTüüp, double hind) {
        this.nimetus = nimetus;
        this.lihaTüüp = lihaTüüp;
        this.saiaTüüp = saiaTüüp;
        this.hind = hind;
    }

    public Burger(String nimetus, String lihaTüüp, double hind) {
        this.nimetus = nimetus;
        this.lihaTüüp = lihaTüüp;
        this.hind = hind;
        saiaTüüp = "teraleib";
    }

    public void lisaLisandid() {
        Scanner scanner = new Scanner(System.in);

        while(lisandiloendur < 4) {
            System.out.println("Sisesta lisandid. Kui lisandit ei soovi, vajuta ENTER.");
            String lisand = scanner.nextLine();
            if(lisand.equals("")) {
                break;
            }
            else this.lisandid.add(lisand);
            lisandiloendur++;
        }
        System.out.println("Sa lisasid juurde: ");
        for(String lisa : this.lisandid) {
            System.out.print(lisa + " ");
        }
        System.out.println();
        System.out.println("Kokku on lisandeid " + lisandiloendur + ".");
    }

    public double koostaBurger() {
        return this.hind + (lisandiloendur * lisandiHind);
    }

}
