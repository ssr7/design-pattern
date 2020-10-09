package io.sr7.tutorial.structural.adapter;

public class PersonDtoAdapter extends PersonEntity {

    PersonDto personDto;

    public PersonDtoAdapter(PersonDto personDto) {
        this.personDto = personDto;
    }

    @Override
    public Long getId() {
        return personDto.getId();
    }

    @Override
    public String getFullName() {
        return String.format("%s %s", personDto.getName(), personDto.getFamily());
    }

    @Override
    public int getCode() {
        int code;
        try {
            code= Integer.parseInt(personDto.getCode());
        }catch (NumberFormatException e){
            code= -1;
        }
        return  code;
    }
}
