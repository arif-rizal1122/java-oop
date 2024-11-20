package hierarkiPackage.latihan;


import hierarkiPackage.latihan.terminal.Console;

class Player{
    private String name;
    Player(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }

    void show(){
        Console.log("mengunakan console log = " + this.name);
    }

}
