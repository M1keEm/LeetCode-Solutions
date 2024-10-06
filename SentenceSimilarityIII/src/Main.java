public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        String sentence1 = "My name is Haley";
        String sentence2 = "My Hale";
        System.out.println(main.areSentencesSimilar(sentence1, sentence2));
    }

    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        String[] words1 = sentence1.split(" ");
        String[] words2 = sentence2.split(" ");
        int start = 0;
        int end1 = words1.length-1;
        int end2 = words2.length-1;
        if(words1.length > words2.length){
            return areSentencesSimilar(sentence2, sentence1);
        }

        while(start < words1.length && words1[start].equals(words2[start])) {
            start++;
        }
        while (end1 >= 0 && words1[end1].equals(words2[end2])) {
            end1--;
            end2--;
        }
        return end1 < start;
    }
}
