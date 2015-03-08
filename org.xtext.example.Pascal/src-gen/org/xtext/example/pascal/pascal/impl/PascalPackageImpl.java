/**
 */
package org.xtext.example.pascal.pascal.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.xtext.example.pascal.pascal.PascalFactory;
import org.xtext.example.pascal.pascal.PascalPackage;
import org.xtext.example.pascal.pascal.abstraction_declaration;
import org.xtext.example.pascal.pascal.abstraction_heading;
import org.xtext.example.pascal.pascal.any_number;
import org.xtext.example.pascal.pascal.array_type;
import org.xtext.example.pascal.pascal.assignment_statement;
import org.xtext.example.pascal.pascal.block;
import org.xtext.example.pascal.pascal.bound_specification;
import org.xtext.example.pascal.pascal.case_label_list;
import org.xtext.example.pascal.pascal.case_limb;
import org.xtext.example.pascal.pascal.case_statement;
import org.xtext.example.pascal.pascal.compound_statement;
import org.xtext.example.pascal.pascal.conditional_statement;
import org.xtext.example.pascal.pascal.conformant_array_schema;
import org.xtext.example.pascal.pascal.constant;
import org.xtext.example.pascal.pascal.constant_definition;
import org.xtext.example.pascal.pascal.constant_definition_part;
import org.xtext.example.pascal.pascal.dynamic_array_type;
import org.xtext.example.pascal.pascal.enumerated_type;
import org.xtext.example.pascal.pascal.expression;
import org.xtext.example.pascal.pascal.expression_list;
import org.xtext.example.pascal.pascal.factor;
import org.xtext.example.pascal.pascal.field_list;
import org.xtext.example.pascal.pascal.file_type;
import org.xtext.example.pascal.pascal.fixed_part;
import org.xtext.example.pascal.pascal.for_statement;
import org.xtext.example.pascal.pascal.formal_parameter_list;
import org.xtext.example.pascal.pascal.formal_parameter_section;
import org.xtext.example.pascal.pascal.function_designator;
import org.xtext.example.pascal.pascal.goto_statement;
import org.xtext.example.pascal.pascal.identifier_list;
import org.xtext.example.pascal.pascal.if_statement;
import org.xtext.example.pascal.pascal.index_type;
import org.xtext.example.pascal.pascal.label;
import org.xtext.example.pascal.pascal.label_declaration_part;
import org.xtext.example.pascal.pascal.number;
import org.xtext.example.pascal.pascal.packed_conformant_array_schema;
import org.xtext.example.pascal.pascal.parameter_type;
import org.xtext.example.pascal.pascal.pascal;
import org.xtext.example.pascal.pascal.pointer_type;
import org.xtext.example.pascal.pascal.procedure_and_function_declaration_part;
import org.xtext.example.pascal.pascal.program;
import org.xtext.example.pascal.pascal.program_heading_block;
import org.xtext.example.pascal.pascal.record_section;
import org.xtext.example.pascal.pascal.record_type;
import org.xtext.example.pascal.pascal.repeat_statement;
import org.xtext.example.pascal.pascal.repetitive_statement;
import org.xtext.example.pascal.pascal.set;
import org.xtext.example.pascal.pascal.set_type;
import org.xtext.example.pascal.pascal.simple_expression;
import org.xtext.example.pascal.pascal.simple_statement;
import org.xtext.example.pascal.pascal.simple_type;
import org.xtext.example.pascal.pascal.statement;
import org.xtext.example.pascal.pascal.statement_part;
import org.xtext.example.pascal.pascal.statement_sequence;
import org.xtext.example.pascal.pascal.structured_statement;
import org.xtext.example.pascal.pascal.structured_type;
import org.xtext.example.pascal.pascal.subrange_type;
import org.xtext.example.pascal.pascal.tag_field;
import org.xtext.example.pascal.pascal.term;
import org.xtext.example.pascal.pascal.type;
import org.xtext.example.pascal.pascal.type_definition;
import org.xtext.example.pascal.pascal.type_definition_part;
import org.xtext.example.pascal.pascal.unpacked_conformant_array_schema;
import org.xtext.example.pascal.pascal.unpacked_structured_type;
import org.xtext.example.pascal.pascal.value_parameter_section;
import org.xtext.example.pascal.pascal.var_;
import org.xtext.example.pascal.pascal.variable;
import org.xtext.example.pascal.pascal.variable_declaration_part;
import org.xtext.example.pascal.pascal.variable_identifier_list;
import org.xtext.example.pascal.pascal.variable_parameter_section;
import org.xtext.example.pascal.pascal.variable_section;
import org.xtext.example.pascal.pascal.variant;
import org.xtext.example.pascal.pascal.variant_part;
import org.xtext.example.pascal.pascal.while_statement;
import org.xtext.example.pascal.pascal.with_statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PascalPackageImpl extends EPackageImpl implements PascalPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pascalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass programEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass program_heading_blockEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass identifier_listEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass blockEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statement_partEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statement_sequenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass labelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass simple_statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass assignment_statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass var_EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expression_listEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass simple_expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass termEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass factorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numberEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass any_numberEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass setEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass function_designatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass structured_statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass compound_statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass repetitive_statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass while_statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass repeat_statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass for_statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conditional_statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass if_statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass case_statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass case_limbEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass case_label_listEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass with_statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass goto_statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass label_declaration_partEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constant_definition_partEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constant_definitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass type_definition_partEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass type_definitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass simple_typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subrange_typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumerated_typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass structured_typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unpacked_structured_typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass array_typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dynamic_array_typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass index_typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass record_typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass field_listEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fixed_partEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variable_identifier_listEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variable_sectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass record_sectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variant_partEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tag_fieldEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass set_typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass file_typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pointer_typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variable_declaration_partEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass procedure_and_function_declaration_partEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstraction_declarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstraction_headingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass formal_parameter_listEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass formal_parameter_sectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass value_parameter_sectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameter_typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conformant_array_schemaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass packed_conformant_array_schemaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bound_specificationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unpacked_conformant_array_schemaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variable_parameter_sectionEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.xtext.example.pascal.pascal.PascalPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private PascalPackageImpl()
  {
    super(eNS_URI, PascalFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link PascalPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static PascalPackage init()
  {
    if (isInited) return (PascalPackage)EPackage.Registry.INSTANCE.getEPackage(PascalPackage.eNS_URI);

    // Obtain or create and register package
    PascalPackageImpl thePascalPackage = (PascalPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PascalPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PascalPackageImpl());

    isInited = true;

    // Create package meta-data objects
    thePascalPackage.createPackageContents();

    // Initialize created meta-data
    thePascalPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    thePascalPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(PascalPackage.eNS_URI, thePascalPackage);
    return thePascalPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getpascal()
  {
    return pascalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getpascal_Program()
  {
    return (EReference)pascalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getprogram()
  {
    return programEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getprogram_Heading()
  {
    return (EReference)programEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getprogram_Block()
  {
    return (EReference)programEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getprogram_heading_block()
  {
    return program_heading_blockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getprogram_heading_block_Name()
  {
    return (EAttribute)program_heading_blockEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getprogram_heading_block_Identifiers()
  {
    return (EReference)program_heading_blockEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getidentifier_list()
  {
    return identifier_listEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getidentifier_list_Names()
  {
    return (EAttribute)identifier_listEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getblock()
  {
    return blockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getblock_Label()
  {
    return (EReference)blockEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getblock_Constant()
  {
    return (EReference)blockEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getblock_Type()
  {
    return (EReference)blockEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getblock_Variable()
  {
    return (EReference)blockEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getblock_Abstraction()
  {
    return (EReference)blockEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getblock_Statement()
  {
    return (EReference)blockEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getstatement_part()
  {
    return statement_partEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getstatement_part_Sequence()
  {
    return (EReference)statement_partEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getstatement_sequence()
  {
    return statement_sequenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getstatement_sequence_Statements()
  {
    return (EReference)statement_sequenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getstatement()
  {
    return statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getstatement_Label()
  {
    return (EReference)statementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getstatement_Simple()
  {
    return (EReference)statementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getstatement_Structured()
  {
    return (EReference)statementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getlabel()
  {
    return labelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getlabel_Number()
  {
    return (EAttribute)labelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getsimple_statement()
  {
    return simple_statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getsimple_statement_Assignment()
  {
    return (EReference)simple_statementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getsimple_statement_Function()
  {
    return (EReference)simple_statementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getsimple_statement_Goto()
  {
    return (EReference)simple_statementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getsimple_statement_Function_noargs()
  {
    return (EAttribute)simple_statementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getassignment_statement()
  {
    return assignment_statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getassignment_statement_Variable()
  {
    return (EReference)assignment_statementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getassignment_statement_Expression()
  {
    return (EReference)assignment_statementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getvariable()
  {
    return variableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getvariable_Name()
  {
    return (EAttribute)variableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getvariable_Variable()
  {
    return (EReference)variableEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getvar_()
  {
    return var_EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getvar__Expressions()
  {
    return (EReference)var_EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getvar__Array()
  {
    return (EReference)var_EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getvar__Accessor()
  {
    return (EAttribute)var_EClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getvar__Name()
  {
    return (EAttribute)var_EClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getvar__Variable()
  {
    return (EReference)var_EClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getvar__Pointer()
  {
    return (EReference)var_EClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getexpression_list()
  {
    return expression_listEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getexpression_list_Expressions()
  {
    return (EReference)expression_listEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getexpression()
  {
    return expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getexpression_Expressions()
  {
    return (EReference)expressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getexpression_Operators()
  {
    return (EAttribute)expressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getsimple_expression()
  {
    return simple_expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getsimple_expression_PrefixOperator()
  {
    return (EAttribute)simple_expressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getsimple_expression_Terms()
  {
    return (EReference)simple_expressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getsimple_expression_Operators()
  {
    return (EAttribute)simple_expressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getterm()
  {
    return termEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getterm_Factors()
  {
    return (EReference)termEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getterm_Operators()
  {
    return (EAttribute)termEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfactor()
  {
    return factorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfactor_Variable()
  {
    return (EReference)factorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfactor_Number()
  {
    return (EReference)factorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfactor_String()
  {
    return (EAttribute)factorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfactor_Set()
  {
    return (EReference)factorEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfactor_Nil()
  {
    return (EAttribute)factorEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfactor_Boolean()
  {
    return (EAttribute)factorEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfactor_Function()
  {
    return (EReference)factorEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfactor_Expression()
  {
    return (EReference)factorEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfactor_Not()
  {
    return (EReference)factorEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnumber()
  {
    return numberEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getnumber_Number()
  {
    return (EReference)numberEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getany_number()
  {
    return any_numberEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getany_number_Integer()
  {
    return (EAttribute)any_numberEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getany_number_Real()
  {
    return (EAttribute)any_numberEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getset()
  {
    return setEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getset_Brackets()
  {
    return (EAttribute)setEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getset_Expressions()
  {
    return (EReference)setEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfunction_designator()
  {
    return function_designatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfunction_designator_Name()
  {
    return (EAttribute)function_designatorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfunction_designator_Expressions()
  {
    return (EReference)function_designatorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getstructured_statement()
  {
    return structured_statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getstructured_statement_Compound()
  {
    return (EReference)structured_statementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getstructured_statement_Repetitive()
  {
    return (EReference)structured_statementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getstructured_statement_Conditional()
  {
    return (EReference)structured_statementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getstructured_statement_WithStmt()
  {
    return (EReference)structured_statementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getcompound_statement()
  {
    return compound_statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getcompound_statement_Sequence()
  {
    return (EReference)compound_statementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getrepetitive_statement()
  {
    return repetitive_statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getrepetitive_statement_WhileStmt()
  {
    return (EReference)repetitive_statementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getrepetitive_statement_RepeatStmt()
  {
    return (EReference)repetitive_statementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getrepetitive_statement_ForStmt()
  {
    return (EReference)repetitive_statementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getwhile_statement()
  {
    return while_statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getwhile_statement_Expression()
  {
    return (EReference)while_statementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getwhile_statement_Statement()
  {
    return (EReference)while_statementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getrepeat_statement()
  {
    return repeat_statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getrepeat_statement_Sequence()
  {
    return (EReference)repeat_statementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getrepeat_statement_Expression()
  {
    return (EReference)repeat_statementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfor_statement()
  {
    return for_statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfor_statement_Assignment()
  {
    return (EReference)for_statementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfor_statement_Expression()
  {
    return (EReference)for_statementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfor_statement_Statement()
  {
    return (EReference)for_statementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getconditional_statement()
  {
    return conditional_statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getconditional_statement_IfStmt()
  {
    return (EReference)conditional_statementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getconditional_statement_CaseStmt()
  {
    return (EReference)conditional_statementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getif_statement()
  {
    return if_statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getif_statement_Expression()
  {
    return (EReference)if_statementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getif_statement_IfStatement()
  {
    return (EReference)if_statementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getif_statement_ElseStatement()
  {
    return (EReference)if_statementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getcase_statement()
  {
    return case_statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getcase_statement_Expression()
  {
    return (EReference)case_statementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getcase_statement_Cases()
  {
    return (EReference)case_statementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getcase_limb()
  {
    return case_limbEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getcase_limb_Cases()
  {
    return (EReference)case_limbEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getcase_limb_Statement()
  {
    return (EReference)case_limbEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getcase_label_list()
  {
    return case_label_listEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getcase_label_list_Constants()
  {
    return (EReference)case_label_listEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getconstant()
  {
    return constantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getconstant_Opterator()
  {
    return (EAttribute)constantEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getconstant_Name()
  {
    return (EAttribute)constantEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getconstant_Number()
  {
    return (EReference)constantEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getconstant_String()
  {
    return (EAttribute)constantEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getconstant_BoolLiteral()
  {
    return (EAttribute)constantEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getconstant_Nil()
  {
    return (EAttribute)constantEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getwith_statement()
  {
    return with_statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getwith_statement_Variables()
  {
    return (EReference)with_statementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getwith_statement_Statement()
  {
    return (EReference)with_statementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getgoto_statement()
  {
    return goto_statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getgoto_statement_Label()
  {
    return (EReference)goto_statementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getlabel_declaration_part()
  {
    return label_declaration_partEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getlabel_declaration_part_Labels()
  {
    return (EReference)label_declaration_partEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getconstant_definition_part()
  {
    return constant_definition_partEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getconstant_definition_part_Consts()
  {
    return (EReference)constant_definition_partEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getconstant_definition()
  {
    return constant_definitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getconstant_definition_Name()
  {
    return (EAttribute)constant_definitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getconstant_definition_Const()
  {
    return (EReference)constant_definitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass gettype_definition_part()
  {
    return type_definition_partEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference gettype_definition_part_Types()
  {
    return (EReference)type_definition_partEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass gettype_definition()
  {
    return type_definitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gettype_definition_Name()
  {
    return (EAttribute)type_definitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference gettype_definition_Type()
  {
    return (EReference)type_definitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass gettype()
  {
    return typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference gettype_Simple()
  {
    return (EReference)typeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference gettype_Structured()
  {
    return (EReference)typeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference gettype_Pointer()
  {
    return (EReference)typeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getsimple_type()
  {
    return simple_typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getsimple_type_Subrange()
  {
    return (EReference)simple_typeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getsimple_type_Enumerated()
  {
    return (EReference)simple_typeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getsimple_type_Name()
  {
    return (EAttribute)simple_typeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getsubrange_type()
  {
    return subrange_typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getsubrange_type_InitialConst()
  {
    return (EReference)subrange_typeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getsubrange_type_FinalConst()
  {
    return (EReference)subrange_typeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getsubrange_type_Subrange()
  {
    return (EAttribute)subrange_typeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getsubrange_type_Const()
  {
    return (EReference)subrange_typeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getenumerated_type()
  {
    return enumerated_typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getenumerated_type_Identifiers()
  {
    return (EReference)enumerated_typeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getstructured_type()
  {
    return structured_typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getstructured_type_Packed()
  {
    return (EAttribute)structured_typeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getstructured_type_Type()
  {
    return (EReference)structured_typeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getunpacked_structured_type()
  {
    return unpacked_structured_typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getunpacked_structured_type_Array()
  {
    return (EReference)unpacked_structured_typeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getunpacked_structured_type_Dynamic()
  {
    return (EReference)unpacked_structured_typeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getunpacked_structured_type_Record()
  {
    return (EReference)unpacked_structured_typeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getunpacked_structured_type_Set()
  {
    return (EReference)unpacked_structured_typeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getunpacked_structured_type_File()
  {
    return (EReference)unpacked_structured_typeEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getarray_type()
  {
    return array_typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getarray_type_Indexes()
  {
    return (EReference)array_typeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getarray_type_Type()
  {
    return (EReference)array_typeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getdynamic_array_type()
  {
    return dynamic_array_typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getdynamic_array_type_Type()
  {
    return (EReference)dynamic_array_typeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getindex_type()
  {
    return index_typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getindex_type_Type()
  {
    return (EReference)index_typeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getrecord_type()
  {
    return record_typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getrecord_type_RecordKeyword()
  {
    return (EAttribute)record_typeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getrecord_type_Fields()
  {
    return (EReference)record_typeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getrecord_type_EndKeyword()
  {
    return (EAttribute)record_typeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfield_list()
  {
    return field_listEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfield_list_Fixed()
  {
    return (EReference)field_listEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfield_list_Variants()
  {
    return (EReference)field_listEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfixed_part()
  {
    return fixed_partEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfixed_part_Sections()
  {
    return (EReference)fixed_partEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getvariable_identifier_list()
  {
    return variable_identifier_listEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getvariable_identifier_list_Names()
  {
    return (EAttribute)variable_identifier_listEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getvariable_section()
  {
    return variable_sectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getvariable_section_Identifiers()
  {
    return (EReference)variable_sectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getvariable_section_Type()
  {
    return (EReference)variable_sectionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getrecord_section()
  {
    return record_sectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getrecord_section_Identifiers()
  {
    return (EReference)record_sectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getrecord_section_Type()
  {
    return (EReference)record_sectionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getvariant_part()
  {
    return variant_partEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getvariant_part_Tag()
  {
    return (EReference)variant_partEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getvariant_part_Name()
  {
    return (EAttribute)variant_partEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getvariant_part_Variants()
  {
    return (EReference)variant_partEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass gettag_field()
  {
    return tag_fieldEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gettag_field_Name()
  {
    return (EAttribute)tag_fieldEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getvariant()
  {
    return variantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getvariant_Labels()
  {
    return (EReference)variantEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getvariant_Fields()
  {
    return (EReference)variantEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getset_type()
  {
    return set_typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getset_type_Type()
  {
    return (EReference)set_typeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfile_type()
  {
    return file_typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfile_type_Type()
  {
    return (EReference)file_typeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getpointer_type()
  {
    return pointer_typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getpointer_type_Type()
  {
    return (EReference)pointer_typeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getvariable_declaration_part()
  {
    return variable_declaration_partEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getvariable_declaration_part_Sections()
  {
    return (EReference)variable_declaration_partEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getprocedure_and_function_declaration_part()
  {
    return procedure_and_function_declaration_partEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getprocedure_and_function_declaration_part_Procedures()
  {
    return (EReference)procedure_and_function_declaration_partEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getprocedure_and_function_declaration_part_Functions()
  {
    return (EReference)procedure_and_function_declaration_partEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getabstraction_declaration()
  {
    return abstraction_declarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getabstraction_declaration_Heading()
  {
    return (EReference)abstraction_declarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getabstraction_declaration_Block()
  {
    return (EReference)abstraction_declarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getabstraction_declaration_Forward()
  {
    return (EAttribute)abstraction_declarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getabstraction_heading()
  {
    return abstraction_headingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getabstraction_heading_Name()
  {
    return (EAttribute)abstraction_headingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getabstraction_heading_Parameters()
  {
    return (EReference)abstraction_headingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getabstraction_heading_ReturnType()
  {
    return (EAttribute)abstraction_headingEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getformal_parameter_list()
  {
    return formal_parameter_listEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getformal_parameter_list_Parameters()
  {
    return (EReference)formal_parameter_listEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getformal_parameter_section()
  {
    return formal_parameter_sectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getformal_parameter_section_Value()
  {
    return (EReference)formal_parameter_sectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getformal_parameter_section_Variable()
  {
    return (EReference)formal_parameter_sectionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getformal_parameter_section_Procedure()
  {
    return (EReference)formal_parameter_sectionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getformal_parameter_section_Function()
  {
    return (EReference)formal_parameter_sectionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getvalue_parameter_section()
  {
    return value_parameter_sectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getvalue_parameter_section_Identifiers()
  {
    return (EReference)value_parameter_sectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getvalue_parameter_section_Type()
  {
    return (EReference)value_parameter_sectionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getparameter_type()
  {
    return parameter_typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getparameter_type_Array()
  {
    return (EReference)parameter_typeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getparameter_type_Name()
  {
    return (EAttribute)parameter_typeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getconformant_array_schema()
  {
    return conformant_array_schemaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getconformant_array_schema_Packed()
  {
    return (EReference)conformant_array_schemaEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getconformant_array_schema_Unpacked()
  {
    return (EReference)conformant_array_schemaEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getpacked_conformant_array_schema()
  {
    return packed_conformant_array_schemaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getpacked_conformant_array_schema_Bound()
  {
    return (EReference)packed_conformant_array_schemaEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getpacked_conformant_array_schema_Name()
  {
    return (EAttribute)packed_conformant_array_schemaEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getbound_specification()
  {
    return bound_specificationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbound_specification_Initial()
  {
    return (EAttribute)bound_specificationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbound_specification_Final()
  {
    return (EAttribute)bound_specificationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbound_specification_Name()
  {
    return (EAttribute)bound_specificationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getunpacked_conformant_array_schema()
  {
    return unpacked_conformant_array_schemaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getunpacked_conformant_array_schema_Bounds()
  {
    return (EReference)unpacked_conformant_array_schemaEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getunpacked_conformant_array_schema_Type()
  {
    return (EReference)unpacked_conformant_array_schemaEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getvariable_parameter_section()
  {
    return variable_parameter_sectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getvariable_parameter_section_Identifiers()
  {
    return (EReference)variable_parameter_sectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getvariable_parameter_section_Type()
  {
    return (EReference)variable_parameter_sectionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PascalFactory getPascalFactory()
  {
    return (PascalFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    pascalEClass = createEClass(PASCAL);
    createEReference(pascalEClass, PASCAL__PROGRAM);

    programEClass = createEClass(PROGRAM);
    createEReference(programEClass, PROGRAM__HEADING);
    createEReference(programEClass, PROGRAM__BLOCK);

    program_heading_blockEClass = createEClass(PROGRAM_HEADING_BLOCK);
    createEAttribute(program_heading_blockEClass, PROGRAM_HEADING_BLOCK__NAME);
    createEReference(program_heading_blockEClass, PROGRAM_HEADING_BLOCK__IDENTIFIERS);

    identifier_listEClass = createEClass(IDENTIFIER_LIST);
    createEAttribute(identifier_listEClass, IDENTIFIER_LIST__NAMES);

    blockEClass = createEClass(BLOCK);
    createEReference(blockEClass, BLOCK__LABEL);
    createEReference(blockEClass, BLOCK__CONSTANT);
    createEReference(blockEClass, BLOCK__TYPE);
    createEReference(blockEClass, BLOCK__VARIABLE);
    createEReference(blockEClass, BLOCK__ABSTRACTION);
    createEReference(blockEClass, BLOCK__STATEMENT);

    statement_partEClass = createEClass(STATEMENT_PART);
    createEReference(statement_partEClass, STATEMENT_PART__SEQUENCE);

    statement_sequenceEClass = createEClass(STATEMENT_SEQUENCE);
    createEReference(statement_sequenceEClass, STATEMENT_SEQUENCE__STATEMENTS);

    statementEClass = createEClass(STATEMENT);
    createEReference(statementEClass, STATEMENT__LABEL);
    createEReference(statementEClass, STATEMENT__SIMPLE);
    createEReference(statementEClass, STATEMENT__STRUCTURED);

    labelEClass = createEClass(LABEL);
    createEAttribute(labelEClass, LABEL__NUMBER);

    simple_statementEClass = createEClass(SIMPLE_STATEMENT);
    createEReference(simple_statementEClass, SIMPLE_STATEMENT__ASSIGNMENT);
    createEReference(simple_statementEClass, SIMPLE_STATEMENT__FUNCTION);
    createEReference(simple_statementEClass, SIMPLE_STATEMENT__GOTO);
    createEAttribute(simple_statementEClass, SIMPLE_STATEMENT__FUNCTION_NOARGS);

    assignment_statementEClass = createEClass(ASSIGNMENT_STATEMENT);
    createEReference(assignment_statementEClass, ASSIGNMENT_STATEMENT__VARIABLE);
    createEReference(assignment_statementEClass, ASSIGNMENT_STATEMENT__EXPRESSION);

    variableEClass = createEClass(VARIABLE);
    createEAttribute(variableEClass, VARIABLE__NAME);
    createEReference(variableEClass, VARIABLE__VARIABLE);

    var_EClass = createEClass(VAR_);
    createEReference(var_EClass, VAR___EXPRESSIONS);
    createEReference(var_EClass, VAR___ARRAY);
    createEAttribute(var_EClass, VAR___ACCESSOR);
    createEAttribute(var_EClass, VAR___NAME);
    createEReference(var_EClass, VAR___VARIABLE);
    createEReference(var_EClass, VAR___POINTER);

    expression_listEClass = createEClass(EXPRESSION_LIST);
    createEReference(expression_listEClass, EXPRESSION_LIST__EXPRESSIONS);

    expressionEClass = createEClass(EXPRESSION);
    createEReference(expressionEClass, EXPRESSION__EXPRESSIONS);
    createEAttribute(expressionEClass, EXPRESSION__OPERATORS);

    simple_expressionEClass = createEClass(SIMPLE_EXPRESSION);
    createEAttribute(simple_expressionEClass, SIMPLE_EXPRESSION__PREFIX_OPERATOR);
    createEReference(simple_expressionEClass, SIMPLE_EXPRESSION__TERMS);
    createEAttribute(simple_expressionEClass, SIMPLE_EXPRESSION__OPERATORS);

    termEClass = createEClass(TERM);
    createEReference(termEClass, TERM__FACTORS);
    createEAttribute(termEClass, TERM__OPERATORS);

    factorEClass = createEClass(FACTOR);
    createEReference(factorEClass, FACTOR__VARIABLE);
    createEReference(factorEClass, FACTOR__NUMBER);
    createEAttribute(factorEClass, FACTOR__STRING);
    createEReference(factorEClass, FACTOR__SET);
    createEAttribute(factorEClass, FACTOR__NIL);
    createEAttribute(factorEClass, FACTOR__BOOLEAN);
    createEReference(factorEClass, FACTOR__FUNCTION);
    createEReference(factorEClass, FACTOR__EXPRESSION);
    createEReference(factorEClass, FACTOR__NOT);

    numberEClass = createEClass(NUMBER);
    createEReference(numberEClass, NUMBER__NUMBER);

    any_numberEClass = createEClass(ANY_NUMBER);
    createEAttribute(any_numberEClass, ANY_NUMBER__INTEGER);
    createEAttribute(any_numberEClass, ANY_NUMBER__REAL);

    setEClass = createEClass(SET);
    createEAttribute(setEClass, SET__BRACKETS);
    createEReference(setEClass, SET__EXPRESSIONS);

    function_designatorEClass = createEClass(FUNCTION_DESIGNATOR);
    createEAttribute(function_designatorEClass, FUNCTION_DESIGNATOR__NAME);
    createEReference(function_designatorEClass, FUNCTION_DESIGNATOR__EXPRESSIONS);

    structured_statementEClass = createEClass(STRUCTURED_STATEMENT);
    createEReference(structured_statementEClass, STRUCTURED_STATEMENT__COMPOUND);
    createEReference(structured_statementEClass, STRUCTURED_STATEMENT__REPETITIVE);
    createEReference(structured_statementEClass, STRUCTURED_STATEMENT__CONDITIONAL);
    createEReference(structured_statementEClass, STRUCTURED_STATEMENT__WITH_STMT);

    compound_statementEClass = createEClass(COMPOUND_STATEMENT);
    createEReference(compound_statementEClass, COMPOUND_STATEMENT__SEQUENCE);

    repetitive_statementEClass = createEClass(REPETITIVE_STATEMENT);
    createEReference(repetitive_statementEClass, REPETITIVE_STATEMENT__WHILE_STMT);
    createEReference(repetitive_statementEClass, REPETITIVE_STATEMENT__REPEAT_STMT);
    createEReference(repetitive_statementEClass, REPETITIVE_STATEMENT__FOR_STMT);

    while_statementEClass = createEClass(WHILE_STATEMENT);
    createEReference(while_statementEClass, WHILE_STATEMENT__EXPRESSION);
    createEReference(while_statementEClass, WHILE_STATEMENT__STATEMENT);

    repeat_statementEClass = createEClass(REPEAT_STATEMENT);
    createEReference(repeat_statementEClass, REPEAT_STATEMENT__SEQUENCE);
    createEReference(repeat_statementEClass, REPEAT_STATEMENT__EXPRESSION);

    for_statementEClass = createEClass(FOR_STATEMENT);
    createEReference(for_statementEClass, FOR_STATEMENT__ASSIGNMENT);
    createEReference(for_statementEClass, FOR_STATEMENT__EXPRESSION);
    createEReference(for_statementEClass, FOR_STATEMENT__STATEMENT);

    conditional_statementEClass = createEClass(CONDITIONAL_STATEMENT);
    createEReference(conditional_statementEClass, CONDITIONAL_STATEMENT__IF_STMT);
    createEReference(conditional_statementEClass, CONDITIONAL_STATEMENT__CASE_STMT);

    if_statementEClass = createEClass(IF_STATEMENT);
    createEReference(if_statementEClass, IF_STATEMENT__EXPRESSION);
    createEReference(if_statementEClass, IF_STATEMENT__IF_STATEMENT);
    createEReference(if_statementEClass, IF_STATEMENT__ELSE_STATEMENT);

    case_statementEClass = createEClass(CASE_STATEMENT);
    createEReference(case_statementEClass, CASE_STATEMENT__EXPRESSION);
    createEReference(case_statementEClass, CASE_STATEMENT__CASES);

    case_limbEClass = createEClass(CASE_LIMB);
    createEReference(case_limbEClass, CASE_LIMB__CASES);
    createEReference(case_limbEClass, CASE_LIMB__STATEMENT);

    case_label_listEClass = createEClass(CASE_LABEL_LIST);
    createEReference(case_label_listEClass, CASE_LABEL_LIST__CONSTANTS);

    constantEClass = createEClass(CONSTANT);
    createEAttribute(constantEClass, CONSTANT__OPTERATOR);
    createEAttribute(constantEClass, CONSTANT__NAME);
    createEReference(constantEClass, CONSTANT__NUMBER);
    createEAttribute(constantEClass, CONSTANT__STRING);
    createEAttribute(constantEClass, CONSTANT__BOOL_LITERAL);
    createEAttribute(constantEClass, CONSTANT__NIL);

    with_statementEClass = createEClass(WITH_STATEMENT);
    createEReference(with_statementEClass, WITH_STATEMENT__VARIABLES);
    createEReference(with_statementEClass, WITH_STATEMENT__STATEMENT);

    goto_statementEClass = createEClass(GOTO_STATEMENT);
    createEReference(goto_statementEClass, GOTO_STATEMENT__LABEL);

    label_declaration_partEClass = createEClass(LABEL_DECLARATION_PART);
    createEReference(label_declaration_partEClass, LABEL_DECLARATION_PART__LABELS);

    constant_definition_partEClass = createEClass(CONSTANT_DEFINITION_PART);
    createEReference(constant_definition_partEClass, CONSTANT_DEFINITION_PART__CONSTS);

    constant_definitionEClass = createEClass(CONSTANT_DEFINITION);
    createEAttribute(constant_definitionEClass, CONSTANT_DEFINITION__NAME);
    createEReference(constant_definitionEClass, CONSTANT_DEFINITION__CONST);

    type_definition_partEClass = createEClass(TYPE_DEFINITION_PART);
    createEReference(type_definition_partEClass, TYPE_DEFINITION_PART__TYPES);

    type_definitionEClass = createEClass(TYPE_DEFINITION);
    createEAttribute(type_definitionEClass, TYPE_DEFINITION__NAME);
    createEReference(type_definitionEClass, TYPE_DEFINITION__TYPE);

    typeEClass = createEClass(TYPE);
    createEReference(typeEClass, TYPE__SIMPLE);
    createEReference(typeEClass, TYPE__STRUCTURED);
    createEReference(typeEClass, TYPE__POINTER);

    simple_typeEClass = createEClass(SIMPLE_TYPE);
    createEReference(simple_typeEClass, SIMPLE_TYPE__SUBRANGE);
    createEReference(simple_typeEClass, SIMPLE_TYPE__ENUMERATED);
    createEAttribute(simple_typeEClass, SIMPLE_TYPE__NAME);

    subrange_typeEClass = createEClass(SUBRANGE_TYPE);
    createEReference(subrange_typeEClass, SUBRANGE_TYPE__INITIAL_CONST);
    createEReference(subrange_typeEClass, SUBRANGE_TYPE__FINAL_CONST);
    createEAttribute(subrange_typeEClass, SUBRANGE_TYPE__SUBRANGE);
    createEReference(subrange_typeEClass, SUBRANGE_TYPE__CONST);

    enumerated_typeEClass = createEClass(ENUMERATED_TYPE);
    createEReference(enumerated_typeEClass, ENUMERATED_TYPE__IDENTIFIERS);

    structured_typeEClass = createEClass(STRUCTURED_TYPE);
    createEAttribute(structured_typeEClass, STRUCTURED_TYPE__PACKED);
    createEReference(structured_typeEClass, STRUCTURED_TYPE__TYPE);

    unpacked_structured_typeEClass = createEClass(UNPACKED_STRUCTURED_TYPE);
    createEReference(unpacked_structured_typeEClass, UNPACKED_STRUCTURED_TYPE__ARRAY);
    createEReference(unpacked_structured_typeEClass, UNPACKED_STRUCTURED_TYPE__DYNAMIC);
    createEReference(unpacked_structured_typeEClass, UNPACKED_STRUCTURED_TYPE__RECORD);
    createEReference(unpacked_structured_typeEClass, UNPACKED_STRUCTURED_TYPE__SET);
    createEReference(unpacked_structured_typeEClass, UNPACKED_STRUCTURED_TYPE__FILE);

    array_typeEClass = createEClass(ARRAY_TYPE);
    createEReference(array_typeEClass, ARRAY_TYPE__INDEXES);
    createEReference(array_typeEClass, ARRAY_TYPE__TYPE);

    dynamic_array_typeEClass = createEClass(DYNAMIC_ARRAY_TYPE);
    createEReference(dynamic_array_typeEClass, DYNAMIC_ARRAY_TYPE__TYPE);

    index_typeEClass = createEClass(INDEX_TYPE);
    createEReference(index_typeEClass, INDEX_TYPE__TYPE);

    record_typeEClass = createEClass(RECORD_TYPE);
    createEAttribute(record_typeEClass, RECORD_TYPE__RECORD_KEYWORD);
    createEReference(record_typeEClass, RECORD_TYPE__FIELDS);
    createEAttribute(record_typeEClass, RECORD_TYPE__END_KEYWORD);

    field_listEClass = createEClass(FIELD_LIST);
    createEReference(field_listEClass, FIELD_LIST__FIXED);
    createEReference(field_listEClass, FIELD_LIST__VARIANTS);

    fixed_partEClass = createEClass(FIXED_PART);
    createEReference(fixed_partEClass, FIXED_PART__SECTIONS);

    variable_identifier_listEClass = createEClass(VARIABLE_IDENTIFIER_LIST);
    createEAttribute(variable_identifier_listEClass, VARIABLE_IDENTIFIER_LIST__NAMES);

    variable_sectionEClass = createEClass(VARIABLE_SECTION);
    createEReference(variable_sectionEClass, VARIABLE_SECTION__IDENTIFIERS);
    createEReference(variable_sectionEClass, VARIABLE_SECTION__TYPE);

    record_sectionEClass = createEClass(RECORD_SECTION);
    createEReference(record_sectionEClass, RECORD_SECTION__IDENTIFIERS);
    createEReference(record_sectionEClass, RECORD_SECTION__TYPE);

    variant_partEClass = createEClass(VARIANT_PART);
    createEReference(variant_partEClass, VARIANT_PART__TAG);
    createEAttribute(variant_partEClass, VARIANT_PART__NAME);
    createEReference(variant_partEClass, VARIANT_PART__VARIANTS);

    tag_fieldEClass = createEClass(TAG_FIELD);
    createEAttribute(tag_fieldEClass, TAG_FIELD__NAME);

    variantEClass = createEClass(VARIANT);
    createEReference(variantEClass, VARIANT__LABELS);
    createEReference(variantEClass, VARIANT__FIELDS);

    set_typeEClass = createEClass(SET_TYPE);
    createEReference(set_typeEClass, SET_TYPE__TYPE);

    file_typeEClass = createEClass(FILE_TYPE);
    createEReference(file_typeEClass, FILE_TYPE__TYPE);

    pointer_typeEClass = createEClass(POINTER_TYPE);
    createEReference(pointer_typeEClass, POINTER_TYPE__TYPE);

    variable_declaration_partEClass = createEClass(VARIABLE_DECLARATION_PART);
    createEReference(variable_declaration_partEClass, VARIABLE_DECLARATION_PART__SECTIONS);

    procedure_and_function_declaration_partEClass = createEClass(PROCEDURE_AND_FUNCTION_DECLARATION_PART);
    createEReference(procedure_and_function_declaration_partEClass, PROCEDURE_AND_FUNCTION_DECLARATION_PART__PROCEDURES);
    createEReference(procedure_and_function_declaration_partEClass, PROCEDURE_AND_FUNCTION_DECLARATION_PART__FUNCTIONS);

    abstraction_declarationEClass = createEClass(ABSTRACTION_DECLARATION);
    createEReference(abstraction_declarationEClass, ABSTRACTION_DECLARATION__HEADING);
    createEReference(abstraction_declarationEClass, ABSTRACTION_DECLARATION__BLOCK);
    createEAttribute(abstraction_declarationEClass, ABSTRACTION_DECLARATION__FORWARD);

    abstraction_headingEClass = createEClass(ABSTRACTION_HEADING);
    createEAttribute(abstraction_headingEClass, ABSTRACTION_HEADING__NAME);
    createEReference(abstraction_headingEClass, ABSTRACTION_HEADING__PARAMETERS);
    createEAttribute(abstraction_headingEClass, ABSTRACTION_HEADING__RETURN_TYPE);

    formal_parameter_listEClass = createEClass(FORMAL_PARAMETER_LIST);
    createEReference(formal_parameter_listEClass, FORMAL_PARAMETER_LIST__PARAMETERS);

    formal_parameter_sectionEClass = createEClass(FORMAL_PARAMETER_SECTION);
    createEReference(formal_parameter_sectionEClass, FORMAL_PARAMETER_SECTION__VALUE);
    createEReference(formal_parameter_sectionEClass, FORMAL_PARAMETER_SECTION__VARIABLE);
    createEReference(formal_parameter_sectionEClass, FORMAL_PARAMETER_SECTION__PROCEDURE);
    createEReference(formal_parameter_sectionEClass, FORMAL_PARAMETER_SECTION__FUNCTION);

    value_parameter_sectionEClass = createEClass(VALUE_PARAMETER_SECTION);
    createEReference(value_parameter_sectionEClass, VALUE_PARAMETER_SECTION__IDENTIFIERS);
    createEReference(value_parameter_sectionEClass, VALUE_PARAMETER_SECTION__TYPE);

    parameter_typeEClass = createEClass(PARAMETER_TYPE);
    createEReference(parameter_typeEClass, PARAMETER_TYPE__ARRAY);
    createEAttribute(parameter_typeEClass, PARAMETER_TYPE__NAME);

    conformant_array_schemaEClass = createEClass(CONFORMANT_ARRAY_SCHEMA);
    createEReference(conformant_array_schemaEClass, CONFORMANT_ARRAY_SCHEMA__PACKED);
    createEReference(conformant_array_schemaEClass, CONFORMANT_ARRAY_SCHEMA__UNPACKED);

    packed_conformant_array_schemaEClass = createEClass(PACKED_CONFORMANT_ARRAY_SCHEMA);
    createEReference(packed_conformant_array_schemaEClass, PACKED_CONFORMANT_ARRAY_SCHEMA__BOUND);
    createEAttribute(packed_conformant_array_schemaEClass, PACKED_CONFORMANT_ARRAY_SCHEMA__NAME);

    bound_specificationEClass = createEClass(BOUND_SPECIFICATION);
    createEAttribute(bound_specificationEClass, BOUND_SPECIFICATION__INITIAL);
    createEAttribute(bound_specificationEClass, BOUND_SPECIFICATION__FINAL);
    createEAttribute(bound_specificationEClass, BOUND_SPECIFICATION__NAME);

    unpacked_conformant_array_schemaEClass = createEClass(UNPACKED_CONFORMANT_ARRAY_SCHEMA);
    createEReference(unpacked_conformant_array_schemaEClass, UNPACKED_CONFORMANT_ARRAY_SCHEMA__BOUNDS);
    createEReference(unpacked_conformant_array_schemaEClass, UNPACKED_CONFORMANT_ARRAY_SCHEMA__TYPE);

    variable_parameter_sectionEClass = createEClass(VARIABLE_PARAMETER_SECTION);
    createEReference(variable_parameter_sectionEClass, VARIABLE_PARAMETER_SECTION__IDENTIFIERS);
    createEReference(variable_parameter_sectionEClass, VARIABLE_PARAMETER_SECTION__TYPE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    abstraction_headingEClass.getESuperTypes().add(this.getabstraction_declaration());

    // Initialize classes and features; add operations and parameters
    initEClass(pascalEClass, pascal.class, "pascal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getpascal_Program(), this.getprogram(), null, "program", null, 0, -1, pascal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(programEClass, program.class, "program", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getprogram_Heading(), this.getprogram_heading_block(), null, "heading", null, 0, 1, program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getprogram_Block(), this.getblock(), null, "block", null, 0, 1, program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(program_heading_blockEClass, program_heading_block.class, "program_heading_block", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getprogram_heading_block_Name(), ecorePackage.getEString(), "name", null, 0, 1, program_heading_block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getprogram_heading_block_Identifiers(), this.getidentifier_list(), null, "identifiers", null, 0, 1, program_heading_block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(identifier_listEClass, identifier_list.class, "identifier_list", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getidentifier_list_Names(), ecorePackage.getEString(), "names", null, 0, -1, identifier_list.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(blockEClass, block.class, "block", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getblock_Label(), this.getlabel_declaration_part(), null, "label", null, 0, 1, block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getblock_Constant(), this.getconstant_definition_part(), null, "constant", null, 0, 1, block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getblock_Type(), this.gettype_definition_part(), null, "type", null, 0, 1, block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getblock_Variable(), this.getvariable_declaration_part(), null, "variable", null, 0, 1, block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getblock_Abstraction(), this.getprocedure_and_function_declaration_part(), null, "abstraction", null, 0, 1, block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getblock_Statement(), this.getstatement_part(), null, "statement", null, 0, 1, block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(statement_partEClass, statement_part.class, "statement_part", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getstatement_part_Sequence(), this.getstatement_sequence(), null, "sequence", null, 0, 1, statement_part.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(statement_sequenceEClass, statement_sequence.class, "statement_sequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getstatement_sequence_Statements(), this.getstatement(), null, "statements", null, 0, -1, statement_sequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(statementEClass, statement.class, "statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getstatement_Label(), this.getlabel(), null, "label", null, 0, 1, statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getstatement_Simple(), this.getsimple_statement(), null, "simple", null, 0, 1, statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getstatement_Structured(), this.getstructured_statement(), null, "structured", null, 0, 1, statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(labelEClass, label.class, "label", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getlabel_Number(), ecorePackage.getEString(), "number", null, 0, 1, label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(simple_statementEClass, simple_statement.class, "simple_statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getsimple_statement_Assignment(), this.getassignment_statement(), null, "assignment", null, 0, 1, simple_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getsimple_statement_Function(), this.getfunction_designator(), null, "function", null, 0, 1, simple_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getsimple_statement_Goto(), this.getgoto_statement(), null, "goto", null, 0, 1, simple_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getsimple_statement_Function_noargs(), ecorePackage.getEString(), "function_noargs", null, 0, 1, simple_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(assignment_statementEClass, assignment_statement.class, "assignment_statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getassignment_statement_Variable(), this.getvariable(), null, "variable", null, 0, 1, assignment_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getassignment_statement_Expression(), this.getexpression(), null, "expression", null, 0, 1, assignment_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableEClass, variable.class, "variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getvariable_Name(), ecorePackage.getEString(), "name", null, 0, 1, variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getvariable_Variable(), this.getvar_(), null, "variable", null, 0, 1, variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(var_EClass, var_.class, "var_", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getvar__Expressions(), this.getexpression_list(), null, "expressions", null, 0, 1, var_.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getvar__Array(), this.getvar_(), null, "array", null, 0, 1, var_.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getvar__Accessor(), ecorePackage.getEBoolean(), "accessor", null, 0, 1, var_.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getvar__Name(), ecorePackage.getEString(), "name", null, 0, 1, var_.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getvar__Variable(), this.getvar_(), null, "variable", null, 0, 1, var_.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getvar__Pointer(), this.getvar_(), null, "pointer", null, 0, 1, var_.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expression_listEClass, expression_list.class, "expression_list", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getexpression_list_Expressions(), this.getexpression(), null, "expressions", null, 0, -1, expression_list.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionEClass, expression.class, "expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getexpression_Expressions(), this.getsimple_expression(), null, "expressions", null, 0, -1, expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getexpression_Operators(), ecorePackage.getEString(), "operators", null, 0, -1, expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(simple_expressionEClass, simple_expression.class, "simple_expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getsimple_expression_PrefixOperator(), ecorePackage.getEString(), "prefixOperator", null, 0, 1, simple_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getsimple_expression_Terms(), ecorePackage.getEObject(), null, "terms", null, 0, -1, simple_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getsimple_expression_Operators(), ecorePackage.getEString(), "operators", null, 0, -1, simple_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(termEClass, term.class, "term", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getterm_Factors(), this.getfactor(), null, "factors", null, 0, -1, term.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getterm_Operators(), ecorePackage.getEString(), "operators", null, 0, -1, term.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(factorEClass, factor.class, "factor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getfactor_Variable(), this.getvariable(), null, "variable", null, 0, 1, factor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getfactor_Number(), this.getnumber(), null, "number", null, 0, 1, factor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getfactor_String(), ecorePackage.getEString(), "string", null, 0, 1, factor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getfactor_Set(), this.getset(), null, "set", null, 0, 1, factor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getfactor_Nil(), ecorePackage.getEBoolean(), "nil", null, 0, 1, factor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getfactor_Boolean(), ecorePackage.getEString(), "boolean", null, 0, 1, factor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getfactor_Function(), this.getfunction_designator(), null, "function", null, 0, 1, factor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getfactor_Expression(), this.getexpression(), null, "expression", null, 0, 1, factor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getfactor_Not(), this.getfactor(), null, "not", null, 0, 1, factor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(numberEClass, number.class, "number", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getnumber_Number(), this.getany_number(), null, "number", null, 0, 1, number.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(any_numberEClass, any_number.class, "any_number", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getany_number_Integer(), ecorePackage.getEString(), "integer", null, 0, 1, any_number.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getany_number_Real(), ecorePackage.getEString(), "real", null, 0, 1, any_number.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(setEClass, set.class, "set", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getset_Brackets(), ecorePackage.getEString(), "brackets", null, 0, -1, set.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getset_Expressions(), this.getexpression_list(), null, "expressions", null, 0, 1, set.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(function_designatorEClass, function_designator.class, "function_designator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getfunction_designator_Name(), ecorePackage.getEString(), "name", null, 0, 1, function_designator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getfunction_designator_Expressions(), this.getexpression_list(), null, "expressions", null, 0, 1, function_designator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(structured_statementEClass, structured_statement.class, "structured_statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getstructured_statement_Compound(), this.getcompound_statement(), null, "compound", null, 0, 1, structured_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getstructured_statement_Repetitive(), this.getrepetitive_statement(), null, "repetitive", null, 0, 1, structured_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getstructured_statement_Conditional(), this.getconditional_statement(), null, "conditional", null, 0, 1, structured_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getstructured_statement_WithStmt(), this.getwith_statement(), null, "withStmt", null, 0, 1, structured_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(compound_statementEClass, compound_statement.class, "compound_statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getcompound_statement_Sequence(), this.getstatement_sequence(), null, "sequence", null, 0, 1, compound_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(repetitive_statementEClass, repetitive_statement.class, "repetitive_statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getrepetitive_statement_WhileStmt(), this.getwhile_statement(), null, "whileStmt", null, 0, 1, repetitive_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getrepetitive_statement_RepeatStmt(), this.getrepeat_statement(), null, "repeatStmt", null, 0, 1, repetitive_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getrepetitive_statement_ForStmt(), this.getfor_statement(), null, "forStmt", null, 0, 1, repetitive_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(while_statementEClass, while_statement.class, "while_statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getwhile_statement_Expression(), this.getexpression(), null, "expression", null, 0, 1, while_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getwhile_statement_Statement(), this.getstatement(), null, "statement", null, 0, 1, while_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(repeat_statementEClass, repeat_statement.class, "repeat_statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getrepeat_statement_Sequence(), this.getstatement_sequence(), null, "sequence", null, 0, 1, repeat_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getrepeat_statement_Expression(), this.getexpression(), null, "expression", null, 0, 1, repeat_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(for_statementEClass, for_statement.class, "for_statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getfor_statement_Assignment(), this.getassignment_statement(), null, "assignment", null, 0, 1, for_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getfor_statement_Expression(), this.getexpression(), null, "expression", null, 0, 1, for_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getfor_statement_Statement(), this.getstatement(), null, "statement", null, 0, 1, for_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(conditional_statementEClass, conditional_statement.class, "conditional_statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getconditional_statement_IfStmt(), this.getif_statement(), null, "ifStmt", null, 0, 1, conditional_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getconditional_statement_CaseStmt(), this.getcase_statement(), null, "caseStmt", null, 0, 1, conditional_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(if_statementEClass, if_statement.class, "if_statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getif_statement_Expression(), this.getexpression(), null, "expression", null, 0, 1, if_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getif_statement_IfStatement(), this.getstatement(), null, "ifStatement", null, 0, 1, if_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getif_statement_ElseStatement(), this.getstatement(), null, "elseStatement", null, 0, 1, if_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(case_statementEClass, case_statement.class, "case_statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getcase_statement_Expression(), this.getexpression(), null, "expression", null, 0, 1, case_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getcase_statement_Cases(), this.getcase_limb(), null, "cases", null, 0, -1, case_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(case_limbEClass, case_limb.class, "case_limb", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getcase_limb_Cases(), this.getcase_label_list(), null, "cases", null, 0, 1, case_limb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getcase_limb_Statement(), this.getstatement(), null, "statement", null, 0, 1, case_limb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(case_label_listEClass, case_label_list.class, "case_label_list", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getcase_label_list_Constants(), this.getconstant(), null, "constants", null, 0, -1, case_label_list.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constantEClass, constant.class, "constant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getconstant_Opterator(), ecorePackage.getEString(), "opterator", null, 0, 1, constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getconstant_Name(), ecorePackage.getEString(), "name", null, 0, 1, constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getconstant_Number(), this.getnumber(), null, "number", null, 0, 1, constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getconstant_String(), ecorePackage.getEString(), "string", null, 0, 1, constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getconstant_BoolLiteral(), ecorePackage.getEString(), "boolLiteral", null, 0, 1, constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getconstant_Nil(), ecorePackage.getEString(), "nil", null, 0, 1, constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(with_statementEClass, with_statement.class, "with_statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getwith_statement_Variables(), this.getvariable(), null, "variables", null, 0, -1, with_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getwith_statement_Statement(), this.getstatement(), null, "statement", null, 0, 1, with_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(goto_statementEClass, goto_statement.class, "goto_statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getgoto_statement_Label(), this.getlabel(), null, "label", null, 0, 1, goto_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(label_declaration_partEClass, label_declaration_part.class, "label_declaration_part", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getlabel_declaration_part_Labels(), this.getlabel(), null, "labels", null, 0, -1, label_declaration_part.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constant_definition_partEClass, constant_definition_part.class, "constant_definition_part", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getconstant_definition_part_Consts(), this.getconstant_definition(), null, "consts", null, 0, -1, constant_definition_part.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constant_definitionEClass, constant_definition.class, "constant_definition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getconstant_definition_Name(), ecorePackage.getEString(), "name", null, 0, 1, constant_definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getconstant_definition_Const(), this.getconstant(), null, "const", null, 0, 1, constant_definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(type_definition_partEClass, type_definition_part.class, "type_definition_part", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(gettype_definition_part_Types(), this.gettype_definition(), null, "types", null, 0, -1, type_definition_part.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(type_definitionEClass, type_definition.class, "type_definition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(gettype_definition_Name(), ecorePackage.getEString(), "name", null, 0, 1, type_definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(gettype_definition_Type(), this.gettype(), null, "type", null, 0, 1, type_definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeEClass, type.class, "type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(gettype_Simple(), this.getsimple_type(), null, "simple", null, 0, 1, type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(gettype_Structured(), this.getstructured_type(), null, "structured", null, 0, 1, type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(gettype_Pointer(), this.getpointer_type(), null, "pointer", null, 0, 1, type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(simple_typeEClass, simple_type.class, "simple_type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getsimple_type_Subrange(), this.getsubrange_type(), null, "subrange", null, 0, 1, simple_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getsimple_type_Enumerated(), this.getenumerated_type(), null, "enumerated", null, 0, 1, simple_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getsimple_type_Name(), ecorePackage.getEString(), "name", null, 0, 1, simple_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(subrange_typeEClass, subrange_type.class, "subrange_type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getsubrange_type_InitialConst(), this.getconstant(), null, "initialConst", null, 0, 1, subrange_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getsubrange_type_FinalConst(), this.getconstant(), null, "finalConst", null, 0, 1, subrange_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getsubrange_type_Subrange(), ecorePackage.getEString(), "subrange", null, 0, 1, subrange_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getsubrange_type_Const(), this.getconstant(), null, "const", null, 0, 1, subrange_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enumerated_typeEClass, enumerated_type.class, "enumerated_type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getenumerated_type_Identifiers(), this.getidentifier_list(), null, "identifiers", null, 0, 1, enumerated_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(structured_typeEClass, structured_type.class, "structured_type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getstructured_type_Packed(), ecorePackage.getEBoolean(), "packed", null, 0, 1, structured_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getstructured_type_Type(), this.getunpacked_structured_type(), null, "type", null, 0, 1, structured_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(unpacked_structured_typeEClass, unpacked_structured_type.class, "unpacked_structured_type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getunpacked_structured_type_Array(), this.getarray_type(), null, "array", null, 0, 1, unpacked_structured_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getunpacked_structured_type_Dynamic(), this.getdynamic_array_type(), null, "dynamic", null, 0, 1, unpacked_structured_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getunpacked_structured_type_Record(), this.getrecord_type(), null, "record", null, 0, 1, unpacked_structured_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getunpacked_structured_type_Set(), this.getset_type(), null, "set", null, 0, 1, unpacked_structured_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getunpacked_structured_type_File(), this.getfile_type(), null, "file", null, 0, 1, unpacked_structured_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(array_typeEClass, array_type.class, "array_type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getarray_type_Indexes(), this.getindex_type(), null, "indexes", null, 0, -1, array_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getarray_type_Type(), this.gettype(), null, "type", null, 0, 1, array_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dynamic_array_typeEClass, dynamic_array_type.class, "dynamic_array_type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getdynamic_array_type_Type(), this.gettype(), null, "type", null, 0, 1, dynamic_array_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(index_typeEClass, index_type.class, "index_type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getindex_type_Type(), this.getsimple_type(), null, "type", null, 0, 1, index_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(record_typeEClass, record_type.class, "record_type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getrecord_type_RecordKeyword(), ecorePackage.getEString(), "recordKeyword", null, 0, 1, record_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getrecord_type_Fields(), this.getfield_list(), null, "fields", null, 0, 1, record_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getrecord_type_EndKeyword(), ecorePackage.getEString(), "endKeyword", null, 0, 1, record_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(field_listEClass, field_list.class, "field_list", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getfield_list_Fixed(), this.getfixed_part(), null, "fixed", null, 0, 1, field_list.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getfield_list_Variants(), this.getvariant_part(), null, "variants", null, 0, -1, field_list.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fixed_partEClass, fixed_part.class, "fixed_part", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getfixed_part_Sections(), this.getrecord_section(), null, "sections", null, 0, -1, fixed_part.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variable_identifier_listEClass, variable_identifier_list.class, "variable_identifier_list", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getvariable_identifier_list_Names(), ecorePackage.getEString(), "names", null, 0, -1, variable_identifier_list.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variable_sectionEClass, variable_section.class, "variable_section", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getvariable_section_Identifiers(), this.getvariable_identifier_list(), null, "identifiers", null, 0, 1, variable_section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getvariable_section_Type(), this.gettype(), null, "type", null, 0, 1, variable_section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(record_sectionEClass, record_section.class, "record_section", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getrecord_section_Identifiers(), this.getidentifier_list(), null, "identifiers", null, 0, 1, record_section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getrecord_section_Type(), this.gettype(), null, "type", null, 0, 1, record_section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variant_partEClass, variant_part.class, "variant_part", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getvariant_part_Tag(), this.gettag_field(), null, "tag", null, 0, 1, variant_part.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getvariant_part_Name(), ecorePackage.getEString(), "name", null, 0, 1, variant_part.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getvariant_part_Variants(), this.getvariant(), null, "variants", null, 0, -1, variant_part.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tag_fieldEClass, tag_field.class, "tag_field", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(gettag_field_Name(), ecorePackage.getEString(), "name", null, 0, 1, tag_field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variantEClass, variant.class, "variant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getvariant_Labels(), this.getcase_label_list(), null, "labels", null, 0, 1, variant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getvariant_Fields(), this.getfield_list(), null, "fields", null, 0, 1, variant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(set_typeEClass, set_type.class, "set_type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getset_type_Type(), this.gettype(), null, "type", null, 0, 1, set_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(file_typeEClass, file_type.class, "file_type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getfile_type_Type(), this.gettype(), null, "type", null, 0, 1, file_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pointer_typeEClass, pointer_type.class, "pointer_type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getpointer_type_Type(), this.gettype(), null, "type", null, 0, 1, pointer_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variable_declaration_partEClass, variable_declaration_part.class, "variable_declaration_part", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getvariable_declaration_part_Sections(), this.getvariable_section(), null, "sections", null, 0, -1, variable_declaration_part.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(procedure_and_function_declaration_partEClass, procedure_and_function_declaration_part.class, "procedure_and_function_declaration_part", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getprocedure_and_function_declaration_part_Procedures(), this.getabstraction_heading(), null, "procedures", null, 0, -1, procedure_and_function_declaration_part.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getprocedure_and_function_declaration_part_Functions(), this.getabstraction_declaration(), null, "functions", null, 0, -1, procedure_and_function_declaration_part.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abstraction_declarationEClass, abstraction_declaration.class, "abstraction_declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getabstraction_declaration_Heading(), this.getabstraction_heading(), null, "heading", null, 0, 1, abstraction_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getabstraction_declaration_Block(), this.getblock(), null, "block", null, 0, 1, abstraction_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getabstraction_declaration_Forward(), ecorePackage.getEBoolean(), "forward", null, 0, 1, abstraction_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abstraction_headingEClass, abstraction_heading.class, "abstraction_heading", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getabstraction_heading_Name(), ecorePackage.getEString(), "name", null, 0, 1, abstraction_heading.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getabstraction_heading_Parameters(), this.getformal_parameter_list(), null, "parameters", null, 0, 1, abstraction_heading.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getabstraction_heading_ReturnType(), ecorePackage.getEString(), "returnType", null, 0, 1, abstraction_heading.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(formal_parameter_listEClass, formal_parameter_list.class, "formal_parameter_list", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getformal_parameter_list_Parameters(), this.getformal_parameter_section(), null, "parameters", null, 0, -1, formal_parameter_list.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(formal_parameter_sectionEClass, formal_parameter_section.class, "formal_parameter_section", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getformal_parameter_section_Value(), this.getvalue_parameter_section(), null, "value", null, 0, 1, formal_parameter_section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getformal_parameter_section_Variable(), this.getvariable_parameter_section(), null, "variable", null, 0, 1, formal_parameter_section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getformal_parameter_section_Procedure(), this.getabstraction_heading(), null, "procedure", null, 0, 1, formal_parameter_section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getformal_parameter_section_Function(), this.getabstraction_heading(), null, "function", null, 0, 1, formal_parameter_section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(value_parameter_sectionEClass, value_parameter_section.class, "value_parameter_section", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getvalue_parameter_section_Identifiers(), this.getidentifier_list(), null, "identifiers", null, 0, 1, value_parameter_section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getvalue_parameter_section_Type(), this.getparameter_type(), null, "type", null, 0, 1, value_parameter_section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameter_typeEClass, parameter_type.class, "parameter_type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getparameter_type_Array(), this.getconformant_array_schema(), null, "array", null, 0, 1, parameter_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getparameter_type_Name(), ecorePackage.getEString(), "name", null, 0, 1, parameter_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(conformant_array_schemaEClass, conformant_array_schema.class, "conformant_array_schema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getconformant_array_schema_Packed(), this.getpacked_conformant_array_schema(), null, "packed", null, 0, 1, conformant_array_schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getconformant_array_schema_Unpacked(), this.getunpacked_conformant_array_schema(), null, "unpacked", null, 0, 1, conformant_array_schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(packed_conformant_array_schemaEClass, packed_conformant_array_schema.class, "packed_conformant_array_schema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getpacked_conformant_array_schema_Bound(), this.getbound_specification(), null, "bound", null, 0, 1, packed_conformant_array_schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getpacked_conformant_array_schema_Name(), ecorePackage.getEString(), "name", null, 0, 1, packed_conformant_array_schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bound_specificationEClass, bound_specification.class, "bound_specification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getbound_specification_Initial(), ecorePackage.getEString(), "initial", null, 0, 1, bound_specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getbound_specification_Final(), ecorePackage.getEString(), "final", null, 0, 1, bound_specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getbound_specification_Name(), ecorePackage.getEString(), "name", null, 0, 1, bound_specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(unpacked_conformant_array_schemaEClass, unpacked_conformant_array_schema.class, "unpacked_conformant_array_schema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getunpacked_conformant_array_schema_Bounds(), this.getbound_specification(), null, "bounds", null, 0, -1, unpacked_conformant_array_schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getunpacked_conformant_array_schema_Type(), this.getparameter_type(), null, "type", null, 0, 1, unpacked_conformant_array_schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variable_parameter_sectionEClass, variable_parameter_section.class, "variable_parameter_section", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getvariable_parameter_section_Identifiers(), this.getidentifier_list(), null, "identifiers", null, 0, 1, variable_parameter_section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getvariable_parameter_section_Type(), this.getparameter_type(), null, "type", null, 0, 1, variable_parameter_section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //PascalPackageImpl
