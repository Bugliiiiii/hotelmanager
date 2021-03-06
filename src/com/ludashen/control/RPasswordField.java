package com.ludashen.control;

import javax.swing.*;
import java.awt.*;

/**
 * @description:密码输入框重写
 * @author: 陆均琪
 * @Data: 2019-12-08 11:18
 */
public class RPasswordField extends JPasswordField {
    public RPasswordField() {
        super();
        setBorder(null);// 取消边框
        setOpaque(false);// 设置控件透明
        setFont(new Font("",1,20));
        setForeground(Color.black);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        int w = getWidth();
        int h = getHeight();
        g2.setColor(new Color(0x3EB4BDFF, true));
        g2.fillRoundRect(0,0,w-1,h-1,20,20);
    }
}
