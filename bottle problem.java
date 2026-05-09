class bottle{
    String brand;
    String color;
    int volume;
   
    int currentVolume=0;
    boolean isOpen=false;
    boolean isClosed=true;
    boolean isFull=false;
    boolean isEmpty=true;

    bottle(String brand,String color,int volume){
        this.brand=brand;
        this.color=color;
        this.volume=volume;
    }
   
    public void OpenCap(){
        System.out.println("opening cap");
        this .isOpen= true;
        this .isClosed= false;
    }
    public void closeCap(){
        System.out.println("closing cap");
        this .isClosed= true;
        this .isOpen= false;
    }
    public void drink(int consumed){
        System.out.println("Drinking"+consumed+"ml of water");
        this.currentVolume -= consumed;
        if(this.currentVolume <=0)
            this .isEmpty = true;
        if(this.currentVolume != this.volume)
            this .isFull = false;
     }
    public void fillwater(int volume){
        System.out.println("Filling"+volume+"ml of water");
        this.currentVolume+=volume;
        if(this.currentVolume==this.volume){
            this.isFull=true;
        }
        if(volume>0){
            this.isEmpty=false;
        }
    }
    public void display(){
        System.out.printf("%s,%s,%d,%d,%b,%b,%b,%b",this.brand,this.color,this.volume,this.currentVolume,this.isFull,this.isEmpty,this.isOpen,this.isClosed);
    }
}
class Main {
    public static void main(String[] args){
        bottle Milton=new bottle("Milton","Black",750);
        Milton.display();
        Milton.OpenCap();
        Milton.display();
        Milton.fillwater(100);
        Milton.display();
        Milton.drink(50);
        Milton.fillwater(700);
        Milton.display();
        Milton.drink(750);
        Milton.display();
        Milton.closeCap();
        Milton.display();
}
}
