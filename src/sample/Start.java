package sample;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageInputStream;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.print.PageFormat;
import java.awt.print.PrinterJob;
import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Start {
    public static void main(String[] args) throws IOException {
        String[] expeditor = new String[8];
        String directoryOfOrganizatons = "C:\\Coding\\Java\\Projects\\Doverennost\\src\\sample\\base";
        // FileReader reader = new FileReader(directoryOfOrganizatons);
        BufferedReader reader = new BufferedReader(new FileReader(directoryOfOrganizatons));
        ArrayList<Expeditor> listexpeditors = new ArrayList<>();
        int count = 0;
        while (reader.ready()) {
            expeditor = reader.readLine().split("\\*");
            listexpeditors.add(new Expeditor(expeditor[0], expeditor[1], expeditor[2], expeditor[3], expeditor[4], expeditor[5], expeditor[6], expeditor[7]));
            //System.out.println(listexpeditors.get(count).getFullName());
            count++;
            /*for (String s : expeditor
            ) {
                System.out.println(s);
            }*/

        }
        printInfo(listexpeditors);
        doimage1();
        System.out.println("Всего экспедиторов:" + count);


    }

    public static void doimage1() throws IOException { //наложение текста на первую картинку *** НУЖНО ПРОПИСАТЬ ОТНОСИТЕЛЬЫНЙ ПУТЬ ***
        final String defaultImage1Dir = "C:\\Coding\\Java\\Projects\\Doverennost\\src\\sample\\img\\defaultimage1.jpg";
        String outImage = "C:\\Coding\\Java\\Projects\\Doverennost\\src\\sample\\img\\image1.jpg";
        BufferedImage read = ImageIO.read(new File("C:\\Coding\\Java\\Projects\\Doverennost\\src\\sample\\img\\defaultimage1.jpg"));
        Graphics g = read.getGraphics();
        /*Font font = Font.getFont(outImage);
        g.setFont(font);*/
        g.setColor(Color.BLACK);
        g.drawString("ТЕСТ ", 7, 55);
      //  g.dispose();
        ImageIO.write(read, "jpg", new File(outImage));


    }


    public static void printInfo(ArrayList<Expeditor> expeditors) {
        for (int i = 0; i < expeditors.size(); i++) {
            //System.out.println(expeditors.get(i).getFullName());
            String z = String.format("%s %s %s %s %s %s %s %s г.",
                    expeditors.get(i).getShortName(),
                    expeditors.get(i).getFullName(),
                    expeditors.get(i).getPassportNumber(),
                    expeditors.get(i).getPassportSerial(),
                    expeditors.get(i).getPassportIssuedBy(),
                    expeditors.get(i).getPassportIssuedDate(),
                    expeditors.get(i).getPassportIssuedMonth(),
                    expeditors.get(i).getPassportIssuedYear());
            System.out.println(z);

        }
    }
    /*public static void goPrinter1() {
        PrinterJob printerJob = new PrinterJob();
        printerJob.setPrintable();
            public int print(Graphics graphics, PageFormat pageformat)
    }*/

}

