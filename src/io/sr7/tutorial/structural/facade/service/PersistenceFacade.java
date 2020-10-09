package io.sr7.tutorial.structural.facade.service;

import java.io.File;

public class PersistenceFacade<T> {
    private FileService fileService;
    private NoSqlService noSqlService;
    private SqlService sqlService;

    public PersistenceFacade() {
        //we can using cache method for create object
        this.fileService = new FileService();
        this.noSqlService = new NoSqlService();
        this.sqlService = new SqlService();
    }

    public void saveFile(T t ){
        FileEntity fileEntity=(FileEntity) t;
        fileService.save( new File(fileEntity.getPath()) );
    }
    public void saveSql(T t){
        sqlService.save(t);
    }
    public void saveNoSql(T t){
        noSqlService.save(t,((NoSqlEntity) t).getName() );
    }

}
