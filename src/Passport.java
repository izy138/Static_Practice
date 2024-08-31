//public class Passport {
//
//    private String passportNo;
//    private String expiry;
//    private Object person;
//
//    public Passport(String passportNo, String expiry, Person person) {
//        this.passportNo = passportNo;
//        this.expiry = expiry;
//        this.person = person;
//    }
//    public String toString() {
//        return "Passport Num: " + passportNo + " " + expiry + " " + person;
//    }
//
//}
//import java.util.Date; // Import the Date class to handle the expiry date of the passport
//// Class representing a Passport
//class Passport {
//    private String passportNumber; // Passport number
//    private Date expiryDate; // Passport expiry date
//    private Person person; // Person associated with the passport
//
//    // Constructor to initialize the passport with passport number and expiry date
//    public Passport(String passportNumber, Date expiryDate, Person person) {
//        this.passportNumber = passportNumber; // Set the passport number
//        this.expiryDate = expiryDate; // Set the expiry date of the passport
//        this.person = person; // Set the person associated with the passport
//    }
//
//    // Getter method for the passport number
//    public String getPassportNumber() {
//        return passportNumber; // Return the passport number
//    }
//
//    // Getter method for the expiry date
//    public Date getExpiryDate() {
//        return expiryDate; // Return the expiry date of the passport
//    }
//
//    // Getter method for the person associated with the passport
//    public Person getPerson() {
//        return person; // Return the person associated with the passport
//    }
//
//    // Setter method for the person associated with the passport
//    public void setPerson(Person person) {
//        this.person = person; // Set the person associated with the passport
//    }
//
//    // Override the toString method to provide a string representation of the passport
//    @Override
//    public String toString() {
//        // Return a string representation of the passport including its number, expiry date, and person details
//        return "Passport{passportNumber='" + passportNumber + "', expiryDate=" + expiryDate +
//                ", person=" + (person != null ? person.getName() : "No person") + "}";
//    }
//}
