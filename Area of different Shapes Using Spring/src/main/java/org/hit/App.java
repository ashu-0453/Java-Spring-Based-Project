package org.hit;

import org.hit.configuration.SpringConfig;
import org.hit.model.IShape;
import org.hit.service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);


        ShapeService service = context.getBean("shapeService",ShapeService.class);

        service.setDimensions();

        System.out.println("Area of rectangle : "+service.getAreaOfRectangle());
        System.out.println("Area of triangle : "+service.getAreaOfTriangle());


    }
}
