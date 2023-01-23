package org.hit.model;

import org.springframework.stereotype.Component;

@Component
public class Triangle extends AbstractShape {

    private float area;

    @Override
    public float getArea() {
        area = 0.5f * dimension1 * dimension2;
        return area;
    }
}

