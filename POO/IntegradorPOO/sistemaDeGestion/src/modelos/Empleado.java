package modelos;


import java.util.*;

public class Empleado {

    private String nombre;
    private int edad;
    private String departamento;
    private int salario;
    private int id;

    public Empleado(String nombre, int edad, String departamento, int salario, int id) {
        this.nombre = nombre;
        this.edad = edad;
        this.departamento = departamento;
        this.salario = salario;
        this.id = id;
    }

    public Empleado() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public void mostrarEmpleado(ArrayList<Empleado> listaEmpleados) {
        System.out.println(" Nombre Edad Salario Departamento");
        int i = 1;
        for (Empleado e : listaEmpleados) {
            System.out.printf("%d %s %d %d %s \n", i, e.nombre, e.edad, e.salario, e.departamento);
            i++;
        }

    }

    public ArrayList<Empleado> filtrarPorNombre(ArrayList<Empleado> listaEmpleados, String dato) {
        ArrayList<Empleado> empleadosOrdenados = new ArrayList<>();
        for (Empleado e : listaEmpleados) {
            if (e.nombre.equals(dato)) {
                empleadosOrdenados.add(e);
            }
        }
        return empleadosOrdenados;
    }

    public ArrayList<Empleado> filtrarPorDepartamento(ArrayList<Empleado> listaEmpleados, String dato) {
        ArrayList<Empleado> empleadosOrdenados = new ArrayList<>();
        for (Empleado e : listaEmpleados) {
            if (e.departamento.equals(dato)) {
                empleadosOrdenados.add(e);
            }
        }
        return empleadosOrdenados;
    }

    public ArrayList<Empleado> filtrarEmpleados(String opcion, ArrayList<Empleado> listaEmpleados, String dato) {
        switch (opcion) {
            case "nombre":
                listaEmpleados = filtrarPorNombre(listaEmpleados, dato);
                break;
            case "edad":
                getEdad();
                break;
            case "salario":
                getSalario();
                break;
            case "departamento":
                listaEmpleados = filtrarPorDepartamento(listaEmpleados, dato);
                break;
        }
        return listaEmpleados;
    }
}
