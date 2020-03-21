import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import javax.swing.*;
import java.awt.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        JFrame frame = new JFrame();

        frame.setTitle("Lab17");
        frame.setSize(new Dimension(600,400));
        frame.setLocationRelativeTo(null);
        frame.setLayout(new GridBagLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GraphicsPanel graphicsPanel =new GraphicsPanel();
//серіалізація

       Gson gson =new Gson();
        String json = gson.toJson(graphicsPanel);

//запис у файл
        FileWriter file = new FileWriter("file1.txt");

        file.write(json);

        file.close();
    //    System.out.println(json);
        //десеріалізація
      //  StringReader reader = new StringReader(json);

     //   ObjectMapper mapper = new ObjectMapper();

       // GraphicsPanel graphicsPanel1 = mapper.readValue(reader, GraphicsPanel.class);


       // System.out.println(graphicsPanel1);

        frame.add(graphicsPanel, new GridBagConstraints(0,0,1,1,1,1, GridBagConstraints.NORTH, GridBagConstraints.BOTH, new Insets(2,2,2,2),0,0));

        frame.setVisible(true);
    }


}