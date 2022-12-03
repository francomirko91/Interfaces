package it.fifthExercise;

public class Assistant extends CollegePerson implements ITeachingPerson, ILearningPerson{

    @Override
    public void studyAtHome() {
        System.out.println("I'm learning from home");

    }

    @Override
    public void teachToOtherPeople() {
        System.out.println("I teach other people");

    }


    boolean isGoingToBeAPhD;



    Assistant(String name,String surname,int id,boolean willBeAPhD) {
        this.name = name;
        this.surname = surname;
        this.collegeId = id;
        this.isGoingToBeAPhD = willBeAPhD;

    }
}
