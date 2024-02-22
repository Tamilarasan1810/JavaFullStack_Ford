package Lambda.VotingEligible;

@FunctionalInterface
interface Findable {
    public void isEligible(int[] ages);
}

public class LambdaDemo {
    public static void main(String[] args) {
        Findable finder = (citizens) -> {
            for (int citizen : citizens) {
                if (citizen >= 18) {
                    System.out.println("Citizen with age " + citizen + " is eligible to vote");
                }
                else {
                    System.out.println("Citizen with age "+citizen+" is not eligible to vote");
                }
            }
        };
        int[] ages ={3,22,34,23,4};
        finder.isEligible(ages);
    }
}
