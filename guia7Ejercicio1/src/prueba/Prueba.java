package prueba;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.TreeSet;

import domain.*;

public class Prueba {

	public static void main(String[] args) {
		Persona p1 = new Persona("perez","carlos","colon 3212");
		Persona p2 = new Persona("perez","carlos","colon 3212");
		Persona p3 = new Persona("garcia","ana","mitre 2812");
		Persona p4 = new Persona("alvarez","valeria","san luis 2812");
		Persona p5 = new Persona("garcia","luis","matheu 3538");
		
		Persona array[] = new Persona[5];
		array[0] = p1;
		array[1] = p2;
		array[2] = p3;
		array[3] = p4;
		array[4] = p5;
		/*
		for (Persona persona : array)
			System.out.println(persona);
		
		System.out.println("/////////////////////");
		Ordenadora ordena = new Ordenadora();
		ordena.ordenar(array);
		for (Persona persona : array)
			System.out.println(persona);
		*/
		/*
		HashSet<Persona> hashset = new HashSet<Persona>();
		hashset.add(p1);
		hashset.add(p2);
		hashset.add(p3);
		hashset.add(p4);
		hashset.add(p5);
		//System.out.println(hashset.contains(p2));
		Iterator<Persona> it = hashset.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		*/
		/*
		LinkedHashSet<Persona> linkedHashSet = new LinkedHashSet<Persona>();
		linkedHashSet.add(p1);
		linkedHashSet.add(p2);
		linkedHashSet.add(p3);
		linkedHashSet.add(p4);
		linkedHashSet.add(p5);
		//System.out.println(linkedHashSet.contains(p2));
		Iterator<Persona> it = linkedHashSet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		*/
		/*
		TreeSet<Persona> treeSet = new TreeSet<Persona>();
		treeSet.add(p1);
		treeSet.add(p2);
		treeSet.add(p3);
		treeSet.add(p4);
		treeSet.add(p5);
		//System.out.println(linkedHashSet.contains(p2));
		Iterator<Persona> it = treeSet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		*/
		
		LinkedList<Persona> linkedList = new LinkedList<Persona>();
		linkedList.add(p1);
		linkedList.add(p2);
		linkedList.add(p3);
		linkedList.add(p4);
		linkedList.add(p5);
		//System.out.println(linkedHashSet.contains(p2));
		while(!linkedList.isEmpty()) {
			Persona p = linkedList.poll();
			System.out.println(p);
		}
		
		/*
		PriorityQueue<Persona> priorityQueue = new PriorityQueue<Persona>();
		priorityQueue.add(p1);
		priorityQueue.add(p2);
		priorityQueue.add(p3);
		priorityQueue.add(p4);
		priorityQueue.add(p5);
		//System.out.println(linkedHashSet.contains(p2));
		while(!priorityQueue.isEmpty()) {
			Persona p = priorityQueue.poll();
			System.out.println(p);
		}
		*/
	}

}
