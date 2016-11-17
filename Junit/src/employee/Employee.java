
package employee;

/**
 *
 * @author RJ
 */
public class Employee {
    
    public int Seniority(int a, int b, int c, int d) {

        int tempA;
        int tempB;
        int senior;
        if ( a < b) { 
            tempA = a;
        } else {
            tempA = b;
        }
        if (c < d) {
            tempB = c;
       } else {
            tempB = d;
       }
       if (tempA < tempB) {
           senior = tempA;
       } else {
           senior = tempB;
       }
       
        System.out.println("Senior = " + senior);
       return senior;
    }  
    
    public int mostVolunteered(int a, int b, int c, int d) {
        
        int tempA;
        int tempB;
        int mostVolunteered;
        if ( a > b) { 
            tempA = a;
        } else {
            tempA = b;
        }
        if (c > d) {
            tempB = c;
       } else {
            tempB = d;
       }
       if (tempA > tempB) {
           mostVolunteered = tempA;
       } else {
           mostVolunteered = tempB;
       }
       
        System.out.println("Most Volunteered = " + mostVolunteered);
       return mostVolunteered;        
    }
    
}