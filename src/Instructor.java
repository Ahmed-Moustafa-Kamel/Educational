import java.sql.Date;

public class Instructor extends Person {
    private Date officeHours;
    private Subject[] courses;

    public void setOfficeHours(Date officeHours) {
        this.officeHours = officeHours;
    }

    public Date getOfficeHours() {
        return officeHours;
    }

    public Subject[] getCourses() {
        return courses;
    }
    public void displayInfo(){
        System.out.println(super.name);
        System.out.println(this.getOfficeHours());
        System.out.println(this.courses);
    }
}
