package Assignment_Day1.ITSupport;

import java.util.Random;

public class CredentialService extends Employee {
    private String email;
    private String password;

    public CredentialService() {
        super();
    }

    public void generateEmail() {
        this.email = this.getFirstName().toLowerCase() + this.getLastName().toLowerCase() + "@" + this.getDepartment().toLowerCase().trim().replace(" ", "") + "." + this.getCompany().toLowerCase() + ".com";
    }

    public void generatePassword() {
        String capital = "OABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String small = "oabcdefghijklmnopqrstuvwxyz";
        String special = "!!@#$%^&*";
        StringBuilder newpassword = new StringBuilder();
        Random rand = new Random();
        int temp;
        int maxlen = rand.nextInt(5) + 1;
        for (int i = 0; i < maxlen; i++) {
            temp = rand.nextInt(25) + 1;
            newpassword.append(capital.charAt(temp));
        }
        maxlen = rand.nextInt(5) + 1;
        for (int i = 0; i < maxlen; i++) {
            temp = rand.nextInt(25) + 1;
            newpassword.append(small.charAt(temp));
        }
        temp = rand.nextInt(8) + 1;
        newpassword.append(special.charAt(temp));
        maxlen = rand.nextInt(5) + 1;
        for (int i = 0; i < maxlen; i++) {
            temp = rand.nextInt(9) + 1;
            newpassword.append(temp);
        }
        this.password = newpassword.toString();
    }

    public void showCredentials() {
        System.out.println("Employee Name: " + (this.getFirstName() + this.getLastName()) + "\nDepartment: " + this.getDepartment() + "\nEmail: " + this.email + "\nPassword: " + this.password);
    }

}
