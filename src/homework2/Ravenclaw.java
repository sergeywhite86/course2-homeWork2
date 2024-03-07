package homework2;

public class Ravenclaw extends Hogwarts{
    private int smartPoints;
    private int wisePoints;
    private int creativityPoints;

    @Override
    public void compareToFaculty(Hogwarts student) {
        String winner = sumPoints(this) > sumPoints(student) ?
                String.format("%s %s ", this.getName(), this.getSurName())
                : String.format("%s %s ", student.getName(), student.getSurName());
        String loser = sumPoints(this) < sumPoints(student) ?
                String.format("%s %s %n", this.getName(), this.getSurName())
                : String.format("%s %s ", student.getName(), student.getSurName());
        System.out.printf("Student Ravenclaw %s is more power than %s %n", winner, loser);
    }

    @Override
    protected <T extends Hogwarts> int sumPoints(T student) {
        Ravenclaw currentStudent = ((Ravenclaw) student);
        return currentStudent.smartPoints+currentStudent.wisePoints+currentStudent.creativityPoints;
    }

    public Ravenclaw(String name, String surName, int magicPowerPoints, int distanceOfTransgression,
                     int smartPoints, int wisePoints, int creativityPoints) {
        super(name, surName, magicPowerPoints, distanceOfTransgression);
        this.smartPoints = smartPoints;
        this.wisePoints = wisePoints;
        this.creativityPoints = creativityPoints;
    }

    public int getSmartPoints() {
        return smartPoints;
    }

    public void setSmartPoints(int smartPoints) {
        this.smartPoints = smartPoints;
    }

    public int getWisePoints() {
        return wisePoints;
    }

    public void setWisePoints(int wisePoints) {
        this.wisePoints = wisePoints;
    }

    public int getCreativityPoints() {
        return creativityPoints;
    }

    public void setCreativityPoints(int creativityPoints) {
        this.creativityPoints = creativityPoints;
    }

    @Override
    public String toString() {
        return String.format("Ravenclaw student: %s smartPoints=%d wisePoints= %d creativityPoints=%d",
                super.toString(),smartPoints,wisePoints,creativityPoints);
    }
}
