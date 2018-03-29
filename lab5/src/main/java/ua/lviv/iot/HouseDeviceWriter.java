package ua.lviv.iot;

import java.io.*;
import java.util.List;

public class HouseDeviceWriter {

    public void writeToFile(final List<HouseDevice> houseDeviceList) throws IOException {
        File file = new File("D:\\programs\\houseDevicesList.csv");
        if (!file.exists()){
            file.createNewFile();
        }

        try (OutputStream stream = new FileOutputStream(file);
                PrintWriter writer = new PrintWriter(stream); ){



            for (HouseDevice houseDevice:houseDeviceList) {
                writer.println(houseDevice.getHeaders());
                writer.println(houseDevice.toCSV());
                writer.println("");
            }
            writer.close();
        }
        catch (IOException e) {
            throw e;
        }

    }
}
