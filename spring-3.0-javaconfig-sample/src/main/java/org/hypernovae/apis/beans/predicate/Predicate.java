package org.hypernovae.apis.beans.predicate;

public interface Predicate<T> {
	boolean test(T t);
}
