package com.cablemanager.model;

import javax.persistence.*;


@Entity
@Table(name = "cablesYKY")
public class Cable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "voltage")
    private String voltage;

    @Column(name = "nCoresXsection")
    private String nCoresXsection;

    @Column (name = "shape")
    private String shape;

    @Column(name = "outerDiametr")
    private float outerDiametr;

    @Column(name = "mass")
    private int mass;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVoltage() {
        return voltage;
    }

    public void setVoltage(String voltage) {
        this.voltage = voltage;
    }

    public String getnCoresXsection() {
        return nCoresXsection;
    }

    public void setnCoresXsection(String nCoresXsection) {
        this.nCoresXsection = nCoresXsection;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public float getOuterDiametr() {
        return outerDiametr;
    }

    public void setOuterDiametr(float outerDiametr) {
        this.outerDiametr = outerDiametr;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    @Override
    public String toString() {
        return "Cable{" +
                "id=" + id +
                ", voltage='" + voltage + '\'' +
                ", nCoresXsection='" + nCoresXsection + '\'' +
                ", shape='" + shape + '\'' +
                ", outerDiametr=" + outerDiametr +
                ", mass=" + mass +
                '}';
    }
}