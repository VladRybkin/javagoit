package module3_3;

/**
 * Created by Vlad on 01.09.2016.
 */
public class SpecialStudent extends CollegeStudent{
    private long secretKey;
    private String email;

    SpecialStudent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }

     SpecialStudent(String lastName, Course[] coursesTaken) {
        super(lastName, coursesTaken);
    }
    //string email??

     SpecialStudent(String firstName, String lastName, int group, Course[] coursesTaken,
                    int age, String collegeName, int rating, long id, long secretKey, String email) {
        super(firstName, lastName, group, coursesTaken, age, collegeName, rating, id);
        this.secretKey = secretKey;
         this.email = email;


    }

    public long getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(long secretKey) {
        this.secretKey = secretKey;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
