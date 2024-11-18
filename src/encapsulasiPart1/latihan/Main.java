package encapsulasiPart1.latihan;

// Kelas Player merepresentasikan karakter dalam permainan
class Player {
    // Variabel anggota yang bersifat private untuk menjaga enkapsulasi
    private int baseHealth; // Kesehatan dasar pemain
    private String name; // Nama pemain
    private int level; // Level pemain
    private int incrementHeatlh; // Increment kesehatan per level
    private int baseAttack; // Kekuatan serangan dasar
    private Weapon weapon; // Senjata yang digunakan oleh pemain
    private int incrementAttack; // Increment serangan per level
    private Armor armor; // Armor yang digunakan oleh pemain

    // Konstruktor untuk inisialisasi nama pemain dan atribut lainnya
    public Player(String name) {
        this.name = name; // Menetapkan nama pemain
        this.baseHealth = 100; // Kesehatan dasar diatur ke 100
        this.baseAttack = 50; // Kekuatan serangan dasar diatur ke 50
        this.level = 1; // Level awal diatur ke 1
        this.incrementHeatlh = 20; // Increment kesehatan per level
        this.incrementAttack = 20; // Increment serangan per level
    }

    // Metode untuk menetapkan armor yang digunakan oleh pemain
    public void setArmor(Armor armor) {
        this.armor = armor; // Menetapkan armor
    }

    // Metode untuk menghitung kesehatan maksimum pemain
    public int maxHealth() {
        // Kesehatan maksimum = kesehatan dasar + (level * tambahan kesehatan dari armor)
        return this.baseHealth + this.level * this.armor.getAddHealth();
    }

    // Metode untuk meningkatkan level pemain
    public void levelUp() {
        this.level++; // Meningkatkan level pemain
    }

    // Metode untuk menetapkan senjata yang digunakan oleh pemain
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon; // Menetapkan senjata
    }

    // Metode untuk menghitung total serangan pemain
    public int getAttack() {
        // Total serangan = serangan dasar + (level * increment serangan) + serangan dari senjata
        return this.baseAttack + this.level * this.incrementAttack + this.weapon.getAttack();
    }

    // Metode untuk menampilkan informasi pemain
    public void display() {
        System.out.println("Player : " + this.name); // Menampilkan nama pemain
        System.out.println("level : " + this.level); // Menampilkan level pemain
        System.out.println("maxHealth : " + this.maxHealth()); // Menampilkan kesehatan maksimum
        System.out.println("Attack : " + this.getAttack()); // Menampilkan total serangan
    }
}

// Kelas Weapon merepresentasikan senjata
class Weapon {
    private String name; // Nama senjata
    private int attack; // Kekuatan serangan senjata

    // Konstruktor untuk inisialisasi nama dan kekuatan serangan senjata
    public Weapon(String name, int attack) {
        this.name = name; // Menetapkan nama senjata
        this.attack = attack; // Menetapkan kekuatan serangan
    }

    // Metode untuk mendapatkan kekuatan serangan senjata
    public int getAttack() {
        return this.attack; // Mengembalikan kekuatan serangan
    }
}

// Kelas Armor merepresentasikan armor
class Armor {
    private String name; // Nama armor
    private int strenght; // Kekuatan armor (tidak digunakan dalam perhitungan)
    private int addHealth; // Tambahan kesehatan dari armor

    // Konstruktor untuk inisialisasi nama, kekuatan, dan tambahan kesehatan armor
    public Armor(String name, int strenght, int addHealth) {
        this.name = name; // Menetapkan nama armor
        this.strenght = 90; // Kekuatan armor diatur ke 90 (ini tampaknya tidak sesuai dengan parameter)
        this.addHealth = addHealth; // Menetapkan tambahan kesehatan
    }

    // Metode untuk menghitung tambahan kesehatan dari armor
    public int getAddHealth() {
        // Tambahan kesehatan = (kekuatan * 10) + tambahan kesehatan
        return this.strenght * 10 + this.addHealth;
    }
}

// Kelas utama untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        // Membuat objek pemain dengan nama "asep"
        Player s1 = new Player("asep");
        // Membuat objek armor dengan nama "baju", kekuatan 32, dan tambahan kesehatan 23
        Armor armor1 = new Armor("baju", 32, 23);
        // Membuat objek senjata dengan nama "pedang" dan kekuatan serangan 10
        Weapon weapon1 = new Weapon("pedang", 10);

        // Menetapkan armor yang telah dibuat ke pemain
        s1.setArmor(armor1);

        // Menetapkan senjata yang telah dibuat ke pemain
        s1.setWeapon(weapon1);

        // Menampilkan informasi pemain setelah armor dan senjata ditetapkan
        s1.display();

        // Meningkatkan level pemain
        s1.levelUp();

        // Menampilkan garis pemisah untuk kejelasan output
        System.out.println("=========================");

        // Menampilkan informasi pemain setelah level ditingkatkan
        s1.display();
    }
}