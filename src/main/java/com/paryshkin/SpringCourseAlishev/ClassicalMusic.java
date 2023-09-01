package com.paryshkin.SpringCourseAlishev;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music
{

    @Override
    public String getSong()
    {
        return "Classic Music";
    }
}
