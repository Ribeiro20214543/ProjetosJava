package UML_One_Return;

//Method that returns a value

public class UMLDeclarationOR {
    //Method declaration
    public String names;
    private String surnames;
    protected String dni;

    public void showMessage(){
        System.out.println("Declared data.");
    }

    public String returnMessage(){
                    return "Declared data returned.";
    }
}
