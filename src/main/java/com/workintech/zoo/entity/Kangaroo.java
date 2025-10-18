package com.workintech.zoo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Kangaroo {
    private long id;
    private String name;
    private double height;
    private double weight;
    private String gender;
    private Boolean isAggressive;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Boolean getIsAggressive() {
        return isAggressive;
    }

    public void setIsAggressive(Boolean aggressive) {
        isAggressive = aggressive;
    }

    @Override
    public String toString() {
        return "Kangaroo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", gender='" + gender + '\'' +
                ", isAggressive=" + isAggressive +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Kangaroo kangaroo = (Kangaroo) o;
        return id == kangaroo.id && Double.compare(height, kangaroo.height) == 0 && Double.compare(weight, kangaroo.weight) == 0 && Objects.equals(name, kangaroo.name) && Objects.equals(gender, kangaroo.gender) && Objects.equals(isAggressive, kangaroo.isAggressive);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, height, weight, gender, isAggressive);
    }
}
