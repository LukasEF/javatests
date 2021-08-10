package javatests;

/**
 *
 * @author Lukas
 */
public class JavaTests {
    
    public static void main(String[] args) {
        TestInterface[] interfaces = new TestInterface[2];
        interfaces[0] = new TestImplementation1();
        interfaces[1] = new TestImplementation2();
        
        for(int i=0; i<2; i++){
            interfaces[i].print();
        }
    }
    
}
