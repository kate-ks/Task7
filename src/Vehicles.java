import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public enum Vehicles {
    CAR(2000,"AUDI", "black"),BICYCLE (100,"UKR", "white"), PLANE(50000,"BOING","Yellow") ;
    int price;
    String name;
    String color;

     Vehicles(int price, String name, String color) {
        this.price = price;
        this.name = name;
        this.color = color;
    }
    public String getColor(){
        return this.color;
    }

    @Override
    public String toString() {
        return name() + "\nName is: " + name + "\nColor is: " + color + "\nPrice is: " + price;
    }
}
