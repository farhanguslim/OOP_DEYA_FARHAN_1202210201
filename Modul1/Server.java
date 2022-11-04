package MODUL1;

import java.util.Scanner;

public class Server {

 public static void main(String[] args) {
        Database db = new Database();

        Menu menu_1 = new Menu();
        menu_1.setName("Bakso");
        menu_1.setCategory("Makanan");
        menu_1.setPrice(10000);

        Menu menu_2 = new Menu();
        menu_2.setName("Es Teh");
        menu_2.setCategory("Minuman");
        menu_2.setPrice(5000);

        Menu menu_3 = new Menu();
        menu_3.setName("Brownies");
        menu_3.setCategory("Dessert");
        menu_3.setPrice(15000);
