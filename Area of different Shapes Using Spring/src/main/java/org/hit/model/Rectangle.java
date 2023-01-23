package org.hit.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Rectangle extends AbstractShape{

    public float area;

    @Override
    public float getArea() {
        area = dimension1*dimension2;
        return area;
    }
}
