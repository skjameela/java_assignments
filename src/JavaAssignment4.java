//Assignment on Stream Api
//
//Make a Student class having fields id,name,age,gender,engDepartment,year of enrollment ,perTillDate
//
//        Add following student in list ;
//
//1.new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8)
//2.new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2)
//3 new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3)
//4.new Student(144, "Murali Gowda", 18, "Male", “Electrical”, 2018, 80)
//5.new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70)
//6.new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70)
//7.new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70)
//8.new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80);
//9.new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85);
//10.new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82);
//11.new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83);
//12.new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4);
//13.new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6);
//14.new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8);
//15.new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4);
//16.new Student(266, "Sanvi Pandey", 17, "Female", “Electric”, 2019, 72.4);
//17.new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5);
//
//Use stream api on above list of employees find
//
//1. Print the name of all departments in the college?
//        2.Get the names of all students who have enrolled after 2018?
//        3. Get the details of all male student in the computer sci department?
//        4. How many male and female student are there ? (HINT:use Collectors.groupingBy() for grouping based on gender)
//        5.What is the average age of male and female students?
//        6.Get the details of highest student having highest percentage ?
//        7.Count the number of students in each department? (Hint :use Collectors.groupingBy())
//        8. What is the average percentage achieved in each department?
//        9. Get the details of youngest male student in the Electronic department?(Hint :Use Collectors.minBy)
//        10.How many male and female students are there in the computer science department?
//


import java.util.*;
import java.util.stream.Collectors;

class Student {
    private int id;
    private String name;
    private int age;
    private String gender;
    private String engDepartment;
    private int yearOfEnrollment;
    private double perTillDate;

    public Student(int id, String name, int age, String gender, String engDepartment, int yearOfEnrollment, double perTillDate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.engDepartment = engDepartment;
        this.yearOfEnrollment = yearOfEnrollment;
        this.perTillDate = perTillDate;
    }

    public String getEngDepartment() {
        return engDepartment;
    }

    public int getYearOfEnrollment() {
        return yearOfEnrollment;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public double getPerTillDate() {
        return perTillDate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", engDepartment='" + engDepartment + '\'' +
                ", yearOfEnrollment=" + yearOfEnrollment +
                ", perTillDate=" + perTillDate +
                '}';
    }
}

public class JavaAssignment4 {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8),
                new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2),
                new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3),
                new Student(144, "Murali Gowda", 18, "Male", "Electrical", 2018, 80),
                new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70),
                new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70),
                new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70),
                new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80),
                new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85),
                new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82),
                new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83),
                new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4),
                new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6),
                new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8),
                new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4),
                new Student(266, "Sanvi Pandey", 17, "Female", "Electric", 2019, 72.4),
                new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5)
        );

        // 1. Print the name of all departments in the college
        System.out.println("1. Departments:");
        students.stream()
                .map(Student::getEngDepartment)
                .distinct()
                .forEach(System.out::println);

        // 2. Get the names of all students who have enrolled after 2018
        System.out.println("\n2. Students enrolled after 2018:");
        students.stream()
                .filter(student -> student.getYearOfEnrollment() > 2018)
                .map(Student::getName)
                .forEach(System.out::println);

        // 3. Get the details of all male students in the computer science department
        System.out.println("\n3. Male students in Computer Science department:");
        students.stream()
                .filter(student -> student.getGender().equals("Male"))
                .filter(student -> student.getEngDepartment().equals("Computer Science"))
                .forEach(System.out::println);

        // 4. Count the number of male and female students
        System.out.println("\n4. Count of male and female students:");
        Map<String, Long> genderCount = students.stream()
                .collect(Collectors.groupingBy(Student::getGender, Collectors.counting()));
        System.out.println("Male count: " + genderCount.getOrDefault("Male", 0L));
        System.out.println("Female count: " + genderCount.getOrDefault("Female", 0L));

        // 5. What is the average age of male and female students?
        System.out.println("\n5. Average age of male and female students:");
        Map<String, Double> avgAgeByGender = students.stream()
                .collect(Collectors.groupingBy(Student::getGender, Collectors.averagingInt(Student::getAge)));
        System.out.println("Average age of male students: " + avgAgeByGender.getOrDefault("Male", 0.0));
        System.out.println("Average age of female students: " + avgAgeByGender.getOrDefault("Female", 0.0));

        // 6. Get the details of the student with the highest percentage
        System.out.println("\n6. Details of the student with the highest percentage:");
        Student highestPercentageStudent = students.stream()
                .max(Comparator.comparingDouble(Student::getPerTillDate))
                .orElse(null);
        System.out.println(highestPercentageStudent);

        // 7. Count the number of students in each department
        System.out.println("\n7. Count of students in each department:");
        Map<String, Long> studentCountByDepartment = students.stream()
                .collect(Collectors.groupingBy(Student::getEngDepartment, Collectors.counting()));
        studentCountByDepartment.forEach((department, count) ->
                System.out.println(department + ": " + count));

        // 8. What is the average percentage achieved in each department?
        System.out.println("\n8. Average percentage achieved in each department:");
        Map<String, Double> avgPercentageByDepartment = students.stream()
                .collect(Collectors.groupingBy(Student::getEngDepartment, Collectors.averagingDouble(Student::getPerTillDate)));
        avgPercentageByDepartment.forEach((department, avgPercentage) ->
                System.out.println(department + ": " + avgPercentage));

        // 9. Get the details of the youngest male student in the Electronic department
        System.out.println("\n9. Details of the youngest male student in the Electronic department:");
        Optional<Student> youngestMaleInElectronic = students.stream()
                .filter(student -> student.getGender().equals("Male"))
                .filter(student -> student.getEngDepartment().equals("Electronic"))
                .min(Comparator.comparingInt(Student::getAge));
        youngestMaleInElectronic.ifPresent(System.out::println);

        // 10. Count the number of male and female students in the computer science department
        System.out.println("\n10. Count of male and female students in Computer Science department:");
        Map<String, Long> genderCountInCS = students.stream()
                .filter(student -> student.getEngDepartment().equals("Computer Science"))
                .collect(Collectors.groupingBy(Student::getGender, Collectors.counting()));
        System.out.println("Male count in CS: " + genderCountInCS.getOrDefault("Male", 0L));
        System.out.println("Female count in CS: " + genderCountInCS.getOrDefault("Female", 0L));
    }
}

