package latihan2.latihan;

// Kelas Player merepresentasikan karakter dalam permainan
class Player {
    String name; // Nama pemain
    double health; // Kesehatan pemain
    int level; // Level pemain (tidak digunakan dalam kode ini)
    // Anggota objek untuk senjata dan armor
    Weapon weapon; // Senjata yang digunakan oleh pemain
    Armor armor; // Armor yang digunakan oleh pemain

    // Konstruktor untuk inisialisasi nama dan kesehatan pemain
    Player(String name, double health) {
        this.name = name;
        this.health = health;
    }

    // Metode untuk menyerang pemain lain
    void attack(Player opponent) {
        double attackPower = this.weapon.attackPower; // Mengambil kekuatan serangan dari senjata

        // Menampilkan pesan serangan
        System.out.println(this.name + " attacking " + opponent.name + " with power " + attackPower);
        opponent.defence(attackPower); // Memanggil metode defence pada lawan untuk menghitung damage
    }

    // Metode untuk menghitung damage yang diterima
    void defence(double attackPower) {
        double damage; // Variabel untuk menyimpan damage yang diterima
        // Jika kekuatan serangan lebih besar dari pertahanan armor
        if (this.armor.defencePower < attackPower) {
            damage = attackPower - this.armor.defencePower; // Hitung damage yang diterima
        } else {
            damage = 0; // Jika armor cukup untuk menahan serangan, tidak ada damage
        }

        this.health -= damage; // Kurangi kesehatan pemain dengan damage yang diterima
        // Menampilkan pesan tentang damage yang diterima
        System.out.println(this.name + " gets damage " + damage);
    }

    // Metode untuk melengkapi senjata
    void equipWeapon(Weapon weapon) {
        this.weapon = weapon; // Menetapkan senjata yang digunakan oleh pemain
    }

    // Metode untuk melengkapi armor
    void equipArmor(Armor armor) {
        this.armor = armor; // Menetapkan armor yang digunakan oleh pemain
    }

    // Metode untuk menampilkan informasi pemain
    void display() {
        System.out.println("\nName : " + this.name);
        System.out.println("Health : " + this.health + " hp");
        this.weapon.display(); // Menampilkan informasi senjata
        this.armor.display(); // Menampilkan informasi armor
    }
}

// Kelas Weapon merepresentasikan senjata
class Weapon {
    double attackPower; // Kekuatan serangan senjata
    String name; // Nama senjata

    // Konstruktor untuk inisialisasi nama dan kekuatan serangan senjata
    Weapon(String name, double attackPower) {
        this.name = name;
        this.attackPower = attackPower;
    }

    // Metode untuk menampilkan informasi senjata
    void display() {
        System.out.println("Weapon : " + this.name + " , attack : " + this.attackPower);
    }
}

// Kelas Armor merepresentasikan armor
class Armor {
    double defencePower; // Kekuatan pertahanan armor
    String name; // Nama armor

    // Konstruktor untuk inisialisasi nama dan kekuatan pertahanan armor
    Armor(String name, double defencePower) {
        this.name = name;
        this.defencePower = defencePower;
    }

    // Metode untuk menampilkan informasi armor
    void display() {
        System.out.println("Armor : " + this.name + " , defence : " + this.defencePower);
    }
}

// Kelas utama untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        // Membuat objek pemain
        Player player1 = new Player("ucup", 100); // Pemain 1 dengan nama "ucup" dan kesehatan 100
        Player player2 = new Player("otong", 50); // Pemain 2 dengan nama "otong" dan kesehatan 50

        // Membuat objek senjata
        Weapon pedang = new Weapon("pedang", 15); // Senjata "pedang" dengan kekuatan serangan 15
        Weapon ketapel = new Weapon("ketapel", 1); // Senjata "ketapel" dengan kekuatan serangan 1

        // Membuat objek armor
        Armor bajuBesi = new Armor("baju besi", 10); // Armor "baju besi" dengan kekuatan pertahanan 10
        Armor kaos = new Armor("kaos", 0); // Armor "kaos" dengan kekuatan pertahanan 0

        // Melengkapi pemain 1 dengan senjata dan armor
        player1.equipWeapon(pedang); // Pemain 1 melengkapi senjata "pedang"
        player1.equipArmor(bajuBesi); // Pemain 1 melengkapi armor "baju besi"
        player1.display(); // Menampilkan informasi pemain 1

        // Melengkapi pemain 2 dengan senjata dan armor
        player2.equipWeapon(ketapel); // Pemain 2 melengkapi senjata "ketapel"
        player2.equipArmor(kaos); // Pemain 2 melengkapi armor "kaos"
        player2.display(); // Menampilkan informasi pemain 2

        // Memulai pertempuran
        System.out.println("\nPERTEMPURAN");
        System.out.println("\nEpisode - 1\n");
        player1.attack(player2); // Pemain 1 menyerang pemain 2
        player1.display(); // Menampilkan informasi pemain 1 setelah serangan
        player2.display(); // Menampilkan informasi pemain 2 setelah menerima serangan

        System.out.println("\nEpisode - 2\n");
        player2.attack(player1); // Pemain 2 menyerang pemain 1
        player1.display(); // Menampilkan informasi pemain 1 setelah menerima serangan
        player2.display(); // Menampilkan informasi pemain 2 setelah serangan
    }
}