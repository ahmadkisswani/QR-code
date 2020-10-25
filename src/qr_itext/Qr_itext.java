/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package qr_itext;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.BarcodeQRCode;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.Buffer;
import javax.imageio.ImageIO;
import javax.imageio.ImageReader;

/**
 *
 * @author User1
 */
public class Qr_itext {
 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws BadElementException, IOException {
  BarcodeQRCode barcodeQRCode = new BarcodeQRCode("https://www.google.com", 1000, 1000, null);
Image codeQrImage = barcodeQRCode.getImage();
codeQrImage.scaleAbsolute(100, 100);
        java.awt.Image image = barcodeQRCode.createAwtImage(Color.black, Color.white);
BufferedImage buffImg = new BufferedImage(image.getWidth(null), image.getWidth(null), BufferedImage.TYPE_4BYTE_ABGR);
buffImg.getGraphics().drawImage(image, 0, 0, null);
buffImg.getGraphics().dispose();
ImageIO.write(buffImg, "png", new File("image\\image.png"));


    }
    
}
