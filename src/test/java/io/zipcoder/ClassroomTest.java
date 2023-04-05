package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class ClassroomTest {
    @Test
    public void getStudents() {
        //Given
        Student s0 = new Student("Fatima", "Uppal", new ArrayList<>(Arrays.asList(50.0, 56.9, 90.0)));
        Student s1 = new Student("Jennifer", "Vernon", new ArrayList<>(Arrays.asList(100.0, 76.89, 45.0)));
        Student s2 = new Student("Jacob", "Ciaffi", new ArrayList<>(Arrays.asList(99.0, 88.5, 150.0)));
        Student[] students = {s0, s1, s2};
        Classroom room = new Classroom(students);

        //When
        room.getStudents();
        //Then
        Assert.assertEquals("Fatima Uppal 66\nJennifer Vernon 74\nJacob Ciaffi 113\n", room.getStudents());
    }

    @Test
    public void getClassAverage() {
        //Given
        Student s0 = new Student("Fatima", "Uppal", new ArrayList<>(Arrays.asList(50.0, 56.9, 90.0)));
        Student s1 = new Student("Jennifer", "Vernon", new ArrayList<>(Arrays.asList(100.0, 76.89, 45.0)));
        Student s2 = new Student("Jacob", "Ciaffi", new ArrayList<>(Arrays.asList(99.0, 88.5, 150.0)));

        Student[] students = {s0, s1, s2};
        Classroom room = new Classroom(students);

        //When
        room.getClassAverage();


        //Then
        Assert.assertEquals(84.3333333333333, (double)room.getClassAverage(), .02);
    }

    @Test
    public void addStudent() {
        //Given
        Student s0 = new Student("Fatima", "Uppal", new ArrayList<>(Arrays.asList(50.0, 56.9, 90.0)));
        Student s1 = new Student("Jennifer", "Vernon", new ArrayList<>(Arrays.asList(100.0, 76.89, 45.0)));
        Student s2 = new Student("Jacob", "Ciaffi", new ArrayList<>(Arrays.asList(99.0, 88.5, 150.0)));

        Student[] students = {s0, s1, s2, null};
        Classroom room = new Classroom(students);

        //When
        Student s3 = new Student("Nina", "Mcnair", new ArrayList<>(Arrays.asList(100.0, 140.8, 99.0)));
        room.addStudent(s3);


        //Then
        Assert.assertEquals("Nina", students[3].getFirstName());

    }

    @Test
    public void removeStudent() {
        //Given
        Student s0 = new Student("Fatima", "Uppal", new ArrayList<>(Arrays.asList(50.0, 56.9, 90.0)));
        Student s1 = new Student("Jennifer", "Vernon", new ArrayList<>(Arrays.asList(100.0, 76.89, 45.0)));
        Student s2 = new Student("Jacob", "Ciaffi", new ArrayList<>(Arrays.asList(99.0, 88.5, 150.0)));

        Student[] students = {s0, s1, s2};
        Classroom room = new Classroom(students);

        //Then
        Assert.assertEquals(true, room.removeStudent("Jennifer", "Vernon"));

    }
}
