package org.hit.model;

public abstract class AbstractShape implements IShape{

    protected int dimension1;
    protected int dimension2;

    @Override
    public void setDimension1(int dimension1) {
        this.dimension1 = dimension1;
    }

    @Override
    public int getDimension1() {
        return dimension1;
    }

    @Override
    public void setDimension2(int dimension2) {
        this.dimension2 = dimension2;
    }

    @Override
    public int getDimension2() {
        return dimension2;
    }
}
