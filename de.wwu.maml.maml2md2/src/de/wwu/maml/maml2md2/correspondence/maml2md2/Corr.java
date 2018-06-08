/**
 */
package de.wwu.maml.maml2md2.correspondence.maml2md2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Corr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.wwu.maml.maml2md2.correspondence.maml2md2.Corr#getSourceElement <em>Source Element</em>}</li>
 *   <li>{@link de.wwu.maml.maml2md2.correspondence.maml2md2.Corr#getTargetElement <em>Target Element</em>}</li>
 *   <li>{@link de.wwu.maml.maml2md2.correspondence.maml2md2.Corr#getDesc <em>Desc</em>}</li>
 * </ul>
 *
 * @see de.wwu.maml.maml2md2.correspondence.maml2md2.Maml2md2Package#getCorr()
 * @model
 * @generated
 */
public interface Corr extends EObject {
	/**
	 * Returns the value of the '<em><b>Source Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Element</em>' reference.
	 * @see #setSourceElement(EObject)
	 * @see de.wwu.maml.maml2md2.correspondence.maml2md2.Maml2md2Package#getCorr_SourceElement()
	 * @model
	 * @generated
	 */
	EObject getSourceElement();

	/**
	 * Sets the value of the '{@link de.wwu.maml.maml2md2.correspondence.maml2md2.Corr#getSourceElement <em>Source Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Element</em>' reference.
	 * @see #getSourceElement()
	 * @generated
	 */
	void setSourceElement(EObject value);

	/**
	 * Returns the value of the '<em><b>Target Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Element</em>' reference.
	 * @see #setTargetElement(EObject)
	 * @see de.wwu.maml.maml2md2.correspondence.maml2md2.Maml2md2Package#getCorr_TargetElement()
	 * @model
	 * @generated
	 */
	EObject getTargetElement();

	/**
	 * Sets the value of the '{@link de.wwu.maml.maml2md2.correspondence.maml2md2.Corr#getTargetElement <em>Target Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Element</em>' reference.
	 * @see #getTargetElement()
	 * @generated
	 */
	void setTargetElement(EObject value);

	/**
	 * Returns the value of the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Desc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Desc</em>' attribute.
	 * @see #setDesc(String)
	 * @see de.wwu.maml.maml2md2.correspondence.maml2md2.Maml2md2Package#getCorr_Desc()
	 * @model
	 * @generated
	 */
	String getDesc();

	/**
	 * Sets the value of the '{@link de.wwu.maml.maml2md2.correspondence.maml2md2.Corr#getDesc <em>Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Desc</em>' attribute.
	 * @see #getDesc()
	 * @generated
	 */
	void setDesc(String value);

} // Corr
