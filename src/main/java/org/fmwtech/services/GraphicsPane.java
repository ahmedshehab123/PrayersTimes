/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fmwtech.services;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 *
 * @author ahmed
 */
public class GraphicsPane extends JPanel {

        public GraphicsPane() {
            setLayout(new GridBagLayout());
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.gridwidth = GridBagConstraints.REMAINDER;
            gbc.fill = GridBagConstraints.HORIZONTAL;

            JButton btn = new JButton("Normal");
            add(btn, gbc);

            btn = new JButton("With border");
            btn.setBorder(new LineBorder(Color.BLACK));
            add(btn, gbc);

            btn = new JButton("borderPainted false");
            btn.setBorderPainted(false);
            btn.setBorder(new LineBorder(Color.BLACK));
            add(btn, gbc);

            btn = new JButton("contentArea false");
            btn.setContentAreaFilled(false);
            btn.setBorder(new LineBorder(Color.BLACK));
            add(btn, gbc);

            btn = new JButton("focusPained false");
            btn.setContentAreaFilled(false);
            btn.setFocusPainted(false);
            btn.setBorder(new LineBorder(Color.BLACK));
            add(btn, gbc);
        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(200, 200);
        }

    }

