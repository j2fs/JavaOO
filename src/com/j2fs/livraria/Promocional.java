package com.j2fs.livraria;

@FunctionalInterface
public interface Promocional {
	boolean aplicarDescontoDe(double pocentagem);
	default boolean aplicarDescontoDe10Porcento (){
		return aplicarDescontoDe(0.1);
	}
	default boolean aplicarDescontoDe5Porcento (){
		return aplicarDescontoDe(0.05);
	}

}
