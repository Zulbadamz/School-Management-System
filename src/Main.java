public class Main {
    public static void main(String[] args) {
        // Creating a School
        School school = new School("Springfield High");

        // Creating Departments
        Department scienceDept = new Department("Science");
        Department mathDept = new Department("Mathematics");

        // Adding Departments to School
        school.addDepartment(scienceDept);
        school.addDepartment(mathDept);

        // Creating Teachers
        Teacher t1 = new Teacher("Mr. Smith", "Biology");
        Teacher t2 = new Teacher("Mrs. Jones", "Chemistry");
        Teacher t3 = new Teacher("Mr. White", "Calculus");
        Teacher t4 = new Teacher("Ms. Black", "Algebra");

        // Adding Teachers to Departments
        scienceDept.addTeacher(t1);
        scienceDept.addTeacher(t2);
        mathDept.addTeacher(t3);
        mathDept.addTeacher(t4);

        // Creating Students
        Student s1 = new Student("John Doe", 10);
        Student s2 = new Student("Jane Doe", 12);
        Student s3 = new Student("Jim Beam", 11);
        Student s4 = new Student("Tim Cook", 10);
        Student s5 = new Student("Ann Taylor", 11);
        Student s6 = new Student("Gary Oak", 12);

        // Adding Students to Departments
        scienceDept.addStudent(s1);
        scienceDept.addStudent(s2);
        scienceDept.addStudent(s3);
        mathDept.addStudent(s4);
        mathDept.addStudent(s5);
        mathDept.addStudent(s6);

        // Display School Details
        System.out.println("School: " + school.getName());
        System.out.println("Departments: ");
        
        for (Department dept : school.getDepartments()) {
            System.out.println("\n" + dept.getName() + " Department");
            System.out.println("- Teachers:");
            for (Teacher teacher : dept.getTeachers()) {
                System.out.println("  " + teacher.getName() + " (" + teacher.getSubject() + ")");
            }
            System.out.println("- Students:");
            for (Student student : dept.getStudents()) {
                System.out.println("  " + student.getName() + " (Grade " + student.getGradeLevel() + ")");
            }
        }
    }
}

