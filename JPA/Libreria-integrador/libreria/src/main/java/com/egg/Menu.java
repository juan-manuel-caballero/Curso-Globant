package com.egg;

public class Menu {
    Scanner sc = new Scanner(System.in);
    int respuesta = 0;
    System.out.println("Bienvenido al sistema de gestión de la librería");
    do {
        System.out.println("Por favor seleccione una acción del menú: ");
        System.out.println("1 - Para menú de Libros");
        System.out.println("2 - Para menú de Autores");
        System.out.println("3 - Para menú de Editoriales");
        respuesta = sc.nextInt();
        switch (respuesta) {
            case 1 -> menuLibros();
            case 2 -> menuAutores();
            case 3 -> menuEditoriales();
            default -> System.out.println("Por favor seleccione una opción válida");
        }
    } while (respuesta > 0);
}
