package io.sr7.tutorial.structural.facade;

import io.sr7.tutorial.structural.facade.service.*;

public class TestFacade {
    public static void main(String[] args) {
        FileEntity fileEntity=new FileEntity("1.txt","/tmp/1.txt");
        NoSqlEntity noSqlEntity=new NoSqlEntity("test");
        SqlEntity sqlEntity=new SqlEntity("1","alice","bob");

        PersistenceFacade<BaseEntity> persistenceFacade=new PersistenceFacade<>();
        persistenceFacade.saveFile(fileEntity);
        persistenceFacade.saveNoSql(noSqlEntity);
        persistenceFacade.saveSql(sqlEntity);

        FileService fileService=new FileService();
        //we can not access file service method because they are protected
    }
}
