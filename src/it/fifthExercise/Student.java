package it.fifthExercise;

public class Student extends CollegePerson implements ILearningPerson {

    @Override
    public void studyAtHome() {
        System.out.println("I'm learning");
    }

    public int academicYear;


   Student(String name,String surname,int id,int year){
       this.name = name;
       this.surname = surname;
       this.collegeId = id;
       this.academicYear = year;
   }




}
