/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119049.latihan31.perkenalanmahasiswa;

/**
 * Nama  : Nur Sasongko
 * Kelas : PBOIF2
 * NIM   : 10119049
 * Deskripsi Program : program untuk perkenalan mahasiswa
 */

import Mahasiswa.Mahasiswa;

public class PBOIF210119049Latihan31PerkenalanMahasiswa {

    public static void main(String[] args) {
        Mahasiswa mh1 = new Mahasiswa();
        mh1.nim = "10119049";
        mh1.nama = "Nur Sasongko";
        mh1.perkenalkanDiri();
        
        Mahasiswa mh2 = new Mahasiswa();
        mh2.nim = "10110270";
        mh2.nama = "Indra Tiola";
        mh2.perkenalkanDiri();
        
        Mahasiswa mh3 = new Mahasiswa();
        mh3.nim = "10110271";
        mh3.nama = "Robi Tanzil Ganefi";
        mh3.perkenalkanDiri();
        
        Mahasiswa mh4 = new Mahasiswa();
        mh4.nim = "1011069";
        mh4.nama = "Muhammad Nur Awaludin";
        mh4.perkenalkanDiri();
    }  
}
