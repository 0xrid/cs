public class task10 {

    public static void main(String[] args) {
        // Define table data
        String[][] table = {
            {"Sl.", "Identifiers", "Validity", "Reason"},
            {"a", "hungry", "Valid", "follows rules for identifiers"},
            {"b", "2AB", "Invalid", "starts with a digit"},
            {"c", "312.2", "Invalid", "contains a decimal point and starts with a digit"},
            {"d", "MOBILE", "Valid", "follows rules for identifiers"},
            {"e", "“Ans”", "Invalid", "contains double quotes"},
            {"f", "$30", "Invalid", "starts with a dollar sign"},
            {"g", "Yes/No", "Invalid", "contains a slash"},
            {"h", "student-id", "Invalid", "contains a hyphen. Only underscore is allowed."},
            {"i", "A+3", "Invalid", "contains a plus sign"},
            {"j", "‘X’", "Invalid", "contains single quotes"},
            {"k", "return", "Invalid", "reserved keyword in Java"}
        };

        // Print table headers
        for (String[] row : table) {
            System.out.printf("%-5s %-13s %-10s %-50s%n", row[0], row[1], row[2], row[3]);
        }
    }
}
