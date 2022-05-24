/**
 */
package qucircuit;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>LOOP KIND</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see qucircuit.QuCircuitPackage#getLOOP_KIND()
 * @model
 * @generated
 */
public enum LOOP_KIND implements Enumerator {
	/**
	 * The '<em><b>CONTROL QUBITS LOOP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTROL_QUBITS_LOOP_VALUE
	 * @generated
	 * @ordered
	 */
	CONTROL_QUBITS_LOOP(0, "CONTROL_QUBITS_LOOP", "CONTROL_QUBITS_LOOP"),

	/**
	 * The '<em><b>TARGET QUBITS LOOP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TARGET_QUBITS_LOOP_VALUE
	 * @generated
	 * @ordered
	 */
	TARGET_QUBITS_LOOP(1, "TARGET_QUBITS_LOOP", "TARGET_QUBITS_LOOP"),

	/**
	 * The '<em><b>SIMPLE LOOP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIMPLE_LOOP_VALUE
	 * @generated
	 * @ordered
	 */
	SIMPLE_LOOP(2, "SIMPLE_LOOP", "SIMPLE_LOOP");

	/**
	 * The '<em><b>CONTROL QUBITS LOOP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTROL_QUBITS_LOOP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONTROL_QUBITS_LOOP_VALUE = 0;

	/**
	 * The '<em><b>TARGET QUBITS LOOP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TARGET_QUBITS_LOOP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TARGET_QUBITS_LOOP_VALUE = 1;

	/**
	 * The '<em><b>SIMPLE LOOP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIMPLE_LOOP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SIMPLE_LOOP_VALUE = 2;

	/**
	 * An array of all the '<em><b>LOOP KIND</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LOOP_KIND[] VALUES_ARRAY = new LOOP_KIND[] { CONTROL_QUBITS_LOOP, TARGET_QUBITS_LOOP,
			SIMPLE_LOOP, };

	/**
	 * A public read-only list of all the '<em><b>LOOP KIND</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<LOOP_KIND> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>LOOP KIND</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LOOP_KIND get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LOOP_KIND result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>LOOP KIND</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LOOP_KIND getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LOOP_KIND result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>LOOP KIND</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LOOP_KIND get(int value) {
		switch (value) {
		case CONTROL_QUBITS_LOOP_VALUE:
			return CONTROL_QUBITS_LOOP;
		case TARGET_QUBITS_LOOP_VALUE:
			return TARGET_QUBITS_LOOP;
		case SIMPLE_LOOP_VALUE:
			return SIMPLE_LOOP;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private LOOP_KIND(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //LOOP_KIND
