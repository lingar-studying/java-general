package fileStudying;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class FileExplanation1{
	
	/**
	 * Explain about File Class in Java API : 
	 * 
	 * https://docs.oracle.com/javase/7/docs/api/java/io/File.html
	 */
	
	File f = new File("a.t");
	
	public static void main(String[] args)  throws IOException{
		
		File f = new File("test.txt");
		System.out.println(f);
		System.out.println(f.exists());
		
		File f2 = new File("fileS");
		System.out.println(f2.exists() + " = f2.exists()");
		
		File f3 = new File(f2, "testec2.txt");
		System.out.println(f3.exists() + " = f3.exists()");
		System.out.println(f3);
		System.out.println(File.pathSeparator);
		
		System.out.println(File.pathSeparator);
		System.out.println(File.separatorChar);
		
		
		File f4 = new File ("C:\\Users\\izhar");
		System.out.println(f4.exists() + " + f4.exists()");
		
		try {
			//C:\\Users\\izhar
			
			URI uri = new URI("file:///C:/Users/izhar/test.txt");
			File f5 = new File (uri);
			System.out.println(f5.exists() + " + f5.exists()");
			System.out.println(f5.isAbsolute());

		} catch (Exception e) {
			// TODO: handle exception
		}

		File f6 = new File("C:\\Users\\", "izhar");
		System.out.println(f6.exists( ) + " = f6.exists()");
		System.out.println(f6);
		
		File f7 = new File("C:\\Users\\i", "zhar");
		System.out.println(f7.exists());
		System.out.println(f7);
		
		System.out.println(f6.canExecute() + " f6.canExecute()");
		System.out.println("f6 = " + f6);
		System.out.println(f6.getName() + "  = f6.getName()");
		File f8 = new File("files/testEc2.txt");
		
		System.out.println(f8.getName() + "  = f8.getName()");

		System.out.println(f8.getParent() + " = f8.getParent()");
		
		File f9 = f8.getParentFile();
		System.out.println(f9);
		File f10 = f2.getParentFile();
		System.out.println(f10);
		File f11 = new File("files/a/b.txt");
		System.out.println(f11.exists());
		System.out.println(f11.getParentFile());
		System.out.println(f11.getPath());
		System.out.println(f11.isAbsolute());
		System.out.println(f6.isAbsolute());
		System.out.println(f11.getAbsolutePath());
		File f12 = new File ("ss");
		System.out.println(f12.getAbsolutePath());
		
		//U here
		try {
			System.out.println(f11.getCanonicalPath());

		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println("Canonical paths are 1 only way to define specific path , "
				+ "It's can be useful for remove duplicates. See here \n "
				+ "More about - "
				+ "https://www.javarticles.com/2014/12/canonical-path.html");
		File f13 = new File ( "files/a/A2/a3/../../b2");
		System.out.println("f13.exists() ? " + f13.exists());
		System.out.println(f13.getPath() + " this is the regular path , ");
		System.out.println(f13.getAbsolutePath() + " - and this is the absolute, ");
		System.out.println(f13.getCanonicalPath() + "and this is the canonical "
				+ "\n Even If I create this file in other way the canonical will remain the same, "
				+ "While the other can be change.");
		
		System.out.println("All the methods of the paths , have a File version "
				+ "that return the path as File. ");
		System.out.println(f13.getCanonicalFile());
		
		System.out.println("With that toUrl u can convert the file to "
				+ "a URL. But it's not rcommended and U should first use in URI . ");
		
		System.out.println(f13.toURL());
		System.out.println("This is to URI ");
		System.out.println(f13.toURI());
		
		System.out.println(f13.toURI().toURL());
		
		File f14 = new File("אאאשד/sdsad");
		System.out.println(f14.toURL());
		System.out.println(f14.toURI().toURL());
		System.out.println(f14.canExecute());
		System.out.println(f13.canExecute());
		File f15 = new File("files/a/B2/CreateTablesDraft.class");
		System.out.println(f15.exists());
		System.out.println(f15.canExecute());
		System.out.println(f15.canRead() + " = can read  ");
		System.out.println(f15.canWrite() + " = can write   "
				+ "\n those methods is for cases U block some files by security exception. See it in the docs. ");
		System.out.println(f15.isDirectory() + " f15 is directory ");
		System.out.println(f13.isDirectory() + " f13 is directory ");
		System.out.println(f14.isDirectory() + " f14 is directory ");
		
		System.out.println(f15.isFile() + " f15 is File ");
		System.out.println(f13.isFile() + " f13 is File ");
		System.out.println(f14.isFile() + " f14 is File ");
		File f16 = new File("files/exposed");
		File f17 = new File("files/hidden");
		File f18 = new File("lingarDOc/content");

		
		System.out.println("Check if the file hidden: ");
		System.out.println("Is " + f16 + " is hidden ? - " + f16.isHidden());
		System.out.println("Is " + f17 + " is hidden ? - " + f17.isHidden());
		
		System.out.println("When " + f18 + " last modified ? - " + f18.lastModified()/1000);
		
		File f19 = new File("files\\two words");
		System.out.println("is " + f19 + " exist? " + f19.exists());
		System.out.println("and as URL : \n" + f19.toURI());
		
		File f20 = new File ("files/haveSOmeWeight.docx");
		System.out.println(f20.exists());
		System.out.println(f20.canRead());
		System.out.println("The size of " + f20 + " is : " 
				+ f20.length() + " bytes \n "
						+ "and in KB is - " +  f20.length()/1000);
		System.out.println("creating new file ");
		File f21 = new File("files/newFile"+ new Random().nextInt(100));
		System.out.println("is " + f21 + " exist? " + f21.exists());
		
		System.out.println("Trying to creating new - is created ? - " + f21.createNewFile());
		
		
		System.out.println("creating new file ");
		File f22 = new File("files/testEc2.txt");
		System.out.println("is " + f22 + " exist? " + f22.exists());
		
		System.out.println("Trying to creating new - is created ? - " + f22.createNewFile());
		
		System.out.println("here is how u can delete file. I'm comment it for not make problems");
		
		File f23 = new File("files/newFile20");
		System.out.println("Trying to delete " + f23 + " is deleted ? " +f23.delete());;
		
		System.out.println("Delete when time over - I did here some intersting "
				+ "Commented code for understanding deleteOnExit");
		/** - UNCOMMENT THIS FOR UNDERSTANDING deleteOnExit
		File f24  = new File ("files/try1");
		f24.createNewFile();
		
		File f25  = new File ("files/try2");
		f25.createNewFile();
		
		
		System.out.println("See now How U have 2 new files try1 and try2 - \n"
				+ "u have 15 seconds ... ");
		try {
			TimeUnit.SECONDS.sleep(15);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("now lets try to delete try1 immediatley : ");
		f24.delete();
		System.out.println("and try2 on exit. \nn U have 15 seconds to check it out");
		f25.deleteOnExit();
		try {
			TimeUnit.SECONDS.sleep(15);
		} catch (Exception e) {
			// TODO: handle exception
		}
	*/
		System.out.println("List of the files of the directory:");
		File f26 = new File("files");
		System.out.println("all the files in " + f26.getAbsolutePath());
		
		String[] allFiles = f26.list();
		for ( String s : allFiles ){
			System.out.println(s);
		}
		
		System.out.println("All roots of file - it's mean like all drive on the"
				+ "\n system. Try to plug and unplug a USB and check the results in each state.");
		File[] allRoots = File.listRoots();
		for(File root : allRoots){
			System.out.println(root);
		}
		System.out.println("Check all the space on the partitions (the driver) "
				+ "That the file on it : ");
		System.out.println(f22.getTotalSpace() + " bytes");
		long giga = f22.getTotalSpace()/ 1000_000_000;
		System.out.println(giga + " GB");
		giga = f22.getFreeSpace()/ 1000_000_000;
		System.out.println("the free space : " + giga);
		
		giga = f22.getUsableSpace()/ 1000_000_000;
		System.out.println("the useable space : " + giga);





	}
}
