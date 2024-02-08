package UML_Parameter;

//Method with parameter

public class UMLDeclarationP {

    public String names;
    private String surnames;
    protected String dni;

    public void showMessage(){
        System.out.println("Declared data.");
    }

    public String returnMessage(){
                 return "Declared data returned.";
    }

    public void print(String name){
                 System.out.println("Declared name: " + name);
    }
}

