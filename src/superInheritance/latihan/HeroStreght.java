package superInheritance.latihan;
// this.name akan akses attr name kalau ada di class ini, jika tidak ada maka akan mengakses dari super class

// super.name akan selalu mengakses attr super class nya.

public class HeroStreght extends Hero{
    String name = "class streght";

    void display(){
        System.out.println("class heroStreght name = " + this.name);
        super.dummyMethod();
        System.out.println("====================");
        this.dummyMethod();
    }
    void displaySuper(){
        System.out.println("class heroStreght name = " + super.name);
    }
    void dummyMethod(){
        System.out.println("method ini ada di sub class");
    }
}
