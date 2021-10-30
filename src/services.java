public class services {

    int id;
    String name;
    int price;

    public services(int id, String name, int price) {
    this.id = id;
    this.name = name;
    this.price = price;
    }

    public String toString(){
        return String.format(id + "\t\t" + name + "\t\t$" + price);
    }
}
