package com.paryshkin.SpringCourseAlishev;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("singleton")
@Scope("prototype")
public class ClassicalMusic implements Music
{

    @Override
    public String getSong()
    {
        return "Classic Music";
    }
}
