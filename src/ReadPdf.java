/*import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.encryption.InvalidPasswordException;
import org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature;
import org.apache.pdfbox.pdmodel.interactive.form.PDSignatureField;


public class main {

	/**
	 * @param args
	 * @throws IOException 
	 */
/*	public static void main(String[] args){
		// TODO Auto-generated method stub
//		File ruta = new File("/media/tinchodell/01D33C71ADC61FD0/Facultad/tpObjetos/tpObjetos/res/1542310321969_30712089446_01_0002_00000031 (1).pdf");
		File ruta = new File("/media/tinchodell/01D33C71ADC61FD0/Facultad/tpObjetos/tpObjetos/res/2017-brooks-map-acel1.pdf");

		System.out.println(ruta.getPath());
	
		try {
			PDDocument pd = PDDocument.load(ruta);
			Long j = pd.getDocumentId();
			ArrayList<PDSignature> dictionaries = (ArrayList<PDSignature>) pd.getSignatureDictionaries();
			ArrayList<PDSignatureField> fields = (ArrayList<PDSignatureField>) pd.getSignatureFields();
			
			System.out.println(pd.isEncrypted());
			System.out.println(dictionaries.size());
			System.out.println(fields.size());
			for (int i=0; i<dictionaries.size(); i++)
				System.out.println(dictionaries.get(i).toString());
			for (int i=0; i<fields.size(); i++)
				System.out.println(fields.get(i).toString());
			
			System.out.println(j);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

}
}
*/
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;
import java.util.*;
import java.io.*;
import java.io.File;
import java.io.IOException;
public class ReadPdf 
{
	public static void main(String args[]) throws IOException 
	{
		try
		{
		//	PDDocument document = PDDocument.load(new File("/media/tinchodell/01D33C71ADC61FD0/Facultad/tpObjetos/tpObjetos/res/2017-brooks-map-acel1.pdf"));// here file1.pdf is the name of pdf file which we want to read....
			PDDocument document = PDDocument.load(new File("/media/tinchodell/01D33C71ADC61FD0/Facultad/tpObjetos/tpObjetos/res/1542310321969_30712089446_01_0002_00000031.pdf"));// here file1.pdf is the name of pdf file which we want to read....
			
			document.getClass();
			if (document.isEncrypted())
			{
				PDFTextStripperByArea stripper = new PDFTextStripperByArea();
				stripper.setSortByPosition(false);
				PDFTextStripper Tstripper = new PDFTextStripper();
				String str = Tstripper.getText(document);
				Scanner scn = null;					
				scn = new Scanner(str);
				String line="";
				while (scn.hasNextLine()) 
				{		
					line = scn.nextLine();
					System.out.println("\n"+line);
				}	
			}
			document.close();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
			
	}
}
