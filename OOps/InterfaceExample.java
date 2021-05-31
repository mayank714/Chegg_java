package OOps;
//Basically interface method is used when we declare some method (Without body) earlier which we
//need to use later using "Implement " method.
//As the method in the interface class are by default abstact (Dont need to write the Anstract keyword)
// All the declaraions here are defaultly "Final"
// We can declare interface just like normal class
public interface InterfaceExample {
    // By default all the methods in the interface class are abstract

    // here we decalre the method (Without any body)
    void add();
    // This declaration is final , Although there is now need to add "final " here
    int x=25;
    
}
