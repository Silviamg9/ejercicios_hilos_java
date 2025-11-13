package com;

public class Main {

	public static void main(String[] args) {
		
		DosArgumentos suma = (x, y) -> x+y;
		System.out.println(suma.operar(3, 4));
		
		DosArgumentos resta = (x, y) -> x-y;
		System.out.println(resta.operar(3, 4));
		
	}
	
	public static void UnArgumento() {
        
        UnArgumento s1 = mensaje -> System.out.println("Prueba argumento -> " + mensaje);
        s1.imprimir("Hola Mundo");
        
        UnArgumento s2 = prueba -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(prueba);
            }
        };
        s2.imprimir("Cambio para prueba");
	}

	public static void SinArgumentos() {
		
		SinArgumentos s1 = () -> System.out.println("Esto es s1");
		SinArgumentos s2 = () -> System.out.println("Esto es s2");
		SinArgumentos s3 = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("Esto es s3: " + i);
			}
		};
		s1.ejecutar();
		s2.ejecutar();
		s3.ejecutar();
	}
}
