package com.statefarm;

public class CommandLineArgs {
    public static void main(String[] args) {
        if(args.length != 2) {
            System.out.println("You must pass two arguments and they both must be incased in double quotes.");
            System.exit(0);
        }

        String name = String.format("%s", args[0]);
        String email = String.format(" <%s>", args[1]);

        System.out.println(name + email);
    }
}
