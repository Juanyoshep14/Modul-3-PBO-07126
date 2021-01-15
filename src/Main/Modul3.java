package Main;

import Controller.*;
import Entity.costomerEntity;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Modul3 {
    private static Scanner input = new Scanner(System.in);  
    private static datacostomerController costomer = new datacostomerController();
    private static datagameController games = new datagameController();
    private static int cekdata,loop=-1;
    
    public static void main(String[] args) {
        daftargame();
        int pilih;
        do{
            System.out.println("TOKO Game XACTIV SURABAYA");
            System.out.println("1. Daftar Member XACTIV");
            System.out.println("2. Login Member");
            System.out.println("3. Exit");
            System.out.print("Masukkan Pilihan = ");
            pilih = input.nextInt();
            switch(pilih){
                case 1 :
                    daftarpelanggan();
                    break;
                case 2 :
                    login();
                    break;
            }
        }while(pilih!=3);
    }
    
    private static void daftarpelanggan(){
        try{
        System.out.println("<==Masukan Data Customer ==>");
        System.out.print("Masukan Nama = ");
        String nama = input.next();
        System.out.print("Masukan Password = ");
        String password = input.next();
        System.out.print("Masukan Nomer Identitas : ");
        int nomerid = input.nextInt();
        System.out.print("Masukan Umur : ");
        int umur = input.nextInt();
        System.out.print("Masukan Alamat : ");
        String alamat = input.next();
        System.out.print("Masukan Nomer Telp : ");
        String notelp = input.next();
        System.out.print("Masukan Tanggal Lahir : ");
        String tanggal = input.next();
        System.out.print("Masukan Kota Asal : ");
        String kota = input.next();
        costomer.insert(nomerid,umur,notelp,nama,tanggal,alamat,kota,password);
        }catch(Exception e){
            System.out.println("Format salah gagal daftar");
        }
    }
    
    private static void login(){
        try{
        int pil;
        System.out.print("Masukkan nama          : ");
        String nama = input.next();
        System.out.print("Masukkan password      : ");
        String password = input.next();
        cekdata = costomer.cekdataAkun(nama, password);
        System.out.println("\nSelamat datang "+costomer.getData(cekdata).getNama()+"\n");
        do{
        System.out.println("Menu ");
        System.out.println("1. Beli Game");
        System.out.println("2. Lihat daftar belanja");
        System.out.println("3. Update Data Pribadi");
        System.out.println("4. Check Out Daftar Belanja");
        System.out.println("5. Logout");
        System.out.print("Masukkan Pilihan   : ");
        pil = input.nextInt();
        switch(pil){
            case 1:
                beligame();
                break;
            case 2:
                cetakdaftarbelanja();
                break;
            case 3:
                updatedatapelanggan();
                break;
            case 4:
                hapusdatagame();
                break;
        }
        }while(pil<=4);
        }catch(Exception e){
            System.out.println("Nama atau password salah");
        }
    }
    
    private static void daftargame(){
        String game[] = {"GRAND THEFT AUTO V", "NEED FOR SPEED HEAT", "THE WITCHER 3"};
        String idgame [] = {"1001","2777","6555"};
        String hargagame [] = {"180.000","270.000","650.000"};
        String tglsewa [] = {"02/01/2021","02/01/2021","02/01/2021"};
        for(int i=0;i<game.length;i++){
        games.insert(idgame[i],hargagame[i],game[i],new Date (tglsewa[i]));
        }
    }
    
    private static void beligame(){
        System.out.println("List Catalogue Game : ");
        for(int i=0;i<3;i++){
            System.out.println(i+1);
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println(" Judul Game          : "+games.getData(i).getGame());
            System.out.println(" Judul ID Game       : "+games.getData(i).getIdgame());
            System.out.println(" Harga Game          : RP."+games.getData(i).getHargagame());
            System.out.println(" Tanggal Pembelian   : "+new SimpleDateFormat("dd-MM-yyyy").format(games.getData(i).gettglsewa()));
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }
        System.out.print("Silakan Masukan Nomer Game Yang akan Dibeli : ");
        int idx=input.nextInt();
        loop++;
        games.getData(loop).setIndexakun(cekdata);
        games.getData(loop).setIndex(idx-1);
        System.out.println("Games Dengan Judul "+games.getData(games.getData(loop).getIndex()).getGame()+" berhasil dimasukan daftar belanja");
    }
    
    private static void cetakdaftarbelanja(){
        System.out.println("Game Yang Telah Dibeli :");
        if(loop<0){
            System.out.println("Anda Belum Melakukan Pembelian Game");
        }
        else{
            for(int i=0;i<=loop;i++){
                if(games.getData(i).getIndexakun()==cekdata){
                    System.out.println("No Pembelian : "+(games.getData(i).getIndex()+1));
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println(" Judul Game          : "+games.getData(games.getData(loop).getIndex()).getGame());
                    System.out.println(" Judul ID Game       : "+games.getData(games.getData(loop).getIndex()).getIdgame());
                    System.out.println(" Harga Game          : "+games.getData(games.getData(loop).getIndex()).getHargagame());
                    System.out.println(" Tanggal Pembelian   : "+new SimpleDateFormat("dd-MM-yyyy").format(games.getData(games.getData(loop).getIndex()).gettglsewa()));
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                }
            }
            
        } 
    }
    
    private static void hapusdatagame(){
    if(loop<0){
            System.out.println("Anda Belum Melakukan Pembelian Game");
    }
    else{
        for(int i=0;i<=loop;i++){
                if(games.getData(i).getIndexakun()==cekdata){
                    System.out.println("No Pembelian : "+(games.getData(i).getIndex()+1));
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println(" Judul Game          : "+games.getData(games.getData(loop).getIndex()).getGame());
                    System.out.println(" Judul ID Game       : "+games.getData(games.getData(loop).getIndex()).getIdgame());
                    System.out.println(" Harga Game          : "+games.getData(games.getData(loop).getIndex()).getHargagame());
                    System.out.println(" Tanggal Pembelian   : "+new SimpleDateFormat("dd-MM-yyyy").format(games.getData(games.getData(loop).getIndex()).gettglsewa()));
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                }
            }
        System.out.println("Masukan No Pembelian Game yang akan dihapus = ");
            int nopembelian = input.nextInt();
            System.out.println("\nNama pembeli : "+costomer.getData(cekdata).nama);
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println(" Judul Game          : "+games.getData(nopembelian-1).getGame());
            System.out.println(" Judul ID Game       : "+games.getData(nopembelian-1).getIdgame());
            System.out.println(" Harga Game          : "+games.getData(nopembelian-1).getHargagame());
            System.out.println(" Tanggal Pembelian   : "+new SimpleDateFormat("dd-MM-yyyy").format(games.getData(nopembelian-1).gettglsewa()));
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            games.delete(nopembelian-1);
            loop--;
        }
    }      
    private static void updatedatapelanggan(){
        try{
        System.out.println("1. password");
        System.out.println("2. no telp");
        System.out.print("yang mau diupdate no = ");
        int pilih = input.nextInt();
        switch(pilih){
            case 1:
                System.out.print("Masukkan password baru = ");
                String newpassword = input.next();
                costomer.getData(cekdata).setPassword(newpassword);
                System.out.println("Password berhasil diupdate");
                break;
            case 2:
                System.out.print("Masukkan notelp baru = ");
                String newnotelp = input.next();
                costomer.getData(cekdata).setNotelp(newnotelp);
                System.out.println("No telp berhasil diupdate");
                break;
        }
        }catch(Exception e){
            System.out.println("format salah update gagal");
        }
    }
   
}