package QUESTION_2;

public class StringsMain {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java cusat.q2.Question_2 <range> <name>");
            System.exit(1);
        }

        int num = Integer.parseInt(args[0]);
        String name = args[1];

        Strings a = new Strings();
        a.setData(num, name);
        a.print();
    }
}

