package mySql;

import java.util.*;
import java.util.stream.*;

public class Remove_duplicate {
	
	/*
	 * delete p1
	 * from person p1
	 * join person p2
	 * on p1.email = p2.email
	 * and p1.id> p2.id;
	 */
	
	int id;
	String email;
	
	Remove_duplicate(int id, String email) {
        this.id = id;
        this.email = email;
    }
	public static void main(String [] args)}

List<Person> unique = people.stream()
.collect(Collectors.toMap(
    p -> p.email,
    p -> p,
    (p1, p2) -> p1.id < p2.id ? p1 : p2
))
.values()
.stream()
.toList();
}
