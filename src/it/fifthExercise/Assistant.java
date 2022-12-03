package it.fifthExercise;

public class Assistant extends CollegePerson implements ITeachingPerson, ILearningPerson{

    @Override
    public void studyAtHome() {

    }

    @Override
    public void teachToOtherPeople() {

    }


    boolean isGoingToBeAPhD;



    Assistant(String name,String surname,int id,boolean willBeAPhD) {
        this.name = name;
        this.surname = surname;
        this.collegeId = id;
        this.isGoingToBeAPhD = willBeAPhD;

    }
}
