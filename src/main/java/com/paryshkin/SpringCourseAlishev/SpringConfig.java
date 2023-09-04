package com.paryshkin.SpringCourseAlishev;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.paryshkin.SpringCourseAlishev")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig
{

}
