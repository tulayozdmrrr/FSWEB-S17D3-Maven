package com.workintech.zoo.entity;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Koala {
    private Integer id;
    private String name;
    private Double sleepHour;
    private Double weight;
    private String gender;

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Double getSleepHour() {
        return this.sleepHour;
    }

    public Double getWeight() {
        return this.weight;
    }

    public String getGender() {
        return this.gender;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSleepHour(Double sleepHour) {
        this.sleepHour = sleepHour;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Koala)) return false;
        final Koala other = (Koala) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$sleepHour = this.getSleepHour();
        final Object other$sleepHour = other.getSleepHour();
        if (this$sleepHour == null ? other$sleepHour != null : !this$sleepHour.equals(other$sleepHour)) return false;
        final Object this$weight = this.getWeight();
        final Object other$weight = other.getWeight();
        if (this$weight == null ? other$weight != null : !this$weight.equals(other$weight)) return false;
        final Object this$gender = this.getGender();
        final Object other$gender = other.getGender();
        if (this$gender == null ? other$gender != null : !this$gender.equals(other$gender)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Koala;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $sleepHour = this.getSleepHour();
        result = result * PRIME + ($sleepHour == null ? 43 : $sleepHour.hashCode());
        final Object $weight = this.getWeight();
        result = result * PRIME + ($weight == null ? 43 : $weight.hashCode());
        final Object $gender = this.getGender();
        result = result * PRIME + ($gender == null ? 43 : $gender.hashCode());
        return result;
    }

    public String toString() {
        return "Koala(id=" + this.getId() + ", name=" + this.getName() + ", sleepHour=" + this.getSleepHour() + ", weight=" + this.getWeight() + ", gender=" + this.getGender() + ")";
    }
}