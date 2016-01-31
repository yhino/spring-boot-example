package com.example.welcome;

import org.hibernate.validator.constraints.NotEmpty;

public class Member
{
    @NotEmpty
    private String name;

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
