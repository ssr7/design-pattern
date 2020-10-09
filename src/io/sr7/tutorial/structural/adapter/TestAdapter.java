package io.sr7.tutorial.structural.adapter;

import org.junit.Assert;
import org.junit.Test;

public class TestAdapter {
    @Test
    public void getPersonDto(){
        PersonDto personDto=new PersonDto();
        personDto.setId(1L);
        personDto.setName("firstName");
        personDto.setFamily("secondName");
        personDto.setCode("10");
        PersonDao personDao=new PersonDao();
        PersonDtoAdapter personDtoAdapter = new PersonDtoAdapter(personDto);
        personDao.save(personDtoAdapter);
        Assert.assertEquals(personDtoAdapter.getCode(),10);


        personDto.setCode("wrong number");
        PersonDtoAdapter personDtoAdapter2 = new PersonDtoAdapter(personDto);
        personDao.save(personDtoAdapter);
        Assert.assertEquals(personDtoAdapter2.getCode(),-1);


    }
}
