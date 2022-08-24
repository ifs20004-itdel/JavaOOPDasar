package programmer.zaman.now.application;

import programmer.zaman.now.error.DatabaseError;

public class DatabaseApp {
    public static void main(String[] args) {
        connectDatabase(null,"ahado");
        System.out.println("Sukses");

    }
    public static void connectDatabase(String username, String password){
        if(username == null || password == null){
            throw new DatabaseError("Tidak bisa terkoneksi ke database");
        }
    }
}
