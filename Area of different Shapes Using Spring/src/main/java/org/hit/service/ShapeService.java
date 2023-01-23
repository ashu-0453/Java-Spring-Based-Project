package org.hit.service;

import org.hit.model.IShape;
import org.hit.model.Rectangle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ShapeService {

    private IShape rectangle;

    private IShape triangle;

    public IShape getRectangle() {
        return rectangle;
    }

    @Autowired
    public void setRectangle(IShape rectangle) {
        this.rectangle = rectangle;
    }

    public IShape getTriangle() {
        return triangle;
    }

    @Autowired
    public void setTriangle(IShape triangle) {
        this.triangle = triangle;
    }

    public void setDimensions(){
        rectangle.setDimension1(10);
        rectangle.setDimension2(20);

        triangle.setDimension1(10);
        triangle.setDimension2(20);
    }

    public float getAreaOfRectangle(){
        return rectangle.getArea();
    }

    public float getAreaOfTriangle(){
        return triangle.getArea();
    }

}
