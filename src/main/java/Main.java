public class Main {
    public static void main(String[] args) {
        CSVFileWriter.writeCSVFile(GenerateUser.generateUsersArray(), "users.csv");
        CSVFileWriter.writeInSeparateFiles(CSVParser.parse("users.csv"));
    }
}
