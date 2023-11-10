package quantum.circuit.lang.utils;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

public class EcoreUtils3 {
	
	public static int getEObjectPosition(EObject eObject) {
		final List<?> containmentList = (List<?>)eObject.eContainer().eGet(eObject.eContainmentFeature());
		return containmentList.indexOf(eObject);
	}
}
