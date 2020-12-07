package burger;

public class ChickenLisandid extends Lisandid {

    public ChickenLisandid(String lisand1, String lisand2, String lisand3, String lisand4) {
        this.lisand1 = lisand1;
        this.lisand2 = lisand2;
        this.lisand3 = lisand3;
        this.lisand4 = lisand4;
    }

    public String toString() {
        return "Chicken Burgeri lisandid, iga lisand on 0,5 €:\n" + lisand1 + ", " + lisand2 + ", " + lisand3 + ", " + lisand4;
    }
}
