package at.jku.se.quantum.operation.contribution.utils;

import org.eclipse.emf.common.util.URI;

public class ContributionUtils {
	
	public static final String ICONS_FOLDER = "icons";
	
	public static String PLUGIN_NAME = "at.jku.se.quantum.operation.contribution";
	
	//Suppress default constructor for noninstantiability
	private ContributionUtils() {
		throw new AssertionError();
	}
	
	public static URI getIconURI(String iconFileName) {
		return URI.createPlatformPluginURI(PLUGIN_NAME + "/" + ICONS_FOLDER + "/" + iconFileName, false);
	}
}
