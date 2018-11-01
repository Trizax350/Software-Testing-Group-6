package iit.uni.miskolc.hu.softwaretesting.model;

import iit.uni.miskolc.hu.softwaretesting.exceptions.InvalidCourseNameException;
import iit.uni.miskolc.hu.softwaretesting.exceptions.InvalidCreditsValueException;
import iit.uni.miskolc.hu.softwaretesting.exceptions.InvalidRecommendedSemesterException;

public class Course {

    private String name;
    private int credits;
    private int recSem;

    public Course(String name, int credits, int recSem) throws InvalidCreditsValueException, InvalidRecommendedSemesterException, InvalidCourseNameException {
        testCourseName(name);
        testCreditValue(credits);
        testRecommendedSemester(recSem);

        this.name = name;
        this.credits = credits;
        this.recSem = recSem;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredits(){
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public int getRecSem(){
        return recSem;
    }

    public void setRecSem(int recSem) {
        this.recSem = recSem;
    }

    /**
     * Credit value must be between 2 and 30.
     */
    private void testCreditValue(int credits) throws InvalidCreditsValueException {
        if (credits < 2 || credits > 30)
            throw new InvalidCreditsValueException("The credits must be between 2 and 30!");
    }

    /**
     * The semester must be minimum 1.
     */
    private void testRecommendedSemester(int recSem) throws InvalidRecommendedSemesterException {
        if (recSem <= 0)
            throw new InvalidRecommendedSemesterException("The recommended semester must be minimum 1!");
    }

    /**
     * The name must contain minimum 1 character
     */
    private void testCourseName(String name) throws InvalidCourseNameException {
        if(name.length() < 1)
            throw new InvalidCourseNameException("The course name can't be empty!");
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", credits=" + credits +
                ", recSem=" + recSem +
                '}';
    }
}
