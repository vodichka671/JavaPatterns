package com.company;

public class Singleton {
    public static void main(String[] args){
        Connection h1 ;
        for (int i = 0; i <100 ; i++) {
            h1 = Connection.getInstance();
        }
        System.out.println(Connection.counter);
    }
}
class Connection {
    private static Connection instance;
    static public int counter = 0;
    private Connection() {
        counter++;
    }
    public static Connection getInstance(){
        if(instance == null){
            instance = new Connection();
            return instance;
        }
        return instance;
    }
}

