package objectTheSuperClass.latihan;




public class Hero extends Object{
    private String name;

    public Hero(String name){
        this.name = name;
    }


    public void display(){
        System.out.println("my name is " + this.name);
    }
}
