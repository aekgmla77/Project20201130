package com.yedam.generic;

public class Box<T> { //메인 메소드 실행할 때 선언하겠다는 뜻.
	T obj; // object 는 최상위 타입. 어떤 타입이든 담을 수 있음.
	void set(T obj) {
		this.obj = obj;
	}
	T get() {
		return obj;
	}
}
//어떤 타입으로 선언하고 싶은지 정하는 거 generic Box<이 부분>
