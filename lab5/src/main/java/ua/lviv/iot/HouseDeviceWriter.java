package ua.lviv.iot;

import java.io.*;
import java.util.List;

public class HouseDeviceWriter {
    private Writer writer;

    public void writeToFile(final List<HouseDevice> houseDeviceList) {
        try{
            File file = new File("D:\\programs\\houseDevicesList.csv");
            if (!file.exists()){
                file.createNewFile();
            }
            OutputStream stream = new FileOutputStream(file);
            writer = new PrintWriter(stream);
            for (HouseDevice houseDevice:houseDeviceList) {
                writer.write(houseDevice.getHeaders()+"\n\r");
                writer.write(houseDevice.toCSV()+"\n\r");
                writer.write("\n\r");
            }
            writer.close();
        }
        catch (IOException e) {
            e.getStackTrace();
        }
    }
}
