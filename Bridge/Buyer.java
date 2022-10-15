import java.io.File;
import java.util.Scanner;

public class Buyer extends  Person {

	private Seller seller;

	public void showMenu() {

	}

	public ProductMenu CreateProductMenu() {
		List myList = new ArrayList();
		File myObj = new File("C:\\Users\\Sowmya\\Downloads\\ProductInfo.txt");
		Scanner myReader = new Scanner(myObj);
		while (myReader.hasNextLine()) {
			String data = myReader.nextLine();
			String[] res = data.split(":");
			if(res[0].equals("Meat")){
				myList.append(res[1]);
			}
		}
	}


}
