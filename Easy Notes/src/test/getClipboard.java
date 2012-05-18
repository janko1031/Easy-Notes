package test;


	import java.awt.Toolkit;
	import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;


	public class getClipboard {


		public String getClip() throws Exception{
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			Clipboard clipboard = toolkit.getSystemClipboard();
			String result1 = null;
			
			try {
				result1 = (String) clipboard.getData(DataFlavor.stringFlavor);
			} catch (UnsupportedFlavorException ex) {
				
				
			}
			return result1;
		}
		
}
