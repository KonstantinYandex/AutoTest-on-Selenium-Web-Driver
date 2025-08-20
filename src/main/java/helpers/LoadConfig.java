package helpers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class LoadConfig {

    Properties props = new Properties();

    public void loadConfig() {
        try (InputStream input = new FileInputStream("src/test/resources/config.properties")) {
            props.load(input);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }

    public String getUrlLogin() {
        return props.getProperty("urlToLogin");
    }

    public String getPassword(){
        return props.getProperty("password");
    }

    public String getLogin(){
        return props.getProperty("username");
    }
}
