import javax.swing.*;
import java.io.File;
import java.util.Scanner;

public class MeatProductMenu implements ProductMenu {

	public void showMenu() {

	}

	public void showAddButton() {
		JFrame g=new JFrame("menu");
		JButton h=new JButton("Add Menu");
		h.setBounds(50,100,95,30);
		g.add(h);
		g.setSize(400,400);
		g.setLayout(null);
		g.setVisible(true);
	}

	public void showViewButton() {
		JFrame g=new JFrame("menu");
		JButton h=new JButton("view Menu");
		h.setBounds(50,100,95,30);
		g.add(h);
		g.setSize(400,400);
		g.setLayout(null);
		g.setVisible(true);
	}

	public void showRadioButton() {
		JFrame g=new JFrame("menu");
		JButton h=new JButton("Radio Button");
		h.setBounds(50,100,95,30);
		g.add(h);
		g.setSize(400,400);
		g.setLayout(null);
		g.setVisible(true);
	}

	public void showLabels() {

	}

	public void showComboxes() {

	}

}
