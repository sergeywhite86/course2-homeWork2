package homework2;

import java.util.Objects;

public abstract class Hogwarts {
    private String name;
    private String surName;
    private int magicPowerPoints;
    private int distanceOfTransgression;

    public abstract void compareToFaculty(Hogwarts student);

    protected abstract <T extends Hogwarts >int sumPoints(T student);

    public void compareToHogwartsStudents(Hogwarts student) {
        int sumPointsFirstStudent = this.distanceOfTransgression + this.magicPowerPoints;
        int sumPointsSecondStudent = student.distanceOfTransgression + student.magicPowerPoints;
        Hogwarts winner = sumPointsFirstStudent > sumPointsSecondStudent ? this : student;
        Hogwarts loser = sumPointsFirstStudent < sumPointsSecondStudent ? this : student;

        System.out.printf("Student Hogwarts %s %s is more power than %s %s %n", winner.getName(),winner.getSurName(),
                loser.getName(),loser.getSurName());
    }

    public Hogwarts(String name, String surName, int magicPowerPoints, int distanceOfTransgression) {
        this.name = name;
        this.surName = surName;
        this.magicPowerPoints = magicPowerPoints;
        this.distanceOfTransgression = distanceOfTransgression;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getMagicPowerPoints() {
        return magicPowerPoints;
    }

    public void setMagicPowerPoints(int magicPowerPoints) {
        this.magicPowerPoints = magicPowerPoints;
    }

    public int getDistanceOfTransgression() {
        return distanceOfTransgression;
    }

    public void setDistanceOfTransgression(int distanceOfTransgression) {
        this.distanceOfTransgression = distanceOfTransgression;
    }

    @Override
    public String toString() {
        return String.format("name-%s surname-%s magicPowerPoints=%d distanceOfTransgression=%d",
                name, surName, magicPowerPoints, distanceOfTransgression);
    }
}
