/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tony.goshredding.ui;

import com.tony.goshredding.vo.AdvertisementVO;
import com.tony.goshredding.vo.EventVO;
import java.awt.Component;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author syp386
 */
public class AdvertisementCellRender2 extends javax.swing.JPanel implements TableCellRenderer {

    /**
     * Creates new form AdvertisementCellRender
     */
    public AdvertisementCellRender2() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adNameLabel = new javax.swing.JLabel();
        supplierLabel = new javax.swing.JLabel();
        contentLabel = new javax.swing.JLabel();
        pricePerPersonLabel = new javax.swing.JLabel();
        pictureLabel = new javax.swing.JLabel();

        adNameLabel.setText("jLabel1");

        supplierLabel.setText("jLabel1");

        contentLabel.setText("jLabel1");

        pricePerPersonLabel.setText("jLabel1");

        pictureLabel.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(adNameLabel)
                .addGap(45, 45, 45)
                .addComponent(supplierLabel)
                .addGap(49, 49, 49)
                .addComponent(contentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(pricePerPersonLabel)
                .addGap(46, 46, 46)
                .addComponent(pictureLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(133, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adNameLabel)
                    .addComponent(supplierLabel)
                    .addComponent(contentLabel)
                    .addComponent(pricePerPersonLabel))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pictureLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adNameLabel;
    private javax.swing.JLabel contentLabel;
    private javax.swing.JLabel pictureLabel;
    private javax.swing.JLabel pricePerPersonLabel;
    private javax.swing.JLabel supplierLabel;
    // End of variables declaration//GEN-END:variables

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        AdvertisementVO advertisementObj = (AdvertisementVO) value;
        adNameLabel.setText(advertisementObj.AdvertisementName);
        contentLabel.setText(advertisementObj.Content);
        pricePerPersonLabel.setText(advertisementObj.PricePerPerson);
        supplierLabel.setText(advertisementObj.Supplier);

        if (advertisementObj.ImageName != null && advertisementObj.ImageName.length() > 0) {

            try {
                File directory = new File("");
                String filePath = directory.getCanonicalPath() + "/images/" + advertisementObj.ImageName;
                File targetFile = new File(filePath);
                Image image = new ImageIcon(targetFile.getAbsolutePath()).getImage();
                image = image.getScaledInstance(104, 60, Image.SCALE_SMOOTH);
                pictureLabel.setIcon(new ImageIcon(image));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (isSelected) {
            this.setBackground(new java.awt.Color(218, 227, 243));
        } else {
            this.setBackground(new java.awt.Color(239, 246, 254));
        }
        return this;
    }
}
