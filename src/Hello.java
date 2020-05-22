public class Hello {
    static String parser(String[] args) {
        String name = "";
        for (int i = 0; i < args.length; i++) {
            String arg = args[i];
            if (arg.startsWith("--")) {
                String[] arrArg = arg.split("=", 0);
                if (arrArg.length > 1) {
                    name = arrArg[1];
                }
            }
        }
        return name;
        }

    public static void main (String[]args){
        String name = parser(args);
        System.out.println("Hello " + name);
    }

}

