package it.fifthExercise;

public class Professor extends CollegePerson implements ITeachingPerson {
    @Override
    public void teachToOtherPeople() {
        System.out.println("I'm teaching");

    }

    public String teachingSubject;

    Professor(String name,String surname,int id,String subject) {
        this.name = name;
        this.surname = surname;
        this.collegeId = id;
        this.teachingSubject = subject;

    }







}
