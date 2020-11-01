public class Notebook<year> {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price <= 600) {
            System.out.println("This notebook is cheap.");
        } else if ((this.price > 600) && (this.price <= 1000)) {
            System.out.println("The price is good.");
        } else {
            System.out.println("This notebook is expensive.");
        }
    }

    public void checkWeight() {
        if (this.weight <= 600) {
            System.out.println("This notebook is light.");
        } else if ((this.weight > 600) && (this.weight <= 1500)) {
            System.out.println("The notebook have normal weight.");
        } else if (this.weight >= 1600) {
            System.out.println("This notebook is heavy.");
        } else {
            System.out.println("weight unknown");
        }
    }

    public void checkYear() {
        if (this.year <= 2015) {
            System.out.println("This notebook is old.");
        } else if ((this.year > 2015) && (this.year <= 2019)) {
            System.out.println("The notebook is modern.");
        } else {
            System.out.println("This notebook is brand new.");
        }
    }

    public void checkDeal() {
        if ((this.year < 2015) && (this.price > 1500))
        {
            System.out.println("Sale deal is bad, don't buy it.");
        }
        else if ((this.year > 2016) && (this.price < 1500) && (this.price > 1000)) {
            System.out.println("Deal is worth to considerate.");
        }
        else {
            System.out.println("It is a super deal!");
        }
    }
}