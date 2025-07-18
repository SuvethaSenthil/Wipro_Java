public class LanguageBasic_2 {
    public static void main(String[] args){
        if (args.length != 1) {
            System.exit(1);
        }
        String word = args[0];
        System.out.print("Welcome" + " " + word);
    }
}
