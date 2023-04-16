package Entities;

public class Buildobj {

    private String brand;
    private String model;
    private int size;
    private double price;

    public Buildobj(Builder builder){
        this.brand=builder.getbrand();
        this.model=builder.getmodel();
        this.size=builder.getsize();
        this.price=builder.getprice();
    }
    public String getbrand(){
        return brand;
    }
    public String getmodel(){
        return model;
    }
    private void setbrand(String _brand){
        this.brand=_brand;
    }
    private void setmodel(String _model){
        this.model=_model;
    }
    public double getprice(){
        return price;
    }
    private void setprice(double _price){
        this.price=_price;
    }
    public int getsize(){
        return size;
    }
    private void setsize(int _size){
        this.size=_size;
    }

    public String toString(){
        String s = "brand: "+this.brand+" , ";
        s+="model: "+this.model+" , ";
        s+="size: "+this.size+" , ";
        s+="price: "+this.price;
        return s;
    }
    public static class Builder{   //static so that we don't need to create a instance of the main class
        private String brand;
        private String model;
        private int size;
        private double price;
        public String getbrand(){
            return brand;
        }
        public String getmodel(){
            return model;
        }
        public Builder setbrand(String _brand){
            this.brand=_brand;
            return this;
        }
        public Builder setmodel(String _model){
            this.model=_model;
            return this;
        }
        public double getprice(){
            return price;
        }
        public Builder setprice(double _price){
            this.price=_price;
            return this;
        }
        public int getsize(){
            return size;
        }
        public Builder setsize(int _size){
            this.size=_size;
            return this;
        }

        public Buildobj build(){
            return new Buildobj(this);
        }

    }

}
