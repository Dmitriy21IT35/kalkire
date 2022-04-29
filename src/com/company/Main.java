package com.company;
interface uses {
    void login();
    void password();
}
interface product {
    void product();
    void price();
    void rating();

}
public class Main {

    public static void main(String[] args) {
        pokypatel nnn = new pokypatel("Toyota Tundra", 5500000, 1, "Кинг", "123");
        nnn.Basket();
        pokypatel nnn1 = new pokypatel("Yamaha YZ250F", 1500000, 3, "Диабло", "123456");
        nnn1.Basket();
        pokypatel nnn2 = new pokypatel("VOYAGER 700 CABIN", 15000000,2, "Фридрих", "12377345456");
        nnn2.Basket();
    }
}

class Car implements product {
    String Toyota_Tundra;
    int name;
    int price;
    int rating;
    Car(String Toyota_Tundra, int price, int rating){
        this.Toyota_Tundra=Toyota_Tundra;
        this.price=price;
        this.rating=rating;
    }
    class Speedboat implements product {
        String VOYAGER_700_CABIN;
        int price;
        int rating;
        Speedboat(String VOYAGER_700_CABIN, int price, int rating){
            this.VOYAGER_700_CABIN=VOYAGER_700_CABIN;
            this.price=price;
            this.rating=rating;
        }
        public void product(){
            System.out.println(VOYAGER_700_CABIN);
        }
        public void price(){
            System.out.println(price);
        }
        public void rating(){
            System.out.println(rating);
        }
    }
    public void product(){
        System.out.println();
    }
    public void price(){
        System.out.println(price);
    }
    public void rating(){
        System.out.println(rating);
    }
}

class Bike implements product {
    String Yamaha_YZ250F;
    int price;
    int rating;
    Bike(String Yamaha_YZ250F, int price, int rating){
        this.Yamaha_YZ250F=Yamaha_YZ250F;
        this.price=price;
        this.rating=rating;
    }
    public void product(){
        System.out.println(Yamaha_YZ250F);
    }
    public void price(){
        System.out.println(price);
    }
    public void rating(){
        System.out.println(rating);
    }
}


class pokypatel implements uses, product {
    String Product;
    int price;
    int rating;
    String logg;
    String pass;


    pokypatel(String Product, int price, int rating, String logg, String pass){
        this.Product=Product;
        this.price=price;
        this.rating=rating;
        this.logg=logg;
        this.pass=pass;
    }

    public void product(){
        System.out.println(Product);
    }
    public void rating(){
        System.out.println(rating);
    }
    public void price(){
        System.out.println(price);
    }

    public void login(){
        System.out.println(logg);
    }
    public void password(){
        System.out.println(pass);
    }
    public void Basket(){
        System.out.println("Пользователь: "+logg + " покупает " + Product+" за "+price+" с рейтингом "+rating);
    }
}