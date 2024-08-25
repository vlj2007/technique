package ru.isands.technique.model;

public class CategoryOfHouseholdAppliances {

    private HouseholdAppliances householdAppliances; //Композиция объекта HouseholdAppliances

    protected String category;

    public CategoryOfHouseholdAppliances() {
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public HouseholdAppliances getHouseholdAppliances() {
        return householdAppliances;
    }

    public void setHouseholdAppliances(HouseholdAppliances householdAppliances) {
        this.householdAppliances = householdAppliances;
    }

    @Override
    public String toString() {
        return "CategoryOfHouseholdAppliances{" +
                "householdAppliances=" + householdAppliances +
                ", category='" + category + '\'' +
                '}';
    }

}
