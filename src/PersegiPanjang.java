/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author HP
 */
public class PersegiPanjang {

    private int panjang;
    private int lebar;

    public PersegiPanjang() {
        this.panjang = 0;
        this.lebar = 0;
    }

    public PersegiPanjang(int panjangBaru, int lebarBaru) {
        this.panjang = panjangBaru;
        this.lebar = lebarBaru;
    }

    public int getLuas() {
        return panjang * lebar;
    }

    public int getKeliling() {
        return 2 * (panjang + lebar);
    }

    public void setPanjang(int panjangBaru) {
        this.panjang = panjangBaru;
    }

    public void setLebar(int lebarBaru) {
        this.lebar = lebarBaru;
    }

    public static void main(String[] args) {
        PersegiPanjang p1 = new PersegiPanjang(1, 1);
        PersegiPanjang p2 = new PersegiPanjang(30, 40);
        PersegiPanjang p3 = new PersegiPanjang(25, 35);

        System.out.println("Luas p1: " + p1.getLuas());
        System.out.println("Keliling p1: " + p1.getKeliling());

        System.out.println("Luas p2: " + p2.getLuas());
        System.out.println("Keliling p2: " + p2.getKeliling());

        System.out.println("Luas p3: " + p3.getLuas());
        System.out.println("Keliling p3: " + p3.getKeliling());
    }
}