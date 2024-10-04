import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);

        int n = skill.length;
        long totalChemistry = 0;

        //Calculate the target sum
        int targetTeamSkill = skill[0] + skill[n - 1];

        //pair players from both ends of the array
        for (int i = 0; i < n / 2; i++) {
            int currentTeamSkill = skill[i] + skill[n - i - 1];

            //If nothing matches the target, return -1
            if (currentTeamSkill != targetTeamSkill) {
                return -1;
            }

            // Calculate and add the chemistry of the current team
            totalChemistry += (long) skill[i] * (long) skill[n - i - 1];
        }

        return totalChemistry;
    }
}