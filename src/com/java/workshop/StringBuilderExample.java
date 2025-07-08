package src.com.java.workshop;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("java");
        sb.append("is");
        sb.append("the").append(" ");
        sb.append("most");
        sb.append(" ").append("used");
        sb.append(" ");
        sb.append("language").append(" ");sb.append("for");
        sb.append(" ").append("enterprise");
        sb.append(" ");
        sb.append("application");
        String result = sb.toString();
    }

}