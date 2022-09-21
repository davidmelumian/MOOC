/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
public class Person {
    private String name;
    private Education education;

    public Person(String name, Education education) {
        this.name = name;
        this.education = education;
    }
    public String getName() {
        return name;
    }

    public Education getEducation() {
        return education;
    }

    public String toString() {
        StringBuilder sa = new StringBuilder();
        sa.append(this.getName() + ", " + this.getEducation());
        return String.valueOf(sa);
    }
}
