package homework2;

public class Hufflepuff extends Hogwarts {
    private int diligencePoints;
    private int loyaltyPoints;
    private int honestyPoints;

    @Override
    public void compareToFaculty(Hogwarts student) {
        String winner = sumPoints(this) > sumPoints(student) ?
                String.format("%s %s ", this.getName(), this.getSurName())
                : String.format("%s %s ", student.getName(), student.getSurName());
        String loser = sumPoints(this) < sumPoints(student) ?
                String.format("%s %s ", this.getName(), this.getSurName())
                : String.format("%s %s ", student.getName(), student.getSurName());
        System.out.printf("Student Hufflepuff %s is more power than %s %n", winner, loser);
    }

    @Override
    protected <T extends Hogwarts> int sumPoints(T student) {
        Hufflepuff currentStudent = ((Hufflepuff) student);
        return currentStudent.diligencePoints + currentStudent.loyaltyPoints + currentStudent.honestyPoints;
    }

    public Hufflepuff(String name, String surName, int magicPowerPoints, int distanceOfTransgression,
                      int diligencePoints, int loyaltyPoints, int honestyPoints) {
        super(name, surName, magicPowerPoints, distanceOfTransgression);
        this.diligencePoints = diligencePoints;
        this.loyaltyPoints = loyaltyPoints;
        this.honestyPoints = honestyPoints;
    }

    public int getDiligencePoints() {
        return diligencePoints;
    }

    public void setDiligencePoints(int diligencePoints) {
        this.diligencePoints = diligencePoints;
    }

    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public void setLoyaltyPoints(int loyaltyPoints) {
        this.loyaltyPoints = loyaltyPoints;
    }

    public int getHonestyPoints() {
        return honestyPoints;
    }

    public void setHonestyPoints(int honestyPoints) {
        this.honestyPoints = honestyPoints;
    }


    @Override
    public String toString() {
        return String.format("Hufflepuff student: %s diligencePoints=%d loyaltyPoints= %d honestyPoints=%d",
                super.toString(), diligencePoints, loyaltyPoints, honestyPoints);
    }
}
