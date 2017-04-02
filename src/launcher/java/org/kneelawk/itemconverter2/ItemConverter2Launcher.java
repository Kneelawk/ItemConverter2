package org.kneelawk.itemconverter2;

import java.io.IOException;

import org.kneelawk.cpcontrol.CPControl3;

class ItemConverter2Launcher {
	public static void main(String[] args) {
		CPControl3 cp = new CPControl3("org.kneelawk.itemconverter2.ItemConverter2");
		cp.addExtractingFromFileLibrary(CPControl3.ME)
				.addLibrary("application", new CPControl3.DirectoryEntryFilter("app"), CPControl3.ALWAYS_DELETE)
				.addLibrary("libraries", new CPControl3.DirectoryEntryFilter("libs"), CPControl3.ALWAYS_DELETE);

		try {
			cp.launch(args);
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}
}