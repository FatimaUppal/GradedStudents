package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentTest {
    @Test
    public void testStudentConstructor(){
        ArrayList <Double> examScores = new ArrayList<>(Arrays.asList(58.7,94.5,102.6));
        Student student= new Student("Fatima", "Uppal",examScores);

        Assert.assertEquals("Fatima", student.getFirstName());
        Assert.assertEquals("Uppal", student.getLastName());
        
    }
    @Test
    public void getFirstName() {
        //Given
        Student student = new Student("Fatima", "Uppal", null);

        //Then
        Assert.assertEquals("Fatima", student.getFirstName());

    }

    @Test
    public void setFirstName() {
        //Given
        Student student = new Student("Fatima", "Uppal", null);
        student.setFirstName("Fatima");

        //Then
        Assert.assertEquals("Fatima", student.getFirstName());
    }

    @Test
    public void getLastName() {
        //Given
        Student student = new Student("Fatima", "Uppal", null);

        //Then
        Assert.assertEquals("Uppal", student.getLastName());


    }

    @Test
    public void setLastName() {
        //Given
        Student student = new Student("Fatima", "Uppal", null);
        student.setLastName("Smith");

        //Then
        Assert.assertEquals("Smith", student.getLastName());
    }
    @Test
    public void addExamScore() {
        //Given
        Student student = new Student("Fatima","Uppal", new ArrayList<>());
        student.addExamScore(58.96);

        //Then
        Assert.assertEquals(new ArrayList<>(Arrays.asList(59.0)), student.getExamScore());
    }

    @Test
    public void getAverageScore() {
        //Given
        Student student = new Student("Fatima", "Uppal", new ArrayList<>(Arrays.asList(34.8, 90.4, 99.9)));

        //Then
        Assert.assertEquals(75.03, student.getAverageScore(), 0.2);
    }

}