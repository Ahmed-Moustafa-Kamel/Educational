public class Student extends Person {
    private int id;
    private Subject[] courses;

    public Subject[] getCourses() {
        return courses;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int totalGrade(){
        int totalGrade=0;
        for(int i=0; i< courses.length;i++)
            totalGrade=totalGrade + courses[i].getGrade();
        return totalGrade;
    }
}
