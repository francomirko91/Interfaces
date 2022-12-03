package it.fifthExercise;

public class Start {

    public static void main(String[] args) {
    Student student = new Student("Marco","Rossi",10,2);
    Professor professor = new Professor("Luca","Verdi",50,"History");
    Assistant assistant = new Assistant("Anna","Bianchi",25,true);

    student.goToCollege();
    professor.goToCollege();
    assistant.goToCollege();

    student.studyAtHome();
    professor.teachToOtherPeople();
    assistant.studyAtHome();
    assistant.teachToOtherPeople();




    }





}
