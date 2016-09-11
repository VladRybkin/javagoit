package module3_3;

import java.util.Date;


public class Solution {

    public static void main(String[] args) {
        Course[] goitcourse = new Course[0];
        Course vladcourse = new Course (new Date(17082016), "Goit");
        Course olegcourse = new Course ("Oleg", 3, "Andriy");
        Course illaycourse= new Course("Illya", 3, "Andriy");
        Course antoncourse= new Course("Anton", 3, "Andriy");
        Course stepancourse= new Course("Stepan", 3, "Andriy");
        CollegeStudent rybkin= new CollegeStudent("Vlad", "Rybkin", 50);
        CollegeStudent pupkin= new CollegeStudent("pupkin", goitcourse);
        Student vlad = new Student("Vlad", "Rybkin", 4);
        Student vladr = new Student("Vlad", goitcourse);
        Student oleg = new Student("rybkin", goitcourse);
        SpecialStudent vladsp = new SpecialStudent("Vlad", "Rybkin", 4);
        SpecialStudent olegsp = new SpecialStudent("rybkin", goitcourse);
        SpecialStudent vladrybkin = new SpecialStudent("Vlad", "Rybkin", 3, goitcourse, 23, "Goit", 100, 666, 1366613, "my@mail.ru");
                                                     // String firstName, String lastName, int group, Course[] coursesTaken,
                                                        //int age, String collegeName, int rating, long id, long secretKey, String email



    }
}
