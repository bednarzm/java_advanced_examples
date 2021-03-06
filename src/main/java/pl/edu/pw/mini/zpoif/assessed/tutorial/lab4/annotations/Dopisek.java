package pl.edu.pw.mini.zpoif.assessed.tutorial.lab4.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)//Oznacza to, �e adnotacja b�dzie dost�pna podczas wykonania programu
@Target(ElementType.FIELD)
public @interface Dopisek {
	/*
	 * Mo�emy zdefiniowa� pole, kt�re b�dzie wype�nione informacj�, kt�r� chcemy przekaza�.
	 */
	String trescDopisku();
}
