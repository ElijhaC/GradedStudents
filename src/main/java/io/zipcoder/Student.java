package io.zipcoder;

public class Student {
    String firstName;
    String lastName;
    int totalExams;
    Double[] testScores;


    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double[] getTestScores() {
        return testScores;
    }
    public int getNumberOfExamsTaken(){
        return totalExams;
    }

    public int getExamScores(){
        return 0;
    }
}
