package homework2;

public class Gryffindor extends Hogwarts {

    private int nobilityPoints;
    private int honorPoints;
    private int couragePoints;

    @Override
    public void compareToFaculty(Hogwarts student) {
        String winner = sumPoints(this) > sumPoints(student) ?
                String.format("%s %s %n", this.getName(), this.getSurName())
                : String.format("%s %s %n", student.getName(), student.getSurName());
        String loser = sumPoints(this) < sumPoints(student) ?
                String.format("%s %s %n", this.getName(), this.getSurName())
                : String.format("%s %s %n", student.getName(), student.getSurName());
        System.out.printf("Student Gryffindor %s is more power than %s %n", winner, loser);
    }

    @Override
    protected <T extends Hogwarts> int sumPoints(T student) {
        Gryffindor currentStudent = ((Gryffindor) student);
        return currentStudent.nobilityPoints + currentStudent.honorPoints + currentStudent.couragePoints;
    }

    public Gryffindor(String name, String surName, int magicPowerPoints, int distanceOfTransgression,
                      int nobilityPoints, int honorPoints, int couragePoints) {
        super(name, surName, magicPowerPoints, distanceOfTransgression);
        this.nobilityPoints = nobilityPoints;
        this.honorPoints = honorPoints;
        this.couragePoints = couragePoints;
    }

    public int getNobilityPoints() {
        return nobilityPoints;
    }

    public void setNobilityPoints(int nobilityPoints) {
        this.nobilityPoints = nobilityPoints;
    }

    public int getHonorPoints() {
        return honorPoints;
    }

    public void setHonorPoints(int honorPoints) {
        this.honorPoints = honorPoints;
    }

    public int getCouragePoints() {
        return couragePoints;
    }

    public void setCouragePoints(int couragePoints) {
        this.couragePoints = couragePoints;
    }


    @Override
    public String toString() {
        return String.format("Gryffindor student: %s nobilityPoints=%d honorPoints= %d couragePoints=%d",
                super.toString(), nobilityPoints, honorPoints, couragePoints);
    }
}
