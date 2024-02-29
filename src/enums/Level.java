package enums;

public enum Level {
//Sintaxis para los enums en Java: Constante(Valor). Las constantes deben ir antes del constructor
    //Los enums deben tener un getter que devuelva el valor de las constantes
    LOW("Low"),
    MID("Medium"),
    HIGH("High");

    public static void main(String[] args) {
        //Invocando el valor de una constante de un enum
        System.out.println(Level.LOW.getLevel() == "Low"); //.getLevel getter returns the actual value of the constant ENUM
    }

    Level(String level){
        this.level = level;
    };

    private final String level;

    public String getLevel(){
        return this.level;
    }
}
