package InputStreamReader.ReadWriteByUser;
import java.io.*;

public class ReadWriteByUserInput {

        public static void main(String[] args) {
            InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            BufferedReader reader = new BufferedReader(inputStreamReader);

            FileWriter fileWriter = null;
            BufferedWriter writer = null;

            try {
                fileWriter = new FileWriter("C:/Users/scc/Desktop/readme.txt", true); // 'true' for append mode
                writer = new BufferedWriter(fileWriter);

                String userInput;

                while (true) {
                    System.out.print("Enter input (type 'exit' to stop): ");
                    userInput = reader.readLine();

                    if ("exit".equalsIgnoreCase(userInput)) {
                        break;
                    }

                    writer.write(userInput);
                    writer.newLine();
                }

                System.out.println("Input has been written to the file.");

            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (reader != null) {
                        reader.close();
                    }
                    if (writer != null) {
                        writer.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


