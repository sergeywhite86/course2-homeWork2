package homework2;

public class Slytherin extends Hogwarts {
    private int trickPoints;
    private int determinationPoints;
    private int ambitionPoints;
    private int resourcefulnessPoints;
    private int thirstForPowerPoints;

    @Override
    public void compareToFaculty(Hogwarts student) {
        String winner = sumPoints(this) > sumPoints(student) ?
                String.format("%s %s ", this.getName(), this.getSurName())
                : String.format("%s %s ", student.getName(), student.getSurName());
        String loser = sumPoints(this) < sumPoints(student) ?
                String.format("%s %s ", this.getName(), this.getSurName())
                : String.format("%s %s ", student.getName(), student.getSurName());
        System.out.printf("Student Slytherin %s is more power than %s %n", winner, loser);
    }

    @Override
    protected <T extends Hogwarts> int sumPoints(T student) {
        Slytherin currentStudent = ((Slytherin) student);
        return currentStudent.trickPoints + currentStudent.determinationPoints + currentStudent.ambitionPoints +
                currentStudent.resourcefulnessPoints + currentStudent.thirstForPowerPoints;
    }

    public Slytherin(String name, String surName, int magicPowerPoints, int distanceOfTransgression, int trickPoints,
                     int determinationPoints, int ambitionPoints, int resourcefulnessPoints, int thirstForPowerPoints) {
        super(name, surName, magicPowerPoints, distanceOfTransgression);
        this.trickPoints = trickPoints;
        this.determinationPoints = determinationPoints;
        this.ambitionPoints = ambitionPoints;
        this.resourcefulnessPoints = resourcefulnessPoints;
        this.thirstForPowerPoints = thirstForPowerPoints;
    }

    public int getTrickPoints() {
        return trickPoints;
    }

    public void setTrickPoints(int trickPoints) {
        this.trickPoints = trickPoints;
    }

    public int getDeterminationPoints() {
        return determinationPoints;
    }

    public void setDeterminationPoints(int determinationPoints) {
        this.determinationPoints = determinationPoints;
    }

    public int getAmbitionPoints() {
        return ambitionPoints;
    }

    public void setAmbitionPoints(int ambitionPoints) {
        this.ambitionPoints = ambitionPoints;
    }

    public int getResourcefulnessPoints() {
        return resourcefulnessPoints;
    }

    public void setResourcefulnessPoints(int resourcefulnessPoints) {
        this.resourcefulnessPoints = resourcefulnessPoints;
    }

    public int getThirstForPowerPoints() {
        return thirstForPowerPoints;
    }

    public void setThirstForPowerPoints(int thirstForPowerPoints) {
        this.thirstForPowerPoints = thirstForPowerPoints;
    }


    @Override
    public String toString() {
        return String.format("Slytherin student: %s trickPoints=%d determinationPoints= %d ambitionPoints=%d" +
                        "resourcefulnessPoints=%d thirstForPowerPoints=%d",
                super.toString(), trickPoints, determinationPoints, ambitionPoints, resourcefulnessPoints, thirstForPowerPoints);
    }
}
