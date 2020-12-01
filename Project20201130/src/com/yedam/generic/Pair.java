package com.yedam.generic;

public class Pair<T, M> { // pair을 선언하는 시점에 타입이 정해짐.
	T kind; //string
	M model; //integer
    int price;
    String name;
    
    void setKind(T kind) {
    	this.kind = kind;
    }
    T getKind() {
    	return kind;
    }
    void setModel(M model) {
    	this.model = model;
    }
    M getModel() {
    	return model;
    }
    
}
