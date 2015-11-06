package org.hypernovae.apis.beans.predicate.impl;

import org.hypernovae.apis.beans.predicate.Predicate;

public class EvenNumberPredicate implements Predicate<Integer> {

	public boolean test(Integer t) {
		
		return t % 2 == 0;
	}

}
