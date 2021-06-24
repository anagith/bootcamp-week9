public class Main {
    public static void main(String[] args) {
        CSVFileWriter.writeCSVFile(GenerateUser.generateUsersArray(), "users.csv");
        System.out.println(CSVParser.parse("users.csv"));
    }
}
