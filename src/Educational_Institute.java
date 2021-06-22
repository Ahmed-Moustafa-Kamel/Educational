public class Educational_Institute {
    private String name;
    private Person[] students;
    private Person[] instructors;
    private Person[] admins;

    public String getName() {
        return name;
    }

    public Person[] getStudents() {
        return students;
    }

    public Person[] getInstructors() {
        return instructors;
    }

    public Person[] getAdmins() {
        return admins;
    }

    public void setName(String name) {
        this.name = name;
    }
}
