public class LanguageBasic_1{
    public static void main(String[] args){
        if (args.length != 2) {
            System.exit(1);
        }
        String word1 = args[0];
        String word2 = args[1];
        System.out.print(word1 + " " + "Technologies" + " " + word2);
    }
}
