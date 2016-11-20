import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bladekp
 */
public class TreeTest {
    
    /* 
     * Wiem że testy nie powinny nic wyrzucać na standardowe wyjście. 
     * Ale na potrzeby wizualizacji tego prostego zadania moje mogą wyrzucać.
     */
    
    @Test
    public void testZadanie() {
        Tree t = new Tree(                              //a
                        new Tree(null, null),           //b
                        new Tree(                       //c
                            new Tree(                   //d
                                new Tree(null, null),   //e
                                new Tree(null, null)    //f    
                            ),        
                            null
                        )
                );
        //System.out.println("drzewo testZadanie:");
        //TreePrinter.printNode(t);
        assertEquals(2, new Solution().solution(t));
    }
    
    @Test
    public void testPusteDrzewo() {
        Tree t = new Tree(null, null);
        //System.out.println("drzewo testPusteDrzewo:");
        //TreePrinter.printNode(t);
        assertEquals(0, new Solution().solution(t));
    }
    
    @Test
    public void testDrzewoNull() {
        Tree t = null;
        //System.out.println("drzewo testDrzewoNull:");
        //TreePrinter.printNode(t);
        assertEquals(-1, new Solution().solution(t));
    }
    
    @Test
    public void testMojeDrzewo() {
        Tree t = new Tree(                              
                        new Tree(new Tree(                       
                            new Tree(                   
                                new Tree(null, null),   
                                new Tree(new Tree(                       
                            new Tree(                   
                                new Tree(null, null),   
                                new Tree(null, null)       
                            ),        
                            null
                        ), null)       
                            ),        
                            null
                        ), new Tree(                       
                            new Tree(                   
                                new Tree(null, null),   
                                new Tree(new Tree(                       
                            new Tree(                   
                                new Tree(null, null),   
                                new Tree(null, null)       
                            ),        
                            null
                        ), null)       
                            ),        
                            null
                        )),           
                        new Tree(                       
                            new Tree(                   
                                new Tree(new Tree(                       
                            new Tree(                   
                                new Tree(null, null),   
                                new Tree(null, null)       
                            ),        
                            null
                        ), null),   
                                new Tree(null, new Tree(                       
                            new Tree(                   
                                new Tree(null, null),   
                                new Tree(null, null)       
                            ),        
                            null
                        ))       
                            ),        
                            null
                        )
                );
        //System.out.println("drzewo testMojeDrzewo:");
        //TreePrinter.printNode(t);
        assertEquals(5, new Solution().solution(t));
    }
}
