public class User {
    public String nama;
    public int no_hp;

    public void setName(String name) {
        this.nama = name;
    }

    public void setno_hp(int no) {
        this.no_hp = no;
    }

    public void daftar() {
        System.out.println();
        System.out.println("Registen Succes");
        System.out.println("Name" + this.nama);
        System.out.println("Phone Number" + this.no_hp);
    }

}
