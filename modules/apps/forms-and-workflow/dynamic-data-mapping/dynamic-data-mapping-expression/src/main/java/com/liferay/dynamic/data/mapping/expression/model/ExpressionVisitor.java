/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.dynamic.data.mapping.expression.model;

/**
 * @author Marcellus Tavares
 */
public abstract class ExpressionVisitor<T> {

	public T visit(AndExpression andExpression) {
		return null;
	}

	public T visit(ArithmeticExpression arithmeticExpression) {
		return null;
	}

	public T visit(ComparisonExpression comparisonExpression) {
		return null;
	}

	public T visit(FloatingPointLiteral floatingPointLiteral) {
		return null;
	}

	public T visit(FunctionCallExpression functionCallExpression) {
		return null;
	}

	public T visit(IntegerLiteral integerLiteral) {
		return null;
	}

	public T visit(MinusExpression minusExpression) {
		return null;
	}

	public T visit(NotExpression notExpression) {
		return null;
	}

	public T visit(OrExpression orExpression) {
		return null;
	}

	public T visit(Parenthesis parenthesis) {
		return null;
	}

	public T visit(StringLiteral stringLiteral) {
		return null;
	}

	public T visit(Term term) {
		return null;
	}

}