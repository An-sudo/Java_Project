package com.imooc.test16;

import java.util.List;
public class AnimalPlay {
	public void AnimalPlayer(List<?extends Animal> list) {
		for(Animal a:list) {
			a.play();
		}
	}
}
