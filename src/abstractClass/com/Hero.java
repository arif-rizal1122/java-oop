package abstractClass.com;

public abstract class Hero {
    public String name;

    public Hero(String name){
        this.name = name;
    }


    public void display(){
        System.out.println("my name is " + this.name);
    }


}
