package locked_me_package;
import java.io.File;
import java.io.IOException;
import java.util.Scanner; 
public class LockedMeMain {
	public static void main(String[] args) {
		String dirname = "/tmp/user/java/bin";
		File d = new File(dirname);
		d.mkdir(); 
		Scanner sc = new Scanner(System.in);
		int mainOption = 0; 
		System.out.println("Welcome to LockedMe");
		System.out.println("Developed By Shane Messmer");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		System.out.println("========================"); 
		while (mainOption != 3) {
		System.out.println("Main Menu:"); 
		System.out.println("Input the number of the action you would like to take..."); 
		System.out.println("========================");
		System.out.println("1. Show all files in the directory.");
		System.out.println("2. Show file options"); 
		System.out.println("3. Quit the application"); 
		System.out.println("========================");
		
		boolean inputInvalid = true;
		do {
		try {
		mainOption = sc.nextInt();
		inputInvalid = false; 
		} catch (Exception e) {
			System.out.println("Wrong entry type, please try again");
			
			sc.next(); 
			
		}
		}while(inputInvalid);
		if (mainOption == 2) {
			int fileMenuOption = 0; 
			while (fileMenuOption != 4) {
			System.out.println("========================");
			System.out.println("File Menu");
			System.out.println("Input the number of the action you would like to take...");
			System.out.println("========================");
			System.out.println("1. Add File");
			System.out.println("2. Delete File");
			System.out.println("3. Search For File"); 
			System.out.println("4. Main Menu");
			System.out.println("========================");
			boolean inputInvalid1 = true; 
			do {
			try {
			fileMenuOption = sc.nextInt();
			inputInvalid1 = false; 
			}catch(Exception e) {
				System.out.println("Wrong entry type, please try again");
				sc.next();
			}
			}while(inputInvalid1);
			if (fileMenuOption == 4) {
				System.out.println("Returning to Main Menu");
				break; 
			} else if (fileMenuOption == 1) {
				System.out.println("What would you like to name the file?"); 
				
		    	 String fileName = sc.next(); 
		    	 File newFile = new File(dirname + "/"+ fileName); 
		    	 try {
					newFile.createNewFile();
					System.out.println("The file "+fileName+ " has been created!");
		    	 } catch (IOException e) {
					e.printStackTrace();
				} 
				
			} else if ( fileMenuOption == 2) {
				System.out.println("What is the name of the file you'd like to delete?");
				String fileToDelete = sc.next(); 
				File thisFile = new File(dirname + "/"+fileToDelete); 
				if (thisFile.exists()) {
					thisFile.delete();
					System.out.println("File deleted"); 
					
				} 
		
				
				
				
				else {
					System.out.println("No File exists by that name"); 
				}
 				
			}
			else if (fileMenuOption == 3) {
				System.out.println("What is the name of the file you are looking for?"); 
				String fileToSearch = sc.next();
				File thisFile1 = new File(dirname + "/"+fileToSearch); 
				if (thisFile1.exists()) {
					System.out.println("This file exists");
					System.out.println("File name: "+thisFile1.getName());
					System.out.println("File path: "+thisFile1.getPath());
				} else {
					System.out.println("This file does not exist");
				}
			}
			else {
				System.out.println("Please enter a number that corresponds to a menu action...");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				} 
			}

			}
		
		}
		else if (mainOption == 1) {
			String[] files = d.list();
			System.out.println("========================");
			System.out.println("All files in the directory are printed below");
			System.out.println("========================");
			for (int i = 0; i < files.length; i++) {
			
                System.out.println(files[i]);
              
               
            }
			System.out.println("========================");
	
			
		} else if (mainOption == 3) {
			System.out.println("Goodbye!");
			break; 
		}
		else {
			System.out.println("Please enter a number that corresponds to a menu action...");
		}
		
		}
			
	}
	
}