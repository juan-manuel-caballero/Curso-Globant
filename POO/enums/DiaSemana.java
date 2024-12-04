public enum DiaSemana {
    LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO;

    public boolean esDiaLaboral() {
        switch (this) {
            case SABADO:
                return false;
            case DOMINGO:
                return false;
            default:
                return true;

        }
    }
}