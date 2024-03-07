import homework2.utill.HogwartsStudentsFactory;

public class Main {
    public static void main(String[] args) {
        HogwartsStudentsFactory studentsFactory = new HogwartsStudentsFactory();
        System.out.println(studentsFactory.harryPotter);
        System.out.println(studentsFactory.cedricDiggory);
        studentsFactory.harryPotter.compareToHogwartsStudents(studentsFactory.hermioneGranger);
        studentsFactory.cedricDiggory.compareToFaculty(studentsFactory.justinFinchFletchley);
        studentsFactory.grahamMontague.compareToFaculty(studentsFactory.dracoMalfoy);
    }
}