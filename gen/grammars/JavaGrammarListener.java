// Generated from C:/Users/headl/IdeaProjects/X-Bugs/src/grammars\JavaGrammar.g4 by ANTLR 4.7.2
package grammars;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavaGrammarParser}.
 */
public interface JavaGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(JavaGrammarParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(JavaGrammarParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(JavaGrammarParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(JavaGrammarParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#numericType}.
	 * @param ctx the parse tree
	 */
	void enterNumericType(JavaGrammarParser.NumericTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#numericType}.
	 * @param ctx the parse tree
	 */
	void exitNumericType(JavaGrammarParser.NumericTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#integralType}.
	 * @param ctx the parse tree
	 */
	void enterIntegralType(JavaGrammarParser.IntegralTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#integralType}.
	 * @param ctx the parse tree
	 */
	void exitIntegralType(JavaGrammarParser.IntegralTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#floatingPointType}.
	 * @param ctx the parse tree
	 */
	void enterFloatingPointType(JavaGrammarParser.FloatingPointTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#floatingPointType}.
	 * @param ctx the parse tree
	 */
	void exitFloatingPointType(JavaGrammarParser.FloatingPointTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void enterReferenceType(JavaGrammarParser.ReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void exitReferenceType(JavaGrammarParser.ReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(JavaGrammarParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(JavaGrammarParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#classType}.
	 * @param ctx the parse tree
	 */
	void enterClassType(JavaGrammarParser.ClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#classType}.
	 * @param ctx the parse tree
	 */
	void exitClassType(JavaGrammarParser.ClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassType_lf_classOrInterfaceType(JavaGrammarParser.ClassType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassType_lf_classOrInterfaceType(JavaGrammarParser.ClassType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassType_lfno_classOrInterfaceType(JavaGrammarParser.ClassType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassType_lfno_classOrInterfaceType(JavaGrammarParser.ClassType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#interfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType(JavaGrammarParser.InterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#interfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType(JavaGrammarParser.InterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#interfaceType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType_lf_classOrInterfaceType(JavaGrammarParser.InterfaceType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#interfaceType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType_lf_classOrInterfaceType(JavaGrammarParser.InterfaceType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#interfaceType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType_lfno_classOrInterfaceType(JavaGrammarParser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#interfaceType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType_lfno_classOrInterfaceType(JavaGrammarParser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#typeVariable}.
	 * @param ctx the parse tree
	 */
	void enterTypeVariable(JavaGrammarParser.TypeVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#typeVariable}.
	 * @param ctx the parse tree
	 */
	void exitTypeVariable(JavaGrammarParser.TypeVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(JavaGrammarParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(JavaGrammarParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#dims}.
	 * @param ctx the parse tree
	 */
	void enterDims(JavaGrammarParser.DimsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#dims}.
	 * @param ctx the parse tree
	 */
	void exitDims(JavaGrammarParser.DimsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(JavaGrammarParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(JavaGrammarParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#typeParameterModifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameterModifier(JavaGrammarParser.TypeParameterModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#typeParameterModifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameterModifier(JavaGrammarParser.TypeParameterModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeBound(JavaGrammarParser.TypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeBound(JavaGrammarParser.TypeBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#additionalBound}.
	 * @param ctx the parse tree
	 */
	void enterAdditionalBound(JavaGrammarParser.AdditionalBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#additionalBound}.
	 * @param ctx the parse tree
	 */
	void exitAdditionalBound(JavaGrammarParser.AdditionalBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(JavaGrammarParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(JavaGrammarParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentList(JavaGrammarParser.TypeArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentList(JavaGrammarParser.TypeArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(JavaGrammarParser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(JavaGrammarParser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#wildcard}.
	 * @param ctx the parse tree
	 */
	void enterWildcard(JavaGrammarParser.WildcardContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#wildcard}.
	 * @param ctx the parse tree
	 */
	void exitWildcard(JavaGrammarParser.WildcardContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#wildcardBounds}.
	 * @param ctx the parse tree
	 */
	void enterWildcardBounds(JavaGrammarParser.WildcardBoundsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#wildcardBounds}.
	 * @param ctx the parse tree
	 */
	void exitWildcardBounds(JavaGrammarParser.WildcardBoundsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#packageName}.
	 * @param ctx the parse tree
	 */
	void enterPackageName(JavaGrammarParser.PackageNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#packageName}.
	 * @param ctx the parse tree
	 */
	void exitPackageName(JavaGrammarParser.PackageNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(JavaGrammarParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(JavaGrammarParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 */
	void enterPackageOrTypeName(JavaGrammarParser.PackageOrTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 */
	void exitPackageOrTypeName(JavaGrammarParser.PackageOrTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#expressionName}.
	 * @param ctx the parse tree
	 */
	void enterExpressionName(JavaGrammarParser.ExpressionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#expressionName}.
	 * @param ctx the parse tree
	 */
	void exitExpressionName(JavaGrammarParser.ExpressionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#methodName}.
	 * @param ctx the parse tree
	 */
	void enterMethodName(JavaGrammarParser.MethodNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#methodName}.
	 * @param ctx the parse tree
	 */
	void exitMethodName(JavaGrammarParser.MethodNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#ambiguousName}.
	 * @param ctx the parse tree
	 */
	void enterAmbiguousName(JavaGrammarParser.AmbiguousNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#ambiguousName}.
	 * @param ctx the parse tree
	 */
	void exitAmbiguousName(JavaGrammarParser.AmbiguousNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(JavaGrammarParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(JavaGrammarParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(JavaGrammarParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(JavaGrammarParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#packageModifier}.
	 * @param ctx the parse tree
	 */
	void enterPackageModifier(JavaGrammarParser.PackageModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#packageModifier}.
	 * @param ctx the parse tree
	 */
	void exitPackageModifier(JavaGrammarParser.PackageModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(JavaGrammarParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(JavaGrammarParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSingleTypeImportDeclaration(JavaGrammarParser.SingleTypeImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSingleTypeImportDeclaration(JavaGrammarParser.SingleTypeImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeImportOnDemandDeclaration(JavaGrammarParser.TypeImportOnDemandDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeImportOnDemandDeclaration(JavaGrammarParser.TypeImportOnDemandDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSingleStaticImportDeclaration(JavaGrammarParser.SingleStaticImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSingleStaticImportDeclaration(JavaGrammarParser.SingleStaticImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#staticImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStaticImportOnDemandDeclaration(JavaGrammarParser.StaticImportOnDemandDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#staticImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStaticImportOnDemandDeclaration(JavaGrammarParser.StaticImportOnDemandDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(JavaGrammarParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(JavaGrammarParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(JavaGrammarParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(JavaGrammarParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalClassDeclaration(JavaGrammarParser.NormalClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalClassDeclaration(JavaGrammarParser.NormalClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#classModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassModifier(JavaGrammarParser.ClassModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#classModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassModifier(JavaGrammarParser.ClassModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(JavaGrammarParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(JavaGrammarParser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#typeParameterList}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameterList(JavaGrammarParser.TypeParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#typeParameterList}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameterList(JavaGrammarParser.TypeParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#superclass}.
	 * @param ctx the parse tree
	 */
	void enterSuperclass(JavaGrammarParser.SuperclassContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#superclass}.
	 * @param ctx the parse tree
	 */
	void exitSuperclass(JavaGrammarParser.SuperclassContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#superinterfaces}.
	 * @param ctx the parse tree
	 */
	void enterSuperinterfaces(JavaGrammarParser.SuperinterfacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#superinterfaces}.
	 * @param ctx the parse tree
	 */
	void exitSuperinterfaces(JavaGrammarParser.SuperinterfacesContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#interfaceTypeList}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceTypeList(JavaGrammarParser.InterfaceTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#interfaceTypeList}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceTypeList(JavaGrammarParser.InterfaceTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(JavaGrammarParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(JavaGrammarParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(JavaGrammarParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(JavaGrammarParser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassMemberDeclaration(JavaGrammarParser.ClassMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassMemberDeclaration(JavaGrammarParser.ClassMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(JavaGrammarParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(JavaGrammarParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#fieldModifier}.
	 * @param ctx the parse tree
	 */
	void enterFieldModifier(JavaGrammarParser.FieldModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#fieldModifier}.
	 * @param ctx the parse tree
	 */
	void exitFieldModifier(JavaGrammarParser.FieldModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorList(JavaGrammarParser.VariableDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorList(JavaGrammarParser.VariableDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(JavaGrammarParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(JavaGrammarParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(JavaGrammarParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(JavaGrammarParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(JavaGrammarParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(JavaGrammarParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#unannType}.
	 * @param ctx the parse tree
	 */
	void enterUnannType(JavaGrammarParser.UnannTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#unannType}.
	 * @param ctx the parse tree
	 */
	void exitUnannType(JavaGrammarParser.UnannTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 */
	void enterUnannPrimitiveType(JavaGrammarParser.UnannPrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 */
	void exitUnannPrimitiveType(JavaGrammarParser.UnannPrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#unannReferenceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannReferenceType(JavaGrammarParser.UnannReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#unannReferenceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannReferenceType(JavaGrammarParser.UnannReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassOrInterfaceType(JavaGrammarParser.UnannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassOrInterfaceType(JavaGrammarParser.UnannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#unannClassType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType(JavaGrammarParser.UnannClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#unannClassType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType(JavaGrammarParser.UnannClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType_lf_unannClassOrInterfaceType(JavaGrammarParser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType_lf_unannClassOrInterfaceType(JavaGrammarParser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType_lfno_unannClassOrInterfaceType(JavaGrammarParser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType_lfno_unannClassOrInterfaceType(JavaGrammarParser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#unannInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType(JavaGrammarParser.UnannInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#unannInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType(JavaGrammarParser.UnannInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType_lf_unannClassOrInterfaceType(JavaGrammarParser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType_lf_unannClassOrInterfaceType(JavaGrammarParser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType_lfno_unannClassOrInterfaceType(JavaGrammarParser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType_lfno_unannClassOrInterfaceType(JavaGrammarParser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#unannTypeVariable}.
	 * @param ctx the parse tree
	 */
	void enterUnannTypeVariable(JavaGrammarParser.UnannTypeVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#unannTypeVariable}.
	 * @param ctx the parse tree
	 */
	void exitUnannTypeVariable(JavaGrammarParser.UnannTypeVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#unannArrayType}.
	 * @param ctx the parse tree
	 */
	void enterUnannArrayType(JavaGrammarParser.UnannArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#unannArrayType}.
	 * @param ctx the parse tree
	 */
	void exitUnannArrayType(JavaGrammarParser.UnannArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(JavaGrammarParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(JavaGrammarParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#methodModifier}.
	 * @param ctx the parse tree
	 */
	void enterMethodModifier(JavaGrammarParser.MethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#methodModifier}.
	 * @param ctx the parse tree
	 */
	void exitMethodModifier(JavaGrammarParser.MethodModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void enterMethodHeader(JavaGrammarParser.MethodHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void exitMethodHeader(JavaGrammarParser.MethodHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#result}.
	 * @param ctx the parse tree
	 */
	void enterResult(JavaGrammarParser.ResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#result}.
	 * @param ctx the parse tree
	 */
	void exitResult(JavaGrammarParser.ResultContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#methodDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclarator(JavaGrammarParser.MethodDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#methodDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclarator(JavaGrammarParser.MethodDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(JavaGrammarParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(JavaGrammarParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(JavaGrammarParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(JavaGrammarParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(JavaGrammarParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(JavaGrammarParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(JavaGrammarParser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(JavaGrammarParser.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameter(JavaGrammarParser.LastFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameter(JavaGrammarParser.LastFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void enterReceiverParameter(JavaGrammarParser.ReceiverParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void exitReceiverParameter(JavaGrammarParser.ReceiverParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#throws_}.
	 * @param ctx the parse tree
	 */
	void enterThrows_(JavaGrammarParser.Throws_Context ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#throws_}.
	 * @param ctx the parse tree
	 */
	void exitThrows_(JavaGrammarParser.Throws_Context ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#exceptionTypeList}.
	 * @param ctx the parse tree
	 */
	void enterExceptionTypeList(JavaGrammarParser.ExceptionTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#exceptionTypeList}.
	 * @param ctx the parse tree
	 */
	void exitExceptionTypeList(JavaGrammarParser.ExceptionTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#exceptionType}.
	 * @param ctx the parse tree
	 */
	void enterExceptionType(JavaGrammarParser.ExceptionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#exceptionType}.
	 * @param ctx the parse tree
	 */
	void exitExceptionType(JavaGrammarParser.ExceptionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(JavaGrammarParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(JavaGrammarParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#instanceInitializer}.
	 * @param ctx the parse tree
	 */
	void enterInstanceInitializer(JavaGrammarParser.InstanceInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#instanceInitializer}.
	 * @param ctx the parse tree
	 */
	void exitInstanceInitializer(JavaGrammarParser.InstanceInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#staticInitializer}.
	 * @param ctx the parse tree
	 */
	void enterStaticInitializer(JavaGrammarParser.StaticInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#staticInitializer}.
	 * @param ctx the parse tree
	 */
	void exitStaticInitializer(JavaGrammarParser.StaticInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(JavaGrammarParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(JavaGrammarParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#constructorModifier}.
	 * @param ctx the parse tree
	 */
	void enterConstructorModifier(JavaGrammarParser.ConstructorModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#constructorModifier}.
	 * @param ctx the parse tree
	 */
	void exitConstructorModifier(JavaGrammarParser.ConstructorModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#constructorDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclarator(JavaGrammarParser.ConstructorDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#constructorDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclarator(JavaGrammarParser.ConstructorDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#simpleTypeName}.
	 * @param ctx the parse tree
	 */
	void enterSimpleTypeName(JavaGrammarParser.SimpleTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#simpleTypeName}.
	 * @param ctx the parse tree
	 */
	void exitSimpleTypeName(JavaGrammarParser.SimpleTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void enterConstructorBody(JavaGrammarParser.ConstructorBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void exitConstructorBody(JavaGrammarParser.ConstructorBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitConstructorInvocation(JavaGrammarParser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitConstructorInvocation(JavaGrammarParser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(JavaGrammarParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(JavaGrammarParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#enumBody}.
	 * @param ctx the parse tree
	 */
	void enterEnumBody(JavaGrammarParser.EnumBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#enumBody}.
	 * @param ctx the parse tree
	 */
	void exitEnumBody(JavaGrammarParser.EnumBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#enumConstantList}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantList(JavaGrammarParser.EnumConstantListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#enumConstantList}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantList(JavaGrammarParser.EnumConstantListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstant(JavaGrammarParser.EnumConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstant(JavaGrammarParser.EnumConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#enumConstantModifier}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantModifier(JavaGrammarParser.EnumConstantModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#enumConstantModifier}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantModifier(JavaGrammarParser.EnumConstantModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterEnumBodyDeclarations(JavaGrammarParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitEnumBodyDeclarations(JavaGrammarParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(JavaGrammarParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(JavaGrammarParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalInterfaceDeclaration(JavaGrammarParser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalInterfaceDeclaration(JavaGrammarParser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#interfaceModifier}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceModifier(JavaGrammarParser.InterfaceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#interfaceModifier}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceModifier(JavaGrammarParser.InterfaceModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#extendsInterfaces}.
	 * @param ctx the parse tree
	 */
	void enterExtendsInterfaces(JavaGrammarParser.ExtendsInterfacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#extendsInterfaces}.
	 * @param ctx the parse tree
	 */
	void exitExtendsInterfaces(JavaGrammarParser.ExtendsInterfacesContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(JavaGrammarParser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(JavaGrammarParser.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDeclaration(JavaGrammarParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDeclaration(JavaGrammarParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclaration(JavaGrammarParser.ConstantDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclaration(JavaGrammarParser.ConstantDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#constantModifier}.
	 * @param ctx the parse tree
	 */
	void enterConstantModifier(JavaGrammarParser.ConstantModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#constantModifier}.
	 * @param ctx the parse tree
	 */
	void exitConstantModifier(JavaGrammarParser.ConstantModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodDeclaration(JavaGrammarParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodDeclaration(JavaGrammarParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodModifier(JavaGrammarParser.InterfaceMethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodModifier(JavaGrammarParser.InterfaceMethodModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeDeclaration(JavaGrammarParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeDeclaration(JavaGrammarParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeBody(JavaGrammarParser.AnnotationTypeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeBody(JavaGrammarParser.AnnotationTypeBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeMemberDeclaration(JavaGrammarParser.AnnotationTypeMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeMemberDeclaration(JavaGrammarParser.AnnotationTypeMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementDeclaration(JavaGrammarParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementDeclaration(JavaGrammarParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#annotationTypeElementModifier}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementModifier(JavaGrammarParser.AnnotationTypeElementModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#annotationTypeElementModifier}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementModifier(JavaGrammarParser.AnnotationTypeElementModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(JavaGrammarParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(JavaGrammarParser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(JavaGrammarParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(JavaGrammarParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#normalAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterNormalAnnotation(JavaGrammarParser.NormalAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#normalAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitNormalAnnotation(JavaGrammarParser.NormalAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#elementValuePairList}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairList(JavaGrammarParser.ElementValuePairListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#elementValuePairList}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairList(JavaGrammarParser.ElementValuePairListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePair(JavaGrammarParser.ElementValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePair(JavaGrammarParser.ElementValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue(JavaGrammarParser.ElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue(JavaGrammarParser.ElementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterElementValueArrayInitializer(JavaGrammarParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitElementValueArrayInitializer(JavaGrammarParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#elementValueList}.
	 * @param ctx the parse tree
	 */
	void enterElementValueList(JavaGrammarParser.ElementValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#elementValueList}.
	 * @param ctx the parse tree
	 */
	void exitElementValueList(JavaGrammarParser.ElementValueListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#markerAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterMarkerAnnotation(JavaGrammarParser.MarkerAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#markerAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitMarkerAnnotation(JavaGrammarParser.MarkerAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#singleElementAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterSingleElementAnnotation(JavaGrammarParser.SingleElementAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#singleElementAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitSingleElementAnnotation(JavaGrammarParser.SingleElementAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(JavaGrammarParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(JavaGrammarParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#variableInitializerList}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializerList(JavaGrammarParser.VariableInitializerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#variableInitializerList}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializerList(JavaGrammarParser.VariableInitializerListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#rtxcMethod}.
	 * @param ctx the parse tree
	 */
	void enterRtxcMethod(JavaGrammarParser.RtxcMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#rtxcMethod}.
	 * @param ctx the parse tree
	 */
	void exitRtxcMethod(JavaGrammarParser.RtxcMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#rcxcMethod}.
	 * @param ctx the parse tree
	 */
	void enterRcxcMethod(JavaGrammarParser.RcxcMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#rcxcMethod}.
	 * @param ctx the parse tree
	 */
	void exitRcxcMethod(JavaGrammarParser.RcxcMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#mxtMethod}.
	 * @param ctx the parse tree
	 */
	void enterMxtMethod(JavaGrammarParser.MxtMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#mxtMethod}.
	 * @param ctx the parse tree
	 */
	void exitMxtMethod(JavaGrammarParser.MxtMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#concurrentMethod}.
	 * @param ctx the parse tree
	 */
	void enterConcurrentMethod(JavaGrammarParser.ConcurrentMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#concurrentMethod}.
	 * @param ctx the parse tree
	 */
	void exitConcurrentMethod(JavaGrammarParser.ConcurrentMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#joinCall}.
	 * @param ctx the parse tree
	 */
	void enterJoinCall(JavaGrammarParser.JoinCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#joinCall}.
	 * @param ctx the parse tree
	 */
	void exitJoinCall(JavaGrammarParser.JoinCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#lockCall}.
	 * @param ctx the parse tree
	 */
	void enterLockCall(JavaGrammarParser.LockCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#lockCall}.
	 * @param ctx the parse tree
	 */
	void exitLockCall(JavaGrammarParser.LockCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#unlockCall}.
	 * @param ctx the parse tree
	 */
	void enterUnlockCall(JavaGrammarParser.UnlockCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#unlockCall}.
	 * @param ctx the parse tree
	 */
	void exitUnlockCall(JavaGrammarParser.UnlockCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#acquireCall}.
	 * @param ctx the parse tree
	 */
	void enterAcquireCall(JavaGrammarParser.AcquireCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#acquireCall}.
	 * @param ctx the parse tree
	 */
	void exitAcquireCall(JavaGrammarParser.AcquireCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#releaseCall}.
	 * @param ctx the parse tree
	 */
	void enterReleaseCall(JavaGrammarParser.ReleaseCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#releaseCall}.
	 * @param ctx the parse tree
	 */
	void exitReleaseCall(JavaGrammarParser.ReleaseCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#countDownCall}.
	 * @param ctx the parse tree
	 */
	void enterCountDownCall(JavaGrammarParser.CountDownCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#countDownCall}.
	 * @param ctx the parse tree
	 */
	void exitCountDownCall(JavaGrammarParser.CountDownCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#submitCall}.
	 * @param ctx the parse tree
	 */
	void enterSubmitCall(JavaGrammarParser.SubmitCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#submitCall}.
	 * @param ctx the parse tree
	 */
	void exitSubmitCall(JavaGrammarParser.SubmitCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#joinStatement}.
	 * @param ctx the parse tree
	 */
	void enterJoinStatement(JavaGrammarParser.JoinStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#joinStatement}.
	 * @param ctx the parse tree
	 */
	void exitJoinStatement(JavaGrammarParser.JoinStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#waitStatement}.
	 * @param ctx the parse tree
	 */
	void enterWaitStatement(JavaGrammarParser.WaitStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#waitStatement}.
	 * @param ctx the parse tree
	 */
	void exitWaitStatement(JavaGrammarParser.WaitStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#notifyStatement}.
	 * @param ctx the parse tree
	 */
	void enterNotifyStatement(JavaGrammarParser.NotifyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#notifyStatement}.
	 * @param ctx the parse tree
	 */
	void exitNotifyStatement(JavaGrammarParser.NotifyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#notifyAllStatement}.
	 * @param ctx the parse tree
	 */
	void enterNotifyAllStatement(JavaGrammarParser.NotifyAllStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#notifyAllStatement}.
	 * @param ctx the parse tree
	 */
	void exitNotifyAllStatement(JavaGrammarParser.NotifyAllStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#awaitStatement}.
	 * @param ctx the parse tree
	 */
	void enterAwaitStatement(JavaGrammarParser.AwaitStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#awaitStatement}.
	 * @param ctx the parse tree
	 */
	void exitAwaitStatement(JavaGrammarParser.AwaitStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#signalStatement}.
	 * @param ctx the parse tree
	 */
	void enterSignalStatement(JavaGrammarParser.SignalStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#signalStatement}.
	 * @param ctx the parse tree
	 */
	void exitSignalStatement(JavaGrammarParser.SignalStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#signalAllStatement}.
	 * @param ctx the parse tree
	 */
	void enterSignalAllStatement(JavaGrammarParser.SignalAllStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#signalAllStatement}.
	 * @param ctx the parse tree
	 */
	void exitSignalAllStatement(JavaGrammarParser.SignalAllStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#sleepStatement}.
	 * @param ctx the parse tree
	 */
	void enterSleepStatement(JavaGrammarParser.SleepStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#sleepStatement}.
	 * @param ctx the parse tree
	 */
	void exitSleepStatement(JavaGrammarParser.SleepStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#lockStatement}.
	 * @param ctx the parse tree
	 */
	void enterLockStatement(JavaGrammarParser.LockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#lockStatement}.
	 * @param ctx the parse tree
	 */
	void exitLockStatement(JavaGrammarParser.LockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#unlockStatement}.
	 * @param ctx the parse tree
	 */
	void enterUnlockStatement(JavaGrammarParser.UnlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#unlockStatement}.
	 * @param ctx the parse tree
	 */
	void exitUnlockStatement(JavaGrammarParser.UnlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#acquireStatement}.
	 * @param ctx the parse tree
	 */
	void enterAcquireStatement(JavaGrammarParser.AcquireStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#acquireStatement}.
	 * @param ctx the parse tree
	 */
	void exitAcquireStatement(JavaGrammarParser.AcquireStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#releaseStatement}.
	 * @param ctx the parse tree
	 */
	void enterReleaseStatement(JavaGrammarParser.ReleaseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#releaseStatement}.
	 * @param ctx the parse tree
	 */
	void exitReleaseStatement(JavaGrammarParser.ReleaseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#countDownStatement}.
	 * @param ctx the parse tree
	 */
	void enterCountDownStatement(JavaGrammarParser.CountDownStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#countDownStatement}.
	 * @param ctx the parse tree
	 */
	void exitCountDownStatement(JavaGrammarParser.CountDownStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#submitStatement}.
	 * @param ctx the parse tree
	 */
	void enterSubmitStatement(JavaGrammarParser.SubmitStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#submitStatement}.
	 * @param ctx the parse tree
	 */
	void exitSubmitStatement(JavaGrammarParser.SubmitStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#noParamEndStatement}.
	 * @param ctx the parse tree
	 */
	void enterNoParamEndStatement(JavaGrammarParser.NoParamEndStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#noParamEndStatement}.
	 * @param ctx the parse tree
	 */
	void exitNoParamEndStatement(JavaGrammarParser.NoParamEndStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#paramEndStatement}.
	 * @param ctx the parse tree
	 */
	void enterParamEndStatement(JavaGrammarParser.ParamEndStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#paramEndStatement}.
	 * @param ctx the parse tree
	 */
	void exitParamEndStatement(JavaGrammarParser.ParamEndStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#concurrentKeyword}.
	 * @param ctx the parse tree
	 */
	void enterConcurrentKeyword(JavaGrammarParser.ConcurrentKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#concurrentKeyword}.
	 * @param ctx the parse tree
	 */
	void exitConcurrentKeyword(JavaGrammarParser.ConcurrentKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(JavaGrammarParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(JavaGrammarParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatements(JavaGrammarParser.BlockStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatements(JavaGrammarParser.BlockStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(JavaGrammarParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(JavaGrammarParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationStatement(JavaGrammarParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationStatement(JavaGrammarParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(JavaGrammarParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(JavaGrammarParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(JavaGrammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(JavaGrammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#statementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterStatementNoShortIf(JavaGrammarParser.StatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#statementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitStatementNoShortIf(JavaGrammarParser.StatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 */
	void enterStatementWithoutTrailingSubstatement(JavaGrammarParser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 */
	void exitStatementWithoutTrailingSubstatement(JavaGrammarParser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(JavaGrammarParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(JavaGrammarParser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatement(JavaGrammarParser.LabeledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatement(JavaGrammarParser.LabeledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatementNoShortIf(JavaGrammarParser.LabeledStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatementNoShortIf(JavaGrammarParser.LabeledStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(JavaGrammarParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(JavaGrammarParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(JavaGrammarParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(JavaGrammarParser.StatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#ifThenStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfThenStatement(JavaGrammarParser.IfThenStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#ifThenStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfThenStatement(JavaGrammarParser.IfThenStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfThenElseStatement(JavaGrammarParser.IfThenElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfThenElseStatement(JavaGrammarParser.IfThenElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterIfThenElseStatementNoShortIf(JavaGrammarParser.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitIfThenElseStatementNoShortIf(JavaGrammarParser.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#assertStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssertStatement(JavaGrammarParser.AssertStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#assertStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssertStatement(JavaGrammarParser.AssertStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(JavaGrammarParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(JavaGrammarParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlock(JavaGrammarParser.SwitchBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlock(JavaGrammarParser.SwitchBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(JavaGrammarParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(JavaGrammarParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#switchLabels}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabels(JavaGrammarParser.SwitchLabelsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#switchLabels}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabels(JavaGrammarParser.SwitchLabelsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(JavaGrammarParser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(JavaGrammarParser.SwitchLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantName(JavaGrammarParser.EnumConstantNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantName(JavaGrammarParser.EnumConstantNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(JavaGrammarParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(JavaGrammarParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatementNoShortIf(JavaGrammarParser.WhileStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatementNoShortIf(JavaGrammarParser.WhileStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoStatement(JavaGrammarParser.DoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoStatement(JavaGrammarParser.DoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(JavaGrammarParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(JavaGrammarParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterForStatementNoShortIf(JavaGrammarParser.ForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitForStatementNoShortIf(JavaGrammarParser.ForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#basicForStatement}.
	 * @param ctx the parse tree
	 */
	void enterBasicForStatement(JavaGrammarParser.BasicForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#basicForStatement}.
	 * @param ctx the parse tree
	 */
	void exitBasicForStatement(JavaGrammarParser.BasicForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterBasicForStatementNoShortIf(JavaGrammarParser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitBasicForStatementNoShortIf(JavaGrammarParser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(JavaGrammarParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(JavaGrammarParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(JavaGrammarParser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(JavaGrammarParser.ForUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#statementExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpressionList(JavaGrammarParser.StatementExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#statementExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpressionList(JavaGrammarParser.StatementExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#enhancedForStatement}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForStatement(JavaGrammarParser.EnhancedForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#enhancedForStatement}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForStatement(JavaGrammarParser.EnhancedForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#enhancedForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForStatementNoShortIf(JavaGrammarParser.EnhancedForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#enhancedForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForStatementNoShortIf(JavaGrammarParser.EnhancedForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(JavaGrammarParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(JavaGrammarParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(JavaGrammarParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(JavaGrammarParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(JavaGrammarParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(JavaGrammarParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void enterThrowStatement(JavaGrammarParser.ThrowStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void exitThrowStatement(JavaGrammarParser.ThrowStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#synchronizedStatement}.
	 * @param ctx the parse tree
	 */
	void enterSynchronizedStatement(JavaGrammarParser.SynchronizedStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#synchronizedStatement}.
	 * @param ctx the parse tree
	 */
	void exitSynchronizedStatement(JavaGrammarParser.SynchronizedStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryStatement(JavaGrammarParser.TryStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryStatement(JavaGrammarParser.TryStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#catches}.
	 * @param ctx the parse tree
	 */
	void enterCatches(JavaGrammarParser.CatchesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#catches}.
	 * @param ctx the parse tree
	 */
	void exitCatches(JavaGrammarParser.CatchesContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(JavaGrammarParser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(JavaGrammarParser.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#catchFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterCatchFormalParameter(JavaGrammarParser.CatchFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#catchFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitCatchFormalParameter(JavaGrammarParser.CatchFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#catchType}.
	 * @param ctx the parse tree
	 */
	void enterCatchType(JavaGrammarParser.CatchTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#catchType}.
	 * @param ctx the parse tree
	 */
	void exitCatchType(JavaGrammarParser.CatchTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#finally_}.
	 * @param ctx the parse tree
	 */
	void enterFinally_(JavaGrammarParser.Finally_Context ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#finally_}.
	 * @param ctx the parse tree
	 */
	void exitFinally_(JavaGrammarParser.Finally_Context ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#tryWithResourcesStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryWithResourcesStatement(JavaGrammarParser.TryWithResourcesStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#tryWithResourcesStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryWithResourcesStatement(JavaGrammarParser.TryWithResourcesStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void enterResourceSpecification(JavaGrammarParser.ResourceSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void exitResourceSpecification(JavaGrammarParser.ResourceSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#resourceList}.
	 * @param ctx the parse tree
	 */
	void enterResourceList(JavaGrammarParser.ResourceListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#resourceList}.
	 * @param ctx the parse tree
	 */
	void exitResourceList(JavaGrammarParser.ResourceListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(JavaGrammarParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(JavaGrammarParser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(JavaGrammarParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(JavaGrammarParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray(JavaGrammarParser.PrimaryNoNewArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray(JavaGrammarParser.PrimaryNoNewArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_arrayAccess(JavaGrammarParser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_arrayAccess(JavaGrammarParser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_arrayAccess(JavaGrammarParser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_arrayAccess(JavaGrammarParser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary(JavaGrammarParser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary(JavaGrammarParser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(JavaGrammarParser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(JavaGrammarParser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(JavaGrammarParser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(JavaGrammarParser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary(JavaGrammarParser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary(JavaGrammarParser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(JavaGrammarParser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(JavaGrammarParser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(JavaGrammarParser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(JavaGrammarParser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression(JavaGrammarParser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression(JavaGrammarParser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression_lf_primary(JavaGrammarParser.ClassInstanceCreationExpression_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression_lf_primary(JavaGrammarParser.ClassInstanceCreationExpression_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression_lfno_primary(JavaGrammarParser.ClassInstanceCreationExpression_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression_lfno_primary(JavaGrammarParser.ClassInstanceCreationExpression_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentsOrDiamond(JavaGrammarParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentsOrDiamond(JavaGrammarParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess(JavaGrammarParser.FieldAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess(JavaGrammarParser.FieldAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess_lf_primary(JavaGrammarParser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess_lf_primary(JavaGrammarParser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess_lfno_primary(JavaGrammarParser.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess_lfno_primary(JavaGrammarParser.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess(JavaGrammarParser.ArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess(JavaGrammarParser.ArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess_lf_primary(JavaGrammarParser.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess_lf_primary(JavaGrammarParser.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess_lfno_primary(JavaGrammarParser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess_lfno_primary(JavaGrammarParser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation(JavaGrammarParser.MethodInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation(JavaGrammarParser.MethodInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation_lf_primary(JavaGrammarParser.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation_lf_primary(JavaGrammarParser.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation_lfno_primary(JavaGrammarParser.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation_lfno_primary(JavaGrammarParser.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(JavaGrammarParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(JavaGrammarParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#methodReference}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference(JavaGrammarParser.MethodReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#methodReference}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference(JavaGrammarParser.MethodReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference_lf_primary(JavaGrammarParser.MethodReference_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference_lf_primary(JavaGrammarParser.MethodReference_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference_lfno_primary(JavaGrammarParser.MethodReference_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference_lfno_primary(JavaGrammarParser.MethodReference_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreationExpression(JavaGrammarParser.ArrayCreationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreationExpression(JavaGrammarParser.ArrayCreationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#dimExprs}.
	 * @param ctx the parse tree
	 */
	void enterDimExprs(JavaGrammarParser.DimExprsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#dimExprs}.
	 * @param ctx the parse tree
	 */
	void exitDimExprs(JavaGrammarParser.DimExprsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#dimExpr}.
	 * @param ctx the parse tree
	 */
	void enterDimExpr(JavaGrammarParser.DimExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#dimExpr}.
	 * @param ctx the parse tree
	 */
	void exitDimExpr(JavaGrammarParser.DimExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(JavaGrammarParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(JavaGrammarParser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(JavaGrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(JavaGrammarParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpression(JavaGrammarParser.LambdaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpression(JavaGrammarParser.LambdaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParameters(JavaGrammarParser.LambdaParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParameters(JavaGrammarParser.LambdaParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterInferredFormalParameterList(JavaGrammarParser.InferredFormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitInferredFormalParameterList(JavaGrammarParser.InferredFormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void enterLambdaBody(JavaGrammarParser.LambdaBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void exitLambdaBody(JavaGrammarParser.LambdaBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(JavaGrammarParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(JavaGrammarParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(JavaGrammarParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(JavaGrammarParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void enterLeftHandSide(JavaGrammarParser.LeftHandSideContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void exitLeftHandSide(JavaGrammarParser.LeftHandSideContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(JavaGrammarParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(JavaGrammarParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(JavaGrammarParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(JavaGrammarParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalOrExpression(JavaGrammarParser.ConditionalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalOrExpression(JavaGrammarParser.ConditionalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalAndExpression(JavaGrammarParser.ConditionalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalAndExpression(JavaGrammarParser.ConditionalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(JavaGrammarParser.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(JavaGrammarParser.InclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(JavaGrammarParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(JavaGrammarParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(JavaGrammarParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(JavaGrammarParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(JavaGrammarParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(JavaGrammarParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(JavaGrammarParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(JavaGrammarParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(JavaGrammarParser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(JavaGrammarParser.ShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(JavaGrammarParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(JavaGrammarParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(JavaGrammarParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(JavaGrammarParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(JavaGrammarParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(JavaGrammarParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreIncrementExpression(JavaGrammarParser.PreIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreIncrementExpression(JavaGrammarParser.PreIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreDecrementExpression(JavaGrammarParser.PreDecrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreDecrementExpression(JavaGrammarParser.PreDecrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpressionNotPlusMinus(JavaGrammarParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpressionNotPlusMinus(JavaGrammarParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(JavaGrammarParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(JavaGrammarParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpression(JavaGrammarParser.PostIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpression(JavaGrammarParser.PostIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpression_lf_postfixExpression(JavaGrammarParser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpression_lf_postfixExpression(JavaGrammarParser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#postDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecrementExpression(JavaGrammarParser.PostDecrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#postDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecrementExpression(JavaGrammarParser.PostDecrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecrementExpression_lf_postfixExpression(JavaGrammarParser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecrementExpression_lf_postfixExpression(JavaGrammarParser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(JavaGrammarParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(JavaGrammarParser.CastExpressionContext ctx);
}