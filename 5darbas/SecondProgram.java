class SecondProgram {
    public static void main(String[] args) {
        StringBuilder hello = new StringBuilder();

        hello.append("Hello");
        hello.append(" ");
        hello.append(args[0]);

        System.out.println(hello.toString());
    }
}