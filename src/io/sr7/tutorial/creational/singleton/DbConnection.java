    package io.sr7.tutorial.creational.singleton;

    public class DbConnection {
        private  static  DbConnection dbConnection=null;
        private DbConnection(){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        public static  DbConnection getInstance(){
            if (dbConnection==null){
                synchronized (DbConnection.class){
                    if (dbConnection==null){
                        dbConnection=new DbConnection();
                    }
                }
            }
            return dbConnection;
        }
    }
