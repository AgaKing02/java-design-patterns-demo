package org.example.creational.prototype;

import java.util.List;

public class Robot implements Cloneable {
    private int id;
    private List<String> features;
    private Component component;

    public Robot(){}

    public Robot(int id, List<String> features, Component component) {
        this.id = id;
        this.features = features;
        this.component = component;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<String> getFeatures() {
        return features;
    }

    public void setFeatures(List<String> features) {
        this.features = features;
    }

    public Component getComponent() {
        return component;
    }

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public Robot clone() {
        try {
            Robot clone = (Robot) super.clone();
            clone.setId(-1);
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public static class Component {
        private String name;
        private String functionality;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getFunctionality() {
            return functionality;
        }

        public void setFunctionality(String functionality) {
            this.functionality = functionality;
        }
    }

    @Override
    public String toString() {
        return "Robot{" +
                "id=" + id +
                ", features=" + features +
                ", component=" + component +
                '}';
    }
}
