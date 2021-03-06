/**
 */
package cz.cuni.mff.d3s.deeco.model.runtime.meta;

import cz.cuni.mff.d3s.deeco.model.runtime.api.Component;
import cz.cuni.mff.d3s.deeco.model.runtime.api.ComponentInstance;
import cz.cuni.mff.d3s.deeco.model.runtime.api.Condition;
import cz.cuni.mff.d3s.deeco.model.runtime.api.Ensemble;
import cz.cuni.mff.d3s.deeco.model.runtime.api.Exchange;
import cz.cuni.mff.d3s.deeco.model.runtime.api.InstanceEnsemblingController;
import cz.cuni.mff.d3s.deeco.model.runtime.api.InstanceProcess;
import cz.cuni.mff.d3s.deeco.model.runtime.api.Invocable;
import cz.cuni.mff.d3s.deeco.model.runtime.api.KnowledgeChangeTrigger;
import cz.cuni.mff.d3s.deeco.model.runtime.api.KnowledgePath;
import cz.cuni.mff.d3s.deeco.model.runtime.api.Parameter;
import cz.cuni.mff.d3s.deeco.model.runtime.api.PathNodeField;
import cz.cuni.mff.d3s.deeco.model.runtime.api.PathNodeMapKey;
import cz.cuni.mff.d3s.deeco.model.runtime.api.RuntimeMetadata;
import cz.cuni.mff.d3s.deeco.model.runtime.api.SchedulingSpecification;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see cz.cuni.mff.d3s.deeco.model.runtime.meta.RuntimeMetadataPackage
 * @generated
 */
public interface RuntimeMetadataFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RuntimeMetadataFactory eINSTANCE = cz.cuni.mff.d3s.deeco.model.runtime.impl.RuntimeMetadataFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Scheduling Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scheduling Specification</em>'.
	 * @generated
	 */
	SchedulingSpecification createSchedulingSpecification();

	/**
	 * Returns a new object of class '<em>Knowledge Change Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Knowledge Change Trigger</em>'.
	 * @generated
	 */
	KnowledgeChangeTrigger createKnowledgeChangeTrigger();

	/**
	 * Returns a new object of class '<em>Knowledge Path</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Knowledge Path</em>'.
	 * @generated
	 */
	KnowledgePath createKnowledgePath();

	/**
	 * Returns a new object of class '<em>Path Node Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Path Node Field</em>'.
	 * @generated
	 */
	PathNodeField createPathNodeField();

	/**
	 * Returns a new object of class '<em>Path Node Map Key</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Path Node Map Key</em>'.
	 * @generated
	 */
	PathNodeMapKey createPathNodeMapKey();

	/**
	 * Returns a new object of class '<em>Runtime Metadata</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Runtime Metadata</em>'.
	 * @generated
	 */
	RuntimeMetadata createRuntimeMetadata();

	/**
	 * Returns a new object of class '<em>Component Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Instance</em>'.
	 * @generated
	 */
	ComponentInstance createComponentInstance();

	/**
	 * Returns a new object of class '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component</em>'.
	 * @generated
	 */
	Component createComponent();

	/**
	 * Returns a new object of class '<em>Ensemble</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ensemble</em>'.
	 * @generated
	 */
	Ensemble createEnsemble();

	/**
	 * Returns a new object of class '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition</em>'.
	 * @generated
	 */
	Condition createCondition();

	/**
	 * Returns a new object of class '<em>Exchange</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exchange</em>'.
	 * @generated
	 */
	Exchange createExchange();

	/**
	 * Returns a new object of class '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process</em>'.
	 * @generated
	 */
	cz.cuni.mff.d3s.deeco.model.runtime.api.Process createProcess();

	/**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	Parameter createParameter();

	/**
	 * Returns a new object of class '<em>Invocable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Invocable</em>'.
	 * @generated
	 */
	Invocable createInvocable();

	/**
	 * Returns a new object of class '<em>Instance Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instance Process</em>'.
	 * @generated
	 */
	InstanceProcess createInstanceProcess();

	/**
	 * Returns a new object of class '<em>Instance Ensembling Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instance Ensembling Controller</em>'.
	 * @generated
	 */
	InstanceEnsemblingController createInstanceEnsemblingController();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RuntimeMetadataPackage getRuntimeMetadataPackage();

} //RuntimeMetadataFactory
