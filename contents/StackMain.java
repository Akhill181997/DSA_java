package stack;

public class StackMain {

    public static void main(String[] args) {
        StackImplementation st = new StackImplementation(); 
        st.push(2); 
        st.push(3);
        
        st.pop();
        
        st.push(9);
        st.push(8);
        
        st.pop();
        
        st.show();
        
        
    }
}
