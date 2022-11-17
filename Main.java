/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teori;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args){
        StrayKids skz = new StrayKids();
        Enhypen enha = new Enhypen();
        
        skz.lokasi();
        skz.kapasitas();
        skz.genre();
        System.out.println();
        enha.lokasi();
        enha.kapasitas();
        enha.genre();
    }
}
