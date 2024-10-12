package com.tutorial.ansible;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class DockerAnsibleDemoApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(DockerAnsibleDemoApp.class,args);
        System.out.println( "Hello World!" );
    }
}
