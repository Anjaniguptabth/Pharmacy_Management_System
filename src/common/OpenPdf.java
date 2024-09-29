/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import dao.PharmacyUtil;
import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author Jani
 */
public class OpenPdf {

    public static void openById(String id) {
        try {
            if ((new File(PharmacyUtil.billPath + id + ".pdf")).exists()) {
                Process p = Runtime
                        .getRuntime()
                        .exec("rundll32 url.dll,FileProtocolHandler" +PharmacyUtil.billPath + "" + id + ".pdf");
            } else {
                JOptionPane.showMessageDialog(null, "File is not exists.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

}
