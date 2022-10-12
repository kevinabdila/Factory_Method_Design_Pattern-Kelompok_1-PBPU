/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class WinButton implements Button {
    public void print() {
        System.out.println("Ini Tombol");
        onClick();
    }
    
    public void onClick() {
        System.out.println("Tombol Berhasil Ditekan");
    }
}
