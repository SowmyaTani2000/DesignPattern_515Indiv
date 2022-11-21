import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


/*
 * Login class to log the user into the system.
 * */
public class Login implements ActionListener{
    ArrayList<String> buyeruname = new ArrayList<String>();
    ArrayList<String> buyerpwd = new ArrayList<String>();
    ArrayList<String> selleruname = new ArrayList<String>();
    ArrayList<String> sellerpwd = new ArrayList<String>();
    Button login;
    TextField username, password;
    Label userNameLabel, passwordLabel, loginLabel;
    Frame loginFrame;
    JRadioButton buyer;
    JRadioButton seller;
    ButtonGroup radioOption;

    String[] userStrings = { "buyer" ,"seller"};

    /*
     * loginUser method to take the user credentials
     * and verify to allow the users to add courses and view them.
     * */

    public void Login() throws IOException {
        File file = new File("src\\BuyerInfo.txt");             // Need to add BuyerInfo.txt
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        while ((st = br.readLine()) != null) {
            String[] buyers = st.split(":");
            buyeruname.add(buyers[0]);
            buyerpwd.add(buyers[1]);
        }
        File file1 = new File("src\\SellerInfo.txt");            // Need to add SellerInfo.txt
        BufferedReader br1 = new BufferedReader(new FileReader(file1));



        while ((st = br1.readLine()) != null) {
            String[] sellers = st.split(":");
            selleruname.add(sellers[0]);
            sellerpwd.add(sellers[1]);
        }


        loginFrame= new Frame("Login Window");

        userNameLabel = new Label("Enter ID :");
        userNameLabel.setBounds(5, 50, 150, 30);
        loginFrame.add(userNameLabel);

        username = new TextField();
        username.setBounds(200, 50, 150, 30);
        loginFrame.add(username);

        password = new TextField();
        password.setBounds(200, 80, 150, 30);
        loginFrame.add(password);

        passwordLabel = new Label("Enter Password :");
        passwordLabel.setBounds(5, 80, 150, 30);
        loginFrame.add(passwordLabel);
        buyer = new JRadioButton("Buyer");
        seller = new JRadioButton("Seller");
        radioOption = new ButtonGroup();
        radioOption.add(buyer);
        radioOption.add(seller);
        loginFrame.add(buyer);
        loginFrame.add(seller);
        loginLabel = new Label("Result :");
        loginLabel.setBounds(90, 140, 150, 30);
        loginFrame.add(loginLabel);

        login = new Button("Login");
        login.setBounds(90, 200, 100, 30);
        loginFrame.add(login);

        login.addActionListener(this);

        loginFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        loginFrame.setLayout(null);
        loginFrame.setSize(500, 400);
        loginFrame.setVisible(true);

    }
    public void actionPerformed(ActionEvent e) {

        int c = 0;

        Scanner input3 = new Scanner(System.in);
        System.out.println("Enter type of user:");		// 0 for buyer and 1 for seller
        int type_of_user = input3.nextInt();
        if(buyer.isSelected()){
            type_of_user=0;
            if (buyeruname.contains(username) & buyerpwd.contains(password))
            {
                System.out.println("Type of User : 0"); // for buyer
                Person buyer = new Buyer(new ProduceProductMenu());

                buyer.showMenu();
                buyer.showAddButton();
                buyer.showViewButton();
            }
            else if(!buyeruname.contains(username) || !buyerpwd.contains(password))
            {
                System.out.println("Error! invalid input");
            }
        }
        if(seller.isSelected()){
            if (selleruname.contains(username) && sellerpwd.contains(password)) {
                System.out.println("Type of user : 1");  // for seller
                Person seller = new Seller(new ProduceProductMenu());
                seller.showMenu();
            }
            else if(!selleruname.contains(username) || !sellerpwd.contains(password)){
                System.out.println("Error! invalid input");
            }
        }


    }


}