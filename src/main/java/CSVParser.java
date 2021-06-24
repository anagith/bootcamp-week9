import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CSVParser {
    public static Map<Character, List<User>> parse(String fileName) {
        try {
            CSVReader reader = new CSVReaderBuilder(new FileReader(fileName))
                    .withSkipLines(1).build();
            return reader.readAll().stream().map(data -> {
                User user = new User();
                user.setName(data[0]);
                user.setSurname(data[1]);
                user.setPhone(data[2]);
                user.setEmail(data[3]);
                user.setAddress(data[4]);
                user.setAge(data[5]);
                return user;
            }).collect(Collectors.groupingBy(data -> data.getSurname().charAt(0)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
