package Assignment_Day1.ITSupport;

public class ITSupportApp {
    public static void main(String[] args) {
//        Employee emp1 = new Employee("Tamil","arasan","Developer");

        CredentialService credentials = new CredentialService();
        credentials.generateEmail();
        credentials.generatePassword();
        credentials.showCredentials();
    }
}
