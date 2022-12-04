public class MainApp {
    public static void main(String[] args) throws Exception {
        Perangkat objPerangkat = new Perangkat("Adata" , 2 , 1.8f);
        objPerangkat.informasi();
        System.out.println();

        System.out.println("=================== Laptop ===================");
        Laptop objLaptop = new Laptop("Seagate", 8 , 2.4f , true);
        objLaptop.informasi();
        objLaptop.bukagame("Dota 2");
        objLaptop.kirimEmail("firstperson@gmail.com");
        objLaptop.kirimEmail("secondperson@gmail.com", "thirdperson@gmail.com");
        System.out.println();

        System.out.println("=================== Handphone ===================");
        Handphone objHandphone = new Handphone("Sandisk", 4 , 2.2f, false);
        objHandphone.informasi();
        objHandphone.telfon(621238123);
        objHandphone.kirimSMS(12345678);
        objHandphone.kirimSMS(12345678, 87654321);

    }
}
