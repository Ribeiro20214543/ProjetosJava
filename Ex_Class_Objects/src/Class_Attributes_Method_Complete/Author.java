package Class_Attributes_Method_Complete;

public class Author {

        public String names; //value default is null
        public String surnames;
        protected String DNI;

        public Author(){
        //Default constructor
        }

        public Author(String names){
        //Overloaded constructor 1
        }

        public Author(String names, String surnames){
        //Overloaded constructor 2
        }

    public void printData(){
            System.out.println("Name: " + names + "Surname: " + surnames + "DNI: " + DNI);
    }
}

