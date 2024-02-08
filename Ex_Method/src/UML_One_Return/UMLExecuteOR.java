package UML_One_Return;

import UML_No_Return.UMLDeclaration;

public class UMLExecuteOR {
    public static void main (String[]args) {
        UMLDeclarationOR declaration = new UMLDeclarationOR();
        System.out.println("Message: " + declaration.returnMessage());
    }
}
