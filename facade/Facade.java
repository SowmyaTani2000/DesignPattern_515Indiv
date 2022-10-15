import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Facade {

	private int UserType;

	private Product theSelectedProduct;

	private int nProductCategory;

	private ClassProductList theProductList;

	private Person thePerson;

	public boolean login() {
		return false;
	}

	public void addTrading() {

	}

	public void viewTrading() {


				JFrame f=new JFrame("button");
				JButton b=new JButton("viewButton");
				b.setBounds(50,100,95,30);
				f.add(b);
				f.setSize(400,400);
				f.setLayout(null);
				f.setVisible(true);

	}

	public void decideBidding() {

	}

	public void discussBidding() {

	}

	public void submitBidding() {
		JFrame g=new JFrame("bidding");
		JButton h=new JButton("Submit");
		h.setBounds(50,100,95,30);
		g.add(h);
		g.setSize(400,400);
		g.setLayout(null);
		g.setVisible(true);
	}

	public void remind() {

	}

	public void createUser(UserInfoItem userinfoitem) {

System.out.println("user created...");
	}

	public void createProductList() {
			ArrayList<String> Items = new ArrayList<String>();
			theProductList.Items.add("Beef");
		theProductList.Items.add("Pork");
		theProductList.Items.add("Mutton");
		theProductList.Items.add("Tomato");
		theProductList.Items.add("Onion");
			System.out.println(theProductList.Items);
	}

	public void AttachProductToUser() {

	}

	public Product SelectProduct() throws FileNotFoundException {

		// dialog box to list product
		JFrame f;
		f=new JFrame();

		String products = "";
		File myObj = new File("C:\\Users\\Sowmya\\Downloads\\ProductInfo.txt");
		Scanner myReader = new Scanner(myObj);
		while (myReader.hasNextLine()) {
			String data = myReader.nextLine();
			String[] res = data.split(":");
			products = products + res[1] + "\n";
		}
		JOptionPane.showMessageDialog(f,products);
		return theSelectedProduct;
	}

	public void productOperation() {

	}

}

