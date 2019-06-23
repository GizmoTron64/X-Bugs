// Generated from S:/jetbrains/IdeaProjects/X-Bugs/src/grammars\JavaGrammar.g4 by ANTLR 4.7.2
package grammars;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JavaGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JavaGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(JavaGrammarParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(JavaGrammarParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#numericType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericType(JavaGrammarParser.NumericTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#integralType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegralType(JavaGrammarParser.IntegralTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#floatingPointType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatingPointType(JavaGrammarParser.FloatingPointTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#referenceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenceType(JavaGrammarParser.ReferenceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceType(JavaGrammarParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#classType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType(JavaGrammarParser.ClassTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType_lf_classOrInterfaceType(JavaGrammarParser.ClassType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType_lfno_classOrInterfaceType(JavaGrammarParser.ClassType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#interfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceType(JavaGrammarParser.InterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#interfaceType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceType_lf_classOrInterfaceType(JavaGrammarParser.InterfaceType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#interfaceType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceType_lfno_classOrInterfaceType(JavaGrammarParser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#typeVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeVariable(JavaGrammarParser.TypeVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(JavaGrammarParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#dims}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDims(JavaGrammarParser.DimsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(JavaGrammarParser.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#typeParameterModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameterModifier(JavaGrammarParser.TypeParameterModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#typeBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBound(JavaGrammarParser.TypeBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#additionalBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionalBound(JavaGrammarParser.AdditionalBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(JavaGrammarParser.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#typeArgumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentList(JavaGrammarParser.TypeArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#typeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgument(JavaGrammarParser.TypeArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#wildcard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcard(JavaGrammarParser.WildcardContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#wildcardBounds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcardBounds(JavaGrammarParser.WildcardBoundsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#packageName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageName(JavaGrammarParser.PackageNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(JavaGrammarParser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageOrTypeName(JavaGrammarParser.PackageOrTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#expressionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionName(JavaGrammarParser.ExpressionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#methodName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodName(JavaGrammarParser.MethodNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#ambiguousName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAmbiguousName(JavaGrammarParser.AmbiguousNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(JavaGrammarParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#packageDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageDeclaration(JavaGrammarParser.PackageDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#packageModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageModifier(JavaGrammarParser.PackageModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(JavaGrammarParser.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleTypeImportDeclaration(JavaGrammarParser.SingleTypeImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeImportOnDemandDeclaration(JavaGrammarParser.TypeImportOnDemandDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleStaticImportDeclaration(JavaGrammarParser.SingleStaticImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#staticImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticImportOnDemandDeclaration(JavaGrammarParser.StaticImportOnDemandDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(JavaGrammarParser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(JavaGrammarParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalClassDeclaration(JavaGrammarParser.NormalClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#classModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassModifier(JavaGrammarParser.ClassModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameters(JavaGrammarParser.TypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#typeParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameterList(JavaGrammarParser.TypeParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#superclass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperclass(JavaGrammarParser.SuperclassContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#superinterfaces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperinterfaces(JavaGrammarParser.SuperinterfacesContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#interfaceTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceTypeList(JavaGrammarParser.InterfaceTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(JavaGrammarParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration(JavaGrammarParser.ClassBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMemberDeclaration(JavaGrammarParser.ClassMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(JavaGrammarParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#fieldModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldModifier(JavaGrammarParser.FieldModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorList(JavaGrammarParser.VariableDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(JavaGrammarParser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorId(JavaGrammarParser.VariableDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(JavaGrammarParser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#unannType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannType(JavaGrammarParser.UnannTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannPrimitiveType(JavaGrammarParser.UnannPrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#unannReferenceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannReferenceType(JavaGrammarParser.UnannReferenceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassOrInterfaceType(JavaGrammarParser.UnannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#unannClassType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassType(JavaGrammarParser.UnannClassTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassType_lf_unannClassOrInterfaceType(JavaGrammarParser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassType_lfno_unannClassOrInterfaceType(JavaGrammarParser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#unannInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannInterfaceType(JavaGrammarParser.UnannInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannInterfaceType_lf_unannClassOrInterfaceType(JavaGrammarParser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannInterfaceType_lfno_unannClassOrInterfaceType(JavaGrammarParser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#unannTypeVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannTypeVariable(JavaGrammarParser.UnannTypeVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#unannArrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannArrayType(JavaGrammarParser.UnannArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(JavaGrammarParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#methodModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodModifier(JavaGrammarParser.MethodModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#methodHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodHeader(JavaGrammarParser.MethodHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult(JavaGrammarParser.ResultContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#methodDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclarator(JavaGrammarParser.MethodDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(JavaGrammarParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(JavaGrammarParser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(JavaGrammarParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#variableModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableModifier(JavaGrammarParser.VariableModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastFormalParameter(JavaGrammarParser.LastFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#receiverParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiverParameter(JavaGrammarParser.ReceiverParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#throws_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrows_(JavaGrammarParser.Throws_Context ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#exceptionTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionTypeList(JavaGrammarParser.ExceptionTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#exceptionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionType(JavaGrammarParser.ExceptionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(JavaGrammarParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#instanceInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceInitializer(JavaGrammarParser.InstanceInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#staticInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticInitializer(JavaGrammarParser.StaticInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(JavaGrammarParser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#constructorModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorModifier(JavaGrammarParser.ConstructorModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#constructorDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclarator(JavaGrammarParser.ConstructorDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#simpleTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleTypeName(JavaGrammarParser.SimpleTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#constructorBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorBody(JavaGrammarParser.ConstructorBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitConstructorInvocation(JavaGrammarParser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDeclaration(JavaGrammarParser.EnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#enumBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBody(JavaGrammarParser.EnumBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#enumConstantList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstantList(JavaGrammarParser.EnumConstantListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#enumConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstant(JavaGrammarParser.EnumConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#enumConstantModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstantModifier(JavaGrammarParser.EnumConstantModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBodyDeclarations(JavaGrammarParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(JavaGrammarParser.InterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalInterfaceDeclaration(JavaGrammarParser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#interfaceModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceModifier(JavaGrammarParser.InterfaceModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#extendsInterfaces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendsInterfaces(JavaGrammarParser.ExtendsInterfacesContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#interfaceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBody(JavaGrammarParser.InterfaceBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMemberDeclaration(JavaGrammarParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#constantDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclaration(JavaGrammarParser.ConstantDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#constantModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantModifier(JavaGrammarParser.ConstantModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodDeclaration(JavaGrammarParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodModifier(JavaGrammarParser.InterfaceMethodModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeDeclaration(JavaGrammarParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeBody(JavaGrammarParser.AnnotationTypeBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeMemberDeclaration(JavaGrammarParser.AnnotationTypeMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementDeclaration(JavaGrammarParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#annotationTypeElementModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementModifier(JavaGrammarParser.AnnotationTypeElementModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#defaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultValue(JavaGrammarParser.DefaultValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(JavaGrammarParser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#normalAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalAnnotation(JavaGrammarParser.NormalAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#elementValuePairList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePairList(JavaGrammarParser.ElementValuePairListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#elementValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePair(JavaGrammarParser.ElementValuePairContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#elementValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValue(JavaGrammarParser.ElementValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueArrayInitializer(JavaGrammarParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#elementValueList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueList(JavaGrammarParser.ElementValueListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#markerAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMarkerAnnotation(JavaGrammarParser.MarkerAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#singleElementAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleElementAnnotation(JavaGrammarParser.SingleElementAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(JavaGrammarParser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#variableInitializerList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializerList(JavaGrammarParser.VariableInitializerListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#rtxcMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRtxcMethod(JavaGrammarParser.RtxcMethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#rcxcMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRcxcMethod(JavaGrammarParser.RcxcMethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#mxtMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMxtMethod(JavaGrammarParser.MxtMethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#concurrentMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcurrentMethod(JavaGrammarParser.ConcurrentMethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#joinCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinCall(JavaGrammarParser.JoinCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#lockCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLockCall(JavaGrammarParser.LockCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#unlockCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnlockCall(JavaGrammarParser.UnlockCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#acquireCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAcquireCall(JavaGrammarParser.AcquireCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#releaseCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReleaseCall(JavaGrammarParser.ReleaseCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#countDownCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCountDownCall(JavaGrammarParser.CountDownCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#submitCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubmitCall(JavaGrammarParser.SubmitCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#joinStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinStatement(JavaGrammarParser.JoinStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#waitStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWaitStatement(JavaGrammarParser.WaitStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#notifyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotifyStatement(JavaGrammarParser.NotifyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#notifyAllStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotifyAllStatement(JavaGrammarParser.NotifyAllStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#awaitStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAwaitStatement(JavaGrammarParser.AwaitStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#signalStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignalStatement(JavaGrammarParser.SignalStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#signalAllStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignalAllStatement(JavaGrammarParser.SignalAllStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#sleepStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSleepStatement(JavaGrammarParser.SleepStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#lockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLockStatement(JavaGrammarParser.LockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#unlockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnlockStatement(JavaGrammarParser.UnlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#acquireStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAcquireStatement(JavaGrammarParser.AcquireStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#releaseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReleaseStatement(JavaGrammarParser.ReleaseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#countDownStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCountDownStatement(JavaGrammarParser.CountDownStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#submitStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubmitStatement(JavaGrammarParser.SubmitStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#noParamEndStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoParamEndStatement(JavaGrammarParser.NoParamEndStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#paramEndStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamEndStatement(JavaGrammarParser.ParamEndStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#concurrentKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcurrentKeyword(JavaGrammarParser.ConcurrentKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(JavaGrammarParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#blockStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatements(JavaGrammarParser.BlockStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(JavaGrammarParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclarationStatement(JavaGrammarParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(JavaGrammarParser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(JavaGrammarParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#statementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementNoShortIf(JavaGrammarParser.StatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementWithoutTrailingSubstatement(JavaGrammarParser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#emptyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStatement(JavaGrammarParser.EmptyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#labeledStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatement(JavaGrammarParser.LabeledStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatementNoShortIf(JavaGrammarParser.LabeledStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(JavaGrammarParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#statementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpression(JavaGrammarParser.StatementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#ifThenStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenStatement(JavaGrammarParser.IfThenStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenElseStatement(JavaGrammarParser.IfThenElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenElseStatementNoShortIf(JavaGrammarParser.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#assertStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssertStatement(JavaGrammarParser.AssertStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#switchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatement(JavaGrammarParser.SwitchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#switchBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlock(JavaGrammarParser.SwitchBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlockStatementGroup(JavaGrammarParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#switchLabels}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabels(JavaGrammarParser.SwitchLabelsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#switchLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabel(JavaGrammarParser.SwitchLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#enumConstantName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstantName(JavaGrammarParser.EnumConstantNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(JavaGrammarParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatementNoShortIf(JavaGrammarParser.WhileStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#doStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoStatement(JavaGrammarParser.DoStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(JavaGrammarParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatementNoShortIf(JavaGrammarParser.ForStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#basicForStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicForStatement(JavaGrammarParser.BasicForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicForStatementNoShortIf(JavaGrammarParser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(JavaGrammarParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#forUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdate(JavaGrammarParser.ForUpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#statementExpressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpressionList(JavaGrammarParser.StatementExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#enhancedForStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForStatement(JavaGrammarParser.EnhancedForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#enhancedForStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForStatementNoShortIf(JavaGrammarParser.EnhancedForStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#breakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(JavaGrammarParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#continueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(JavaGrammarParser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(JavaGrammarParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#throwStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowStatement(JavaGrammarParser.ThrowStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#synchronizedStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSynchronizedStatement(JavaGrammarParser.SynchronizedStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#tryStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryStatement(JavaGrammarParser.TryStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#catches}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatches(JavaGrammarParser.CatchesContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#catchClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchClause(JavaGrammarParser.CatchClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#catchFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchFormalParameter(JavaGrammarParser.CatchFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#catchType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchType(JavaGrammarParser.CatchTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#finally_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinally_(JavaGrammarParser.Finally_Context ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#tryWithResourcesStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryWithResourcesStatement(JavaGrammarParser.TryWithResourcesStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#resourceSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceSpecification(JavaGrammarParser.ResourceSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#resourceList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceList(JavaGrammarParser.ResourceListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#resource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource(JavaGrammarParser.ResourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(JavaGrammarParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray(JavaGrammarParser.PrimaryNoNewArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_arrayAccess(JavaGrammarParser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_arrayAccess(JavaGrammarParser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary(JavaGrammarParser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(JavaGrammarParser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(JavaGrammarParser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary(JavaGrammarParser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(JavaGrammarParser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(JavaGrammarParser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInstanceCreationExpression(JavaGrammarParser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInstanceCreationExpression_lf_primary(JavaGrammarParser.ClassInstanceCreationExpression_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInstanceCreationExpression_lfno_primary(JavaGrammarParser.ClassInstanceCreationExpression_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentsOrDiamond(JavaGrammarParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#fieldAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess(JavaGrammarParser.FieldAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess_lf_primary(JavaGrammarParser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess_lfno_primary(JavaGrammarParser.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess(JavaGrammarParser.ArrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess_lf_primary(JavaGrammarParser.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess_lfno_primary(JavaGrammarParser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#methodInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation(JavaGrammarParser.MethodInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation_lf_primary(JavaGrammarParser.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation_lfno_primary(JavaGrammarParser.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(JavaGrammarParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#methodReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference(JavaGrammarParser.MethodReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference_lf_primary(JavaGrammarParser.MethodReference_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference_lfno_primary(JavaGrammarParser.MethodReference_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreationExpression(JavaGrammarParser.ArrayCreationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#dimExprs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimExprs(JavaGrammarParser.DimExprsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#dimExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimExpr(JavaGrammarParser.DimExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#constantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpression(JavaGrammarParser.ConstantExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(JavaGrammarParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#lambdaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExpression(JavaGrammarParser.LambdaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#lambdaParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaParameters(JavaGrammarParser.LambdaParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInferredFormalParameterList(JavaGrammarParser.InferredFormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#lambdaBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaBody(JavaGrammarParser.LambdaBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(JavaGrammarParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(JavaGrammarParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#leftHandSide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftHandSide(JavaGrammarParser.LeftHandSideContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(JavaGrammarParser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(JavaGrammarParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalOrExpression(JavaGrammarParser.ConditionalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalAndExpression(JavaGrammarParser.ConditionalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclusiveOrExpression(JavaGrammarParser.InclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusiveOrExpression(JavaGrammarParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(JavaGrammarParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(JavaGrammarParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(JavaGrammarParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpression(JavaGrammarParser.ShiftExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(JavaGrammarParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(JavaGrammarParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(JavaGrammarParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreIncrementExpression(JavaGrammarParser.PreIncrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreDecrementExpression(JavaGrammarParser.PreDecrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpressionNotPlusMinus(JavaGrammarParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(JavaGrammarParser.PostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostIncrementExpression(JavaGrammarParser.PostIncrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostIncrementExpression_lf_postfixExpression(JavaGrammarParser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#postDecrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostDecrementExpression(JavaGrammarParser.PostDecrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostDecrementExpression_lf_postfixExpression(JavaGrammarParser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpression(JavaGrammarParser.CastExpressionContext ctx);
}